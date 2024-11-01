// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Named Item.
 */
public class WorkbookNamedItem extends Entity implements IJsonBackedObject {


    /**
     * The Comment.
     * Represents the comment associated with this name.
     */
    @SerializedName(value = "comment", alternate = {"Comment"})
    @Expose
    public String comment;

    /**
     * The Name.
     * The name of the object. Read-only.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Scope.
     * Indicates whether the name is scoped to the workbook or to a specific worksheet. Read-only.
     */
    @SerializedName(value = "scope", alternate = {"Scope"})
    @Expose
    public String scope;

    /**
     * The Type.
     * Indicates what type of reference is associated with the name. The possible values are: String, Integer, Double, Boolean, Range. Read-only.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
    public String type;

    /**
     * The Value.
     * Represents the formula that the name is defined to refer to. E.g. =Sheet14!$B$2:$H$12, =4.75, etc. Read-only.
     */
    @SerializedName(value = "value", alternate = {"Value"})
    @Expose
    public com.google.gson.JsonElement value;

    /**
     * The Visible.
     * Specifies whether the object is visible or not.
     */
    @SerializedName(value = "visible", alternate = {"Visible"})
    @Expose
    public Boolean visible;

    /**
     * The Worksheet.
     * Returns the worksheet on which the named item is scoped to. Available only if the item is scoped to the worksheet. Read-only.
     */
    @SerializedName(value = "worksheet", alternate = {"Worksheet"})
    @Expose
    public WorkbookWorksheet worksheet;


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
