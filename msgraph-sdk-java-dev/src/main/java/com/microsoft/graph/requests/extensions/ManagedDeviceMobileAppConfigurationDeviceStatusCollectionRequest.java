// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfiguration;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationDeviceStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Device Status Collection Request.
 */
public class ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest extends BaseCollectionRequest<ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse, IManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage> implements IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest {

    /**
     * The request builder for this collection of ManagedDeviceMobileAppConfigurationDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse.class, IManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage.class);
    }

    public void get(final ICallback<? super IManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage> callback) {
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

    public IManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage get() throws ClientException {
        final ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ManagedDeviceMobileAppConfigurationDeviceStatus newManagedDeviceMobileAppConfigurationDeviceStatus, final ICallback<? super ManagedDeviceMobileAppConfigurationDeviceStatus> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedDeviceMobileAppConfigurationDeviceStatus, callback);
    }

    public ManagedDeviceMobileAppConfigurationDeviceStatus post(final ManagedDeviceMobileAppConfigurationDeviceStatus newManagedDeviceMobileAppConfigurationDeviceStatus) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedDeviceMobileAppConfigurationDeviceStatus);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest)this;
    }
    public IManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage buildFromResponse(final ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse response) {
        final IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage page = new ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}