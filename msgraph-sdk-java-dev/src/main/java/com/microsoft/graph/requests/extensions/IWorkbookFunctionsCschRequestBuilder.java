// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCschRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Csch Request Builder.
 */
public interface IWorkbookFunctionsCschRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsCschRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCschRequest instance
     */
    IWorkbookFunctionsCschRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsCschRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCschRequest instance
     */
    IWorkbookFunctionsCschRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
