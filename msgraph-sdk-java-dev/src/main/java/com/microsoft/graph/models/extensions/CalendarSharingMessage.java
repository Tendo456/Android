// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.CalendarSharingMessageAction;
import com.microsoft.graph.models.extensions.Message;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Sharing Message.
 */
public class CalendarSharingMessage extends Message implements IJsonBackedObject {


    /**
     * The Can Accept.
     * 
     */
    @SerializedName(value = "canAccept", alternate = {"CanAccept"})
    @Expose
    public Boolean canAccept;

    /**
     * The Sharing Message Action.
     * 
     */
    @SerializedName(value = "sharingMessageAction", alternate = {"SharingMessageAction"})
    @Expose
    public CalendarSharingMessageAction sharingMessageAction;

    /**
     * The Sharing Message Actions.
     * 
     */
    @SerializedName(value = "sharingMessageActions", alternate = {"SharingMessageActions"})
    @Expose
    public java.util.List<CalendarSharingMessageAction> sharingMessageActions;

    /**
     * The Suggested Calendar Name.
     * 
     */
    @SerializedName(value = "suggestedCalendarName", alternate = {"SuggestedCalendarName"})
    @Expose
    public String suggestedCalendarName;


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
