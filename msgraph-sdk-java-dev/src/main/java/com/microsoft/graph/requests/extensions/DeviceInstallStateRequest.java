// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceInstallState;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Install State Request.
 */
public class DeviceInstallStateRequest extends BaseRequest implements IDeviceInstallStateRequest {
	
    /**
     * The request for the DeviceInstallState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceInstallStateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceInstallState.class);
    }

    /**
     * Gets the DeviceInstallState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceInstallState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceInstallState from the service
     *
     * @return the DeviceInstallState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceInstallState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceInstallState> callback) {
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
     * Patches this DeviceInstallState with a source
     *
     * @param sourceDeviceInstallState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceInstallState sourceDeviceInstallState, final ICallback<? super DeviceInstallState> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceInstallState);
    }

    /**
     * Patches this DeviceInstallState with a source
     *
     * @param sourceDeviceInstallState the source object with updates
     * @return the updated DeviceInstallState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceInstallState patch(final DeviceInstallState sourceDeviceInstallState) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceInstallState);
    }

    /**
     * Creates a DeviceInstallState with a new object
     *
     * @param newDeviceInstallState the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceInstallState newDeviceInstallState, final ICallback<? super DeviceInstallState> callback) {
        send(HttpMethod.POST, callback, newDeviceInstallState);
    }

    /**
     * Creates a DeviceInstallState with a new object
     *
     * @param newDeviceInstallState the new object to create
     * @return the created DeviceInstallState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceInstallState post(final DeviceInstallState newDeviceInstallState) throws ClientException {
        return send(HttpMethod.POST, newDeviceInstallState);
    }

    /**
     * Creates a DeviceInstallState with a new object
     *
     * @param newDeviceInstallState the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceInstallState newDeviceInstallState, final ICallback<? super DeviceInstallState> callback) {
        send(HttpMethod.PUT, callback, newDeviceInstallState);
    }

    /**
     * Creates a DeviceInstallState with a new object
     *
     * @param newDeviceInstallState the object to create/update
     * @return the created DeviceInstallState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceInstallState put(final DeviceInstallState newDeviceInstallState) throws ClientException {
        return send(HttpMethod.PUT, newDeviceInstallState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceInstallStateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceInstallStateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceInstallStateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceInstallStateRequest)this;
     }

}

