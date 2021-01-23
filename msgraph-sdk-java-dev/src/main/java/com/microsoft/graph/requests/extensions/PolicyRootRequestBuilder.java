// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyRoot;
import com.microsoft.graph.requests.extensions.IActivityBasedTimeoutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityBasedTimeoutPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionGrantPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionGrantPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConditionalAccessPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthorizationPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthorizationPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentitySecurityDefaultsEnforcementPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentitySecurityDefaultsEnforcementPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Root Request Builder.
 */
public class PolicyRootRequestBuilder extends BaseRequestBuilder implements IPolicyRootRequestBuilder {

    /**
     * The request builder for the PolicyRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PolicyRootRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPolicyRootRequest instance
     */
    public IPolicyRootRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPolicyRootRequest instance
     */
    public IPolicyRootRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PolicyRootRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IActivityBasedTimeoutPolicyCollectionRequestBuilder activityBasedTimeoutPolicies() {
        return new ActivityBasedTimeoutPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("activityBasedTimeoutPolicies"), getClient(), null);
    }

    public IActivityBasedTimeoutPolicyRequestBuilder activityBasedTimeoutPolicies(final String id) {
        return new ActivityBasedTimeoutPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("activityBasedTimeoutPolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AuthorizationPolicy
     *
     * @return the IAuthorizationPolicyRequestBuilder instance
     */
    public IAuthorizationPolicyRequestBuilder authorizationPolicy() {
        return new AuthorizationPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("authorizationPolicy"), getClient(), null);
    }
    public IClaimsMappingPolicyCollectionRequestBuilder claimsMappingPolicies() {
        return new ClaimsMappingPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("claimsMappingPolicies"), getClient(), null);
    }

    public IClaimsMappingPolicyRequestBuilder claimsMappingPolicies(final String id) {
        return new ClaimsMappingPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("claimsMappingPolicies") + "/" + id, getClient(), null);
    }
    public IHomeRealmDiscoveryPolicyCollectionRequestBuilder homeRealmDiscoveryPolicies() {
        return new HomeRealmDiscoveryPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("homeRealmDiscoveryPolicies"), getClient(), null);
    }

    public IHomeRealmDiscoveryPolicyRequestBuilder homeRealmDiscoveryPolicies(final String id) {
        return new HomeRealmDiscoveryPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("homeRealmDiscoveryPolicies") + "/" + id, getClient(), null);
    }
    public IPermissionGrantPolicyCollectionRequestBuilder permissionGrantPolicies() {
        return new PermissionGrantPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("permissionGrantPolicies"), getClient(), null);
    }

    public IPermissionGrantPolicyRequestBuilder permissionGrantPolicies(final String id) {
        return new PermissionGrantPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("permissionGrantPolicies") + "/" + id, getClient(), null);
    }
    public ITokenIssuancePolicyCollectionRequestBuilder tokenIssuancePolicies() {
        return new TokenIssuancePolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tokenIssuancePolicies"), getClient(), null);
    }

    public ITokenIssuancePolicyRequestBuilder tokenIssuancePolicies(final String id) {
        return new TokenIssuancePolicyRequestBuilder(getRequestUrlWithAdditionalSegment("tokenIssuancePolicies") + "/" + id, getClient(), null);
    }
    public ITokenLifetimePolicyCollectionRequestBuilder tokenLifetimePolicies() {
        return new TokenLifetimePolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tokenLifetimePolicies"), getClient(), null);
    }

    public ITokenLifetimePolicyRequestBuilder tokenLifetimePolicies(final String id) {
        return new TokenLifetimePolicyRequestBuilder(getRequestUrlWithAdditionalSegment("tokenLifetimePolicies") + "/" + id, getClient(), null);
    }
    public IConditionalAccessPolicyCollectionRequestBuilder conditionalAccessPolicies() {
        return new ConditionalAccessPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("conditionalAccessPolicies"), getClient(), null);
    }

    public IConditionalAccessPolicyRequestBuilder conditionalAccessPolicies(final String id) {
        return new ConditionalAccessPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("conditionalAccessPolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for IdentitySecurityDefaultsEnforcementPolicy
     *
     * @return the IIdentitySecurityDefaultsEnforcementPolicyRequestBuilder instance
     */
    public IIdentitySecurityDefaultsEnforcementPolicyRequestBuilder identitySecurityDefaultsEnforcementPolicy() {
        return new IdentitySecurityDefaultsEnforcementPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("identitySecurityDefaultsEnforcementPolicy"), getClient(), null);
    }
}