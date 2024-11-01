// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartPointFormat;
import com.microsoft.graph.requests.extensions.IWorkbookChartFillRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartFillRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Point Format Request Builder.
 */
public class WorkbookChartPointFormatRequestBuilder extends BaseRequestBuilder implements IWorkbookChartPointFormatRequestBuilder {

    /**
     * The request builder for the WorkbookChartPointFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartPointFormatRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartPointFormatRequest instance
     */
    public IWorkbookChartPointFormatRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartPointFormatRequest instance
     */
    public IWorkbookChartPointFormatRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookChartPointFormatRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartFill
     *
     * @return the IWorkbookChartFillRequestBuilder instance
     */
    public IWorkbookChartFillRequestBuilder fill() {
        return new WorkbookChartFillRequestBuilder(getRequestUrlWithAdditionalSegment("fill"), getClient(), null);
    }
}
