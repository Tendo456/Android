// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ComplianceState;
import com.microsoft.graph.models.extensions.ConfigurationManagerClientEnabledFeatures;
import com.microsoft.graph.models.extensions.DeviceActionResult;
import com.microsoft.graph.models.generated.DeviceEnrollmentType;
import com.microsoft.graph.models.extensions.DeviceHealthAttestationState;
import com.microsoft.graph.models.generated.DeviceRegistrationState;
import com.microsoft.graph.models.generated.DeviceManagementExchangeAccessState;
import com.microsoft.graph.models.generated.DeviceManagementExchangeAccessStateReason;
import com.microsoft.graph.models.generated.ManagedDeviceOwnerType;
import com.microsoft.graph.models.generated.ManagementAgentType;
import com.microsoft.graph.models.generated.ManagedDevicePartnerReportedHealthState;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyState;
import com.microsoft.graph.models.extensions.DeviceConfigurationState;
import com.microsoft.graph.models.extensions.DeviceCategory;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device.
 */
public class ManagedDevice extends Entity implements IJsonBackedObject {


    /**
     * The Activation Lock Bypass Code.
     * Code that allows the Activation Lock on a device to be bypassed.
     */
    @SerializedName(value = "activationLockBypassCode", alternate = {"ActivationLockBypassCode"})
    @Expose
    public String activationLockBypassCode;

    /**
     * The Android Security Patch Level.
     * Android security patch level
     */
    @SerializedName(value = "androidSecurityPatchLevel", alternate = {"AndroidSecurityPatchLevel"})
    @Expose
    public String androidSecurityPatchLevel;

    /**
     * The Azure ADDevice Id.
     * The unique identifier for the Azure Active Directory device. Read only.
     */
    @SerializedName(value = "azureADDeviceId", alternate = {"AzureADDeviceId"})
    @Expose
    public String azureADDeviceId;

    /**
     * The Azure ADRegistered.
     * Whether the device is Azure Active Directory registered.
     */
    @SerializedName(value = "azureADRegistered", alternate = {"AzureADRegistered"})
    @Expose
    public Boolean azureADRegistered;

    /**
     * The Compliance Grace Period Expiration Date Time.
     * The DateTime when device compliance grace period expires
     */
    @SerializedName(value = "complianceGracePeriodExpirationDateTime", alternate = {"ComplianceGracePeriodExpirationDateTime"})
    @Expose
    public java.util.Calendar complianceGracePeriodExpirationDateTime;

    /**
     * The Compliance State.
     * Compliance state of the device. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod, configManager.
     */
    @SerializedName(value = "complianceState", alternate = {"ComplianceState"})
    @Expose
    public ComplianceState complianceState;

    /**
     * The Configuration Manager Client Enabled Features.
     * ConfigrMgr client enabled features
     */
    @SerializedName(value = "configurationManagerClientEnabledFeatures", alternate = {"ConfigurationManagerClientEnabledFeatures"})
    @Expose
    public ConfigurationManagerClientEnabledFeatures configurationManagerClientEnabledFeatures;

    /**
     * The Device Action Results.
     * List of ComplexType deviceActionResult objects.
     */
    @SerializedName(value = "deviceActionResults", alternate = {"DeviceActionResults"})
    @Expose
    public java.util.List<DeviceActionResult> deviceActionResults;

    /**
     * The Device Category Display Name.
     * Device category display name
     */
    @SerializedName(value = "deviceCategoryDisplayName", alternate = {"DeviceCategoryDisplayName"})
    @Expose
    public String deviceCategoryDisplayName;

    /**
     * The Device Enrollment Type.
     * Enrollment type of the device. Possible values are: unknown, userEnrollment, deviceEnrollmentManager, appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment, windowsBulkAzureDomainJoin, windowsCoManagement.
     */
    @SerializedName(value = "deviceEnrollmentType", alternate = {"DeviceEnrollmentType"})
    @Expose
    public DeviceEnrollmentType deviceEnrollmentType;

    /**
     * The Device Health Attestation State.
     * The device health attestation state.
     */
    @SerializedName(value = "deviceHealthAttestationState", alternate = {"DeviceHealthAttestationState"})
    @Expose
    public DeviceHealthAttestationState deviceHealthAttestationState;

    /**
     * The Device Name.
     * Name of the device
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
    public String deviceName;

    /**
     * The Device Registration State.
     * Device registration state. Possible values are: notRegistered, registered, revoked, keyConflict, approvalPending, certificateReset, notRegisteredPendingEnrollment, unknown.
     */
    @SerializedName(value = "deviceRegistrationState", alternate = {"DeviceRegistrationState"})
    @Expose
    public DeviceRegistrationState deviceRegistrationState;

