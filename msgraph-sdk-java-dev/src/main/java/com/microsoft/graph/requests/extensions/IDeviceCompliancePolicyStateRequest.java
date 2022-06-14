// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyState;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Policy State Request.
 */
public interface IDeviceCompliancePolicyStateRequest extends IHttpRequest {

    /**
     * Gets the DeviceCompliancePolicyState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceCompliancePolicyState> callback);

    /**
     * Gets the DeviceCompliancePolicyState from the service
     *
     * @return the DeviceCompliancePolicyState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicyState get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceCompliancePolicyState> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceCompliancePolicyState with a source
     *
     * @param sourceDeviceCompliancePolicyState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceCompliancePolicyState sourceDeviceCompliancePolicyState, final ICallback<? super DeviceCompliancePolicyState> callback);

    /**
     * Patches this DeviceCompliancePolicyState with a source
     *
     * @param sourceDeviceCompliancePolicyState the source object with updates
     * @return the updated DeviceCompliancePolicyState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicyState patch(final DeviceCompliancePolicyState sourceDeviceCompliancePolicyState) throws ClientException;

    /**
     * Posts a DeviceCompliancePolicyState with a new object
     *
     * @param newDeviceCompliancePolicyState the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceCompliancePolicyState newDeviceCompliancePolicyState, final ICallback<? super DeviceCompliancePolicyState> callback);

    /**
     * Posts a DeviceCompliancePolicyState with a new object
     *
     * @param newDeviceCompliancePolicyState the new object to create
     * @return the created DeviceCompliancePolicyState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicyState post(final DeviceCompliancePolicyState newDeviceCompliancePolicyState) throws ClientException;

    /**
     * Posts a DeviceCompliancePolicyState with a new object
     *
     * @param newDeviceCompliancePolicyState the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceCompliancePolicyState newDeviceCompliancePolicyState, final ICallback<? super DeviceCompliancePolicyState> callback);

    /**
     * Posts a DeviceCompliancePolicyState with a new object
     *
     * @param newDeviceCompliancePolicyState the object to create/update
     * @return the created DeviceCompliancePolicyState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicyState put(final DeviceCompliancePolicyState newDeviceCompliancePolicyState) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceCompliancePolicyStateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceCompliancePolicyStateRequest expand(final String value);

}

