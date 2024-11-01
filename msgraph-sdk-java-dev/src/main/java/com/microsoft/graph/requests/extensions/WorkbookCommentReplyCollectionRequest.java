// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookComment;
import com.microsoft.graph.models.extensions.WorkbookCommentReply;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWorkbookCommentReplyCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookCommentReplyCollectionResponse;
import com.microsoft.graph.requests.extensions.IWorkbookCommentReplyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookCommentReplyCollectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookCommentReplyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Comment Reply Collection Request.
 */
public class WorkbookCommentReplyCollectionRequest extends BaseCollectionRequest<WorkbookCommentReplyCollectionResponse, IWorkbookCommentReplyCollectionPage> implements IWorkbookCommentReplyCollectionRequest {

    /**
     * The request builder for this collection of WorkbookCommentReply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookCommentReplyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookCommentReplyCollectionResponse.class, IWorkbookCommentReplyCollectionPage.class);
    }

    public void get(final ICallback<? super IWorkbookCommentReplyCollectionPage> callback) {
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

    public IWorkbookCommentReplyCollectionPage get() throws ClientException {
        final WorkbookCommentReplyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkbookCommentReply newWorkbookCommentReply, final ICallback<? super WorkbookCommentReply> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkbookCommentReplyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWorkbookCommentReply, callback);
    }

    public WorkbookCommentReply post(final WorkbookCommentReply newWorkbookCommentReply) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkbookCommentReplyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWorkbookCommentReply);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookCommentReplyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookCommentReplyCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IWorkbookCommentReplyCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (WorkbookCommentReplyCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IWorkbookCommentReplyCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (WorkbookCommentReplyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookCommentReplyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookCommentReplyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWorkbookCommentReplyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WorkbookCommentReplyCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IWorkbookCommentReplyCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (WorkbookCommentReplyCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IWorkbookCommentReplyCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IWorkbookCommentReplyCollectionRequest)this;
    }
    public IWorkbookCommentReplyCollectionPage buildFromResponse(final WorkbookCommentReplyCollectionResponse response) {
        final IWorkbookCommentReplyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkbookCommentReplyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkbookCommentReplyCollectionPage page = new WorkbookCommentReplyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
