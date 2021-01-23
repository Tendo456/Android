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
 * The class for the Workbook Functions F_Inv_RTBody.
 */
public class WorkbookFunctionsF_Inv_RTBody {

    /**
     * The probability.
     * 
     */
    @SerializedName(value = "probability", alternate = {"Probability"})
    @Expose
    public com.google.gson.JsonElement probability;

    /**
     * The deg Freedom1.
     * 
     */
    @SerializedName(value = "degFreedom1", alternate = {"DegFreedom1"})
    @Expose
    public com.google.gson.JsonElement degFreedom1;

    /**
     * The deg Freedom2.
     * 
     */
    @SerializedName(value = "degFreedom2", alternate = {"DegFreedom2"})
    @Expose
    public com.google.gson.JsonElement degFreedom2;


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