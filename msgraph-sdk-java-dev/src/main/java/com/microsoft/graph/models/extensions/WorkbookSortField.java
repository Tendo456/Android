// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WorkbookIcon;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Sort Field.
 */
public class WorkbookSortField implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Ascending.
     * Represents whether the sorting is done in an ascending fashion.
     */
    @SerializedName(value = "ascending", alternate = {"Ascending"})
    @Expose
    public Boolean ascending;

    /**
     * The Color.
     * Represents the color that is the target of the condition if the sorting is on font or cell color.
     */
    @SerializedName(value = "color", alternate = {"Color"})
    @Expose
    public String color;

    /**
     * The Data Option.
     * Represents additional sorting options for this field. The possible values are: Normal, TextAsNumber.
     */
    @SerializedName(value = "dataOption", alternate = {"DataOption"})
    @Expose
    public String dataOption;

    /**
     * The Icon.
     * Represents the icon that is the target of the condition if the sorting is on the cell's icon.
     */
    @SerializedName(value = "icon", alternate = {"Icon"})
    @Expose
    public WorkbookIcon icon;

    /**
     * The Key.
     * Represents the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row).
     */
    @SerializedName(value = "key", alternate = {"Key"})
    @Expose
    public Integer key;

    /**
     * The Sort On.
     * Represents the type of sorting of this condition. The possible values are: Value, CellColor, FontColor, Icon.
     */
    @SerializedName(value = "sortOn", alternate = {"SortOn"})
    @Expose
    public String sortOn;


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
