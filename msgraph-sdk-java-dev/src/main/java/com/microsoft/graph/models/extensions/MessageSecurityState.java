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
 * The class for the Message Security State.
 */
public class MessageSecurityState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Connecting IP.
     * 
     */
    @SerializedName(value = "connectingIP", alternate = {"ConnectingIP"})
    @Expose
    public String connectingIP;

    /**
     * The Delivery Action.
     * 
     */
    @SerializedName(value = "deliveryAction", alternate = {"DeliveryAction"})
    @Expose
    public String deliveryAction;

    /**
     * The Delivery Location.
     * 
     */
    @SerializedName(value = "deliveryLocation", alternate = {"DeliveryLocation"})
    @Expose
    public String deliveryLocation;

    /**
     * The Directionality.
     * 
     */
    @SerializedName(value = "directionality", alternate = {"Directionality"})
    @Expose
    public String directionality;

    /**
     * The Internet Message Id.
     * 
     */
    @SerializedName(value = "internetMessageId", alternate = {"InternetMessageId"})
    @Expose
    public String internetMessageId;

    /**
     * The Message Fingerprint.
     * 
     */
    @SerializedName(value = "messageFingerprint", alternate = {"MessageFingerprint"})
    @Expose
    public String messageFingerprint;

    /**
     * The Message Received Date Time.
     * 
     */
    @SerializedName(value = "messageReceivedDateTime", alternate = {"MessageReceivedDateTime"})
    @Expose
    public java.util.Calendar messageReceivedDateTime;

    /**
     * The Message Subject.
     * 
     */
    @SerializedName(value = "messageSubject", alternate = {"MessageSubject"})
    @Expose
    public String messageSubject;

    /**
     * The Network Message Id.
     * 
     */
    @SerializedName(value = "networkMessageId", alternate = {"NetworkMessageId"})
    @Expose
    public String networkMessageId;


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
