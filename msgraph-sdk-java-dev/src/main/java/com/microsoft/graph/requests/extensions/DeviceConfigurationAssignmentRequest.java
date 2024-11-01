// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Assignment Request.
 */
public class DeviceConfigurationAssignmentRequest extends BaseRequest implements IDeviceConfigurationAssignmentRequest {
	
    /**
     * The request for the DeviceConfigurationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationAssignment.class);
    }

    /**
     * Gets the DeviceConfigurationAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceConfigurationAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceConfigurationAssignment from the service
     *
     * @return the DeviceConfigurationAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceConfigurationAssignment> callback) {
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
     * Patches this DeviceConfigurationAssignment with a source
     *
     * @param sourceDeviceConfigurationAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceConfigurationAssignment sourceDeviceConfigurationAssignment, final ICallback<? super DeviceConfigurationAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceConfigurationAssignment);
    }

    /**
     * Patches this DeviceConfigurationAssignment with a source
     *
     * @param sourceDeviceConfigurationAssignment the source object with updates
     * @return the updated DeviceConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationAssignment patch(final DeviceConfigurationAssignment sourceDeviceConfigurationAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceConfigurationAssignment);
    }

    /**
     * Creates a DeviceConfigurationAssignment with a new object
     *
     * @param newDeviceConfigurationAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceConfigurationAssignment newDeviceConfigurationAssignment, final ICallback<? super DeviceConfigurationAssignment> callback) {
        send(HttpMethod.POST, callback, newDeviceConfigurationAssignment);
    }

    /**
     * Creates a DeviceConfigurationAssignment with a new object
     *
     * @param newDeviceConfigurationAssignment the new object to create
     * @return the created DeviceConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationAssignment post(final DeviceConfigurationAssignment newDeviceConfigurationAssignment) throws ClientException {
        return send(HttpMethod.POST, newDeviceConfigurationAssignment);
    }

    /**
     * Creates a DeviceConfigurationAssignment with a new object
     *
     * @param newDeviceConfigurationAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceConfigurationAssignment newDeviceConfigurationAssignment, final ICallback<? super DeviceConfigurationAssignment> callback) {
        send(HttpMethod.PUT, callback, newDeviceConfigurationAssignment);
    }

    /**
     * Creates a DeviceConfigurationAssignment with a new object
     *
     * @param newDeviceConfigurationAssignment the object to create/update
     * @return the created DeviceConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationAssignment put(final DeviceConfigurationAssignment newDeviceConfigurationAssignment) throws ClientException {
        return send(HttpMethod.PUT, newDeviceConfigurationAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceConfigurationAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceConfigurationAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceConfigurationAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceConfigurationAssignmentRequest)this;
     }

}

