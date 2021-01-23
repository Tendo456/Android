// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Role Assignment Collection Request.
 */
public class DeviceAndAppManagementRoleAssignmentCollectionRequest extends BaseCollectionRequest<DeviceAndAppManagementRoleAssignmentCollectionResponse, IDeviceAndAppManagementRoleAssignmentCollectionPage> implements IDeviceAndAppManagementRoleAssignmentCollectionRequest {

    /**
     * The request builder for this collection of DeviceAndAppManagementRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAndAppManagementRoleAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAndAppManagementRoleAssignmentCollectionResponse.class, IDeviceAndAppManagementRoleAssignmentCollectionPage.class);
    }

    public void get(final ICallback<? super IDeviceAndAppManagementRoleAssignmentCollectionPage> callback) {
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

    public IDeviceAndAppManagementRoleAssignmentCollectionPage get() throws ClientException {
        final DeviceAndAppManagementRoleAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment, final ICallback<? super DeviceAndAppManagementRoleAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceAndAppManagementRoleAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceAndAppManagementRoleAssignment, callback);
    }

    public DeviceAndAppManagementRoleAssignment post(final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceAndAppManagementRoleAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceAndAppManagementRoleAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceAndAppManagementRoleAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceAndAppManagementRoleAssignmentCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceAndAppManagementRoleAssignmentCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceAndAppManagementRoleAssignmentCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceAndAppManagementRoleAssignmentCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceAndAppManagementRoleAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceAndAppManagementRoleAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceAndAppManagementRoleAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceAndAppManagementRoleAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceAndAppManagementRoleAssignmentCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceAndAppManagementRoleAssignmentCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceAndAppManagementRoleAssignmentCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceAndAppManagementRoleAssignmentCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceAndAppManagementRoleAssignmentCollectionRequest)this;
    }
    public IDeviceAndAppManagementRoleAssignmentCollectionPage buildFromResponse(final DeviceAndAppManagementRoleAssignmentCollectionResponse response) {
        final IDeviceAndAppManagementRoleAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceAndAppManagementRoleAssignmentCollectionPage page = new DeviceAndAppManagementRoleAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}