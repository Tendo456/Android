// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsHyperlinkRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsHyperlinkRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Hyperlink Request Builder.
 */
public class WorkbookFunctionsHyperlinkRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsHyperlinkRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsHyperlink
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param linkLocation the linkLocation
     * @param friendlyName the friendlyName
     */
    public WorkbookFunctionsHyperlinkRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement linkLocation, final com.google.gson.JsonElement friendlyName) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("linkLocation", linkLocation);
        bodyParams.put("friendlyName", friendlyName);
    }

    /**
     * Creates the IWorkbookFunctionsHyperlinkRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsHyperlinkRequest instance
     */
    public IWorkbookFunctionsHyperlinkRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsHyperlinkRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsHyperlinkRequest instance
     */
    public IWorkbookFunctionsHyperlinkRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsHyperlinkRequest request = new WorkbookFunctionsHyperlinkRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("linkLocation")) {
            request.body.linkLocation = getParameter("linkLocation");
        }

        if (hasParameter("friendlyName")) {
            request.body.friendlyName = getParameter("friendlyName");
        }

        return request;
    }
}
