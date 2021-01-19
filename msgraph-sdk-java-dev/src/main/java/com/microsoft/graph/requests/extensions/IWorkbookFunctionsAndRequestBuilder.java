// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsAndRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions And Request Builder.
 */
public interface IWorkbookFunctionsAndRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsAndRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAndRequest instance
     */
    IWorkbookFunctionsAndRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsAndRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAndRequest instance
     */
    IWorkbookFunctionsAndRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
