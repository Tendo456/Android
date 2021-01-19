// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.InternetSiteSecurityLevel;
import com.microsoft.graph.models.generated.SiteSecurityLevel;
import com.microsoft.graph.models.generated.RequiredPasswordType;
import com.microsoft.graph.models.generated.WindowsUserAccountControlSettings;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows81General Configuration.
 */
public class Windows81GeneralConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Accounts Block Adding Non Microsoft Account Email.
     * Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account.
     */
    @SerializedName(value = "accountsBlockAddingNonMicrosoftAccountEmail", alternate = {"AccountsBlockAddingNonMicrosoftAccountEmail"})
    @Expose
    public Boolean accountsBlockAddingNonMicrosoftAccountEmail;

    /**
     * The Apply Only To Windows81.
     * Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     */
    @SerializedName(value = "applyOnlyToWindows81", alternate = {"ApplyOnlyToWindows81"})
    @Expose
    public Boolean applyOnlyToWindows81;

    /**
     * The Browser Block Autofill.
     * Indicates whether or not to block auto fill.
     */
    @SerializedName(value = "browserBlockAutofill", alternate = {"BrowserBlockAutofill"})
    @Expose
    public Boolean browserBlockAutofill;

    /**
     * The Browser Block Automatic Detection Of Intranet Sites.
     * Indicates whether or not to block automatic detection of Intranet sites.
     */
    @SerializedName(value = "browserBlockAutomaticDetectionOfIntranetSites", alternate = {"BrowserBlockAutomaticDetectionOfIntranetSites"})
    @Expose
    public Boolean browserBlockAutomaticDetectionOfIntranetSites;

    /**
     * The Browser Block Enterprise Mode Access.
     * Indicates whether or not to block enterprise mode access.
     */
    @SerializedName(value = "browserBlockEnterpriseModeAccess", alternate = {"BrowserBlockEnterpriseModeAccess"})
    @Expose
    public Boolean browserBlockEnterpriseModeAccess;

    /**
     * The Browser Block Java Script.
     * Indicates whether or not to Block the user from using JavaScript.
     */
    @SerializedName(value = "browserBlockJavaScript", alternate = {"BrowserBlockJavaScript"})
    @Expose
    public Boolean browserBlockJavaScript;

    /**
     * The Browser Block Plugins.
     * Indicates whether or not to block plug-ins.
     */
    @SerializedName(value = "browserBlockPlugins", alternate = {"BrowserBlockPlugins"})
    @Expose
    public Boolean browserBlockPlugins;

    /**
     * The Browser Block Popups.
     * Indicates whether or not to block popups.
     */
    @SerializedName(value = "browserBlockPopups", alternate = {"BrowserBlockPopups"})
    @Expose
    public Boolean browserBlockPopups;

    /**
     * The Browser Block Sending Do Not Track Header.
     * Indicates whether or not to Block the user from sending the do not track header.
     */
    @SerializedName(value = "browserBlockSendingDoNotTrackHeader", alternate = {"BrowserBlockSendingDoNotTrackHeader"})
    @Expose
    public Boolean browserBlockSendingDoNotTrackHeader;

    /**
     * The Browser Block Single Word Entry On Intranet Sites.
     * Indicates whether or not to block a single word entry on Intranet sites.
     */
    @SerializedName(value = "browserBlockSingleWordEntryOnIntranetSites", alternate = {"BrowserBlockSingleWordEntryOnIntranetSites"})
    @Expose
    public Boolean browserBlockSingleWordEntryOnIntranetSites;

    /**
     * The Browser Enterprise Mode Site List Location.
     * The enterprise mode site list location. Could be a local file, local network or http location.
     */
    @SerializedName(value = "browserEnterpriseModeSiteListLocation", alternate = {"BrowserEnterpriseModeSiteListLocation"})
    @Expose
    public String browserEnterpriseModeSiteListLocation;

    /**
     * The Browser Internet Security Level.
     * The internet security level. Possible values are: userDefined, medium, mediumHigh, high.
     */
    @SerializedName(value = "browserInternetSecurityLevel", alternate = {"BrowserInternetSecurityLevel"})
    @Expose
    public InternetSiteSecurityLevel browserInternetSecurityLevel;

    /**
     * The Browser Intranet Security Level.
     * The Intranet security level. Possible values are: userDefined, low, mediumLow, medium, mediumHigh, high.
     */
    @SerializedName(value = "browserIntranetSecurityLevel", alternate = {"BrowserIntranetSecurityLevel"})
    @Expose
    public SiteSecurityLevel browserIntranetSecurityLevel;

    /**
     * The Browser Logging Report Location.
     * The logging report location.
     */
    @SerializedName(value = "browserLoggingReportLocation", alternate = {"BrowserLoggingReportLocation"})
    @Expose
    public String browserLoggingReportLocation;

    /**
     * The Browser Require Firewall.
     * Indicates whether or not to require a firewall.
     */
    @SerializedName(value = "browserRequireFirewall", alternate = {"BrowserRequireFirewall"})
    @Expose
    public Boolean browserRequireFirewall;

    /**
     * The Browser Require Fraud Warning.
     * Indicates whether or not to require fraud warning.
     */
    @SerializedName(value = "browserRequireFraudWarning", alternate = {"BrowserRequireFraudWarning"})
    @Expose
    public Boolean browserRequireFraudWarning;

    /**
     * The Browser Require High Security For Restricted Sites.
     * Indicates whether or not to require high security for restricted sites.
     */
    @SerializedName(value = "browserRequireHighSecurityForRestrictedSites", alternate = {"BrowserRequireHighSecurityForRestrictedSites"})
    @Expose
    public Boolean browserRequireHighSecurityForRestrictedSites;

    /**
     * The Browser Require Smart Screen.
     * Indicates whether or not to require the user to use the smart screen filter.
     */
    @SerializedName(value = "browserRequireSmartScreen", alternate = {"BrowserRequireSmartScreen"})
    @Expose
    public Boolean browserRequireSmartScreen;

    /**
     * The Browser Trusted Sites Security Level.
     * The trusted sites security level. Possible values are: userDefined, low, mediumLow, medium, mediumHigh, high.
     */
    @SerializedName(value = "browserTrustedSitesSecurityLevel", alternate = {"BrowserTrustedSitesSecurityLevel"})
    @Expose
    public SiteSecurityLevel browserTrustedSitesSecurityLevel;

    /**
     * The Cellular Block Data Roaming.
     * Indicates whether or not to block data roaming.
     */
    @SerializedName(value = "cellularBlockDataRoaming", alternate = {"CellularBlockDataRoaming"})
    @Expose
    public Boolean cellularBlockDataRoaming;

    /**
     * The Diagnostics Block Data Submission.
     * Indicates whether or not to block diagnostic data submission.
     */
    @SerializedName(value = "diagnosticsBlockDataSubmission", alternate = {"DiagnosticsBlockDataSubmission"})
    @Expose
    public Boolean diagnosticsBlockDataSubmission;

    /**
     * The Password Block Picture Password And Pin.
     * Indicates whether or not to Block the user from using a pictures password and pin.
     */
    @SerializedName(value = "passwordBlockPicturePasswordAndPin", alternate = {"PasswordBlockPicturePasswordAndPin"})
    @Expose
    public Boolean passwordBlockPicturePasswordAndPin;

    /**
     * The Password Expiration Days.
     * Password expiration in days.
     */
    @SerializedName(value = "passwordExpirationDays", alternate = {"PasswordExpirationDays"})
    @Expose
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Character Set Count.
     * The number of character sets required in the password.
     */
    @SerializedName(value = "passwordMinimumCharacterSetCount", alternate = {"PasswordMinimumCharacterSetCount"})
    @Expose
    public Integer passwordMinimumCharacterSetCount;

    /**
     * The Password Minimum Length.
     * The minimum password length.
     */
    @SerializedName(value = "passwordMinimumLength", alternate = {"PasswordMinimumLength"})
    @Expose
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Screen Timeout.
     * The minutes of inactivity before the screen times out.
     */
    @SerializedName(value = "passwordMinutesOfInactivityBeforeScreenTimeout", alternate = {"PasswordMinutesOfInactivityBeforeScreenTimeout"})
    @Expose
    public Integer passwordMinutesOfInactivityBeforeScreenTimeout;

    /**
     * The Password Previous Password Block Count.
     * The number of previous passwords to prevent re-use of. Valid values 0 to 24
     */
    @SerializedName(value = "passwordPreviousPasswordBlockCount", alternate = {"PasswordPreviousPasswordBlockCount"})
    @Expose
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Required Type.
     * The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
     */
    @SerializedName(value = "passwordRequiredType", alternate = {"PasswordRequiredType"})
    @Expose
    public RequiredPasswordType passwordRequiredType;

    /**
     * The Password Sign In Failure Count Before Factory Reset.
     * The number of sign in failures before factory reset.
     */
    @SerializedName(value = "passwordSignInFailureCountBeforeFactoryReset", alternate = {"PasswordSignInFailureCountBeforeFactoryReset"})
    @Expose
    public Integer passwordSignInFailureCountBeforeFactoryReset;

    /**
     * The Storage Require Device Encryption.
     * Indicates whether or not to require encryption on a mobile device.
     */
    @SerializedName(value = "storageRequireDeviceEncryption", alternate = {"StorageRequireDeviceEncryption"})
    @Expose
    public Boolean storageRequireDeviceEncryption;

    /**
     * The Updates Require Automatic Updates.
     * Indicates whether or not to require automatic updates.
     */
    @SerializedName(value = "updatesRequireAutomaticUpdates", alternate = {"UpdatesRequireAutomaticUpdates"})
    @Expose
    public Boolean updatesRequireAutomaticUpdates;

    /**
     * The User Account Control Settings.
     * The user account control settings. Possible values are: userDefined, alwaysNotify, notifyOnAppChanges, notifyOnAppChangesWithoutDimming, neverNotify.
     */
    @SerializedName(value = "userAccountControlSettings", alternate = {"UserAccountControlSettings"})
    @Expose
    public WindowsUserAccountControlSettings userAccountControlSettings;

    /**
     * The Work Folders Url.
     * The work folders url.
     */
    @SerializedName(value = "workFoldersUrl", alternate = {"WorkFoldersUrl"})
    @Expose
    public String workFoldersUrl;


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
