// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityGroupCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Office365Groups Activity Group Counts Request Builder.
 */
public interface IReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetOffice365GroupsActivityGroupCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOffice365GroupsActivityGroupCountsRequest instance
     */
    IReportRootGetOffice365GroupsActivityGroupCountsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IReportRootGetOffice365GroupsActivityGroupCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOffice365GroupsActivityGroupCountsRequest instance
     */
    IReportRootGetOffice365GroupsActivityGroupCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
