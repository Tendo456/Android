// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceRetireRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Retire Request Builder.
 */
public interface IManagedDeviceRetireRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IManagedDeviceRetireRequest
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceRetireRequest instance
     */
    IManagedDeviceRetireRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IManagedDeviceRetireRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceRetireRequest instance
     */
    IManagedDeviceRetireRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
