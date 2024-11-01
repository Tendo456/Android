// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sign In Status.
 */
public class SignInStatus implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Additional Details.
     * Provides additional details on the sign-in activity
     */
    @SerializedName(value = "additionalDetails", alternate = {"AdditionalDetails"})
    @Expose
    public String additionalDetails;

    /**
     * The Error Code.
     * Provides the 5-6 digit error code that's generated during a sign-in failure. Check out the list of error codes and messages.
     */
    @SerializedName(value = "errorCode", alternate = {"ErrorCode"})
    @Expose
    public Integer errorCode;

    /**
     * The Failure Reason.
     * Provides the error message or the reason for failure for the corresponding sign-in activity. Check out the list of error codes and messages.
     */
    @SerializedName(value = "failureReason", alternate = {"FailureReason"})
    @Expose
    public String failureReason;


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
