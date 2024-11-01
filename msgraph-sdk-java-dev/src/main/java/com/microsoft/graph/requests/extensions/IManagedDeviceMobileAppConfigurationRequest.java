// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Mobile App Configuration Request.
 */
public interface IManagedDeviceMobileAppConfigurationRequest extends IHttpRequest {

    /**
     * Gets the ManagedDeviceMobileAppConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ManagedDeviceMobileAppConfiguration> callback);

    /**
     * Gets the ManagedDeviceMobileAppConfiguration from the service
     *
     * @return the ManagedDeviceMobileAppConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDeviceMobileAppConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ManagedDeviceMobileAppConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagedDeviceMobileAppConfiguration with a source
     *
     * @param sourceManagedDeviceMobileAppConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedDeviceMobileAppConfiguration sourceManagedDeviceMobileAppConfiguration, final ICallback<? super ManagedDeviceMobileAppConfiguration> callback);

    /**
     * Patches this ManagedDeviceMobileAppConfiguration with a source
     *
     * @param sourceManagedDeviceMobileAppConfiguration the source object with updates
     * @return the updated ManagedDeviceMobileAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDeviceMobileAppConfiguration patch(final ManagedDeviceMobileAppConfiguration sourceManagedDeviceMobileAppConfiguration) throws ClientException;

    /**
     * Posts a ManagedDeviceMobileAppConfiguration with a new object
     *
     * @param newManagedDeviceMobileAppConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedDeviceMobileAppConfiguration newManagedDeviceMobileAppConfiguration, final ICallback<? super ManagedDeviceMobileAppConfiguration> callback);

    /**
     * Posts a ManagedDeviceMobileAppConfiguration with a new object
     *
     * @param newManagedDeviceMobileAppConfiguration the new object to create
     * @return the created ManagedDeviceMobileAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDeviceMobileAppConfiguration post(final ManagedDeviceMobileAppConfiguration newManagedDeviceMobileAppConfiguration) throws ClientException;

    /**
     * Posts a ManagedDeviceMobileAppConfiguration with a new object
     *
     * @param newManagedDeviceMobileAppConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ManagedDeviceMobileAppConfiguration newManagedDeviceMobileAppConfiguration, final ICallback<? super ManagedDeviceMobileAppConfiguration> callback);

    /**
     * Posts a ManagedDeviceMobileAppConfiguration with a new object
     *
     * @param newManagedDeviceMobileAppConfiguration the object to create/update
     * @return the created ManagedDeviceMobileAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDeviceMobileAppConfiguration put(final ManagedDeviceMobileAppConfiguration newManagedDeviceMobileAppConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedDeviceMobileAppConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedDeviceMobileAppConfigurationRequest expand(final String value);

}

