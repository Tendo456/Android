// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.models.extensions.WorkbookNamedItem;
import com.microsoft.graph.models.extensions.WorkbookPivotTable;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtection;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.WorkbookChartCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookTableCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet.
 */
public class WorkbookWorksheet extends Entity implements IJsonBackedObject {


    /**
     * The Name.
     * The display name of the worksheet.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Position.
     * The zero-based position of the worksheet within the workbook.
     */
    @SerializedName(value = "position", alternate = {"Position"})
    @Expose
    public Integer position;

    /**
     * The Visibility.
     * The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden.
     */
    @SerializedName(value = "visibility", alternate = {"Visibility"})
    @Expose
    public String visibility;

    /**
     * The Charts.
     * Returns collection of charts that are part of the worksheet. Read-only.
     */
    @SerializedName(value = "charts", alternate = {"Charts"})
    @Expose
    public WorkbookChartCollectionPage charts;

    /**
     * The Names.
     * Returns collection of names that are associated with the worksheet. Read-only.
     */
    @SerializedName(value = "names", alternate = {"Names"})
    @Expose
    public WorkbookNamedItemCollectionPage names;

    /**
     * The Pivot Tables.
     * Collection of PivotTables that are part of the worksheet.
     */
    @SerializedName(value = "pivotTables", alternate = {"PivotTables"})
    @Expose
    public WorkbookPivotTableCollectionPage pivotTables;

    /**
     * The Protection.
     * Returns sheet protection object for a worksheet. Read-only.
     */
    @SerializedName(value = "protection", alternate = {"Protection"})
    @Expose
    public WorkbookWorksheetProtection protection;

    /**
     * The Tables.
     * Collection of tables that are part of the worksheet. Read-only.
     */
    @SerializedName(value = "tables", alternate = {"Tables"})
    @Expose
    public WorkbookTableCollectionPage tables;


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


        if (json.has("charts")) {
            charts = serializer.deserializeObject(json.get("charts").toString(), WorkbookChartCollectionPage.class);
        }

        if (json.has("names")) {
            names = serializer.deserializeObject(json.get("names").toString(), WorkbookNamedItemCollectionPage.class);
        }

        if (json.has("pivotTables")) {
            pivotTables = serializer.deserializeObject(json.get("pivotTables").toString(), WorkbookPivotTableCollectionPage.class);
        }

        if (json.has("tables")) {
            tables = serializer.deserializeObject(json.get("tables").toString(), WorkbookTableCollectionPage.class);
        }
    }
}
