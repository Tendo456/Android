// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsApp;
import com.microsoft.graph.models.extensions.TeamsAppDefinition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionCollectionResponse;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionCollectionRequest;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Definition Collection Request.
 */
public class TeamsAppDefinitionCollectionRequest extends BaseCollectionRequest<TeamsAppDefinitionCollectionResponse, ITeamsAppDefinitionCollectionPage> implements ITeamsAppDefinitionCollectionRequest {

    /**
     * The request builder for this collection of TeamsAppDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppDefinitionCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsAppDefinitionCollectionResponse.class, ITeamsAppDefinitionCollectionPage.class);
    }

    public void get(final ICallback<? super ITeamsAppDefinitionCollectionPage> callback) {
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

    public ITeamsAppDefinitionCollectionPage get() throws ClientException {
        final TeamsAppDefinitionCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TeamsAppDefinition newTeamsAppDefinition, final ICallback<? super TeamsAppDefinition> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TeamsAppDefinitionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTeamsAppDefinition, callback);
    }

    public TeamsAppDefinition post(final TeamsAppDefinition newTeamsAppDefinition) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TeamsAppDefinitionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTeamsAppDefinition);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITeamsAppDefinitionCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TeamsAppDefinitionCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ITeamsAppDefinitionCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (TeamsAppDefinitionCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ITeamsAppDefinitionCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (TeamsAppDefinitionCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITeamsAppDefinitionCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TeamsAppDefinitionCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITeamsAppDefinitionCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (TeamsAppDefinitionCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ITeamsAppDefinitionCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (TeamsAppDefinitionCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ITeamsAppDefinitionCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ITeamsAppDefinitionCollectionRequest)this;
    }
    public ITeamsAppDefinitionCollectionPage buildFromResponse(final TeamsAppDefinitionCollectionResponse response) {
        final ITeamsAppDefinitionCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TeamsAppDefinitionCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TeamsAppDefinitionCollectionPage page = new TeamsAppDefinitionCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
