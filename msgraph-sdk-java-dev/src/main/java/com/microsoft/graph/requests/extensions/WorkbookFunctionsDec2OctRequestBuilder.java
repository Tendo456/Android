// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDec2OctRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDec2OctRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Dec2Oct Request Builder.
 */
public class WorkbookFunctionsDec2OctRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsDec2OctRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDec2Oct
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param places the places
     */
    public WorkbookFunctionsDec2OctRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement places) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("places", places);
    }

    /**
     * Creates the IWorkbookFunctionsDec2OctRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDec2OctRequest instance
     */
    public IWorkbookFunctionsDec2OctRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsDec2OctRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDec2OctRequest instance
     */
    public IWorkbookFunctionsDec2OctRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsDec2OctRequest request = new WorkbookFunctionsDec2OctRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("places")) {
            request.body.places = getParameter("places");
        }

        return request;
    }
}
