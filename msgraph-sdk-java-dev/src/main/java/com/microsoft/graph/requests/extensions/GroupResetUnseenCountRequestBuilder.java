// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupResetUnseenCountRequest;
import com.microsoft.graph.requests.extensions.GroupResetUnseenCountRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Reset Unseen Count Request Builder.
 */
public class GroupResetUnseenCountRequestBuilder extends BaseActionRequestBuilder implements IGroupResetUnseenCountRequestBuilder {

    /**
     * The request builder for this GroupResetUnseenCount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupResetUnseenCountRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IGroupResetUnseenCountRequest
     *
     * @param requestOptions the options for the request
     * @return the IGroupResetUnseenCountRequest instance
     */
    public IGroupResetUnseenCountRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IGroupResetUnseenCountRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupResetUnseenCountRequest instance
     */
    public IGroupResetUnseenCountRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        GroupResetUnseenCountRequest request = new GroupResetUnseenCountRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
