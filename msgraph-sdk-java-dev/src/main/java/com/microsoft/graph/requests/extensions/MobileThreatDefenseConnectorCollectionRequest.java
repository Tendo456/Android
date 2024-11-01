// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.MobileThreatDefenseConnector;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionResponse;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorCollectionRequest;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile Threat Defense Connector Collection Request.
 */
public class MobileThreatDefenseConnectorCollectionRequest extends BaseCollectionRequest<MobileThreatDefenseConnectorCollectionResponse, IMobileThreatDefenseConnectorCollectionPage> implements IMobileThreatDefenseConnectorCollectionRequest {

    /**
     * The request builder for this collection of MobileThreatDefenseConnector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileThreatDefenseConnectorCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileThreatDefenseConnectorCollectionResponse.class, IMobileThreatDefenseConnectorCollectionPage.class);
    }

    public void get(final ICallback<? super IMobileThreatDefenseConnectorCollectionPage> callback) {
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

    public IMobileThreatDefenseConnectorCollectionPage get() throws ClientException {
        final MobileThreatDefenseConnectorCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final MobileThreatDefenseConnector newMobileThreatDefenseConnector, final ICallback<? super MobileThreatDefenseConnector> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MobileThreatDefenseConnectorRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMobileThreatDefenseConnector, callback);
    }

    public MobileThreatDefenseConnector post(final MobileThreatDefenseConnector newMobileThreatDefenseConnector) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MobileThreatDefenseConnectorRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMobileThreatDefenseConnector);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMobileThreatDefenseConnectorCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (MobileThreatDefenseConnectorCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IMobileThreatDefenseConnectorCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (MobileThreatDefenseConnectorCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IMobileThreatDefenseConnectorCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (MobileThreatDefenseConnectorCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMobileThreatDefenseConnectorCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (MobileThreatDefenseConnectorCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMobileThreatDefenseConnectorCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (MobileThreatDefenseConnectorCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IMobileThreatDefenseConnectorCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (MobileThreatDefenseConnectorCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IMobileThreatDefenseConnectorCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IMobileThreatDefenseConnectorCollectionRequest)this;
    }
    public IMobileThreatDefenseConnectorCollectionPage buildFromResponse(final MobileThreatDefenseConnectorCollectionResponse response) {
        final IMobileThreatDefenseConnectorCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MobileThreatDefenseConnectorCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MobileThreatDefenseConnectorCollectionPage page = new MobileThreatDefenseConnectorCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
