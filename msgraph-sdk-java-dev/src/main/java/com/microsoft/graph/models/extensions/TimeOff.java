// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.TimeOffItem;
import com.microsoft.graph.models.extensions.ChangeTrackedEntity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Off.
 */
public class TimeOff extends ChangeTrackedEntity implements IJsonBackedObject {


    /**
     * The Draft Time Off.
     * The draft version of this timeOff that is viewable by managers. Required.
     */
    @SerializedName(value = "draftTimeOff", alternate = {"DraftTimeOff"})
    @Expose
    public TimeOffItem draftTimeOff;

    /**
     * The Shared Time Off.
     * The shared version of this timeOff that is viewable by both employees and managers. Required.
     */
    @SerializedName(value = "sharedTimeOff", alternate = {"SharedTimeOff"})
    @Expose
    public TimeOffItem sharedTimeOff;

    /**
     * The User Id.
     * ID of the user assigned to the timeOff. Required.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
    public String userId;


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
