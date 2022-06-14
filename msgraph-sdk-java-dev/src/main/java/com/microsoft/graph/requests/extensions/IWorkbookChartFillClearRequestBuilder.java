// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartFillClearRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Fill Clear Request Builder.
 */
public interface IWorkbookChartFillClearRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookChartFillClearRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartFillClearRequest instance
     */
    IWorkbookChartFillClearRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookChartFillClearRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartFillClearRequest instance
     */
    IWorkbookChartFillClearRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
