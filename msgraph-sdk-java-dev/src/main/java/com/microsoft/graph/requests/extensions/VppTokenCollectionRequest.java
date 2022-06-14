// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.VppToken;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IVppTokenCollectionPage;
import com.microsoft.graph.requests.extensions.VppTokenCollectionResponse;
import com.microsoft.graph.requests.extensions.IVppTokenCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IVppTokenCollectionRequest;
import com.microsoft.graph.requests.extensions.VppTokenCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpp Token Collection Request.
 */
public class VppTokenCollectionRequest extends BaseCollectionRequest<VppTokenCollectionResponse, IVppTokenCollectionPage> implements IVppTokenCollectionRequest {

    /**
     * The request builder for this collection of VppToken
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public VppTokenCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, VppTokenCollectionResponse.class, IVppTokenCollectionPage.class);
    }

    public void get(final ICallback<? super IVppTokenCollectionPage> callback) {
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

    public IVppTokenCollectionPage get() throws ClientException {
        final VppTokenCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final VppToken newVppToken, final ICallback<? super VppToken> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new VppTokenRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newVppToken, callback);
    }

    public VppToken post(final VppToken newVppToken) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new VppTokenRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newVppToken);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IVppTokenCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (VppTokenCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IVppTokenCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (VppTokenCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IVppTokenCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (VppTokenCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IVppTokenCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (VppTokenCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IVppTokenCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (VppTokenCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IVppTokenCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (VppTokenCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IVppTokenCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IVppTokenCollectionRequest)this;
    }
    public IVppTokenCollectionPage buildFromResponse(final VppTokenCollectionResponse response) {
        final IVppTokenCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new VppTokenCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final VppTokenCollectionPage page = new VppTokenCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
