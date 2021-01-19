// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCombinaRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Combina Request Builder.
 */
public interface IWorkbookFunctionsCombinaRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsCombinaRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCombinaRequest instance
     */
    IWorkbookFunctionsCombinaRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsCombinaRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCombinaRequest instance
     */
    IWorkbookFunctionsCombinaRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
