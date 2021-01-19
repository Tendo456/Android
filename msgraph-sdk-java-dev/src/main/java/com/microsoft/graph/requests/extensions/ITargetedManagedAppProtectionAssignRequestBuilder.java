// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppProtectionAssignRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Targeted Managed App Protection Assign Request Builder.
 */
public interface ITargetedManagedAppProtectionAssignRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ITargetedManagedAppProtectionAssignRequest
     *
     * @param requestOptions the options for the request
     * @return the ITargetedManagedAppProtectionAssignRequest instance
     */
    ITargetedManagedAppProtectionAssignRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the ITargetedManagedAppProtectionAssignRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ITargetedManagedAppProtectionAssignRequest instance
     */
    ITargetedManagedAppProtectionAssignRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
