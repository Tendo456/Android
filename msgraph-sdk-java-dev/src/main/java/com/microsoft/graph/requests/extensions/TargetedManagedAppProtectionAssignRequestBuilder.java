// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppProtectionAssignRequest;
import com.microsoft.graph.requests.extensions.TargetedManagedAppProtectionAssignRequest;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Protection Assign Request Builder.
 */
public class TargetedManagedAppProtectionAssignRequestBuilder extends BaseActionRequestBuilder implements ITargetedManagedAppProtectionAssignRequestBuilder {

    /**
     * The request builder for this TargetedManagedAppProtectionAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param assignments the assignments
     */
    public TargetedManagedAppProtectionAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<TargetedManagedAppPolicyAssignment> assignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("assignments", assignments);
    }

    /**
     * Creates the ITargetedManagedAppProtectionAssignRequest
     *
     * @param requestOptions the options for the request
     * @return the ITargetedManagedAppProtectionAssignRequest instance
     */
    public ITargetedManagedAppProtectionAssignRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ITargetedManagedAppProtectionAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ITargetedManagedAppProtectionAssignRequest instance
     */
    public ITargetedManagedAppProtectionAssignRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        TargetedManagedAppProtectionAssignRequest request = new TargetedManagedAppProtectionAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("assignments")) {
            request.body.assignments = getParameter("assignments");
        }

        return request;
    }
}
