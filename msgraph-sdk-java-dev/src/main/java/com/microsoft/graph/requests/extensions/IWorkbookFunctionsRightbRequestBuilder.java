// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRightbRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Rightb Request Builder.
 */
public interface IWorkbookFunctionsRightbRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsRightbRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRightbRequest instance
     */
    IWorkbookFunctionsRightbRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsRightbRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRightbRequest instance
     */
    IWorkbookFunctionsRightbRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
