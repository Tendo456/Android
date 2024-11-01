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
 * The class for the Informational Url.
 */
public class InformationalUrl implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Logo Url.
     * CDN URL to the application's logo, Read-only.
     */
    @SerializedName(value = "logoUrl", alternate = {"LogoUrl"})
    @Expose
    public String logoUrl;

    /**
     * The Marketing Url.
     * Link to the application's marketing page. For example, https://www.contoso.com/app/marketing
     */
    @SerializedName(value = "marketingUrl", alternate = {"MarketingUrl"})
    @Expose
    public String marketingUrl;

    /**
     * The Privacy Statement Url.
     * Link to the application's privacy statement. For example, https://www.contoso.com/app/privacy
     */
    @SerializedName(value = "privacyStatementUrl", alternate = {"PrivacyStatementUrl"})
    @Expose
    public String privacyStatementUrl;

    /**
     * The Support Url.
     * Link to the application's support page. For example, https://www.contoso.com/app/support
     */
    @SerializedName(value = "supportUrl", alternate = {"SupportUrl"})
    @Expose
    public String supportUrl;

    /**
     * The Terms Of Service Url.
     * Link to the application's terms of service statement. For example, https://www.contoso.com/app/termsofservice
     */
    @SerializedName(value = "termsOfServiceUrl", alternate = {"TermsOfServiceUrl"})
    @Expose
    public String termsOfServiceUrl;


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
