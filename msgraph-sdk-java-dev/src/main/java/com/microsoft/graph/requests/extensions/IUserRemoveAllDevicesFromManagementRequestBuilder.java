// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserRemoveAllDevicesFromManagementRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Remove All Devices From Management Request Builder.
 */
public interface IUserRemoveAllDevicesFromManagementRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IUserRemoveAllDevicesFromManagementRequest
     *
     * @param requestOptions the options for the request
     * @return the IUserRemoveAllDevicesFromManagementRequest instance
     */
    IUserRemoveAllDevicesFromManagementRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IUserRemoveAllDevicesFromManagementRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IUserRemoveAllDevicesFromManagementRequest instance
     */
    IUserRemoveAllDevicesFromManagementRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
