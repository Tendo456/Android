// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsF_Inv_RTRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsF_Inv_RTRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions F_Inv_RTRequest Builder.
 */
public class WorkbookFunctionsF_Inv_RTRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsF_Inv_RTRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsF_Inv_RT
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param probability the probability
     * @param degFreedom1 the degFreedom1
     * @param degFreedom2 the degFreedom2
     */
    public WorkbookFunctionsF_Inv_RTRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement degFreedom1, final com.google.gson.JsonElement degFreedom2) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("probability", probability);
        bodyParams.put("degFreedom1", degFreedom1);
        bodyParams.put("degFreedom2", degFreedom2);
    }

    /**
     * Creates the IWorkbookFunctionsF_Inv_RTRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsF_Inv_RTRequest instance
     */
    public IWorkbookFunctionsF_Inv_RTRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsF_Inv_RTRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsF_Inv_RTRequest instance
     */
    public IWorkbookFunctionsF_Inv_RTRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsF_Inv_RTRequest request = new WorkbookFunctionsF_Inv_RTRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("probability")) {
            request.body.probability = getParameter("probability");
        }

        if (hasParameter("degFreedom1")) {
            request.body.degFreedom1 = getParameter("degFreedom1");
        }

        if (hasParameter("degFreedom2")) {
            request.body.degFreedom2 = getParameter("degFreedom2");
        }

        return request;
    }
}
