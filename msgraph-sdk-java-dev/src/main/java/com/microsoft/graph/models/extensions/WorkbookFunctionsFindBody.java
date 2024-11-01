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
 * The class for the Workbook Functions Find Body.
 */
public class WorkbookFunctionsFindBody {

    /**
     * The find Text.
     * 
     */
    @SerializedName(value = "findText", alternate = {"FindText"})
    @Expose
    public com.google.gson.JsonElement findText;

    /**
     * The within Text.
     * 
     */
    @SerializedName(value = "withinText", alternate = {"WithinText"})
    @Expose
    public com.google.gson.JsonElement withinText;

    /**
     * The start Num.
     * 
     */
    @SerializedName(value = "startNum", alternate = {"StartNum"})
    @Expose
    public com.google.gson.JsonElement startNum;


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
