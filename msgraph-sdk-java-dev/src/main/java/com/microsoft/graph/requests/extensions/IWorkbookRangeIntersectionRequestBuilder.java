// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeIntersectionRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Intersection Request Builder.
 */
public interface IWorkbookRangeIntersectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookRangeIntersectionRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeIntersectionRequest instance
     */
    IWorkbookRangeIntersectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookRangeIntersectionRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeIntersectionRequest instance
     */
    IWorkbookRangeIntersectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    /**
     * Gets the request builder for WorkbookRangeFormat
     *
     * @return the IWorkbookRangeFormatRequestBuilder instance
     */
    IWorkbookRangeFormatRequestBuilder format();

    /**
     * Gets the request builder for WorkbookRangeSort
     *
     * @return the IWorkbookRangeSortRequestBuilder instance
     */
    IWorkbookRangeSortRequestBuilder sort();

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the IWorkbookWorksheetRequestBuilder instance
     */
    IWorkbookWorksheetRequestBuilder worksheet();
}
