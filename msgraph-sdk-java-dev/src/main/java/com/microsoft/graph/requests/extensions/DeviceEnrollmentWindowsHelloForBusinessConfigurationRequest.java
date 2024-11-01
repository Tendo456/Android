// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceEnrollmentWindowsHelloForBusinessConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Windows Hello For Business Configuration Request.
 */
public class DeviceEnrollmentWindowsHelloForBusinessConfigurationRequest extends BaseRequest implements IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest {
	
    /**
     * The request for the DeviceEnrollmentWindowsHelloForBusinessConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceEnrollmentWindowsHelloForBusinessConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceEnrollmentWindowsHelloForBusinessConfiguration.class);
    }

    /**
     * Gets the DeviceEnrollmentWindowsHelloForBusinessConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceEnrollmentWindowsHelloForBusinessConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceEnrollmentWindowsHelloForBusinessConfiguration from the service
     *
     * @return the DeviceEnrollmentWindowsHelloForBusinessConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceEnrollmentWindowsHelloForBusinessConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceEnrollmentWindowsHelloForBusinessConfiguration> callback) {
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
     * Patches this DeviceEnrollmentWindowsHelloForBusinessConfiguration with a source
     *
     * @param sourceDeviceEnrollmentWindowsHelloForBusinessConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceEnrollmentWindowsHelloForBusinessConfiguration sourceDeviceEnrollmentWindowsHelloForBusinessConfiguration, final ICallback<? super DeviceEnrollmentWindowsHelloForBusinessConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceEnrollmentWindowsHelloForBusinessConfiguration);
    }

    /**
     * Patches this DeviceEnrollmentWindowsHelloForBusinessConfiguration with a source
     *
     * @param sourceDeviceEnrollmentWindowsHelloForBusinessConfiguration the source object with updates
     * @return the updated DeviceEnrollmentWindowsHelloForBusinessConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceEnrollmentWindowsHelloForBusinessConfiguration patch(final DeviceEnrollmentWindowsHelloForBusinessConfiguration sourceDeviceEnrollmentWindowsHelloForBusinessConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceEnrollmentWindowsHelloForBusinessConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentWindowsHelloForBusinessConfiguration with a new object
     *
     * @param newDeviceEnrollmentWindowsHelloForBusinessConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceEnrollmentWindowsHelloForBusinessConfiguration newDeviceEnrollmentWindowsHelloForBusinessConfiguration, final ICallback<? super DeviceEnrollmentWindowsHelloForBusinessConfiguration> callback) {
        send(HttpMethod.POST, callback, newDeviceEnrollmentWindowsHelloForBusinessConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentWindowsHelloForBusinessConfiguration with a new object
     *
     * @param newDeviceEnrollmentWindowsHelloForBusinessConfiguration the new object to create
     * @return the created DeviceEnrollmentWindowsHelloForBusinessConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceEnrollmentWindowsHelloForBusinessConfiguration post(final DeviceEnrollmentWindowsHelloForBusinessConfiguration newDeviceEnrollmentWindowsHelloForBusinessConfiguration) throws ClientException {
        return send(HttpMethod.POST, newDeviceEnrollmentWindowsHelloForBusinessConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentWindowsHelloForBusinessConfiguration with a new object
     *
     * @param newDeviceEnrollmentWindowsHelloForBusinessConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceEnrollmentWindowsHelloForBusinessConfiguration newDeviceEnrollmentWindowsHelloForBusinessConfiguration, final ICallback<? super DeviceEnrollmentWindowsHelloForBusinessConfiguration> callback) {
        send(HttpMethod.PUT, callback, newDeviceEnrollmentWindowsHelloForBusinessConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentWindowsHelloForBusinessConfiguration with a new object
     *
     * @param newDeviceEnrollmentWindowsHelloForBusinessConfiguration the object to create/update
     * @return the created DeviceEnrollmentWindowsHelloForBusinessConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceEnrollmentWindowsHelloForBusinessConfiguration put(final DeviceEnrollmentWindowsHelloForBusinessConfiguration newDeviceEnrollmentWindowsHelloForBusinessConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newDeviceEnrollmentWindowsHelloForBusinessConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceEnrollmentWindowsHelloForBusinessConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceEnrollmentWindowsHelloForBusinessConfigurationRequest)this;
     }

}

