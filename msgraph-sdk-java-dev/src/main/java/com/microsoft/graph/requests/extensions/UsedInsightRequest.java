// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UsedInsight;
import com.microsoft.graph.requests.extensions.IEntityRequestBuilder;
import com.microsoft.graph.requests.extensions.EntityRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Used Insight Request.
 */
public class UsedInsightRequest extends BaseRequest implements IUsedInsightRequest {
	
    /**
     * The request for the UsedInsight
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UsedInsightRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UsedInsight.class);
    }

    /**
     * Gets the UsedInsight from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UsedInsight> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UsedInsight from the service
     *
     * @return the UsedInsight from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UsedInsight get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UsedInsight> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UsedInsight with a source
     *
     * @param sourceUsedInsight the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UsedInsight sourceUsedInsight, final ICallback<? super UsedInsight> callback) {
        send(HttpMethod.PATCH, callback, sourceUsedInsight);
    }

    /**
     * Patches this UsedInsight with a source
     *
     * @param sourceUsedInsight the source object with updates
     * @return the updated UsedInsight
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UsedInsight patch(final UsedInsight sourceUsedInsight) throws ClientException {
        return send(HttpMethod.PATCH, sourceUsedInsight);
    }

    /**
     * Creates a UsedInsight with a new object
     *
     * @param newUsedInsight the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UsedInsight newUsedInsight, final ICallback<? super UsedInsight> callback) {
        send(HttpMethod.POST, callback, newUsedInsight);
    }

    /**
     * Creates a UsedInsight with a new object
     *
     * @param newUsedInsight the new object to create
     * @return the created UsedInsight
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UsedInsight post(final UsedInsight newUsedInsight) throws ClientException {
        return send(HttpMethod.POST, newUsedInsight);
    }

    /**
     * Creates a UsedInsight with a new object
     *
     * @param newUsedInsight the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UsedInsight newUsedInsight, final ICallback<? super UsedInsight> callback) {
        send(HttpMethod.PUT, callback, newUsedInsight);
    }

    /**
     * Creates a UsedInsight with a new object
     *
     * @param newUsedInsight the object to create/update
     * @return the created UsedInsight
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UsedInsight put(final UsedInsight newUsedInsight) throws ClientException {
        return send(HttpMethod.PUT, newUsedInsight);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUsedInsightRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UsedInsightRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUsedInsightRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UsedInsightRequest)this;
     }

}

