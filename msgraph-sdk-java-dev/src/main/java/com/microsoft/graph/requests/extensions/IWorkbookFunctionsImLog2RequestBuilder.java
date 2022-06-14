// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImLog2Request;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Im Log2Request Builder.
 */
public interface IWorkbookFunctionsImLog2RequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsImLog2Request
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImLog2Request instance
     */
    IWorkbookFunctionsImLog2Request buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsImLog2Request with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImLog2Request instance
     */
    IWorkbookFunctionsImLog2Request buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