    /**
     * The Eas Activated.
     * Whether the device is Exchange ActiveSync activated.
     */
    @SerializedName(value = "easActivated", alternate = {"EasActivated"})
    @Expose
    public Boolean easActivated;

    /**
     * The Eas Activation Date Time.
     * Exchange ActivationSync activation time of the device.
     */
    @SerializedName(value = "easActivationDateTime", alternate = {"EasActivationDateTime"})
    @Expose
    public java.util.Calendar easActivationDateTime;

    /**
     * The Eas Device Id.
     * Exchange ActiveSync Id of the device.
     */
    @SerializedName(value = "easDeviceId", alternate = {"EasDeviceId"})
    @Expose
    public String easDeviceId;

    /**
     * The Email Address.
     * Email(s) for the user associated with the device
     */
    @SerializedName(value = "emailAddress", alternate = {"EmailAddress"})
    @Expose
    public String emailAddress;

    /**
     * The Enrolled Date Time.
     * Enrollment time of the device.
     */
    @SerializedName(value = "enrolledDateTime", alternate = {"EnrolledDateTime"})
    @Expose
    public java.util.Calendar enrolledDateTime;

    /**
     * The Exchange Access State.
     * The Access State of the device in Exchange. Possible values are: none, unknown, allowed, blocked, quarantined.
     */
    @SerializedName(value = "exchangeAccessState", alternate = {"ExchangeAccessState"})
    @Expose
    public DeviceManagementExchangeAccessState exchangeAccessState;

    /**
     * The Exchange Access State Reason.
     * The reason for the device's access state in Exchange. Possible values are: none, unknown, exchangeGlobalRule, exchangeIndividualRule, exchangeDeviceRule, exchangeUpgrade, exchangeMailboxPolicy, other, compliant, notCompliant, notEnrolled, unknownLocation, mfaRequired, azureADBlockDueToAccessPolicy, compromisedPassword, deviceNotKnownWithManagedApp.
     */
    @SerializedName(value = "exchangeAccessStateReason", alternate = {"ExchangeAccessStateReason"})
    @Expose
    public DeviceManagementExchangeAccessStateReason exchangeAccessStateReason;

    /**
     * The Exchange Last Successful Sync Date Time.
     * Last time the device contacted Exchange.
     */
    @SerializedName(value = "exchangeLastSuccessfulSyncDateTime", alternate = {"ExchangeLastSuccessfulSyncDateTime"})
    @Expose
    public java.util.Calendar exchangeLastSuccessfulSyncDateTime;

    /**
     * The Free Storage Space In Bytes.
     * Free Storage in Bytes
     */
    @SerializedName(value = "freeStorageSpaceInBytes", alternate = {"FreeStorageSpaceInBytes"})
    @Expose
    public Long freeStorageSpaceInBytes;

    /**
     * The Imei.
     * IMEI
     */
    @SerializedName(value = "imei", alternate = {"Imei"})
    @Expose
    public String imei;

    /**
     * The Is Encrypted.
     * Device encryption status
     */
    @SerializedName(value = "isEncrypted", alternate = {"IsEncrypted"})
    @Expose
    public Boolean isEncrypted;

    /**
     * The Is Supervised.
     * Device supervised status
     */
    @SerializedName(value = "isSupervised", alternate = {"IsSupervised"})
    @Expose
    public Boolean isSupervised;

    /**
     * The Jail Broken.
     * whether the device is jail broken or rooted.
     */
    @SerializedName(value = "jailBroken", alternate = {"JailBroken"})
    @Expose
    public String jailBroken;

    /**
     * The Last Sync Date Time.
     * The date and time that the device last completed a successful sync with Intune.
     */
    @SerializedName(value = "lastSyncDateTime", alternate = {"LastSyncDateTime"})
    @Expose
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Managed Device Name.
     * Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     */
    @SerializedName(value = "managedDeviceName", alternate = {"ManagedDeviceName"})
    @Expose
    public String managedDeviceName;

    /**
     * The Managed Device Owner Type.
     * Ownership of the device. Can be 'company' or 'personal'. Possible values are: unknown, company, personal.
     */
    @SerializedName(value = "managedDeviceOwnerType", alternate = {"ManagedDeviceOwnerType"})
    @Expose
    public ManagedDeviceOwnerType managedDeviceOwnerType;

    /**
     * The Management Agent.
     * Management channel of the device. Intune, EAS, etc. Possible values are: eas, mdm, easMdm, intuneClient, easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown, jamf, googleCloudDevicePolicyController.
     */
    @SerializedName(value = "managementAgent", alternate = {"ManagementAgent"})
    @Expose
    public ManagementAgentType managementAgent;

