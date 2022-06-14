// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionPage;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionResponse;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionRequest;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the OAuth2Permission Grant Collection Request.
 */
public class OAuth2PermissionGrantCollectionRequest extends BaseCollectionRequest<OAuth2PermissionGrantCollectionResponse, IOAuth2PermissionGrantCollectionPage> implements IOAuth2PermissionGrantCollectionRequest {

    /**
     * The request builder for this collection of OAuth2PermissionGrant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OAuth2PermissionGrantCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OAuth2PermissionGrantCollectionResponse.class, IOAuth2PermissionGrantCollectionPage.class);
    }

    public void get(final ICallback<? super IOAuth2PermissionGrantCollectionPage> callback) {
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

    public IOAuth2PermissionGrantCollectionPage get() throws ClientException {
        final OAuth2PermissionGrantCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final OAuth2PermissionGrant newOAuth2PermissionGrant, final ICallback<? super OAuth2PermissionGrant> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new OAuth2PermissionGrantRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOAuth2PermissionGrant, callback);
    }

    public OAuth2PermissionGrant post(final OAuth2PermissionGrant newOAuth2PermissionGrant) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new OAuth2PermissionGrantRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOAuth2PermissionGrant);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOAuth2PermissionGrantCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (OAuth2PermissionGrantCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IOAuth2PermissionGrantCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (OAuth2PermissionGrantCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IOAuth2PermissionGrantCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (OAuth2PermissionGrantCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOAuth2PermissionGrantCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (OAuth2PermissionGrantCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IOAuth2PermissionGrantCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (OAuth2PermissionGrantCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IOAuth2PermissionGrantCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (OAuth2PermissionGrantCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IOAuth2PermissionGrantCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IOAuth2PermissionGrantCollectionRequest)this;
    }
    public IOAuth2PermissionGrantCollectionPage buildFromResponse(final OAuth2PermissionGrantCollectionResponse response) {
        final IOAuth2PermissionGrantCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OAuth2PermissionGrantCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final OAuth2PermissionGrantCollectionPage page = new OAuth2PermissionGrantCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
