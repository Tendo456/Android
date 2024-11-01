// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ResultInfo;
import com.microsoft.graph.models.generated.OperationStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Comms Operation.
 */
public class CommsOperation extends Entity implements IJsonBackedObject {


    /**
     * The Client Context.
     * Unique Client Context string. Max limit is 256 chars.
     */
    @SerializedName(value = "clientContext", alternate = {"ClientContext"})
    @Expose
    public String clientContext;

    /**
     * The Result Info.
     * The result information. Read-only.
     */
    @SerializedName(value = "resultInfo", alternate = {"ResultInfo"})
    @Expose
    public ResultInfo resultInfo;

    /**
     * The Status.
     * Possible values are: notStarted, running, completed, failed. Read-only.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public OperationStatus status;


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
