// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsXirrRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsXirrRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Xirr Request Builder.
 */
public class WorkbookFunctionsXirrRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsXirrRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsXirr
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     * @param dates the dates
     * @param guess the guess
     */
    public WorkbookFunctionsXirrRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement values, final com.google.gson.JsonElement dates, final com.google.gson.JsonElement guess) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
        bodyParams.put("dates", dates);
        bodyParams.put("guess", guess);
    }

    /**
     * Creates the IWorkbookFunctionsXirrRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsXirrRequest instance
     */
    public IWorkbookFunctionsXirrRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsXirrRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsXirrRequest instance
     */
    public IWorkbookFunctionsXirrRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsXirrRequest request = new WorkbookFunctionsXirrRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        if (hasParameter("dates")) {
            request.body.dates = getParameter("dates");
        }

        if (hasParameter("guess")) {
            request.body.guess = getParameter("guess");
        }

        return request;
    }
}
