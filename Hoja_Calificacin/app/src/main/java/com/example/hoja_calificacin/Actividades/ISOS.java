package com.example.hoja_calificacin.Actividades;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hoja_calificacin.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.JsonObject;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.IGraphServiceClient;
import com.microsoft.graph.requests.extensions.GraphServiceClient;
import com.microsoft.identity.client.AuthenticationCallback;
import com.microsoft.identity.client.IAccount;
import com.microsoft.identity.client.IAuthenticationResult;
import com.microsoft.identity.client.IPublicClientApplication;
import com.microsoft.identity.client.ISingleAccountPublicClientApplication;
import com.microsoft.identity.client.PublicClientApplication;
import com.microsoft.identity.client.SilentAuthenticationCallback;
import com.microsoft.identity.client.exception.MsalException;

import java.util.Objects;

public class ISOS extends AppCompatActivity {

    private final static String[] SCOPES = {"Files.Read"};
    /* Azure AD v2 Configs */
    final static String AUTHORITY = "https://login.microsoftonline.com/common";
    private ISingleAccountPublicClientApplication mSingleAccountApp;

    private static final String TAG = MainActivity.class.getSimpleName();

    /* UI & Debugging Variables */
    Button signInButton;
    //Button callGraphApiInteractiveButton;
    //Button callGraphApiSilentButton;
    TextView logTextView;
    TextView currentUserTextView;
    String saveuser;
    String userisos = "Usuario ISOS";
    FloatingActionButton signOutButton,next;

