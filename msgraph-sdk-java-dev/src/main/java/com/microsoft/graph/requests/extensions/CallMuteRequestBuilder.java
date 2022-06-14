// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICallMuteRequest;
import com.microsoft.graph.requests.extensions.CallMuteRequest;
import com.microsoft.graph.models.extensions.MuteParticipantOperation;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Mute Request Builder.
 */
public class CallMuteRequestBuilder extends BaseActionRequestBuilder implements ICallMuteRequestBuilder {

    /**
     * The request builder for this CallMute
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param clientContext the clientContext
     */
    public CallMuteRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String clientContext) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("clientContext", clientContext);
    }

    /**
     * Creates the ICallMuteRequest
     *
     * @param requestOptions the options for the request
     * @return the ICallMuteRequest instance
     */
    public ICallMuteRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ICallMuteRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ICallMuteRequest instance
     */
    public ICallMuteRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CallMuteRequest request = new CallMuteRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("clientContext")) {
            request.body.clientContext = getParameter("clientContext");
        }

        return request;
    }
}
