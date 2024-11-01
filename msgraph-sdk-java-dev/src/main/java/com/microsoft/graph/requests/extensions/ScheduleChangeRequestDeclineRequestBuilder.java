// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IScheduleChangeRequestDeclineRequest;
import com.microsoft.graph.requests.extensions.ScheduleChangeRequestDeclineRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Change Request Decline Request Builder.
 */
public class ScheduleChangeRequestDeclineRequestBuilder extends BaseActionRequestBuilder implements IScheduleChangeRequestDeclineRequestBuilder {

    /**
     * The request builder for this ScheduleChangeRequestDecline
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param message the message
     */
    public ScheduleChangeRequestDeclineRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String message) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("message", message);
    }

    /**
     * Creates the IScheduleChangeRequestDeclineRequest
     *
     * @param requestOptions the options for the request
     * @return the IScheduleChangeRequestDeclineRequest instance
     */
    public IScheduleChangeRequestDeclineRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IScheduleChangeRequestDeclineRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IScheduleChangeRequestDeclineRequest instance
     */
    public IScheduleChangeRequestDeclineRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ScheduleChangeRequestDeclineRequest request = new ScheduleChangeRequestDeclineRequest(
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
