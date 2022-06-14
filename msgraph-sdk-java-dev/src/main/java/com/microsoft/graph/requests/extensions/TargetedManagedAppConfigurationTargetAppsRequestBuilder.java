// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationTargetAppsRequest;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationTargetAppsRequest;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Configuration Target Apps Request Builder.
 */
public class TargetedManagedAppConfigurationTargetAppsRequestBuilder extends BaseActionRequestBuilder implements ITargetedManagedAppConfigurationTargetAppsRequestBuilder {

    /**
     * The request builder for this TargetedManagedAppConfigurationTargetApps
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param apps the apps
     */
    public TargetedManagedAppConfigurationTargetAppsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<ManagedMobileApp> apps) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("apps", apps);
    }

    /**
     * Creates the ITargetedManagedAppConfigurationTargetAppsRequest
     *
     * @param requestOptions the options for the request
     * @return the ITargetedManagedAppConfigurationTargetAppsRequest instance
     */
    public ITargetedManagedAppConfigurationTargetAppsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ITargetedManagedAppConfigurationTargetAppsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ITargetedManagedAppConfigurationTargetAppsRequest instance
     */
    public ITargetedManagedAppConfigurationTargetAppsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        TargetedManagedAppConfigurationTargetAppsRequest request = new TargetedManagedAppConfigurationTargetAppsRequest(
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
