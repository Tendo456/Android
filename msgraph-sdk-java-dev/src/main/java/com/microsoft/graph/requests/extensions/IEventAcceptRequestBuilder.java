// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEventAcceptRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Event Accept Request Builder.
 */
public interface IEventAcceptRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IEventAcceptRequest
     *
     * @param requestOptions the options for the request
     * @return the IEventAcceptRequest instance
     */
    IEventAcceptRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IEventAcceptRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IEventAcceptRequest instance
     */
    IEventAcceptRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
