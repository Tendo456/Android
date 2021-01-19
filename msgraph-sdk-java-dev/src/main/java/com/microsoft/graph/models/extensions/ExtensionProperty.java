// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DirectoryObject;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Extension Property.
 */
public class ExtensionProperty extends DirectoryObject implements IJsonBackedObject {


    /**
     * The App Display Name.
     * Display name of the application object on which this extension property is defined. Read-only.
     */
    @SerializedName(value = "appDisplayName", alternate = {"AppDisplayName"})
    @Expose
    public String appDisplayName;

    /**
     * The Data Type.
     * Specifies the data type of the value the extension property can hold. Following values are supported. Not nullable. Binary - 256 bytes maximumBooleanDateTime - Must be specified in ISO 8601 format. Will be stored in UTC.Integer - 32-bit value.LargeInteger - 64-bit value.String - 256 characters maximum
     */
    @SerializedName(value = "dataType", alternate = {"DataType"})
    @Expose
    public String dataType;

    /**
     * The Is Synced From On Premises.
     * Indicates if this extension property was sycned from onpremises directory using Azure AD Connect. Read-only.
     */
    @SerializedName(value = "isSyncedFromOnPremises", alternate = {"IsSyncedFromOnPremises"})
    @Expose
    public Boolean isSyncedFromOnPremises;

    /**
     * The Name.
     * Name of the extension property. Not nullable.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Target Objects.
     * Following values are supported. Not nullable. UserGroupOrganizationDeviceApplication
     */
    @SerializedName(value = "targetObjects", alternate = {"TargetObjects"})
    @Expose
    public java.util.List<String> targetObjects;


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
