// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsConcatenateRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Concatenate Request Builder.
 */
public interface IWorkbookFunctionsConcatenateRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsConcatenateRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsConcatenateRequest instance
     */
    IWorkbookFunctionsConcatenateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsConcatenateRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsConcatenateRequest instance
     */
    IWorkbookFunctionsConcatenateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
