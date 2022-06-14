// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsOddFYieldRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Odd FYield Request Builder.
 */
public interface IWorkbookFunctionsOddFYieldRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsOddFYieldRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsOddFYieldRequest instance
     */
    IWorkbookFunctionsOddFYieldRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsOddFYieldRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsOddFYieldRequest instance
     */
    IWorkbookFunctionsOddFYieldRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
