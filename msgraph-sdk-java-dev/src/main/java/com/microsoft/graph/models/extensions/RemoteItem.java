// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.File;
import com.microsoft.graph.models.extensions.FileSystemInfo;
import com.microsoft.graph.models.extensions.Folder;
import com.microsoft.graph.models.extensions.Image;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.models.extensions.Shared;
import com.microsoft.graph.models.extensions.SharepointIds;
import com.microsoft.graph.models.extensions.SpecialFolder;
import com.microsoft.graph.models.extensions.Video;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Remote Item.
 */
public class RemoteItem implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Created By.
     * Identity of the user, device, and application which created the item. Read-only.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
     * Date and time of item creation. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The File.
     * Indicates that the remote item is a file. Read-only.
     */
    @SerializedName(value = "file", alternate = {"File"})
    @Expose
    public File file;

    /**
     * The File System Info.
     * Information about the remote item from the local file system. Read-only.
     */
    @SerializedName(value = "fileSystemInfo", alternate = {"FileSystemInfo"})
    @Expose
    public FileSystemInfo fileSystemInfo;

    /**
     * The Folder.
     * Indicates that the remote item is a folder. Read-only.
     */
    @SerializedName(value = "folder", alternate = {"Folder"})
    @Expose
    public Folder folder;

    /**
     * The Id.
     * Unique identifier for the remote item in its drive. Read-only.
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
    public String id;

    /**
     * The Image.
     * Image metadata, if the item is an image. Read-only.
     */
    @SerializedName(value = "image", alternate = {"Image"})
    @Expose
    public Image image;

    /**
     * The Last Modified By.
     * Identity of the user, device, and application which last modified the item. Read-only.
     */
    @SerializedName(value = "lastModifiedBy", alternate = {"LastModifiedBy"})
    @Expose
    public IdentitySet lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * Date and time the item was last modified. Read-only.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Name.
     * Optional. Filename of the remote item. Read-only.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Package.
     * If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.
     */
    @SerializedName(value = "package", alternate = {"Package"})
    @Expose
    public com.microsoft.graph.models.extensions.Package msgraphPackage;

    /**
     * The Parent Reference.
     * Properties of the parent of the remote item. Read-only.
     */
    @SerializedName(value = "parentReference", alternate = {"ParentReference"})
    @Expose
    public ItemReference parentReference;

    /**
     * The Shared.
     * Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.
     */
    @SerializedName(value = "shared", alternate = {"Shared"})
    @Expose
    public Shared shared;

    /**
     * The Sharepoint Ids.
     * Provides interop between items in OneDrive for Business and SharePoint with the full set of item identifiers. Read-only.
     */
    @SerializedName(value = "sharepointIds", alternate = {"SharepointIds"})
    @Expose
    public SharepointIds sharepointIds;

    /**
     * The Size.
     * Size of the remote item. Read-only.
     */
    @SerializedName(value = "size", alternate = {"Size"})
    @Expose
    public Long size;

    /**
     * The Special Folder.
     * If the current item is also available as a special folder, this facet is returned. Read-only.
     */
    @SerializedName(value = "specialFolder", alternate = {"SpecialFolder"})
    @Expose
    public SpecialFolder specialFolder;

    /**
     * The Video.
     * Video metadata, if the item is a video. Read-only.
     */
    @SerializedName(value = "video", alternate = {"Video"})
    @Expose
    public Video video;

    /**
     * The Web Dav Url.
     * DAV compatible URL for the item.
     */
    @SerializedName(value = "webDavUrl", alternate = {"WebDavUrl"})
    @Expose
    public String webDavUrl;

    /**
     * The Web Url.
     * URL that displays the resource in the browser. Read-only.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
    public String webUrl;


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