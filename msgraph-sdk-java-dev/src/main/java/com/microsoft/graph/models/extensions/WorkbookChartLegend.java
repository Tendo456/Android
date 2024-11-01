// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WorkbookChartLegendFormat;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Legend.
 */
public class WorkbookChartLegend extends Entity implements IJsonBackedObject {


    /**
     * The Overlay.
     * Boolean value for whether the chart legend should overlap with the main body of the chart.
     */
    @SerializedName(value = "overlay", alternate = {"Overlay"})
    @Expose
    public Boolean overlay;

    /**
     * The Position.
     * Represents the position of the legend on the chart. The possible values are: Top, Bottom, Left, Right, Corner, Custom.
     */
    @SerializedName(value = "position", alternate = {"Position"})
    @Expose
    public String position;

    /**
     * The Visible.
     * A boolean value the represents the visibility of a ChartLegend object.
     */
    @SerializedName(value = "visible", alternate = {"Visible"})
    @Expose
    public Boolean visible;

    /**
     * The Format.
     * Represents the formatting of a chart legend, which includes fill and font formatting. Read-only.
     */
    @SerializedName(value = "format", alternate = {"Format"})
    @Expose
    public WorkbookChartLegendFormat format;


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

    }
}