    private Window window;
    String primaryDark = "#3F51B5";
    String primary = "#3F51B5";
    String background = "#303F9F";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_s_o_s);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.logo);

        this.window = getWindow();
        color(primaryDark,primary,background);

        initializeUI();

        PublicClientApplication.createSingleAccountPublicClientApplication(getApplicationContext(),
                R.raw.auth_config_single_account, new IPublicClientApplication.ISingleAccountApplicationCreatedListener() {
                    @Override
                    public void onCreated(ISingleAccountPublicClientApplication application) {
                        mSingleAccountApp = application;
                        loadAccount();
                    }
                    @Override
                    public void onError(MsalException exception) {
                        displayError(exception);
                    }
                });
    }
    //When app comes to the foreground, load existing account to determine if user is signed in
    private void loadAccount() {
        if (mSingleAccountApp == null) {
            return;
        }

        mSingleAccountApp.getCurrentAccountAsync(new ISingleAccountPublicClientApplication.CurrentAccountCallback() {
            @Override
            public void onAccountLoaded(@Nullable IAccount activeAccount) {
                // You can use the account data to update your UI or your app database.
                updateUI(activeAccount);
            }

            @Override
            public void onAccountChanged(@Nullable IAccount priorAccount, @Nullable IAccount currentAccount) {
                if (currentAccount == null) {
                    // Perform a cleanup task as the signed-in account changed.
                    performOperationOnSignOut();
                }
            }

            @Override
            public void onError(@NonNull MsalException exception) {
                displayError(exception);
            }
        });
    }

    private void initializeUI(){
        signInButton = findViewById(R.id.signIn);
        //callGraphApiSilentButton = findViewById(R.id.callGraphSilent);
        //callGraphApiInteractiveButton = findViewById(R.id.callGraphInteractive);
        signOutButton = findViewById(R.id.clearCache);
        next = findViewById(R.id.next);
        logTextView = findViewById(R.id.txt_log);
        currentUserTextView = findViewById(R.id.current_user);

        //Sign in user
        signInButton.setOnClickListener(v -> {
            if (mSingleAccountApp == null) {
                return;
            }
            mSingleAccountApp.signIn(ISOS.this, null, SCOPES, getAuthInteractiveCallback());
        });

        //Sign out user
        signOutButton.setOnClickListener(v -> {
            if (mSingleAccountApp == null){
                return;
            }
            mSingleAccountApp.signOut(new ISingleAccountPublicClientApplication.SignOutCallback() {
                @Override
                public void onSignOut() {
                    updateUI(null);
                    performOperationOnSignOut();
                    finish();
                }
                @Override
                public void onError(@NonNull MsalException exception){
                    displayError(exception);
                }
            });
        });

        /*Interactive
        callGraphApiInteractiveButton.setOnClickListener(v -> {
            if (mSingleAccountApp == null) {
                return;
            }
            mSingleAccountApp.acquireToken(MainActivity.this, SCOPES, getAuthInteractiveCallback());
        });

        //Silent
        callGraphApiSilentButton.setOnClickListener(v -> {
            if (mSingleAccountApp == null){
                return;
            }
            mSingleAccountApp.acquireTokenSilentAsync(SCOPES, AUTHORITY, getAuthSilentCallback());
        });*/

        next.setOnClickListener(v ->{
            Intent intent = new Intent(ISOS.this, MainActivity.class);
            intent.putExtra("EmailUser",saveuser);
            intent.putExtra("DisplayUser",userisos);
            startActivity(intent);
        });
    }

    private AuthenticationCallback getAuthInteractiveCallback() {
        return new AuthenticationCallback() {
            @Override
            public void onSuccess(IAuthenticationResult authenticationResult) {
                /* Successfully got a token, use it to call a protected resource - MSGraph */
                Log.d(TAG, "Successfully authenticated");
                /* Update UI */
                updateUI(authenticationResult.getAccount());
                /* call graph */
                callGraphAPI(authenticationResult);
            }

            @Override
            public void onError(MsalException exception) {
                /* Failed to acquireToken */
                Log.d(TAG, "Authentication failed: " + exception.toString());
                displayError(exception);
            }
            @Override
            public void onCancel() {
                /* User canceled the authentication */
                Log.d(TAG, "User cancelled login.");
            }
        };
    }

    private SilentAuthenticationCallback getAuthSilentCallback() {
        return new SilentAuthenticationCallback() {
            @Override
            public void onSuccess(IAuthenticationResult authenticationResult) {
                Log.d(TAG, "Successfully authenticated");
                callGraphAPI(authenticationResult);
            }
            @Override
            public void onError(MsalException exception) {
                Log.d(TAG, "Authentication failed: " + exception.toString());
                displayError(exception);
            }
        };
    }

    private void callGraphAPI(IAuthenticationResult authenticationResult) {

        final String accessToken = authenticationResult.getAccessToken();

        IGraphServiceClient graphClient =
                GraphServiceClient
                        .builder()
                        .authenticationProvider(request -> {
                            Log.d(TAG, "Authenticating request," + request.getRequestUrl());
                            request.addHeader("Authorization", "Bearer " + accessToken);
                        })
                        .buildClient();

        graphClient
                .me()
                .drive()
                .buildRequest()
                .get(new ICallback<Drive>() {
                    @Override
                    public void success(final Drive drive) {
                        Log.d(TAG, "Found Drive " + drive.id);
                        displayGraphResult(drive.getRawObject());
                    }

                    @Override
                    public void failure(ClientException ex) {
                        displayError(ex);
                    }
                });
    }

    private void updateUI(@Nullable final IAccount account) {
        if (account != null) {
            signInButton.setEnabled(false);
            signOutButton.setEnabled(true);
            //callGraphApiInteractiveButton.setEnabled(true);
            //callGraphApiSilentButton.setEnabled(true);
            next.setEnabled(true);
            currentUserTextView.setText(account.getUsername());
            saveuser = currentUserTextView.getText().toString();
            Toast.makeText(getApplicationContext(),"Bienvenido ", Toast.LENGTH_SHORT).show();
        } else {
            signInButton.setEnabled(true);
            signOutButton.setEnabled(false);
            //callGraphApiInteractiveButton.setEnabled(false);
            //callGraphApiSilentButton.setEnabled(false);
            next.setEnabled(false);
            currentUserTextView.setText("");
            logTextView.setText("");
        }
    }

    private void displayError(@NonNull final Exception exception) {
        logTextView.setText(exception.toString());
    }

    private void displayGraphResult(@NonNull final JsonObject graphResponse) {
        logTextView.setText(graphResponse.toString());
    }

    private void performOperationOnSignOut() {
        final String signOutText = "Sesion Cerrada";
        currentUserTextView.setText("");
        Toast.makeText(getApplicationContext(), signOutText, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        if (mSingleAccountApp == null){
            return;
        }
        mSingleAccountApp.signOut(new ISingleAccountPublicClientApplication.SignOutCallback() {
            @Override
            public void onSignOut() {
                updateUI(null);
                performOperationOnSignOut();
            }
            @Override
            public void onError(@NonNull MsalException exception){
                displayError(exception);
            }
        });
        super.onBackPressed();
    }

    public void color (String primaryDark, String primary, String background){

        window.setStatusBarColor(Color.parseColor(primaryDark));

        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(Color.parseColor(primary)));

        //window.setBackgroundDrawable(new ColorDrawable(Color.parseColor(background)));

        window.setNavigationBarColor(Color.parseColor(primary));

    }

}