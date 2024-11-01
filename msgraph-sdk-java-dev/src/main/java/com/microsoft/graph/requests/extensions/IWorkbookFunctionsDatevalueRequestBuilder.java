// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDatevalueRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Datevalue Request Builder.
 */
public interface IWorkbookFunctionsDatevalueRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsDatevalueRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDatevalueRequest instance
     */
    IWorkbookFunctionsDatevalueRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsDatevalueRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDatevalueRequest instance
     */
    IWorkbookFunctionsDatevalueRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
