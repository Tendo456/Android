// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootDeviceConfigurationUserActivityRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Device Configuration User Activity Request Builder.
 */
public interface IReportRootDeviceConfigurationUserActivityRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootDeviceConfigurationUserActivityRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootDeviceConfigurationUserActivityRequest instance
     */
    IReportRootDeviceConfigurationUserActivityRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IReportRootDeviceConfigurationUserActivityRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootDeviceConfigurationUserActivityRequest instance
     */
    IReportRootDeviceConfigurationUserActivityRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
