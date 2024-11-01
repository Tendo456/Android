// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WorkbookTableColumn;
import com.microsoft.graph.models.extensions.WorkbookTableRow;
import com.microsoft.graph.models.extensions.WorkbookTableSort;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookTableRowCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table.
 */
public class WorkbookTable extends Entity implements IJsonBackedObject {


    /**
     * The Highlight First Column.
     * Indicates whether the first column contains special formatting.
     */
    @SerializedName(value = "highlightFirstColumn", alternate = {"HighlightFirstColumn"})
    @Expose
    public Boolean highlightFirstColumn;

    /**
     * The Highlight Last Column.
     * Indicates whether the last column contains special formatting.
     */
    @SerializedName(value = "highlightLastColumn", alternate = {"HighlightLastColumn"})
    @Expose
    public Boolean highlightLastColumn;

    /**
     * The Legacy Id.
     * Legacy Id used in older Excle clients. The value of the identifier remains the same even when the table is renamed. This property should be interpreted as an opaque string value and should not be parsed to any other type. Read-only.
     */
    @SerializedName(value = "legacyId", alternate = {"LegacyId"})
    @Expose
    public String legacyId;

    /**
     * The Name.
     * Name of the table.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Show Banded Columns.
     * Indicates whether the columns show banded formatting in which odd columns are highlighted differently from even ones to make reading the table easier.
     */
    @SerializedName(value = "showBandedColumns", alternate = {"ShowBandedColumns"})
    @Expose
    public Boolean showBandedColumns;

    /**
     * The Show Banded Rows.
     * Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make reading the table easier.
     */
    @SerializedName(value = "showBandedRows", alternate = {"ShowBandedRows"})
    @Expose
    public Boolean showBandedRows;

    /**
     * The Show Filter Button.
     * Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row.
     */
    @SerializedName(value = "showFilterButton", alternate = {"ShowFilterButton"})
    @Expose
    public Boolean showFilterButton;

    /**
     * The Show Headers.
     * Indicates whether the header row is visible or not. This value can be set to show or remove the header row.
     */
    @SerializedName(value = "showHeaders", alternate = {"ShowHeaders"})
    @Expose
    public Boolean showHeaders;

    /**
     * The Show Totals.
     * Indicates whether the total row is visible or not. This value can be set to show or remove the total row.
     */
    @SerializedName(value = "showTotals", alternate = {"ShowTotals"})
    @Expose
    public Boolean showTotals;

    /**
     * The Style.
     * Constant value that represents the Table style. The possible values are: TableStyleLight1 thru TableStyleLight21, TableStyleMedium1 thru TableStyleMedium28, TableStyleStyleDark1 thru TableStyleStyleDark11. A custom user-defined style present in the workbook can also be specified.
     */
    @SerializedName(value = "style", alternate = {"Style"})
    @Expose
    public String style;

    /**
     * The Columns.
     * Represents a collection of all the columns in the table. Read-only.
     */
    @SerializedName(value = "columns", alternate = {"Columns"})
    @Expose
    public WorkbookTableColumnCollectionPage columns;

    /**
     * The Rows.
     * Represents a collection of all the rows in the table. Read-only.
     */
    @SerializedName(value = "rows", alternate = {"Rows"})
    @Expose
    public WorkbookTableRowCollectionPage rows;

    /**
     * The Sort.
     * Represents the sorting for the table. Read-only.
     */
    @SerializedName(value = "sort", alternate = {"Sort"})
    @Expose
    public WorkbookTableSort sort;

    /**
     * The Worksheet.
     * The worksheet containing the current table. Read-only.
     */
    @SerializedName(value = "worksheet", alternate = {"Worksheet"})
    @Expose
    public WorkbookWorksheet worksheet;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("columns")) {
            columns = serializer.deserializeObject(json.get("columns").toString(), WorkbookTableColumnCollectionPage.class);
        }

        if (json.has("rows")) {
            rows = serializer.deserializeObject(json.get("rows").toString(), WorkbookTableRowCollectionPage.class);
        }
    }
}
