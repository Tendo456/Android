// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsTbillYieldRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsTbillYieldRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Tbill Yield Request Builder.
 */
public class WorkbookFunctionsTbillYieldRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsTbillYieldRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsTbillYield
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param pr the pr
     */
    public WorkbookFunctionsTbillYieldRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement pr) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("settlement", settlement);
        bodyParams.put("maturity", maturity);
        bodyParams.put("pr", pr);
    }

    /**
     * Creates the IWorkbookFunctionsTbillYieldRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsTbillYieldRequest instance
     */
    public IWorkbookFunctionsTbillYieldRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsTbillYieldRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsTbillYieldRequest instance
     */
    public IWorkbookFunctionsTbillYieldRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsTbillYieldRequest request = new WorkbookFunctionsTbillYieldRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("settlement")) {
            request.body.settlement = getParameter("settlement");
        }

        if (hasParameter("maturity")) {
            request.body.maturity = getParameter("maturity");
        }

        if (hasParameter("pr")) {
            request.body.pr = getParameter("pr");
        }

        return request;
    }
}
