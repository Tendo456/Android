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
 * The class for the Object Identity.
 */
public class ObjectIdentity implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Issuer.
     * Specifies the issuer of the identity, for example facebook.com.For local accounts (where signInType is not federated), this property is the local B2C tenant default domain name, for example contoso.onmicrosoft.com.For external users from other Azure AD organization, this will be the domain of the federated organization, for example contoso.com.Supports $filter. 512 character limit.
     */
    @SerializedName(value = "issuer", alternate = {"Issuer"})
    @Expose
    public String issuer;

    /**
     * The Issuer Assigned Id.
     * Specifies the unique identifier assigned to the user by the issuer. The combination of issuer and issuerAssignedId must be unique within the organization. Represents the sign-in name for the user, when signInType is set to emailAddress or userName (also known as local accounts).When signInType is set to: emailAddress, (or starts with emailAddress like emailAddress1) issuerAssignedId must be a valid email addressuserName, issuerAssignedId must be a valid local part of an email addressSupports $filter. 512 character limit.
     */
    @SerializedName(value = "issuerAssignedId", alternate = {"IssuerAssignedId"})
    @Expose
    public String issuerAssignedId;

    /**
     * The Sign In Type.
     * Specifies the user sign-in types in your directory, such as emailAddress, userName or federated. Here, federated represents a unique identifier for a user from an issuer, that can be in any format chosen by the issuer. Additional validation is enforced on issuerAssignedId when the sign-in type is set to emailAddress or userName. This property can also be set to any custom string.
     */
    @SerializedName(value = "signInType", alternate = {"SignInType"})
    @Expose
    public String signInType;


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