    /**
     * The Manufacturer.
     * Manufacturer of the device
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
    public String manufacturer;

    /**
     * The Meid.
     * MEID
     */
    @SerializedName(value = "meid", alternate = {"Meid"})
    @Expose
    public String meid;

    /**
     * The Model.
     * Model of the device
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
    public String model;

    /**
     * The Operating System.
     * Operating system of the device. Windows, iOS, etc.
     */
    @SerializedName(value = "operatingSystem", alternate = {"OperatingSystem"})
    @Expose
    public String operatingSystem;

    /**
     * The Os Version.
     * Operating system version of the device.
     */
    @SerializedName(value = "osVersion", alternate = {"OsVersion"})
    @Expose
    public String osVersion;

    /**
     * The Partner Reported Threat State.
     * Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read Only. Possible values are: unknown, activated, deactivated, secured, lowSeverity, mediumSeverity, highSeverity, unresponsive, compromised, misconfigured.
     */
    @SerializedName(value = "partnerReportedThreatState", alternate = {"PartnerReportedThreatState"})
    @Expose
    public ManagedDevicePartnerReportedHealthState partnerReportedThreatState;

    /**
     * The Phone Number.
     * Phone number of the device
     */
    @SerializedName(value = "phoneNumber", alternate = {"PhoneNumber"})
    @Expose
    public String phoneNumber;

    /**
     * The Remote Assistance Session Error Details.
     * An error string that identifies issues when creating Remote Assistance session objects.
     */
    @SerializedName(value = "remoteAssistanceSessionErrorDetails", alternate = {"RemoteAssistanceSessionErrorDetails"})
    @Expose
    public String remoteAssistanceSessionErrorDetails;

    /**
     * The Remote Assistance Session Url.
     * Url that allows a Remote Assistance session to be established with the device.
     */
    @SerializedName(value = "remoteAssistanceSessionUrl", alternate = {"RemoteAssistanceSessionUrl"})
    @Expose
    public String remoteAssistanceSessionUrl;

    /**
     * The Serial Number.
     * SerialNumber
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
    public String serialNumber;

    /**
     * The Subscriber Carrier.
     * Subscriber Carrier
     */
    @SerializedName(value = "subscriberCarrier", alternate = {"SubscriberCarrier"})
    @Expose
    public String subscriberCarrier;

    /**
     * The Total Storage Space In Bytes.
     * Total Storage in Bytes
     */
    @SerializedName(value = "totalStorageSpaceInBytes", alternate = {"TotalStorageSpaceInBytes"})
    @Expose
    public Long totalStorageSpaceInBytes;

    /**
     * The User Display Name.
     * User display name
     */
    @SerializedName(value = "userDisplayName", alternate = {"UserDisplayName"})
    @Expose
    public String userDisplayName;

    /**
     * The User Id.
     * Unique Identifier for the user associated with the device
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
    public String userId;

    /**
     * The User Principal Name.
     * Device user principal name
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;

    /**
     * The Wi Fi Mac Address.
     * Wi-Fi MAC
     */
    @SerializedName(value = "wiFiMacAddress", alternate = {"WiFiMacAddress"})
    @Expose
    public String wiFiMacAddress;

    /**
     * The Device Compliance Policy States.
     * Device compliance policy states for this device.
     */
    @SerializedName(value = "deviceCompliancePolicyStates", alternate = {"DeviceCompliancePolicyStates"})
    @Expose
    public DeviceCompliancePolicyStateCollectionPage deviceCompliancePolicyStates;

    /**
     * The Device Configuration States.
     * Device configuration states for this device.
     */
    @SerializedName(value = "deviceConfigurationStates", alternate = {"DeviceConfigurationStates"})
    @Expose
    public DeviceConfigurationStateCollectionPage deviceConfigurationStates;

    /**
     * The Device Category.
     * Device category
     */
    @SerializedName(value = "deviceCategory", alternate = {"DeviceCategory"})
    @Expose
    public DeviceCategory deviceCategory;


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


        if (json.has("deviceCompliancePolicyStates")) {
            deviceCompliancePolicyStates = serializer.deserializeObject(json.get("deviceCompliancePolicyStates").toString(), DeviceCompliancePolicyStateCollectionPage.class);
        }

        if (json.has("deviceConfigurationStates")) {
            deviceConfigurationStates = serializer.deserializeObject(json.get("deviceConfigurationStates").toString(), DeviceConfigurationStateCollectionPage.class);
        }
    }
}
