// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsUserActivityUserCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Teams User Activity User Counts Request Builder.
 */
public interface IReportRootGetTeamsUserActivityUserCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetTeamsUserActivityUserCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetTeamsUserActivityUserCountsRequest instance
     */
    IReportRootGetTeamsUserActivityUserCountsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IReportRootGetTeamsUserActivityUserCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetTeamsUserActivityUserCountsRequest instance
     */
    IReportRootGetTeamsUserActivityUserCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}