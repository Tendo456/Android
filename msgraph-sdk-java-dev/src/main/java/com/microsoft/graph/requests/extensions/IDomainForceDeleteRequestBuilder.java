// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDomainForceDeleteRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Domain Force Delete Request Builder.
 */
public interface IDomainForceDeleteRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDomainForceDeleteRequest
     *
     * @param requestOptions the options for the request
     * @return the IDomainForceDeleteRequest instance
     */
    IDomainForceDeleteRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDomainForceDeleteRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDomainForceDeleteRequest instance
     */
    IDomainForceDeleteRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
