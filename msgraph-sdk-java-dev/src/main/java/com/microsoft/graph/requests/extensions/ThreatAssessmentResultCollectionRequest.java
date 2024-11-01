// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ThreatAssessmentRequest;
import com.microsoft.graph.models.extensions.ThreatAssessmentResult;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IThreatAssessmentResultCollectionPage;
import com.microsoft.graph.requests.extensions.ThreatAssessmentResultCollectionResponse;
import com.microsoft.graph.requests.extensions.IThreatAssessmentResultCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IThreatAssessmentResultCollectionRequest;
import com.microsoft.graph.requests.extensions.ThreatAssessmentResultCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Threat Assessment Result Collection Request.
 */
public class ThreatAssessmentResultCollectionRequest extends BaseCollectionRequest<ThreatAssessmentResultCollectionResponse, IThreatAssessmentResultCollectionPage> implements IThreatAssessmentResultCollectionRequest {

    /**
     * The request builder for this collection of ThreatAssessmentResult
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThreatAssessmentResultCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ThreatAssessmentResultCollectionResponse.class, IThreatAssessmentResultCollectionPage.class);
    }

    public void get(final ICallback<? super IThreatAssessmentResultCollectionPage> callback) {
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

    public IThreatAssessmentResultCollectionPage get() throws ClientException {
        final ThreatAssessmentResultCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ThreatAssessmentResult newThreatAssessmentResult, final ICallback<? super ThreatAssessmentResult> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ThreatAssessmentResultRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newThreatAssessmentResult, callback);
    }

    public ThreatAssessmentResult post(final ThreatAssessmentResult newThreatAssessmentResult) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ThreatAssessmentResultRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newThreatAssessmentResult);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IThreatAssessmentResultCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ThreatAssessmentResultCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IThreatAssessmentResultCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ThreatAssessmentResultCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IThreatAssessmentResultCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ThreatAssessmentResultCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IThreatAssessmentResultCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ThreatAssessmentResultCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IThreatAssessmentResultCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ThreatAssessmentResultCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IThreatAssessmentResultCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ThreatAssessmentResultCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IThreatAssessmentResultCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IThreatAssessmentResultCollectionRequest)this;
    }
    public IThreatAssessmentResultCollectionPage buildFromResponse(final ThreatAssessmentResultCollectionResponse response) {
        final IThreatAssessmentResultCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ThreatAssessmentResultCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ThreatAssessmentResultCollectionPage page = new ThreatAssessmentResultCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
