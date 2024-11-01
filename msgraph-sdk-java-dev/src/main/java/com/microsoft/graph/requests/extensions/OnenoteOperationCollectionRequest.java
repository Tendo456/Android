// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IOnenoteOperationCollectionPage;
import com.microsoft.graph.requests.extensions.OnenoteOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.IOnenoteOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteOperationCollectionRequest;
import com.microsoft.graph.requests.extensions.OnenoteOperationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Operation Collection Request.
 */
public class OnenoteOperationCollectionRequest extends BaseCollectionRequest<OnenoteOperationCollectionResponse, IOnenoteOperationCollectionPage> implements IOnenoteOperationCollectionRequest {

    /**
     * The request builder for this collection of OnenoteOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteOperationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenoteOperationCollectionResponse.class, IOnenoteOperationCollectionPage.class);
    }

    public void get(final ICallback<? super IOnenoteOperationCollectionPage> callback) {
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

    public IOnenoteOperationCollectionPage get() throws ClientException {
        final OnenoteOperationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final OnenoteOperation newOnenoteOperation, final ICallback<? super OnenoteOperation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new OnenoteOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOnenoteOperation, callback);
    }

    public OnenoteOperation post(final OnenoteOperation newOnenoteOperation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new OnenoteOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOnenoteOperation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOnenoteOperationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (OnenoteOperationCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IOnenoteOperationCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (OnenoteOperationCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IOnenoteOperationCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (OnenoteOperationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOnenoteOperationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (OnenoteOperationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IOnenoteOperationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (OnenoteOperationCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IOnenoteOperationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (OnenoteOperationCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IOnenoteOperationCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IOnenoteOperationCollectionRequest)this;
    }
    public IOnenoteOperationCollectionPage buildFromResponse(final OnenoteOperationCollectionResponse response) {
        final IOnenoteOperationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OnenoteOperationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final OnenoteOperationCollectionPage page = new OnenoteOperationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
