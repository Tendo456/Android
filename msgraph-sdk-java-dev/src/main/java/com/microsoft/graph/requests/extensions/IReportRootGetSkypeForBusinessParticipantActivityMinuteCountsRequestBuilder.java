// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Skype For Business Participant Activity Minute Counts Request Builder.
 */
public interface IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequest instance
     */
    IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequest instance
     */
    IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
