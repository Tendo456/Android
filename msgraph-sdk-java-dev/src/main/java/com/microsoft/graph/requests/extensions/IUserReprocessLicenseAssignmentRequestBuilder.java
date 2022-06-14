// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserReprocessLicenseAssignmentRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Reprocess License Assignment Request Builder.
 */
public interface IUserReprocessLicenseAssignmentRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IUserReprocessLicenseAssignmentRequest
     *
     * @param requestOptions the options for the request
     * @return the IUserReprocessLicenseAssignmentRequest instance
     */
    IUserReprocessLicenseAssignmentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IUserReprocessLicenseAssignmentRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IUserReprocessLicenseAssignmentRequest instance
     */
    IUserReprocessLicenseAssignmentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
