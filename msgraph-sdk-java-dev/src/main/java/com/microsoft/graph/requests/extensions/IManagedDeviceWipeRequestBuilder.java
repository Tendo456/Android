// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceWipeRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Wipe Request Builder.
 */
public interface IManagedDeviceWipeRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IManagedDeviceWipeRequest
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceWipeRequest instance
     */
    IManagedDeviceWipeRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IManagedDeviceWipeRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceWipeRequest instance
     */
    IManagedDeviceWipeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
