// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookApplicationCalculateRequest;
import com.microsoft.graph.requests.extensions.WorkbookApplicationCalculateRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Application Calculate Request Builder.
 */
public class WorkbookApplicationCalculateRequestBuilder extends BaseActionRequestBuilder implements IWorkbookApplicationCalculateRequestBuilder {

    /**
     * The request builder for this WorkbookApplicationCalculate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param calculationType the calculationType
     */
    public WorkbookApplicationCalculateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String calculationType) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("calculationType", calculationType);
    }

    /**
     * Creates the IWorkbookApplicationCalculateRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookApplicationCalculateRequest instance
     */
    public IWorkbookApplicationCalculateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookApplicationCalculateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookApplicationCalculateRequest instance
     */
    public IWorkbookApplicationCalculateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookApplicationCalculateRequest request = new WorkbookApplicationCalculateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("calculationType")) {
            request.body.calculationType = getParameter("calculationType");
        }

        return request;
    }
}
