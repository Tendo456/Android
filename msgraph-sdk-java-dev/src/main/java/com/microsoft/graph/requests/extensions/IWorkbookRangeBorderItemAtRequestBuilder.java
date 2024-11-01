// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderItemAtRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Border Item At Request Builder.
 */
public interface IWorkbookRangeBorderItemAtRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookRangeBorderItemAtRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeBorderItemAtRequest instance
     */
    IWorkbookRangeBorderItemAtRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookRangeBorderItemAtRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeBorderItemAtRequest instance
     */
    IWorkbookRangeBorderItemAtRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
