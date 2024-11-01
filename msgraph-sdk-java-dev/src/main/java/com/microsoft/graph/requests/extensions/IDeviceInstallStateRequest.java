// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceInstallState;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Install State Request.
 */
public interface IDeviceInstallStateRequest extends IHttpRequest {

    /**
     * Gets the DeviceInstallState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceInstallState> callback);

    /**
     * Gets the DeviceInstallState from the service
     *
     * @return the DeviceInstallState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceInstallState get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceInstallState> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceInstallState with a source
     *
     * @param sourceDeviceInstallState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceInstallState sourceDeviceInstallState, final ICallback<? super DeviceInstallState> callback);

    /**
     * Patches this DeviceInstallState with a source
     *
     * @param sourceDeviceInstallState the source object with updates
     * @return the updated DeviceInstallState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceInstallState patch(final DeviceInstallState sourceDeviceInstallState) throws ClientException;

    /**
     * Posts a DeviceInstallState with a new object
     *
     * @param newDeviceInstallState the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceInstallState newDeviceInstallState, final ICallback<? super DeviceInstallState> callback);

    /**
     * Posts a DeviceInstallState with a new object
     *
     * @param newDeviceInstallState the new object to create
     * @return the created DeviceInstallState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceInstallState post(final DeviceInstallState newDeviceInstallState) throws ClientException;

    /**
     * Posts a DeviceInstallState with a new object
     *
     * @param newDeviceInstallState the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceInstallState newDeviceInstallState, final ICallback<? super DeviceInstallState> callback);

    /**
     * Posts a DeviceInstallState with a new object
     *
     * @param newDeviceInstallState the object to create/update
     * @return the created DeviceInstallState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceInstallState put(final DeviceInstallState newDeviceInstallState) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceInstallStateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceInstallStateRequest expand(final String value);

}

