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
 * The class for the Device Configuration Device State Summary.
 */
public class DeviceConfigurationDeviceStateSummary extends Entity implements IJsonBackedObject {


    /**
     * The Compliant Device Count.
     * Number of compliant devices
     */
    @SerializedName(value = "compliantDeviceCount", alternate = {"CompliantDeviceCount"})
    @Expose
    public Integer compliantDeviceCount;

    /**
     * The Conflict Device Count.
     * Number of conflict devices
     */
    @SerializedName(value = "conflictDeviceCount", alternate = {"ConflictDeviceCount"})
    @Expose
    public Integer conflictDeviceCount;

    /**
     * The Error Device Count.
     * Number of error devices
     */
    @SerializedName(value = "errorDeviceCount", alternate = {"ErrorDeviceCount"})
    @Expose
    public Integer errorDeviceCount;

    /**
     * The Non Compliant Device Count.
     * Number of NonCompliant devices
     */
    @SerializedName(value = "nonCompliantDeviceCount", alternate = {"NonCompliantDeviceCount"})
    @Expose
    public Integer nonCompliantDeviceCount;

    /**
     * The Not Applicable Device Count.
     * Number of not applicable devices
     */
    @SerializedName(value = "notApplicableDeviceCount", alternate = {"NotApplicableDeviceCount"})
    @Expose
    public Integer notApplicableDeviceCount;

    /**
     * The Remediated Device Count.
     * Number of remediated devices
     */
    @SerializedName(value = "remediatedDeviceCount", alternate = {"RemediatedDeviceCount"})
    @Expose
    public Integer remediatedDeviceCount;

    /**
     * The Unknown Device Count.
     * Number of unknown devices
     */
    @SerializedName(value = "unknownDeviceCount", alternate = {"UnknownDeviceCount"})
    @Expose
    public Integer unknownDeviceCount;


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
