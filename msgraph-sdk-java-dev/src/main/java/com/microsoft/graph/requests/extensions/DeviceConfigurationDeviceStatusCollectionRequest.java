// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.DeviceConfigurationDeviceStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStatusCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStatusCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Device Status Collection Request.
 */
public class DeviceConfigurationDeviceStatusCollectionRequest extends BaseCollectionRequest<DeviceConfigurationDeviceStatusCollectionResponse, IDeviceConfigurationDeviceStatusCollectionPage> implements IDeviceConfigurationDeviceStatusCollectionRequest {

    /**
     * The request builder for this collection of DeviceConfigurationDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationDeviceStatusCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationDeviceStatusCollectionResponse.class, IDeviceConfigurationDeviceStatusCollectionPage.class);
    }

    public void get(final ICallback<? super IDeviceConfigurationDeviceStatusCollectionPage> callback) {
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

    public IDeviceConfigurationDeviceStatusCollectionPage get() throws ClientException {
        final DeviceConfigurationDeviceStatusCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceConfigurationDeviceStatus newDeviceConfigurationDeviceStatus, final ICallback<? super DeviceConfigurationDeviceStatus> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceConfigurationDeviceStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceConfigurationDeviceStatus, callback);
    }

    public DeviceConfigurationDeviceStatus post(final DeviceConfigurationDeviceStatus newDeviceConfigurationDeviceStatus) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceConfigurationDeviceStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceConfigurationDeviceStatus);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceConfigurationDeviceStatusCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceConfigurationDeviceStatusCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceConfigurationDeviceStatusCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceConfigurationDeviceStatusCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceConfigurationDeviceStatusCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceConfigurationDeviceStatusCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceConfigurationDeviceStatusCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceConfigurationDeviceStatusCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceConfigurationDeviceStatusCollectionRequest)this;
    }
    public IDeviceConfigurationDeviceStatusCollectionPage buildFromResponse(final DeviceConfigurationDeviceStatusCollectionResponse response) {
        final IDeviceConfigurationDeviceStatusCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceConfigurationDeviceStatusCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceConfigurationDeviceStatusCollectionPage page = new DeviceConfigurationDeviceStatusCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
