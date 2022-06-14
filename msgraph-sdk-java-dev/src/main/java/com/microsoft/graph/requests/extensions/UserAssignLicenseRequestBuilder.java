// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserAssignLicenseRequest;
import com.microsoft.graph.requests.extensions.UserAssignLicenseRequest;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Assign License Request Builder.
 */
public class UserAssignLicenseRequestBuilder extends BaseActionRequestBuilder implements IUserAssignLicenseRequestBuilder {

    /**
     * The request builder for this UserAssignLicense
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param addLicenses the addLicenses
     * @param removeLicenses the removeLicenses
     */
    public UserAssignLicenseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<AssignedLicense> addLicenses, final java.util.List<java.util.UUID> removeLicenses) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("addLicenses", addLicenses);
        bodyParams.put("removeLicenses", removeLicenses);
    }

    /**
     * Creates the IUserAssignLicenseRequest
     *
     * @param requestOptions the options for the request
     * @return the IUserAssignLicenseRequest instance
     */
    public IUserAssignLicenseRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IUserAssignLicenseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IUserAssignLicenseRequest instance
     */
    public IUserAssignLicenseRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserAssignLicenseRequest request = new UserAssignLicenseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("addLicenses")) {
            request.body.addLicenses = getParameter("addLicenses");
        }

        if (hasParameter("removeLicenses")) {
            request.body.removeLicenses = getParameter("removeLicenses");
        }

        return request;
    }
}
