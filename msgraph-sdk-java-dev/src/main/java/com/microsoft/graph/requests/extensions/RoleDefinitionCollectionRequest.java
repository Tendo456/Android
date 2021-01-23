// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.RoleDefinition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IRoleDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.RoleDefinitionCollectionResponse;
import com.microsoft.graph.requests.extensions.IRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleDefinitionCollectionRequest;
import com.microsoft.graph.requests.extensions.RoleDefinitionCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Definition Collection Request.
 */
public class RoleDefinitionCollectionRequest extends BaseCollectionRequest<RoleDefinitionCollectionResponse, IRoleDefinitionCollectionPage> implements IRoleDefinitionCollectionRequest {

    /**
     * The request builder for this collection of RoleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleDefinitionCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RoleDefinitionCollectionResponse.class, IRoleDefinitionCollectionPage.class);
    }

    public void get(final ICallback<? super IRoleDefinitionCollectionPage> callback) {
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

    public IRoleDefinitionCollectionPage get() throws ClientException {
        final RoleDefinitionCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final RoleDefinition newRoleDefinition, final ICallback<? super RoleDefinition> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new RoleDefinitionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newRoleDefinition, callback);
    }

    public RoleDefinition post(final RoleDefinition newRoleDefinition) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new RoleDefinitionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newRoleDefinition);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IRoleDefinitionCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (RoleDefinitionCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IRoleDefinitionCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (RoleDefinitionCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IRoleDefinitionCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (RoleDefinitionCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IRoleDefinitionCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (RoleDefinitionCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IRoleDefinitionCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (RoleDefinitionCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IRoleDefinitionCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (RoleDefinitionCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IRoleDefinitionCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IRoleDefinitionCollectionRequest)this;
    }
    public IRoleDefinitionCollectionPage buildFromResponse(final RoleDefinitionCollectionResponse response) {
        final IRoleDefinitionCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new RoleDefinitionCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final RoleDefinitionCollectionPage page = new RoleDefinitionCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}