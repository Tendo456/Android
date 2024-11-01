// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfigurationDeviceStatus;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Device Status Request.
 */
public class DeviceConfigurationDeviceStatusRequest extends BaseRequest implements IDeviceConfigurationDeviceStatusRequest {
	
    /**
     * The request for the DeviceConfigurationDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationDeviceStatusRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationDeviceStatus.class);
    }

    /**
     * Gets the DeviceConfigurationDeviceStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceConfigurationDeviceStatus> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceConfigurationDeviceStatus from the service
     *
     * @return the DeviceConfigurationDeviceStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationDeviceStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceConfigurationDeviceStatus> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceConfigurationDeviceStatus with a source
     *
     * @param sourceDeviceConfigurationDeviceStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceConfigurationDeviceStatus sourceDeviceConfigurationDeviceStatus, final ICallback<? super DeviceConfigurationDeviceStatus> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceConfigurationDeviceStatus);
    }

    /**
     * Patches this DeviceConfigurationDeviceStatus with a source
     *
     * @param sourceDeviceConfigurationDeviceStatus the source object with updates
     * @return the updated DeviceConfigurationDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationDeviceStatus patch(final DeviceConfigurationDeviceStatus sourceDeviceConfigurationDeviceStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceConfigurationDeviceStatus);
    }

    /**
     * Creates a DeviceConfigurationDeviceStatus with a new object
     *
     * @param newDeviceConfigurationDeviceStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceConfigurationDeviceStatus newDeviceConfigurationDeviceStatus, final ICallback<? super DeviceConfigurationDeviceStatus> callback) {
        send(HttpMethod.POST, callback, newDeviceConfigurationDeviceStatus);
    }

    /**
     * Creates a DeviceConfigurationDeviceStatus with a new object
     *
     * @param newDeviceConfigurationDeviceStatus the new object to create
     * @return the created DeviceConfigurationDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationDeviceStatus post(final DeviceConfigurationDeviceStatus newDeviceConfigurationDeviceStatus) throws ClientException {
        return send(HttpMethod.POST, newDeviceConfigurationDeviceStatus);
    }

    /**
     * Creates a DeviceConfigurationDeviceStatus with a new object
     *
     * @param newDeviceConfigurationDeviceStatus the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceConfigurationDeviceStatus newDeviceConfigurationDeviceStatus, final ICallback<? super DeviceConfigurationDeviceStatus> callback) {
        send(HttpMethod.PUT, callback, newDeviceConfigurationDeviceStatus);
    }

    /**
     * Creates a DeviceConfigurationDeviceStatus with a new object
     *
     * @param newDeviceConfigurationDeviceStatus the object to create/update
     * @return the created DeviceConfigurationDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationDeviceStatus put(final DeviceConfigurationDeviceStatus newDeviceConfigurationDeviceStatus) throws ClientException {
        return send(HttpMethod.PUT, newDeviceConfigurationDeviceStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceConfigurationDeviceStatusRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceConfigurationDeviceStatusRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceConfigurationDeviceStatusRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceConfigurationDeviceStatusRequest)this;
     }

}

