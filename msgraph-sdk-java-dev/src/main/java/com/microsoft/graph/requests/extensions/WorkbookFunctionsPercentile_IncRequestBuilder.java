// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPercentile_IncRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsPercentile_IncRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Percentile_Inc Request Builder.
 */
public class WorkbookFunctionsPercentile_IncRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsPercentile_IncRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPercentile_Inc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param array the array
     * @param k the k
     */
    public WorkbookFunctionsPercentile_IncRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement array, final com.google.gson.JsonElement k) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("array", array);
        bodyParams.put("k", k);
    }

    /**
     * Creates the IWorkbookFunctionsPercentile_IncRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPercentile_IncRequest instance
     */
    public IWorkbookFunctionsPercentile_IncRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsPercentile_IncRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPercentile_IncRequest instance
     */
    public IWorkbookFunctionsPercentile_IncRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsPercentile_IncRequest request = new WorkbookFunctionsPercentile_IncRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("array")) {
            request.body.array = getParameter("array");
        }

        if (hasParameter("k")) {
            request.body.k = getParameter("k");
        }

        return request;
    }
}
