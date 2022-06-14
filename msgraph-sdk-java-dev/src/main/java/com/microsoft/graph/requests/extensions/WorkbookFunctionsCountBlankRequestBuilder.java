// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCountBlankRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsCountBlankRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Count Blank Request Builder.
 */
public class WorkbookFunctionsCountBlankRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsCountBlankRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCountBlank
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param range the range
     */
    public WorkbookFunctionsCountBlankRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement range) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("range", range);
    }

    /**
     * Creates the IWorkbookFunctionsCountBlankRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCountBlankRequest instance
     */
    public IWorkbookFunctionsCountBlankRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsCountBlankRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCountBlankRequest instance
     */
    public IWorkbookFunctionsCountBlankRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsCountBlankRequest request = new WorkbookFunctionsCountBlankRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("range")) {
            request.body.range = getParameter("range");
        }

        return request;
    }
}
