// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeCellRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeCellRequest;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Cell Request Builder.
 */
public class WorkbookRangeCellRequestBuilder extends BaseFunctionRequestBuilder implements IWorkbookRangeCellRequestBuilder {

    /**
     * The request builder for this WorkbookRangeCell
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param row the row
     * @param column the column
     */
    public WorkbookRangeCellRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Integer row, final Integer column) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("row", row));
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("column", column));
    }

    /**
     * Creates the IWorkbookRangeCellRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeCellRequest instance
     */
    public IWorkbookRangeCellRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookRangeCellRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeCellRequest instance
     */
    public IWorkbookRangeCellRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookRangeCellRequest request = new WorkbookRangeCellRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }

    /**
     * Gets the request builder for WorkbookRangeFormat
     *
     * @return the IWorkbookRangeFormatRequestBuilder instance
     */
    public IWorkbookRangeFormatRequestBuilder format() {
        return new WorkbookRangeFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookRangeSort
     *
     * @return the IWorkbookRangeSortRequestBuilder instance
     */
    public IWorkbookRangeSortRequestBuilder sort() {
        return new WorkbookRangeSortRequestBuilder(getRequestUrlWithAdditionalSegment("sort"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the IWorkbookWorksheetRequestBuilder instance
     */
    public IWorkbookWorksheetRequestBuilder worksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }
}