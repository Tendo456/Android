// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookCreateSessionRequest;
import com.microsoft.graph.requests.extensions.WorkbookCreateSessionRequest;
import com.microsoft.graph.models.extensions.WorkbookSessionInfo;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Create Session Request Builder.
 */
public class WorkbookCreateSessionRequestBuilder extends BaseActionRequestBuilder implements IWorkbookCreateSessionRequestBuilder {

    /**
     * The request builder for this WorkbookCreateSession
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param persistChanges the persistChanges
     */
    public WorkbookCreateSessionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Boolean persistChanges) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("persistChanges", persistChanges);
    }

    /**
     * Creates the IWorkbookCreateSessionRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookCreateSessionRequest instance
     */
    public IWorkbookCreateSessionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookCreateSessionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookCreateSessionRequest instance
     */
    public IWorkbookCreateSessionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookCreateSessionRequest request = new WorkbookCreateSessionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("persistChanges")) {
            request.body.persistChanges = getParameter("persistChanges");
        }

        return request;
    }
}
