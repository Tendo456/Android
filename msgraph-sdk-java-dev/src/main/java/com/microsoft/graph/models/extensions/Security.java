// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Alert;
import com.microsoft.graph.models.extensions.SecureScoreControlProfile;
import com.microsoft.graph.models.extensions.SecureScore;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AlertCollectionPage;
import com.microsoft.graph.requests.extensions.SecureScoreControlProfileCollectionPage;
import com.microsoft.graph.requests.extensions.SecureScoreCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security.
 */
public class Security extends Entity implements IJsonBackedObject {


    /**
     * The Alerts.
     * Read-only. Nullable.
     */
    @SerializedName(value = "alerts", alternate = {"Alerts"})
    @Expose
    public AlertCollectionPage alerts;

    /**
     * The Secure Score Control Profiles.
     * 
     */
    @SerializedName(value = "secureScoreControlProfiles", alternate = {"SecureScoreControlProfiles"})
    @Expose
    public SecureScoreControlProfileCollectionPage secureScoreControlProfiles;

    /**
     * The Secure Scores.
     * 
     */
    @SerializedName(value = "secureScores", alternate = {"SecureScores"})
    @Expose
    public SecureScoreCollectionPage secureScores;


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


        if (json.has("alerts")) {
            alerts = serializer.deserializeObject(json.get("alerts").toString(), AlertCollectionPage.class);
        }

        if (json.has("secureScoreControlProfiles")) {
            secureScoreControlProfiles = serializer.deserializeObject(json.get("secureScoreControlProfiles").toString(), SecureScoreControlProfileCollectionPage.class);
        }

        if (json.has("secureScores")) {
            secureScores = serializer.deserializeObject(json.get("secureScores").toString(), SecureScoreCollectionPage.class);
        }
    }
}
