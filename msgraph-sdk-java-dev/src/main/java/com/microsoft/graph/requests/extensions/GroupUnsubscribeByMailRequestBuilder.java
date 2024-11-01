// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupUnsubscribeByMailRequest;
import com.microsoft.graph.requests.extensions.GroupUnsubscribeByMailRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Unsubscribe By Mail Request Builder.
 */
public class GroupUnsubscribeByMailRequestBuilder extends BaseActionRequestBuilder implements IGroupUnsubscribeByMailRequestBuilder {

    /**
     * The request builder for this GroupUnsubscribeByMail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupUnsubscribeByMailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IGroupUnsubscribeByMailRequest
     *
     * @param requestOptions the options for the request
     * @return the IGroupUnsubscribeByMailRequest instance
     */
    public IGroupUnsubscribeByMailRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IGroupUnsubscribeByMailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupUnsubscribeByMailRequest instance
     */
    public IGroupUnsubscribeByMailRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        GroupUnsubscribeByMailRequest request = new GroupUnsubscribeByMailRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
