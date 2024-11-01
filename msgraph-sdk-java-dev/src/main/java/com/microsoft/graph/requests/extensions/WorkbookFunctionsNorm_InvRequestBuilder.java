// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNorm_InvRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNorm_InvRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Norm_Inv Request Builder.
 */
public class WorkbookFunctionsNorm_InvRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsNorm_InvRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNorm_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param probability the probability
     * @param mean the mean
     * @param standardDev the standardDev
     */
    public WorkbookFunctionsNorm_InvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement mean, final com.google.gson.JsonElement standardDev) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("probability", probability);
        bodyParams.put("mean", mean);
        bodyParams.put("standardDev", standardDev);
    }

    /**
     * Creates the IWorkbookFunctionsNorm_InvRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNorm_InvRequest instance
     */
    public IWorkbookFunctionsNorm_InvRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsNorm_InvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNorm_InvRequest instance
     */
    public IWorkbookFunctionsNorm_InvRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsNorm_InvRequest request = new WorkbookFunctionsNorm_InvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("probability")) {
            request.body.probability = getParameter("probability");
        }

        if (hasParameter("mean")) {
            request.body.mean = getParameter("mean");
        }

        if (hasParameter("standardDev")) {
            request.body.standardDev = getParameter("standardDev");
        }

        return request;
    }
}
