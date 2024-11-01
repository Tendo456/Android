// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceEnrollmentWindowsHelloForBusinessConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Enrollment Windows Hello For Business Configuration Request.
 */
public interface IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest extends IHttpRequest {

    /**
     * Gets the DeviceEnrollmentWindowsHelloForBusinessConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceEnrollmentWindowsHelloForBusinessConfiguration> callback);

    /**
     * Gets the DeviceEnrollmentWindowsHelloForBusinessConfiguration from the service
     *
     * @return the DeviceEnrollmentWindowsHelloForBusinessConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceEnrollmentWindowsHelloForBusinessConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceEnrollmentWindowsHelloForBusinessConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceEnrollmentWindowsHelloForBusinessConfiguration with a source
     *
     * @param sourceDeviceEnrollmentWindowsHelloForBusinessConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceEnrollmentWindowsHelloForBusinessConfiguration sourceDeviceEnrollmentWindowsHelloForBusinessConfiguration, final ICallback<? super DeviceEnrollmentWindowsHelloForBusinessConfiguration> callback);

    /**
     * Patches this DeviceEnrollmentWindowsHelloForBusinessConfiguration with a source
     *
     * @param sourceDeviceEnrollmentWindowsHelloForBusinessConfiguration the source object with updates
     * @return the updated DeviceEnrollmentWindowsHelloForBusinessConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceEnrollmentWindowsHelloForBusinessConfiguration patch(final DeviceEnrollmentWindowsHelloForBusinessConfiguration sourceDeviceEnrollmentWindowsHelloForBusinessConfiguration) throws ClientException;

    /**
     * Posts a DeviceEnrollmentWindowsHelloForBusinessConfiguration with a new object
     *
     * @param newDeviceEnrollmentWindowsHelloForBusinessConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceEnrollmentWindowsHelloForBusinessConfiguration newDeviceEnrollmentWindowsHelloForBusinessConfiguration, final ICallback<? super DeviceEnrollmentWindowsHelloForBusinessConfiguration> callback);

    /**
     * Posts a DeviceEnrollmentWindowsHelloForBusinessConfiguration with a new object
     *
     * @param newDeviceEnrollmentWindowsHelloForBusinessConfiguration the new object to create
     * @return the created DeviceEnrollmentWindowsHelloForBusinessConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceEnrollmentWindowsHelloForBusinessConfiguration post(final DeviceEnrollmentWindowsHelloForBusinessConfiguration newDeviceEnrollmentWindowsHelloForBusinessConfiguration) throws ClientException;

    /**
     * Posts a DeviceEnrollmentWindowsHelloForBusinessConfiguration with a new object
     *
     * @param newDeviceEnrollmentWindowsHelloForBusinessConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceEnrollmentWindowsHelloForBusinessConfiguration newDeviceEnrollmentWindowsHelloForBusinessConfiguration, final ICallback<? super DeviceEnrollmentWindowsHelloForBusinessConfiguration> callback);

    /**
     * Posts a DeviceEnrollmentWindowsHelloForBusinessConfiguration with a new object
     *
     * @param newDeviceEnrollmentWindowsHelloForBusinessConfiguration the object to create/update
     * @return the created DeviceEnrollmentWindowsHelloForBusinessConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceEnrollmentWindowsHelloForBusinessConfiguration put(final DeviceEnrollmentWindowsHelloForBusinessConfiguration newDeviceEnrollmentWindowsHelloForBusinessConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest expand(final String value);

}

