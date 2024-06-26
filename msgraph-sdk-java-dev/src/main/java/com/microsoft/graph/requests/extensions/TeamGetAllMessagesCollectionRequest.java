// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITeamGetAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamGetAllMessagesCollectionPage;
import com.microsoft.graph.requests.extensions.TeamGetAllMessagesCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Get All Messages Collection Request.
 */
public class TeamGetAllMessagesCollectionRequest extends BaseCollectionRequest<TeamGetAllMessagesCollectionResponse, ITeamGetAllMessagesCollectionPage> implements ITeamGetAllMessagesCollectionRequest {


    /**
     * The request for this TeamGetAllMessages
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamGetAllMessagesCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamGetAllMessagesCollectionResponse.class, ITeamGetAllMessagesCollectionPage.class);
    }


    public void get(final ICallback<? super ITeamGetAllMessagesCollectionPage> callback) {
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

    public ITeamGetAllMessagesCollectionPage get() throws ClientException {
        final TeamGetAllMessagesCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public ITeamGetAllMessagesCollectionPage buildFromResponse(final TeamGetAllMessagesCollectionResponse response) {
        final ITeamGetAllMessagesCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TeamGetAllMessagesCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ITeamGetAllMessagesCollectionPage page = new TeamGetAllMessagesCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITeamGetAllMessagesCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ITeamGetAllMessagesCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITeamGetAllMessagesCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ITeamGetAllMessagesCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITeamGetAllMessagesCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ITeamGetAllMessagesCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ITeamGetAllMessagesCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ITeamGetAllMessagesCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ITeamGetAllMessagesCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ITeamGetAllMessagesCollectionRequest)this;
    }

}
