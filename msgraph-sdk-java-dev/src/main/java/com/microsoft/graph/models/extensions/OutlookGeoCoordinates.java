// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook Geo Coordinates.
 */
public class OutlookGeoCoordinates implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Accuracy.
     * The accuracy of the latitude and longitude. As an example, the accuracy can be measured in meters, such as the latitude and longitude are accurate to within 50 meters.
     */
    @SerializedName(value = "accuracy", alternate = {"Accuracy"})
    @Expose
    public Double accuracy;

    /**
     * The Altitude.
     * The altitude of the location.
     */
    @SerializedName(value = "altitude", alternate = {"Altitude"})
    @Expose
    public Double altitude;

    /**
     * The Altitude Accuracy.
     * The accuracy of the altitude.
     */
    @SerializedName(value = "altitudeAccuracy", alternate = {"AltitudeAccuracy"})
    @Expose
    public Double altitudeAccuracy;

    /**
     * The Latitude.
     * The latitude of the location.
     */
    @SerializedName(value = "latitude", alternate = {"Latitude"})
    @Expose
    public Double latitude;

    /**
     * The Longitude.
     * The longitude of the location.
     */
    @SerializedName(value = "longitude", alternate = {"Longitude"})
    @Expose
    public Double longitude;


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
