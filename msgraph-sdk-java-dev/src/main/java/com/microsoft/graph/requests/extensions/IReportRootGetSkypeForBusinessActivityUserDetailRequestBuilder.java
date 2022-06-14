// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityUserDetailRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Skype For Business Activity User Detail Request Builder.
 */
public interface IReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSkypeForBusinessActivityUserDetailRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessActivityUserDetailRequest instance
     */
    IReportRootGetSkypeForBusinessActivityUserDetailRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IReportRootGetSkypeForBusinessActivityUserDetailRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessActivityUserDetailRequest instance
     */
    IReportRootGetSkypeForBusinessActivityUserDetailRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
