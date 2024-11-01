// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityUserDetailRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Email Activity User Detail Request Builder.
 */
public interface IReportRootGetEmailActivityUserDetailRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetEmailActivityUserDetailRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetEmailActivityUserDetailRequest instance
     */
    IReportRootGetEmailActivityUserDetailRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IReportRootGetEmailActivityUserDetailRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetEmailActivityUserDetailRequest instance
     */
    IReportRootGetEmailActivityUserDetailRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
