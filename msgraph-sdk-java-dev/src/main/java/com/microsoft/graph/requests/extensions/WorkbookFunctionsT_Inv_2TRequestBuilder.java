// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsT_Inv_2TRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsT_Inv_2TRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions T_Inv_2TRequest Builder.
 */
public class WorkbookFunctionsT_Inv_2TRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsT_Inv_2TRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsT_Inv_2T
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param probability the probability
     * @param degFreedom the degFreedom
     */
    public WorkbookFunctionsT_Inv_2TRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement degFreedom) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("probability", probability);
        bodyParams.put("degFreedom", degFreedom);
    }

    /**
     * Creates the IWorkbookFunctionsT_Inv_2TRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsT_Inv_2TRequest instance
     */
    public IWorkbookFunctionsT_Inv_2TRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsT_Inv_2TRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsT_Inv_2TRequest instance
     */
    public IWorkbookFunctionsT_Inv_2TRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsT_Inv_2TRequest request = new WorkbookFunctionsT_Inv_2TRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("probability")) {
            request.body.probability = getParameter("probability");
        }

        if (hasParameter("degFreedom")) {
            request.body.degFreedom = getParameter("degFreedom");
        }

        return request;
    }
}
