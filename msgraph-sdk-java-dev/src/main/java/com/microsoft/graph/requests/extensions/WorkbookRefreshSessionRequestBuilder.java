// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRefreshSessionRequest;
import com.microsoft.graph.requests.extensions.WorkbookRefreshSessionRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Refresh Session Request Builder.
 */
public class WorkbookRefreshSessionRequestBuilder extends BaseActionRequestBuilder implements IWorkbookRefreshSessionRequestBuilder {

    /**
     * The request builder for this WorkbookRefreshSession
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRefreshSessionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookRefreshSessionRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRefreshSessionRequest instance
     */
    public IWorkbookRefreshSessionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookRefreshSessionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRefreshSessionRequest instance
     */
    public IWorkbookRefreshSessionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookRefreshSessionRequest request = new WorkbookRefreshSessionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
