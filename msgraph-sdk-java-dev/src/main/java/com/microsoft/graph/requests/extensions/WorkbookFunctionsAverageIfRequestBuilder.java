// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsAverageIfRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsAverageIfRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Average If Request Builder.
 */
public class WorkbookFunctionsAverageIfRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsAverageIfRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAverageIf
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param range the range
     * @param criteria the criteria
     * @param averageRange the averageRange
     */
    public WorkbookFunctionsAverageIfRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement range, final com.google.gson.JsonElement criteria, final com.google.gson.JsonElement averageRange) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("range", range);
        bodyParams.put("criteria", criteria);
        bodyParams.put("averageRange", averageRange);
    }

    /**
     * Creates the IWorkbookFunctionsAverageIfRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAverageIfRequest instance
     */
    public IWorkbookFunctionsAverageIfRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsAverageIfRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAverageIfRequest instance
     */
    public IWorkbookFunctionsAverageIfRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsAverageIfRequest request = new WorkbookFunctionsAverageIfRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("range")) {
            request.body.range = getParameter("range");
        }

        if (hasParameter("criteria")) {
            request.body.criteria = getParameter("criteria");
        }

        if (hasParameter("averageRange")) {
            request.body.averageRange = getParameter("averageRange");
        }

        return request;
    }
}
