// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ComplianceManagementPartnerAssignment;
import com.microsoft.graph.models.generated.DeviceManagementPartnerTenantState;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Compliance Management Partner.
 */
public class ComplianceManagementPartner extends Entity implements IJsonBackedObject {


    /**
     * The Android Enrollment Assignments.
     * User groups which enroll Android devices through partner.
     */
    @SerializedName(value = "androidEnrollmentAssignments", alternate = {"AndroidEnrollmentAssignments"})
    @Expose
    public java.util.List<ComplianceManagementPartnerAssignment> androidEnrollmentAssignments;

    /**
     * The Android Onboarded.
     * Partner onboarded for Android devices.
     */
    @SerializedName(value = "androidOnboarded", alternate = {"AndroidOnboarded"})
    @Expose
    public Boolean androidOnboarded;

    /**
     * The Display Name.
     * Partner display name
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Ios Enrollment Assignments.
     * User groups which enroll ios devices through partner.
     */
    @SerializedName(value = "iosEnrollmentAssignments", alternate = {"IosEnrollmentAssignments"})
    @Expose
    public java.util.List<ComplianceManagementPartnerAssignment> iosEnrollmentAssignments;

    /**
     * The Ios Onboarded.
     * Partner onboarded for ios devices.
     */
    @SerializedName(value = "iosOnboarded", alternate = {"IosOnboarded"})
    @Expose
    public Boolean iosOnboarded;

    /**
     * The Last Heartbeat Date Time.
     * Timestamp of last heartbeat after admin onboarded to the compliance management partner
     */
    @SerializedName(value = "lastHeartbeatDateTime", alternate = {"LastHeartbeatDateTime"})
    @Expose
    public java.util.Calendar lastHeartbeatDateTime;

    /**
     * The Mac Os Enrollment Assignments.
     * User groups which enroll Mac devices through partner.
     */
    @SerializedName(value = "macOsEnrollmentAssignments", alternate = {"MacOsEnrollmentAssignments"})
    @Expose
    public java.util.List<ComplianceManagementPartnerAssignment> macOsEnrollmentAssignments;

    /**
     * The Mac Os Onboarded.
     * Partner onboarded for Mac devices.
     */
    @SerializedName(value = "macOsOnboarded", alternate = {"MacOsOnboarded"})
    @Expose
    public Boolean macOsOnboarded;

    /**
     * The Partner State.
     * Partner state of this tenant. Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive.
     */
    @SerializedName(value = "partnerState", alternate = {"PartnerState"})
    @Expose
    public DeviceManagementPartnerTenantState partnerState;


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
