// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeMergeRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeMergeRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Merge Request Builder.
 */
public class WorkbookRangeMergeRequestBuilder extends BaseActionRequestBuilder implements IWorkbookRangeMergeRequestBuilder {

    /**
     * The request builder for this WorkbookRangeMerge
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param across the across
     */
    public WorkbookRangeMergeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Boolean across) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("across", across);
    }

    /**
     * Creates the IWorkbookRangeMergeRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeMergeRequest instance
     */
    public IWorkbookRangeMergeRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookRangeMergeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeMergeRequest instance
     */
    public IWorkbookRangeMergeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookRangeMergeRequest request = new WorkbookRangeMergeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("across")) {
            request.body.across = getParameter("across");
        }

        return request;
    }
}
