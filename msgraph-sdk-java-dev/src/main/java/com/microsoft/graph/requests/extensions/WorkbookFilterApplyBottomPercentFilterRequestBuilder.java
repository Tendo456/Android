// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyBottomPercentFilterRequest;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyBottomPercentFilterRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Apply Bottom Percent Filter Request Builder.
 */
public class WorkbookFilterApplyBottomPercentFilterRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFilterApplyBottomPercentFilterRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyBottomPercentFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param percent the percent
     */
    public WorkbookFilterApplyBottomPercentFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Integer percent) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("percent", percent);
    }

    /**
     * Creates the IWorkbookFilterApplyBottomPercentFilterRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFilterApplyBottomPercentFilterRequest instance
     */
    public IWorkbookFilterApplyBottomPercentFilterRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFilterApplyBottomPercentFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFilterApplyBottomPercentFilterRequest instance
     */
    public IWorkbookFilterApplyBottomPercentFilterRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFilterApplyBottomPercentFilterRequest request = new WorkbookFilterApplyBottomPercentFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("percent")) {
            request.body.percent = getParameter("percent");
        }

        return request;
    }
}
