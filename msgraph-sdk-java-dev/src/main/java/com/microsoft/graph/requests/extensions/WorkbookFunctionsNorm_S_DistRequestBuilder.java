// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNorm_S_DistRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNorm_S_DistRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Norm_S_Dist Request Builder.
 */
public class WorkbookFunctionsNorm_S_DistRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsNorm_S_DistRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNorm_S_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param z the z
     * @param cumulative the cumulative
     */
    public WorkbookFunctionsNorm_S_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement z, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("z", z);
        bodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsNorm_S_DistRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNorm_S_DistRequest instance
     */
    public IWorkbookFunctionsNorm_S_DistRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsNorm_S_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNorm_S_DistRequest instance
     */
    public IWorkbookFunctionsNorm_S_DistRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsNorm_S_DistRequest request = new WorkbookFunctionsNorm_S_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("z")) {
            request.body.z = getParameter("z");
        }

        if (hasParameter("cumulative")) {
            request.body.cumulative = getParameter("cumulative");
        }

        return request;
    }
}
