// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.DelegatedPermissionClassification;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDelegatedPermissionClassificationCollectionPage;
import com.microsoft.graph.requests.extensions.DelegatedPermissionClassificationCollectionResponse;
import com.microsoft.graph.requests.extensions.IDelegatedPermissionClassificationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDelegatedPermissionClassificationCollectionRequest;
import com.microsoft.graph.requests.extensions.DelegatedPermissionClassificationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Delegated Permission Classification Collection Request.
 */
public class DelegatedPermissionClassificationCollectionRequest extends BaseCollectionRequest<DelegatedPermissionClassificationCollectionResponse, IDelegatedPermissionClassificationCollectionPage> implements IDelegatedPermissionClassificationCollectionRequest {

    /**
     * The request builder for this collection of DelegatedPermissionClassification
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DelegatedPermissionClassificationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DelegatedPermissionClassificationCollectionResponse.class, IDelegatedPermissionClassificationCollectionPage.class);
    }

    public void get(final ICallback<? super IDelegatedPermissionClassificationCollectionPage> callback) {
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

    public IDelegatedPermissionClassificationCollectionPage get() throws ClientException {
        final DelegatedPermissionClassificationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DelegatedPermissionClassification newDelegatedPermissionClassification, final ICallback<? super DelegatedPermissionClassification> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DelegatedPermissionClassificationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDelegatedPermissionClassification, callback);
    }

    public DelegatedPermissionClassification post(final DelegatedPermissionClassification newDelegatedPermissionClassification) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DelegatedPermissionClassificationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDelegatedPermissionClassification);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDelegatedPermissionClassificationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DelegatedPermissionClassificationCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDelegatedPermissionClassificationCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DelegatedPermissionClassificationCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDelegatedPermissionClassificationCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DelegatedPermissionClassificationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDelegatedPermissionClassificationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DelegatedPermissionClassificationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDelegatedPermissionClassificationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DelegatedPermissionClassificationCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDelegatedPermissionClassificationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DelegatedPermissionClassificationCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDelegatedPermissionClassificationCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDelegatedPermissionClassificationCollectionRequest)this;
    }
    public IDelegatedPermissionClassificationCollectionPage buildFromResponse(final DelegatedPermissionClassificationCollectionResponse response) {
        final IDelegatedPermissionClassificationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DelegatedPermissionClassificationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DelegatedPermissionClassificationCollectionPage page = new DelegatedPermissionClassificationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
