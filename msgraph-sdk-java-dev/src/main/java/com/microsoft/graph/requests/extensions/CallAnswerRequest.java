// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CallAnswerBody;
import com.microsoft.graph.requests.extensions.ICallAnswerRequest;
import com.microsoft.graph.requests.extensions.CallAnswerRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Answer Request.
 */
public class CallAnswerRequest extends BaseRequest implements ICallAnswerRequest {
    protected final CallAnswerBody body;

    /**
     * The request for this CallAnswer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallAnswerRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
        body = new CallAnswerBody();
    }

    public void post(final ICallback<? super Void> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public Void post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICallAnswerRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CallAnswerRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ICallAnswerRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (CallAnswerRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICallAnswerRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CallAnswerRequest)this;
    }

}
