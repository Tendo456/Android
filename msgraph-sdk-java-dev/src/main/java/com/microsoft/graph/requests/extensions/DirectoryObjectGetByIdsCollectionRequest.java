// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryObject;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDirectoryObjectGetByIdsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetByIdsCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetByIdsCollectionResponse;
import com.microsoft.graph.models.extensions.DirectoryObjectGetByIdsBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Get By Ids Collection Request.
 */
public class DirectoryObjectGetByIdsCollectionRequest extends BaseCollectionRequest<DirectoryObjectGetByIdsCollectionResponse, IDirectoryObjectGetByIdsCollectionPage> implements IDirectoryObjectGetByIdsCollectionRequest {


    protected final DirectoryObjectGetByIdsBody body;


    /**
     * The request for this DirectoryObjectGetByIds
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryObjectGetByIdsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryObjectGetByIdsCollectionResponse.class, IDirectoryObjectGetByIdsCollectionPage.class);
        body = new DirectoryObjectGetByIdsBody();
    }


    public void post(final ICallback<? super IDirectoryObjectGetByIdsCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDirectoryObjectGetByIdsCollectionPage post() throws ClientException {
        final DirectoryObjectGetByIdsCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IDirectoryObjectGetByIdsCollectionPage buildFromResponse(final DirectoryObjectGetByIdsCollectionResponse response) {
        final IDirectoryObjectGetByIdsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DirectoryObjectGetByIdsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<String>) null, (java.util.List<String>) null);
        } else {
            builder = null;
        }
        final IDirectoryObjectGetByIdsCollectionPage page = new DirectoryObjectGetByIdsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDirectoryObjectGetByIdsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IDirectoryObjectGetByIdsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDirectoryObjectGetByIdsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IDirectoryObjectGetByIdsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDirectoryObjectGetByIdsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IDirectoryObjectGetByIdsCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDirectoryObjectGetByIdsCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IDirectoryObjectGetByIdsCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDirectoryObjectGetByIdsCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IDirectoryObjectGetByIdsCollectionRequest)this;
    }

}
