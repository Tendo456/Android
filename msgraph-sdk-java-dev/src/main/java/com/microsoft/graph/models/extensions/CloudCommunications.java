// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.callrecords.models.extensions.CallRecord;
import com.microsoft.graph.models.extensions.OnlineMeeting;
import com.microsoft.graph.models.extensions.Presence;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.CallCollectionPage;
import com.microsoft.graph.callrecords.requests.extensions.CallRecordCollectionPage;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionPage;
import com.microsoft.graph.requests.extensions.PresenceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Communications.
 */
public class CloudCommunications extends Entity implements IJsonBackedObject {


    /**
     * The Calls.
     * 
     */
    @SerializedName(value = "calls", alternate = {"Calls"})
    @Expose
    public CallCollectionPage calls;

    /**
     * The Call Records.
     * 
     */
    @SerializedName(value = "callRecords", alternate = {"CallRecords"})
    @Expose
    public CallRecordCollectionPage callRecords;

    /**
     * The Online Meetings.
     * 
     */
    @SerializedName(value = "onlineMeetings", alternate = {"OnlineMeetings"})
    @Expose
    public OnlineMeetingCollectionPage onlineMeetings;

    /**
     * The Presences.
     * 
     */
    @SerializedName(value = "presences", alternate = {"Presences"})
    @Expose
    public PresenceCollectionPage presences;


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


        if (json.has("calls")) {
            calls = serializer.deserializeObject(json.get("calls").toString(), CallCollectionPage.class);
        }

        if (json.has("callRecords")) {
            callRecords = serializer.deserializeObject(json.get("callRecords").toString(), CallRecordCollectionPage.class);
        }

        if (json.has("onlineMeetings")) {
            onlineMeetings = serializer.deserializeObject(json.get("onlineMeetings").toString(), OnlineMeetingCollectionPage.class);
        }

        if (json.has("presences")) {
            presences = serializer.deserializeObject(json.get("presences").toString(), PresenceCollectionPage.class);
        }
    }
}
