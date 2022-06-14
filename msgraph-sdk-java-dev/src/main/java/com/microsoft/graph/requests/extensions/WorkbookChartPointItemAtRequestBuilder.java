// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointItemAtRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartPointItemAtRequest;
import com.microsoft.graph.models.extensions.WorkbookChartPoint;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Point Item At Request Builder.
 */
public class WorkbookChartPointItemAtRequestBuilder extends BaseFunctionRequestBuilder implements IWorkbookChartPointItemAtRequestBuilder {

    /**
     * The request builder for this WorkbookChartPointItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param index the index
     */
    public WorkbookChartPointItemAtRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Integer index) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("index", index));
    }

    /**
     * Creates the IWorkbookChartPointItemAtRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartPointItemAtRequest instance
     */
    public IWorkbookChartPointItemAtRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookChartPointItemAtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartPointItemAtRequest instance
     */
    public IWorkbookChartPointItemAtRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookChartPointItemAtRequest request = new WorkbookChartPointItemAtRequest(
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
     * Gets the request builder for WorkbookChartPointFormat
     *
     * @return the IWorkbookChartPointFormatRequestBuilder instance
     */
    public IWorkbookChartPointFormatRequestBuilder format() {
        return new WorkbookChartPointFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }
}
