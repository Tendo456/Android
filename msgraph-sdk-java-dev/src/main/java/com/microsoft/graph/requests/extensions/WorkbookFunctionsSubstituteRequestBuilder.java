// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsSubstituteRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsSubstituteRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Substitute Request Builder.
 */
public class WorkbookFunctionsSubstituteRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsSubstituteRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSubstitute
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     * @param oldText the oldText
     * @param newText the newText
     * @param instanceNum the instanceNum
     */
    public WorkbookFunctionsSubstituteRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement oldText, final com.google.gson.JsonElement newText, final com.google.gson.JsonElement instanceNum) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
        bodyParams.put("oldText", oldText);
        bodyParams.put("newText", newText);
        bodyParams.put("instanceNum", instanceNum);
    }

    /**
     * Creates the IWorkbookFunctionsSubstituteRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSubstituteRequest instance
     */
    public IWorkbookFunctionsSubstituteRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsSubstituteRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSubstituteRequest instance
     */
    public IWorkbookFunctionsSubstituteRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsSubstituteRequest request = new WorkbookFunctionsSubstituteRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.body.text = getParameter("text");
        }

        if (hasParameter("oldText")) {
            request.body.oldText = getParameter("oldText");
        }

        if (hasParameter("newText")) {
            request.body.newText = getParameter("newText");
        }

        if (hasParameter("instanceNum")) {
            request.body.instanceNum = getParameter("instanceNum");
        }

        return request;
    }
}
