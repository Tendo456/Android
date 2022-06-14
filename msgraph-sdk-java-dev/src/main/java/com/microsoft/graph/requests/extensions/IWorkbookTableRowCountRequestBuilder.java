// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowCountRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Table Row Count Request Builder.
 */
public interface IWorkbookTableRowCountRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookTableRowCountRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableRowCountRequest instance
     */
    IWorkbookTableRowCountRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookTableRowCountRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableRowCountRequest instance
     */
    IWorkbookTableRowCountRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
