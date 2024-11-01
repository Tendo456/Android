// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ManagedAppPolicyDeploymentSummaryPerApp;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Policy Deployment Summary.
 */
public class ManagedAppPolicyDeploymentSummary extends Entity implements IJsonBackedObject {


    /**
     * The Configuration Deployed User Count.
     * Not yet documented
     */
    @SerializedName(value = "configurationDeployedUserCount", alternate = {"ConfigurationDeployedUserCount"})
    @Expose
    public Integer configurationDeployedUserCount;

    /**
     * The Configuration Deployment Summary Per App.
     * Not yet documented
     */
    @SerializedName(value = "configurationDeploymentSummaryPerApp", alternate = {"ConfigurationDeploymentSummaryPerApp"})
    @Expose
    public java.util.List<ManagedAppPolicyDeploymentSummaryPerApp> configurationDeploymentSummaryPerApp;

    /**
     * The Display Name.
     * Not yet documented
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Last Refresh Time.
     * Not yet documented
     */
    @SerializedName(value = "lastRefreshTime", alternate = {"LastRefreshTime"})
    @Expose
    public java.util.Calendar lastRefreshTime;

    /**
     * The Version.
     * Version of the entity.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
    public String version;


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
