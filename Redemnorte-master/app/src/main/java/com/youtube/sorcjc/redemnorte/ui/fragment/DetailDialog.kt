package com.youtube.sorcjc.redemnorte.ui.fragment

import android.Manifest
import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.*
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import com.google.android.material.textfield.TextInputLayout
import com.youtube.sorcjc.redemnorte.R
import com.youtube.sorcjc.redemnorte.io.MyApiAdapter
import com.youtube.sorcjc.redemnorte.io.response.ExpectedDataResponse
import com.youtube.sorcjc.redemnorte.io.response.ExistsResponse
import com.youtube.sorcjc.redemnorte.model.Item
import com.youtube.sorcjc.redemnorte.ui.activity.DetailsActivity
import com.youtube.sorcjc.redemnorte.ui.activity.SimpleScannerActivity
import com.youtube.sorcjc.redemnorte.util.checkAndRequestPermission
import com.youtube.sorcjc.redemnorte.util.getItemIndex
import com.youtube.sorcjc.redemnorte.util.showInfoDialog
import com.youtube.sorcjc.redemnorte.util.toast
import kotlinx.android.synthetic.main.dialog_new_detail.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DetailDialog : DialogFragment(), View.OnClickListener {

    // Parent header
    private var sheetId: Int = -1

    // Only provided in edit mode
    private var itemId: Int = -1

    // Responsible associated with the header, so we can check if the detail is assigned to it
    // in old databases
    private var responsible: String? = null

    // Check QR before registration
    private var qrAlreadyExists: Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            sheetId = it.getInt("hoja_id")
            itemId = it.getInt("item_id")
            responsible = it.getString("responsable")
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.dialog_new_detail, container, false)

        setHasOptionsMenu(true)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var title = getString(R.string.title_item_create)

        if (itemId > -1) {
            title = getString(R.string.title_item_edit)
        }

        toolbar.title = title

        val appCompatActivity = (activity as AppCompatActivity?)
        appCompatActivity?.setSupportActionBar(toolbar)

        appCompatActivity?.supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.setHomeButtonEnabled(true)
            it.setHomeAsUpIndicator(R.drawable.ic_close)
        }

        setupEditMode()

        registerListeners()
    }

    private fun registerListeners()
    {
        // Capture QR, Patrimonial Barcode & Old code
        btnCaptureQR.setOnClickListener(this)
        btnCapturePatrimonial.setOnClickListener(this)
        btnCaptureOldCode.setOnClickListener(this)

        // Check if QR is available
        btnCheckQR.setOnClickListener(this)

        // Take data by patrimonial code
        btnTakeByPatrimonial.setOnClickListener(this)

        // Take data by old code
        btnTakeByOldCode.setOnClickListener(this)

        // Validation is required if the QR code is changed
        etQR.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                qrAlreadyExists = null
            }
        })
    }

    private fun setupEditMode() {
        // itemId provided => edit mode
        if (itemId > -1) {
            progressBarDetail.visibility = View.VISIBLE

            etQR.isEnabled = false
            btnCaptureQR.visibility = View.GONE
            btnCheckQR.visibility = View.GONE

            val call = MyApiAdapter.getApiService().getItem(itemId)
            call.enqueue(GetPreviousDataCallback())
        } else {
            // new item
            showDialogContent()
        }
    }

    private fun showDialogContent() {
        progressBarDetail.visibility = View.GONE
        scrollViewDetail.visibility = View.VISIBLE
        enableSaveAction()
    }

    internal inner class GetPreviousDataCallback : Callback<Item> {
        override fun onResponse(call: Call<Item>, response: Response<Item>) {
            if (response.isSuccessful) {
                response.body()?.let {
                    setProductDataToViews(it)
                }
            } else {
                context?.toast(getString(R.string.error_format_server_response))
            }

            showDialogContent()
        }

        override fun onFailure(call: Call<Item>, t: Throwable) {
            context?.toast(t.localizedMessage ?: "")

            showDialogContent()
        }
    }

    private fun setProductDataToViews(item: Item) {
        etQR.setText(item.inventory_code)
        etPatrimonial.setText(item.patrimonial)
        etOldCode.setText(item.old_code)

        spinnerOldYear.setSelection(spinnerOldYear.getItemIndex(item.old_year))
        spinnerStatus.setSelection(item.status)

        checkOperative.isChecked = item.operative
        checkLabeled.isChecked = item.labeled

        etDescription.setText(item.denomination)
        etColor.setText(item.color)
        etBrand.setText(item.brand)
        etModel.setText(item.model)
        etSeries.setText(item.series)
        etLong.setText(item.length)
        etWidth.setText(item.width)
        etHeight.setText(item.height)
        etObservation.setText(item.observation)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        return dialog
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.save_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.save) {
            validateForm()
            return true
        } else if (id == android.R.id.home) {
            // close button
            dismiss()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        val item = menu.findItem(R.id.save)

        if (allowSave) {
            item.isEnabled = true
            item.icon.alpha = 255
        } else { // disabled
            item.isEnabled = false
            item.icon.alpha = 130
        }
    }

    var allowSave = false

    private fun validateForm() {
        if (!validateEditText(etQR, tilQR, R.string.error_til_qr)) {
            return
        }

        when (qrAlreadyExists) {
            null -> {
                tilQR.error = getString(R.string.must_validate_unique_qr)
            }
            true -> {
                tilQR.error = getString(R.string.already_registered_qr)
            }
            else -> {
                tilQR.isErrorEnabled = false
            }
        }

        if (!validateEditText(etDescription, tilDescription, R.string.error_til_description)) {
            return
        }

        performRegisterRequest()
    }

    private fun enableSaveAction(enabled: Boolean = true) {
        allowSave = enabled
        activity?.invalidateOptionsMenu()
    }

    private fun performRegisterRequest() {
        enableSaveAction(false)

        val qrCode = etQR.text.toString().trim()
        val patrimonial = etPatrimonial.text.toString().trim()
        val oldCode = etOldCode.text.toString().trim()
        val oldYear = spinnerOldYear.selectedItem.toString()
        val denomination = etDescription.text.toString().trim()
        val brand = etBrand.text.toString().trim()
        val model = etModel.text.toString().trim()
        val series = etSeries.text.toString().trim()
        val color = etColor.text.toString().trim()
        val length = etLong.text.toString().trim()
        val width = etWidth.text.toString().trim()
        val height = etHeight.text.toString().trim()

        val status = spinnerStatus.selectedItemPosition
        val labeled = checkLabeled.isChecked
        val operative = checkOperative.isChecked
        val observation = etObservation.text.toString().trim()

        val call: Call<Item>
        // Qr code provided => edit mode

        call = if (itemId > -1) {
            MyApiAdapter.getApiService().updateItem(
                    itemId, qrCode, patrimonial, oldCode, oldYear,
                    denomination, brand, model, series, color,
                    length, width, height,
                    status, labeled, operative, observation
            )
        } else {
            MyApiAdapter.getApiService().storeItem(
                    sheetId, qrCode, patrimonial, oldCode, oldYear,
                    denomination, brand, model, series, color,
                    length, width, height,
                    status, labeled, operative, observation
            )
        }
        call.enqueue(CreateItemCallback())
    }

    internal inner class CreateItemCallback : Callback<Item> {
        override fun onResponse(call: Call<Item>, response: Response<Item>) {
            if (response.isSuccessful) {
                response.body()?.let {
                    context?.toast(getString(R.string.success_item_store_update))

                    // re-load the recyclerView,
                    (activity as DetailsActivity?)?.loadItems()
                    // and dismiss this dialog.
                    dismiss()
                }
            } else {
                context?.toast(getString(R.string.error_item_store_update))
                enableSaveAction()
            }
        }

        override fun onFailure(call: Call<Item>, t: Throwable) {
            context?.toast(t.localizedMessage ?: "")
            enableSaveAction()
        }
    }

    private fun validateEditText(editText: EditText, textInputLayout: TextInputLayout, errorString: Int): Boolean {
        if (editText.text.toString().trim().isEmpty()) {
            textInputLayout.error = getString(errorString)
            return false
        } else {
            textInputLayout.isErrorEnabled = false
        }

        return true
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnCaptureQR -> scanCodeIfPermissionIsGranted(REQUEST_QR_CODE)
            R.id.btnCapturePatrimonial -> scanCodeIfPermissionIsGranted(REQUEST_PATRIMONIAL_CODE)
            R.id.btnCaptureOldCode -> scanCodeIfPermissionIsGranted(REQUEST_OLD_CODE)

            R.id.btnCheckQR -> performCheckQrRequest()
            R.id.btnTakeByPatrimonial -> performByPatrimonialRequest()
            R.id.btnTakeByOldCode -> performByOldCodeRequest()
        }
    }

    private fun scanCodeIfPermissionIsGranted(requestCode: Int) {
        activity?.checkAndRequestPermission(
                getString(R.string.dialog_camera_title),
                getString(R.string.dialog_camera_explanation),
                Manifest.permission.CAMERA, REQUEST_CAMERA_PERMISSION
        ) {
            startScanner(requestCode)
        }
    }

    private fun startScanner(requestCode: Int) {
        val intentQR = Intent(context, SimpleScannerActivity::class.java)
        startActivityForResult(intentQR, requestCode)
    }

    private fun performByPatrimonialRequest() {
        val patrimonial = etPatrimonial.text.toString().trim()

        if (patrimonial.isEmpty()) {
            context?.toast(getString(R.string.empty_patrimonial_code_search))
        } else {
            val call = MyApiAdapter.getApiService().getByPatrimonial(patrimonial)
            call.enqueue(TakeByPatrimonialCallback())
        }
    }

    internal inner class TakeByPatrimonialCallback : Callback<ExpectedDataResponse> {
        override fun onResponse(call: Call<ExpectedDataResponse>, response: Response<ExpectedDataResponse>) {
            if (response.isSuccessful) {
                response.body()?.let {
                    if (it.found)
                        setItemDataInViews(it.item, it.alreadyRegistered)
                    else
                        context?.toast(getString(R.string.no_data_found))
                } ?: run {
                    context?.toast(getString(R.string.no_data_found))
                }
            } else {
                context?.toast(getString(R.string.no_data_found))
            }
        }

        override fun onFailure(call: Call<ExpectedDataResponse>, t: Throwable) {
            context?.toast(t.localizedMessage ?: "")
        }
    }

    private fun setItemDataInViews(item: Item, alreadyRegistered: Boolean) {
        if (alreadyRegistered) {
            context?.showInfoDialog(getString(R.string.important), getString(R.string.item_patrimonial_code_already_registered))
            return
        }

        context?.toast(getString(R.string.data_found_and_loaded))

        val description = item.denomination.trim()
        val color = item.color?.trim()
        val brand = item.brand?.trim()
        val model = item.model?.trim()
        val series = item.series?.trim()
        val status = item.status

        checkLabeled.isChecked = true

        /*
        if (status == "BP" || status == "BA" || status == "NO" || status == "NU") {
            val message = "Lamentablemente este bien ha sido dado de baja."
            context?.showInfoDialog(title, message)
            return
        }
        */

        etDescription.setText(description)
        etColor.setText(color)
        etBrand.setText(brand)
        etModel.setText(model)
        etSeries.setText(series)
        spinnerStatus.setSelection(status)

        /*
        when (status) {
            "BU" -> preservation = "Bueno"
            "SE" -> preservation = "Bueno"
            "RE" -> preservation = "Regular"
            "MA" -> preservation = "Malo"
            "PB" -> preservation = "Malo"
            "ER" -> preservation = "Malo"
            "IN" -> preservation = "Malo"
        }
        spinnerPreservation.setSelection(spinnerPreservation.getItemIndex(preservation))
        */


        item.responsible?.let {
            val expectedResponsible = it.trim()

            if (expectedResponsible.isNotEmpty() && expectedResponsible != responsible) {
                val message = (
                    "Este bien le pertenece a $expectedResponsible.\n"
                        + "Verifica si el responsable de esta hoja ($responsible) se hará cargo.\n"
                        + "De caso contrario, crea una nueva hoja, márcala como pendiente y registra allí el bien."
                )

                context?.showInfoDialog(getString(R.string.important), message)
            }
        }
    }

    private fun performByOldCodeRequest() {
        val year = spinnerOldYear.selectedItem.toString()
        val code = etOldCode.text.toString().trim()

        if (code.isEmpty()) {
            context?.toast(getString(R.string.empty_old_code_search))
        } else {
            val call = MyApiAdapter.getApiService().getByOldCode(year, code)
            call.enqueue(TakeByOldCodeCallback())
        }
    }

    internal inner class TakeByOldCodeCallback : Callback<Item> {
        override fun onResponse(call: Call<Item>, response: Response<Item>) {
            if (response.isSuccessful) {
                response.body()?.let { item ->
                    etDescription.setText(item.denomination)
                    etPatrimonial.setText(item.patrimonial)
                    etColor.setText(item.color)

                    context?.toast(getString(R.string.data_found_and_loaded))
                } ?: run {
                    context?.toast(getString(R.string.no_data_found))
                }
            } else {
                context?.toast(getString(R.string.no_data_found))
            }
        }

        override fun onFailure(call: Call<Item>, t: Throwable) {
            context?.toast(t.localizedMessage ?: "")
        }
    }

    private fun performCheckQrRequest() {
        val qrCode = etQR.text.toString().trim()

        if (qrCode.isEmpty()) {
            context?.toast(getString(R.string.empty_qr_code_check))
        } else {
            val call = MyApiAdapter.getApiService().getCheckQr(qrCode)
            call.enqueue(CheckRequestCallback())
        }
    }

    internal inner class CheckRequestCallback : Callback<ExistsResponse> {
        override fun onResponse(call: Call<ExistsResponse>, response: Response<ExistsResponse>) {
            if (response.isSuccessful) {
                response.body()?.let {
                    context?.toast(it.message)
                    qrAlreadyExists = it.exists
                }
            }
        }

        override fun onFailure(call: Call<ExistsResponse>, t: Throwable) {
            context?.toast(t.toString())
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_QR_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                val result = data?.getStringExtra("code")
                etQR.setText(result)
                context?.toast(getString(R.string.instructions_use_button_to_check_qr_not_registered_yet))
            }
        } else if (requestCode == REQUEST_PATRIMONIAL_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                val result = data?.getStringExtra("code")
                etPatrimonial.setText(result)
                context?.toast(getString(R.string.instructions_use_button_to_get_data_by_patrimonial_code))
            }
        } else if (requestCode == REQUEST_OLD_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                val result = data?.getStringExtra("code")
                etOldCode.setText(result)
                context?.toast(getString(R.string.instructions_use_button_to_get_data_by_old_code))
            }
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {
            REQUEST_CAMERA_PERMISSION ->
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    context?.toast(getString(R.string.permission_camera_granted))
                } else {
                    context?.toast(getString(R.string.permission_camera_denied))
                }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(sheetId: Int, itemId: Int, responsible: String?): DetailDialog {
            val args = Bundle()
            args.putInt("hoja_id", sheetId)
            args.putInt("item_id", itemId)
            args.putString("responsable", responsible)

            val f = DetailDialog()
            f.arguments = args
            return f
        }

        const val REQUEST_QR_CODE = 1
        const val REQUEST_PATRIMONIAL_CODE = 2
        const val REQUEST_OLD_CODE = 3

        const val REQUEST_CAMERA_PERMISSION = 101
    }
}