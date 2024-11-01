// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsGammaLnRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsGammaLnRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Gamma Ln Request Builder.
 */
public class WorkbookFunctionsGammaLnRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsGammaLnRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsGammaLn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     */
    public WorkbookFunctionsGammaLnRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement x) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
    }

    /**
     * Creates the IWorkbookFunctionsGammaLnRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsGammaLnRequest instance
     */
    public IWorkbookFunctionsGammaLnRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsGammaLnRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsGammaLnRequest instance
     */
    public IWorkbookFunctionsGammaLnRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsGammaLnRequest request = new WorkbookFunctionsGammaLnRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        return request;
    }
}
