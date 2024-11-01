// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RatingFranceMoviesType;
import com.microsoft.graph.models.generated.RatingFranceTelevisionType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Media Content Rating France.
 */
public class MediaContentRatingFrance implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Movie Rating.
     * Movies rating selected for France. Possible values are: allAllowed, allBlocked, agesAbove10, agesAbove12, agesAbove16, agesAbove18.
     */
    @SerializedName(value = "movieRating", alternate = {"MovieRating"})
    @Expose
    public RatingFranceMoviesType movieRating;

    /**
     * The Tv Rating.
     * TV rating selected for France. Possible values are: allAllowed, allBlocked, agesAbove10, agesAbove12, agesAbove16, agesAbove18.
     */
    @SerializedName(value = "tvRating", alternate = {"TvRating"})
    @Expose
    public RatingFranceTelevisionType tvRating;


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
