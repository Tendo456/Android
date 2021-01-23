// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ActivityBasedTimeoutPolicy;
import com.microsoft.graph.models.extensions.AuthorizationPolicy;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import com.microsoft.graph.models.extensions.HomeRealmDiscoveryPolicy;
import com.microsoft.graph.models.extensions.PermissionGrantPolicy;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import com.microsoft.graph.models.extensions.TokenLifetimePolicy;
import com.microsoft.graph.models.extensions.ConditionalAccessPolicy;
import com.microsoft.graph.models.extensions.IdentitySecurityDefaultsEnforcementPolicy;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Root.
 */
public class PolicyRoot extends Entity implements IJsonBackedObject {


    /**
     * The Activity Based Timeout Policies.
     * 
     */
    @SerializedName(value = "activityBasedTimeoutPolicies", alternate = {"ActivityBasedTimeoutPolicies"})
    @Expose
    public ActivityBasedTimeoutPolicyCollectionPage activityBasedTimeoutPolicies;

    /**
     * The Authorization Policy.
     * 
     */
    @SerializedName(value = "authorizationPolicy", alternate = {"AuthorizationPolicy"})
    @Expose
    public AuthorizationPolicy authorizationPolicy;

    /**
     * The Claims Mapping Policies.
     * 
     */
    @SerializedName(value = "claimsMappingPolicies", alternate = {"ClaimsMappingPolicies"})
    @Expose
    public ClaimsMappingPolicyCollectionPage claimsMappingPolicies;

    /**
     * The Home Realm Discovery Policies.
     * 
     */
    @SerializedName(value = "homeRealmDiscoveryPolicies", alternate = {"HomeRealmDiscoveryPolicies"})
    @Expose
    public HomeRealmDiscoveryPolicyCollectionPage homeRealmDiscoveryPolicies;

    /**
     * The Permission Grant Policies.
     * 
     */
    @SerializedName(value = "permissionGrantPolicies", alternate = {"PermissionGrantPolicies"})
    @Expose
    public PermissionGrantPolicyCollectionPage permissionGrantPolicies;

    /**
     * The Token Issuance Policies.
     * 
     */
    @SerializedName(value = "tokenIssuancePolicies", alternate = {"TokenIssuancePolicies"})
    @Expose
    public TokenIssuancePolicyCollectionPage tokenIssuancePolicies;

    /**
     * The Token Lifetime Policies.
     * 
     */
    @SerializedName(value = "tokenLifetimePolicies", alternate = {"TokenLifetimePolicies"})
    @Expose
    public TokenLifetimePolicyCollectionPage tokenLifetimePolicies;

    /**
     * The Conditional Access Policies.
     * 
     */
    @SerializedName(value = "conditionalAccessPolicies", alternate = {"ConditionalAccessPolicies"})
    @Expose
    public ConditionalAccessPolicyCollectionPage conditionalAccessPolicies;

    /**
     * The Identity Security Defaults Enforcement Policy.
     * 
     */
    @SerializedName(value = "identitySecurityDefaultsEnforcementPolicy", alternate = {"IdentitySecurityDefaultsEnforcementPolicy"})
    @Expose
    public IdentitySecurityDefaultsEnforcementPolicy identitySecurityDefaultsEnforcementPolicy;


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


        if (json.has("activityBasedTimeoutPolicies")) {
            activityBasedTimeoutPolicies = serializer.deserializeObject(json.get("activityBasedTimeoutPolicies").toString(), ActivityBasedTimeoutPolicyCollectionPage.class);
        }

        if (json.has("claimsMappingPolicies")) {
            claimsMappingPolicies = serializer.deserializeObject(json.get("claimsMappingPolicies").toString(), ClaimsMappingPolicyCollectionPage.class);
        }

        if (json.has("homeRealmDiscoveryPolicies")) {
            homeRealmDiscoveryPolicies = serializer.deserializeObject(json.get("homeRealmDiscoveryPolicies").toString(), HomeRealmDiscoveryPolicyCollectionPage.class);
        }

        if (json.has("permissionGrantPolicies")) {
            permissionGrantPolicies = serializer.deserializeObject(json.get("permissionGrantPolicies").toString(), PermissionGrantPolicyCollectionPage.class);
        }

        if (json.has("tokenIssuancePolicies")) {
            tokenIssuancePolicies = serializer.deserializeObject(json.get("tokenIssuancePolicies").toString(), TokenIssuancePolicyCollectionPage.class);
        }

        if (json.has("tokenLifetimePolicies")) {
            tokenLifetimePolicies = serializer.deserializeObject(json.get("tokenLifetimePolicies").toString(), TokenLifetimePolicyCollectionPage.class);
        }

        if (json.has("conditionalAccessPolicies")) {
            conditionalAccessPolicies = serializer.deserializeObject(json.get("conditionalAccessPolicies").toString(), ConditionalAccessPolicyCollectionPage.class);
        }
    }
}