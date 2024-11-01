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
 * The class for the Resource Visualization.
 */
public class ResourceVisualization implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Container Display Name.
     * A string describing where the item is stored. For example, the name of a SharePoint site or the user name identifying the owner of the OneDrive storing the item.
     */
    @SerializedName(value = "containerDisplayName", alternate = {"ContainerDisplayName"})
    @Expose
    public String containerDisplayName;

    /**
     * The Container Type.
     * Can be used for filtering by the type of container in which the file is stored. Such as Site or OneDriveBusiness.
     */
    @SerializedName(value = "containerType", alternate = {"ContainerType"})
    @Expose
    public String containerType;

    /**
     * The Container Web Url.
     * A path leading to the folder in which the item is stored.
     */
    @SerializedName(value = "containerWebUrl", alternate = {"ContainerWebUrl"})
    @Expose
    public String containerWebUrl;

    /**
     * The Media Type.
     * The item's media type. Can be used for filtering for a specific type of file based on supported IANA Media Mime Types. Note that not all Media Mime Types are supported.
     */
    @SerializedName(value = "mediaType", alternate = {"MediaType"})
    @Expose
    public String mediaType;

    /**
     * The Preview Image Url.
     * A URL leading to the preview image for the item.
     */
    @SerializedName(value = "previewImageUrl", alternate = {"PreviewImageUrl"})
    @Expose
    public String previewImageUrl;

    /**
     * The Preview Text.
     * A preview text for the item.
     */
    @SerializedName(value = "previewText", alternate = {"PreviewText"})
    @Expose
    public String previewText;

    /**
     * The Title.
     * The item's title text.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
    public String title;

    /**
     * The Type.
     * The item's media type. Can be used for filtering for a specific file based on a specific type. See below for supported types.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
    public String type;


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
