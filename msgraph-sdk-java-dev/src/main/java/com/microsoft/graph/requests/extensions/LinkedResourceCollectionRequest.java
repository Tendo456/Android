// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TodoTask;
import com.microsoft.graph.models.extensions.LinkedResource;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ILinkedResourceCollectionPage;
import com.microsoft.graph.requests.extensions.LinkedResourceCollectionResponse;
import com.microsoft.graph.requests.extensions.ILinkedResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILinkedResourceCollectionRequest;
import com.microsoft.graph.requests.extensions.LinkedResourceCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Linked Resource Collection Request.
 */
public class LinkedResourceCollectionRequest extends BaseCollectionRequest<LinkedResourceCollectionResponse, ILinkedResourceCollectionPage> implements ILinkedResourceCollectionRequest {

    /**
     * The request builder for this collection of LinkedResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LinkedResourceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, LinkedResourceCollectionResponse.class, ILinkedResourceCollectionPage.class);
    }

    public void get(final ICallback<? super ILinkedResourceCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ILinkedResourceCollectionPage get() throws ClientException {
        final LinkedResourceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final LinkedResource newLinkedResource, final ICallback<? super LinkedResource> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new LinkedResourceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newLinkedResource, callback);
    }

    public LinkedResource post(final LinkedResource newLinkedResource) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new LinkedResourceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newLinkedResource);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ILinkedResourceCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (LinkedResourceCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ILinkedResourceCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (LinkedResourceCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ILinkedResourceCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (LinkedResourceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ILinkedResourceCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (LinkedResourceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ILinkedResourceCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (LinkedResourceCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ILinkedResourceCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (LinkedResourceCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ILinkedResourceCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ILinkedResourceCollectionRequest)this;
    }
    public ILinkedResourceCollectionPage buildFromResponse(final LinkedResourceCollectionResponse response) {
        final ILinkedResourceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new LinkedResourceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final LinkedResourceCollectionPage page = new LinkedResourceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
