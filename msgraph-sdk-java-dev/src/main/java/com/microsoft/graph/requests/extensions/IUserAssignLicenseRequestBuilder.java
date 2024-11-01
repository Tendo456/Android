// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserAssignLicenseRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Assign License Request Builder.
 */
public interface IUserAssignLicenseRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IUserAssignLicenseRequest
     *
     * @param requestOptions the options for the request
     * @return the IUserAssignLicenseRequest instance
     */
    IUserAssignLicenseRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IUserAssignLicenseRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IUserAssignLicenseRequest instance
     */
    IUserAssignLicenseRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
