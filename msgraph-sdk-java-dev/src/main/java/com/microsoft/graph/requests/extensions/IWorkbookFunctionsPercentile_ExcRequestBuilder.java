// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPercentile_ExcRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Percentile_Exc Request Builder.
 */
public interface IWorkbookFunctionsPercentile_ExcRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsPercentile_ExcRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPercentile_ExcRequest instance
     */
    IWorkbookFunctionsPercentile_ExcRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsPercentile_ExcRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPercentile_ExcRequest instance
     */
    IWorkbookFunctionsPercentile_ExcRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
