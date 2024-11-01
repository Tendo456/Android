// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementRoleDefinition;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device And App Management Role Definition Request.
 */
public interface IDeviceAndAppManagementRoleDefinitionRequest extends IHttpRequest {

    /**
     * Gets the DeviceAndAppManagementRoleDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceAndAppManagementRoleDefinition> callback);

    /**
     * Gets the DeviceAndAppManagementRoleDefinition from the service
     *
     * @return the DeviceAndAppManagementRoleDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceAndAppManagementRoleDefinition get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceAndAppManagementRoleDefinition> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceAndAppManagementRoleDefinition with a source
     *
     * @param sourceDeviceAndAppManagementRoleDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceAndAppManagementRoleDefinition sourceDeviceAndAppManagementRoleDefinition, final ICallback<? super DeviceAndAppManagementRoleDefinition> callback);

    /**
     * Patches this DeviceAndAppManagementRoleDefinition with a source
     *
     * @param sourceDeviceAndAppManagementRoleDefinition the source object with updates
     * @return the updated DeviceAndAppManagementRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceAndAppManagementRoleDefinition patch(final DeviceAndAppManagementRoleDefinition sourceDeviceAndAppManagementRoleDefinition) throws ClientException;

    /**
     * Posts a DeviceAndAppManagementRoleDefinition with a new object
     *
     * @param newDeviceAndAppManagementRoleDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceAndAppManagementRoleDefinition newDeviceAndAppManagementRoleDefinition, final ICallback<? super DeviceAndAppManagementRoleDefinition> callback);

    /**
     * Posts a DeviceAndAppManagementRoleDefinition with a new object
     *
     * @param newDeviceAndAppManagementRoleDefinition the new object to create
     * @return the created DeviceAndAppManagementRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceAndAppManagementRoleDefinition post(final DeviceAndAppManagementRoleDefinition newDeviceAndAppManagementRoleDefinition) throws ClientException;

    /**
     * Posts a DeviceAndAppManagementRoleDefinition with a new object
     *
     * @param newDeviceAndAppManagementRoleDefinition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceAndAppManagementRoleDefinition newDeviceAndAppManagementRoleDefinition, final ICallback<? super DeviceAndAppManagementRoleDefinition> callback);

    /**
     * Posts a DeviceAndAppManagementRoleDefinition with a new object
     *
     * @param newDeviceAndAppManagementRoleDefinition the object to create/update
     * @return the created DeviceAndAppManagementRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceAndAppManagementRoleDefinition put(final DeviceAndAppManagementRoleDefinition newDeviceAndAppManagementRoleDefinition) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceAndAppManagementRoleDefinitionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceAndAppManagementRoleDefinitionRequest expand(final String value);

}

