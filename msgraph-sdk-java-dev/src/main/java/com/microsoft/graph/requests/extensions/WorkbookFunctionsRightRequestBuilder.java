// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRightRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRightRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Right Request Builder.
 */
public class WorkbookFunctionsRightRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsRightRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRight
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     * @param numChars the numChars
     */
    public WorkbookFunctionsRightRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement numChars) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
        bodyParams.put("numChars", numChars);
    }

    /**
     * Creates the IWorkbookFunctionsRightRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRightRequest instance
     */
    public IWorkbookFunctionsRightRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsRightRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRightRequest instance
     */
    public IWorkbookFunctionsRightRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsRightRequest request = new WorkbookFunctionsRightRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.body.text = getParameter("text");
        }

        if (hasParameter("numChars")) {
            request.body.numChars = getParameter("numChars");
        }

        return request;
    }
}
