// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRangeRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Worksheet Range Request Builder.
 */
public interface IWorkbookWorksheetRangeRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookWorksheetRangeRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookWorksheetRangeRequest instance
     */
    IWorkbookWorksheetRangeRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookWorksheetRangeRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookWorksheetRangeRequest instance
     */
    IWorkbookWorksheetRangeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

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