// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PermissionGrantPolicy;
import com.microsoft.graph.models.extensions.PermissionGrantConditionSet;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPermissionGrantConditionSetCollectionPage;
import com.microsoft.graph.requests.extensions.PermissionGrantConditionSetCollectionResponse;
import com.microsoft.graph.requests.extensions.IPermissionGrantConditionSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionGrantConditionSetCollectionRequest;
import com.microsoft.graph.requests.extensions.PermissionGrantConditionSetCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Condition Set Collection Request.
 */
public class PermissionGrantConditionSetCollectionRequest extends BaseCollectionRequest<PermissionGrantConditionSetCollectionResponse, IPermissionGrantConditionSetCollectionPage> implements IPermissionGrantConditionSetCollectionRequest {

    /**
     * The request builder for this collection of PermissionGrantConditionSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PermissionGrantConditionSetCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PermissionGrantConditionSetCollectionResponse.class, IPermissionGrantConditionSetCollectionPage.class);
    }

    public void get(final ICallback<? super IPermissionGrantConditionSetCollectionPage> callback) {
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

    public IPermissionGrantConditionSetCollectionPage get() throws ClientException {
        final PermissionGrantConditionSetCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PermissionGrantConditionSet newPermissionGrantConditionSet, final ICallback<? super PermissionGrantConditionSet> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PermissionGrantConditionSetRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPermissionGrantConditionSet, callback);
    }

    public PermissionGrantConditionSet post(final PermissionGrantConditionSet newPermissionGrantConditionSet) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PermissionGrantConditionSetRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPermissionGrantConditionSet);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPermissionGrantConditionSetCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PermissionGrantConditionSetCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IPermissionGrantConditionSetCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (PermissionGrantConditionSetCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IPermissionGrantConditionSetCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (PermissionGrantConditionSetCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPermissionGrantConditionSetCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PermissionGrantConditionSetCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPermissionGrantConditionSetCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PermissionGrantConditionSetCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPermissionGrantConditionSetCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PermissionGrantConditionSetCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPermissionGrantConditionSetCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPermissionGrantConditionSetCollectionRequest)this;
    }
    public IPermissionGrantConditionSetCollectionPage buildFromResponse(final PermissionGrantConditionSetCollectionResponse response) {
        final IPermissionGrantConditionSetCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PermissionGrantConditionSetCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PermissionGrantConditionSetCollectionPage page = new PermissionGrantConditionSetCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
