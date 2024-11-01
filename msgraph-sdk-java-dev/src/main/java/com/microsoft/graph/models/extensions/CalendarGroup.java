// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.CalendarCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Group.
 */
public class CalendarGroup extends Entity implements IJsonBackedObject {


    /**
     * The Change Key.
     * Identifies the version of the calendar group. Every time the calendar group is changed, ChangeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     */
    @SerializedName(value = "changeKey", alternate = {"ChangeKey"})
    @Expose
    public String changeKey;

    /**
     * The Class Id.
     * The class identifier. Read-only.
     */
    @SerializedName(value = "classId", alternate = {"ClassId"})
    @Expose
    public java.util.UUID classId;

    /**
     * The Name.
     * The group name.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Calendars.
     * The calendars in the calendar group. Navigation property. Read-only. Nullable.
     */
    @SerializedName(value = "calendars", alternate = {"Calendars"})
    @Expose
    public CalendarCollectionPage calendars;


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


        if (json.has("calendars")) {
            calendars = serializer.deserializeObject(json.get("calendars").toString(), CalendarCollectionPage.class);
        }
    }
}
