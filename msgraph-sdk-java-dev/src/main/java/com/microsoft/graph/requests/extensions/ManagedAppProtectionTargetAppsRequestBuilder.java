// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedAppProtectionTargetAppsRequest;
import com.microsoft.graph.requests.extensions.ManagedAppProtectionTargetAppsRequest;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Protection Target Apps Request Builder.
 */
public class ManagedAppProtectionTargetAppsRequestBuilder extends BaseActionRequestBuilder implements IManagedAppProtectionTargetAppsRequestBuilder {

    /**
     * The request builder for this ManagedAppProtectionTargetApps
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param apps the apps
     */
    public ManagedAppProtectionTargetAppsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<ManagedMobileApp> apps) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("apps", apps);
    }

    /**
     * Creates the IManagedAppProtectionTargetAppsRequest
     *
     * @param requestOptions the options for the request
     * @return the IManagedAppProtectionTargetAppsRequest instance
     */
    public IManagedAppProtectionTargetAppsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IManagedAppProtectionTargetAppsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedAppProtectionTargetAppsRequest instance
     */
    public IManagedAppProtectionTargetAppsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedAppProtectionTargetAppsRequest request = new ManagedAppProtectionTargetAppsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("apps")) {
            request.body.apps = getParameter("apps");
        }

        return request;
    }
}