// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPostForwardRequest;
import com.microsoft.graph.requests.extensions.PostForwardRequest;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Post Forward Request Builder.
 */
public class PostForwardRequestBuilder extends BaseActionRequestBuilder implements IPostForwardRequestBuilder {

    /**
     * The request builder for this PostForward
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param comment the comment
     * @param toRecipients the toRecipients
     */
    public PostForwardRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String comment, final java.util.List<Recipient> toRecipients) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("comment", comment);
        bodyParams.put("toRecipients", toRecipients);
    }

    /**
     * Creates the IPostForwardRequest
     *
     * @param requestOptions the options for the request
     * @return the IPostForwardRequest instance
     */
    public IPostForwardRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IPostForwardRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IPostForwardRequest instance
     */
    public IPostForwardRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PostForwardRequest request = new PostForwardRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("comment")) {
            request.body.comment = getParameter("comment");
        }

        if (hasParameter("toRecipients")) {
            request.body.toRecipients = getParameter("toRecipients");
        }

        return request;
    }
}
