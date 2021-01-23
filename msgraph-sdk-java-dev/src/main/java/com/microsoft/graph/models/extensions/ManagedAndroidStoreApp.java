// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AndroidMinimumOperatingSystem;
import com.microsoft.graph.models.extensions.ManagedApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Android Store App.
 */
public class ManagedAndroidStoreApp extends ManagedApp implements IJsonBackedObject {


    /**
     * The App Store Url.
     * The Android AppStoreUrl.
     */
    @SerializedName(value = "appStoreUrl", alternate = {"AppStoreUrl"})
    @Expose
    public String appStoreUrl;

    /**
     * The Minimum Supported Operating System.
     * The value for the minimum supported operating system.
     */
    @SerializedName(value = "minimumSupportedOperatingSystem", alternate = {"MinimumSupportedOperatingSystem"})
    @Expose
    public AndroidMinimumOperatingSystem minimumSupportedOperatingSystem;

    /**
     * The Package Id.
     * The app's package ID.
     */
    @SerializedName(value = "packageId", alternate = {"PackageId"})
    @Expose
    public String packageId;


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