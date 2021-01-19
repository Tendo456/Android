// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartSeries;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartPointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartPointRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartSeriesFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Series Request Builder.
 */
public class WorkbookChartSeriesRequestBuilder extends BaseRequestBuilder implements IWorkbookChartSeriesRequestBuilder {

    /**
     * The request builder for the WorkbookChartSeries
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartSeriesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartSeriesRequest instance
     */
    public IWorkbookChartSeriesRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartSeriesRequest instance
     */
    public IWorkbookChartSeriesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookChartSeriesRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartSeriesFormat
     *
     * @return the IWorkbookChartSeriesFormatRequestBuilder instance
     */
    public IWorkbookChartSeriesFormatRequestBuilder format() {
        return new WorkbookChartSeriesFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }
    public IWorkbookChartPointCollectionRequestBuilder points() {
        return new WorkbookChartPointCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("points"), getClient(), null);
    }

    public IWorkbookChartPointRequestBuilder points(final String id) {
        return new WorkbookChartPointRequestBuilder(getRequestUrlWithAdditionalSegment("points") + "/" + id, getClient(), null);
    }
}
