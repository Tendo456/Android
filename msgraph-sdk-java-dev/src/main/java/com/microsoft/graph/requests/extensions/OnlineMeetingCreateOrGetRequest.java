// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnlineMeetingCreateOrGetBody;
import com.microsoft.graph.models.extensions.OnlineMeeting;
import com.microsoft.graph.requests.extensions.IOnlineMeetingCreateOrGetRequest;
import com.microsoft.graph.requests.extensions.OnlineMeetingCreateOrGetRequest;

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
 * The class for the Online Meeting Create Or Get Request.
 */
public class OnlineMeetingCreateOrGetRequest extends BaseRequest implements IOnlineMeetingCreateOrGetRequest {
    protected final OnlineMeetingCreateOrGetBody body;

    /**
     * The request for this OnlineMeetingCreateOrGet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnlineMeetingCreateOrGetRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnlineMeeting.class);
        body = new OnlineMeetingCreateOrGetBody();
    }

    public void post(final ICallback<? super OnlineMeeting> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public OnlineMeeting post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOnlineMeetingCreateOrGetRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (OnlineMeetingCreateOrGetRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IOnlineMeetingCreateOrGetRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (OnlineMeetingCreateOrGetRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOnlineMeetingCreateOrGetRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (OnlineMeetingCreateOrGetRequest)this;
    }

}
