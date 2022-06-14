// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFvRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsFvRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Fv Request Builder.
 */
public class WorkbookFunctionsFvRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsFvRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rate the rate
     * @param nper the nper
     * @param pmt the pmt
     * @param pv the pv
     * @param type the type
     */
    public WorkbookFunctionsFvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pmt, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement type) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("rate", rate);
        bodyParams.put("nper", nper);
        bodyParams.put("pmt", pmt);
        bodyParams.put("pv", pv);
        bodyParams.put("type", type);
    }

    /**
     * Creates the IWorkbookFunctionsFvRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFvRequest instance
     */
    public IWorkbookFunctionsFvRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsFvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFvRequest instance
     */
    public IWorkbookFunctionsFvRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsFvRequest request = new WorkbookFunctionsFvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("nper")) {
            request.body.nper = getParameter("nper");
        }

        if (hasParameter("pmt")) {
            request.body.pmt = getParameter("pmt");
        }

        if (hasParameter("pv")) {
            request.body.pv = getParameter("pv");
        }

        if (hasParameter("type")) {
            request.body.type = getParameter("type");
        }

        return request;
    }
}
