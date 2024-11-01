// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICallTransferRequest;
import com.microsoft.graph.requests.extensions.CallTransferRequest;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Transfer Request Builder.
 */
public class CallTransferRequestBuilder extends BaseActionRequestBuilder implements ICallTransferRequestBuilder {

    /**
     * The request builder for this CallTransfer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param transferTarget the transferTarget
     */
    public CallTransferRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final InvitationParticipantInfo transferTarget) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("transferTarget", transferTarget);
    }

    /**
     * Creates the ICallTransferRequest
     *
     * @param requestOptions the options for the request
     * @return the ICallTransferRequest instance
     */
    public ICallTransferRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ICallTransferRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ICallTransferRequest instance
     */
    public ICallTransferRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CallTransferRequest request = new CallTransferRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("transferTarget")) {
            request.body.transferTarget = getParameter("transferTarget");
        }

        return request;
    }
}
