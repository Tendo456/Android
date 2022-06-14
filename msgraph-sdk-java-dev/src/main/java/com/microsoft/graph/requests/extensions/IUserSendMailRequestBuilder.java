// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserSendMailRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Send Mail Request Builder.
 */
public interface IUserSendMailRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IUserSendMailRequest
     *
     * @param requestOptions the options for the request
     * @return the IUserSendMailRequest instance
     */
    IUserSendMailRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IUserSendMailRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IUserSendMailRequest instance
     */
    IUserSendMailRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
