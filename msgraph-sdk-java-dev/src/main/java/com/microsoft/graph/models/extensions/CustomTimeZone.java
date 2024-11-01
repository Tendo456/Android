// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DaylightTimeZoneOffset;
import com.microsoft.graph.models.extensions.StandardTimeZoneOffset;
import com.microsoft.graph.models.extensions.TimeZoneBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Custom Time Zone.
 */
public class CustomTimeZone extends TimeZoneBase implements IJsonBackedObject {


    /**
     * The Bias.
     * The time offset of the time zone from Coordinated Universal Time (UTC). This value is in minutes. Time zones that are ahead of UTC have a positive offset; time zones that are behind UTC have a negative offset.
     */
    @SerializedName(value = "bias", alternate = {"Bias"})
    @Expose
    public Integer bias;

    /**
     * The Daylight Offset.
     * Specifies when the time zone switches from standard time to daylight saving time.
     */
    @SerializedName(value = "daylightOffset", alternate = {"DaylightOffset"})
    @Expose
    public DaylightTimeZoneOffset daylightOffset;

    /**
     * The Standard Offset.
     * Specifies when the time zone switches from daylight saving time to standard time.
     */
    @SerializedName(value = "standardOffset", alternate = {"StandardOffset"})
    @Expose
    public StandardTimeZoneOffset standardOffset;


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
