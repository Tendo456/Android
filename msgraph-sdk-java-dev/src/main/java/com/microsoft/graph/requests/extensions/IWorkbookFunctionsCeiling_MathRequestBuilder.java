// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCeiling_MathRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Ceiling_Math Request Builder.
 */
public interface IWorkbookFunctionsCeiling_MathRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsCeiling_MathRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCeiling_MathRequest instance
     */
    IWorkbookFunctionsCeiling_MathRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsCeiling_MathRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCeiling_MathRequest instance
     */
    IWorkbookFunctionsCeiling_MathRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
