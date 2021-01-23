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
 * The class for the Key Credential.
 */
public class KeyCredential implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Custom Key Identifier.
     * Custom key identifier
     */
    @SerializedName(value = "customKeyIdentifier", alternate = {"CustomKeyIdentifier"})
    @Expose
    public byte[] customKeyIdentifier;

    /**
     * The Display Name.
     * Friendly name for the key. Optional.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The End Date Time.
     * The date and time at which the credential expires.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Key.
     * The certificate's raw data in byte array converted to Base64 string; for example, [System.Convert]::ToBase64String($Cert.GetRawCertData()).
     */
    @SerializedName(value = "key", alternate = {"Key"})
    @Expose
    public byte[] key;

    /**
     * The Key Id.
     * The unique identifier (GUID) for the key.
     */
    @SerializedName(value = "keyId", alternate = {"KeyId"})
    @Expose
    public java.util.UUID keyId;

    /**
     * The Start Date Time.
     * The date and time at which the credential becomes valid.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The Type.
     * The type of key credential; for example, 'Symmetric'.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
    public String type;

    /**
     * The Usage.
     * A string that describes the purpose for which the key can be used; for example, 'Verify'.
     */
    @SerializedName(value = "usage", alternate = {"Usage"})
    @Expose
    public String usage;


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