// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountDetailRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get One Drive Usage Account Detail Request Builder.
 */
public interface IReportRootGetOneDriveUsageAccountDetailRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetOneDriveUsageAccountDetailRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOneDriveUsageAccountDetailRequest instance
     */
    IReportRootGetOneDriveUsageAccountDetailRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IReportRootGetOneDriveUsageAccountDetailRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOneDriveUsageAccountDetailRequest instance
     */
    IReportRootGetOneDriveUsageAccountDetailRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
