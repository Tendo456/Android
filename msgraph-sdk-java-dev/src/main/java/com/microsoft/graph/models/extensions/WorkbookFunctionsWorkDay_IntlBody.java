// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Work Day_Intl Body.
 */
public class WorkbookFunctionsWorkDay_IntlBody {

    /**
     * The start Date.
     * 
     */
    @SerializedName(value = "startDate", alternate = {"StartDate"})
    @Expose
    public com.google.gson.JsonElement startDate;

    /**
     * The days.
     * 
     */
    @SerializedName(value = "days", alternate = {"Days"})
    @Expose
    public com.google.gson.JsonElement days;

    /**
     * The weekend.
     * 
     */
    @SerializedName(value = "weekend", alternate = {"Weekend"})
    @Expose
    public com.google.gson.JsonElement weekend;

    /**
     * The holidays.
     * 
     */
    @SerializedName(value = "holidays", alternate = {"Holidays"})
    @Expose
    public com.google.gson.JsonElement holidays;


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
