// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Font.
 */
public class WorkbookChartFont extends Entity implements IJsonBackedObject {


    /**
     * The Bold.
     * Represents the bold status of font.
     */
    @SerializedName(value = "bold", alternate = {"Bold"})
    @Expose
    public Boolean bold;

    /**
     * The Color.
     * HTML color code representation of the text color. E.g. #FF0000 represents Red.
     */
    @SerializedName(value = "color", alternate = {"Color"})
    @Expose
    public String color;

    /**
     * The Italic.
     * Represents the italic status of the font.
     */
    @SerializedName(value = "italic", alternate = {"Italic"})
    @Expose
    public Boolean italic;

    /**
     * The Name.
     * Font name (e.g. 'Calibri')
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Size.
     * Size of the font (e.g. 11)
     */
    @SerializedName(value = "size", alternate = {"Size"})
    @Expose
    public Double size;

    /**
     * The Underline.
     * Type of underline applied to the font. The possible values are: None, Single.
     */
    @SerializedName(value = "underline", alternate = {"Underline"})
    @Expose
    public String underline;


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
