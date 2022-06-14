// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.callrecords.models.extensions.Endpoint;
import com.microsoft.graph.callrecords.models.extensions.FailureInfo;
import com.microsoft.graph.callrecords.models.extensions.Media;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Segment.
 */
public class Segment extends Entity implements IJsonBackedObject {


    /**
     * The Callee.
     * Endpoint that answered this segment.
     */
    @SerializedName(value = "callee", alternate = {"Callee"})
    @Expose
    public Endpoint callee;

    /**
     * The Caller.
     * Endpoint that initiated this segment.
     */
    @SerializedName(value = "caller", alternate = {"Caller"})
    @Expose
    public Endpoint caller;

    /**
     * The End Date Time.
     * UTC time when the segment ended. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Failure Info.
     * Failure information associated with the segment if it failed.
     */
    @SerializedName(value = "failureInfo", alternate = {"FailureInfo"})
    @Expose
    public FailureInfo failureInfo;

    /**
     * The Media.
     * Media associated with this segment.
     */
    @SerializedName(value = "media", alternate = {"Media"})
    @Expose
    public java.util.List<Media> media;

    /**
     * The Start Date Time.
     * UTC time when the segment started. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
    public java.util.Calendar startDateTime;


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
