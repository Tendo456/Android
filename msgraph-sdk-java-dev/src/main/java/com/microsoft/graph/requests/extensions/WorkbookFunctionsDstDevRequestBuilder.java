// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDstDevRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDstDevRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Dst Dev Request Builder.
 */
public class WorkbookFunctionsDstDevRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsDstDevRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDstDev
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param database the database
     * @param field the field
     * @param criteria the criteria
     */
    public WorkbookFunctionsDstDevRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement database, final com.google.gson.JsonElement field, final com.google.gson.JsonElement criteria) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("database", database);
        bodyParams.put("field", field);
        bodyParams.put("criteria", criteria);
    }

    /**
     * Creates the IWorkbookFunctionsDstDevRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDstDevRequest instance
     */
    public IWorkbookFunctionsDstDevRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsDstDevRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDstDevRequest instance
     */
    public IWorkbookFunctionsDstDevRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsDstDevRequest request = new WorkbookFunctionsDstDevRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("database")) {
            request.body.database = getParameter("database");
        }

        if (hasParameter("field")) {
            request.body.field = getParameter("field");
        }

        if (hasParameter("criteria")) {
            request.body.criteria = getParameter("criteria");
        }

        return request;
    }
}
