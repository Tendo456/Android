// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookPivotTableRefreshRequest;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableRefreshRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Pivot Table Refresh Request Builder.
 */
public class WorkbookPivotTableRefreshRequestBuilder extends BaseActionRequestBuilder implements IWorkbookPivotTableRefreshRequestBuilder {

    /**
     * The request builder for this WorkbookPivotTableRefresh
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookPivotTableRefreshRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookPivotTableRefreshRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookPivotTableRefreshRequest instance
     */
    public IWorkbookPivotTableRefreshRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookPivotTableRefreshRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookPivotTableRefreshRequest instance
     */
    public IWorkbookPivotTableRefreshRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookPivotTableRefreshRequest request = new WorkbookPivotTableRefreshRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
