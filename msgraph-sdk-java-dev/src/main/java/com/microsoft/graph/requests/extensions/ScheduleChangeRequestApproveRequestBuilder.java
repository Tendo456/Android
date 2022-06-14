// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IScheduleChangeRequestApproveRequest;
import com.microsoft.graph.requests.extensions.ScheduleChangeRequestApproveRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Change Request Approve Request Builder.
 */
public class ScheduleChangeRequestApproveRequestBuilder extends BaseActionRequestBuilder implements IScheduleChangeRequestApproveRequestBuilder {

    /**
     * The request builder for this ScheduleChangeRequestApprove
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param message the message
     */
    public ScheduleChangeRequestApproveRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String message) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("message", message);
    }

    /**
     * Creates the IScheduleChangeRequestApproveRequest
     *
     * @param requestOptions the options for the request
     * @return the IScheduleChangeRequestApproveRequest instance
     */
    public IScheduleChangeRequestApproveRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IScheduleChangeRequestApproveRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IScheduleChangeRequestApproveRequest instance
     */
    public IScheduleChangeRequestApproveRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ScheduleChangeRequestApproveRequest request = new ScheduleChangeRequestApproveRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("message")) {
            request.body.message = getParameter("message");
        }

        return request;
    }
}
