// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCodeRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Code Request Builder.
 */
public interface IWorkbookFunctionsCodeRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsCodeRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCodeRequest instance
     */
    IWorkbookFunctionsCodeRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsCodeRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCodeRequest instance
     */
    IWorkbookFunctionsCodeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
