// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.EditionUpgradeLicenseType;
import com.microsoft.graph.models.generated.Windows10EditionType;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Edition Upgrade Configuration.
 */
public class EditionUpgradeConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The License.
     * Edition Upgrade License File Content.
     */
    @SerializedName(value = "license", alternate = {"License"})
    @Expose
    public String license;

    /**
     * The License Type.
     * Edition Upgrade License Type. Possible values are: productKey, licenseFile.
     */
    @SerializedName(value = "licenseType", alternate = {"LicenseType"})
    @Expose
    public EditionUpgradeLicenseType licenseType;

    /**
     * The Product Key.
     * Edition Upgrade Product Key.
     */
    @SerializedName(value = "productKey", alternate = {"ProductKey"})
    @Expose
    public String productKey;

    /**
     * The Target Edition.
     * Edition Upgrade Target Edition. Possible values are: windows10Enterprise, windows10EnterpriseN, windows10Education, windows10EducationN, windows10MobileEnterprise, windows10HolographicEnterprise, windows10Professional, windows10ProfessionalN, windows10ProfessionalEducation, windows10ProfessionalEducationN, windows10ProfessionalWorkstation, windows10ProfessionalWorkstationN.
     */
    @SerializedName(value = "targetEdition", alternate = {"TargetEdition"})
    @Expose
    public Windows10EditionType targetEdition;


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
