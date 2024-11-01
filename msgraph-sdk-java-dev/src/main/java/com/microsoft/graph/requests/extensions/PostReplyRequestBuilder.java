// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPostReplyRequest;
import com.microsoft.graph.requests.extensions.PostReplyRequest;
import com.microsoft.graph.models.extensions.Post;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Post Reply Request Builder.
 */
public class PostReplyRequestBuilder extends BaseActionRequestBuilder implements IPostReplyRequestBuilder {

    /**
     * The request builder for this PostReply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param post the post
     */
    public PostReplyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Post post) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("post", post);
    }

    /**
     * Creates the IPostReplyRequest
     *
     * @param requestOptions the options for the request
     * @return the IPostReplyRequest instance
     */
    public IPostReplyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IPostReplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IPostReplyRequest instance
     */
    public IPostReplyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PostReplyRequest request = new PostReplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("post")) {
            request.body.post = getParameter("post");
        }

        return request;
    }
}
