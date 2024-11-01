// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsSumIfRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsSumIfRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Sum If Request Builder.
 */
public class WorkbookFunctionsSumIfRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsSumIfRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSumIf
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param range the range
     * @param criteria the criteria
     * @param sumRange the sumRange
     */
    public WorkbookFunctionsSumIfRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement range, final com.google.gson.JsonElement criteria, final com.google.gson.JsonElement sumRange) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("range", range);
        bodyParams.put("criteria", criteria);
        bodyParams.put("sumRange", sumRange);
    }

    /**
     * Creates the IWorkbookFunctionsSumIfRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSumIfRequest instance
     */
    public IWorkbookFunctionsSumIfRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsSumIfRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSumIfRequest instance
     */
    public IWorkbookFunctionsSumIfRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsSumIfRequest request = new WorkbookFunctionsSumIfRequest(
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

        if (hasParameter("sumRange")) {
            request.body.sumRange = getParameter("sumRange");
        }

        return request;
    }
}
