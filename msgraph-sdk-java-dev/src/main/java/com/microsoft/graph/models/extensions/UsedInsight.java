// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.UsageDetails;
import com.microsoft.graph.models.extensions.ResourceReference;
import com.microsoft.graph.models.extensions.ResourceVisualization;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Used Insight.
 */
public class UsedInsight extends Entity implements IJsonBackedObject {


    /**
     * The Last Used.
     * Information about when the item was last viewed or modified by the user. Read only.
     */
    @SerializedName(value = "lastUsed", alternate = {"LastUsed"})
    @Expose
    public UsageDetails lastUsed;

    /**
     * The Resource Reference.
     * Reference properties of the used document, such as the url and type of the document. Read-only
     */
    @SerializedName(value = "resourceReference", alternate = {"ResourceReference"})
    @Expose
    public ResourceReference resourceReference;

    /**
     * The Resource Visualization.
     * Properties that you can use to visualize the document in your experience. Read-only
     */
    @SerializedName(value = "resourceVisualization", alternate = {"ResourceVisualization"})
    @Expose
    public ResourceVisualization resourceVisualization;

    /**
     * The Resource.
     * Used for navigating to the item that was used. For file attachments, the type is fileAttachment. For linked attachments, the type is driveItem.
     */
    @SerializedName(value = "resource", alternate = {"Resource"})
    @Expose
    public Entity resource;


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
