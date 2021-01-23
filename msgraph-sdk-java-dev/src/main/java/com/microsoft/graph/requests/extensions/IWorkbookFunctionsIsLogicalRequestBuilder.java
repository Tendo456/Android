// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIsLogicalRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Is Logical Request Builder.
 */
public interface IWorkbookFunctionsIsLogicalRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsIsLogicalRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIsLogicalRequest instance
     */
    IWorkbookFunctionsIsLogicalRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsIsLogicalRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIsLogicalRequest instance
     */
    IWorkbookFunctionsIsLogicalRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}