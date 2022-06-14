// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBitandRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Bitand Request Builder.
 */
public interface IWorkbookFunctionsBitandRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsBitandRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBitandRequest instance
     */
    IWorkbookFunctionsBitandRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsBitandRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBitandRequest instance
     */
    IWorkbookFunctionsBitandRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
