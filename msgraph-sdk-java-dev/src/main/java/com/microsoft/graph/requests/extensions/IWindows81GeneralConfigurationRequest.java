// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Windows81GeneralConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows81General Configuration Request.
 */
public interface IWindows81GeneralConfigurationRequest extends IHttpRequest {

    /**
     * Gets the Windows81GeneralConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Windows81GeneralConfiguration> callback);

    /**
     * Gets the Windows81GeneralConfiguration from the service
     *
     * @return the Windows81GeneralConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81GeneralConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Windows81GeneralConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Windows81GeneralConfiguration with a source
     *
     * @param sourceWindows81GeneralConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows81GeneralConfiguration sourceWindows81GeneralConfiguration, final ICallback<? super Windows81GeneralConfiguration> callback);

    /**
     * Patches this Windows81GeneralConfiguration with a source
     *
     * @param sourceWindows81GeneralConfiguration the source object with updates
     * @return the updated Windows81GeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81GeneralConfiguration patch(final Windows81GeneralConfiguration sourceWindows81GeneralConfiguration) throws ClientException;

    /**
     * Posts a Windows81GeneralConfiguration with a new object
     *
     * @param newWindows81GeneralConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows81GeneralConfiguration newWindows81GeneralConfiguration, final ICallback<? super Windows81GeneralConfiguration> callback);

    /**
     * Posts a Windows81GeneralConfiguration with a new object
     *
     * @param newWindows81GeneralConfiguration the new object to create
     * @return the created Windows81GeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81GeneralConfiguration post(final Windows81GeneralConfiguration newWindows81GeneralConfiguration) throws ClientException;

    /**
     * Posts a Windows81GeneralConfiguration with a new object
     *
     * @param newWindows81GeneralConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Windows81GeneralConfiguration newWindows81GeneralConfiguration, final ICallback<? super Windows81GeneralConfiguration> callback);

    /**
     * Posts a Windows81GeneralConfiguration with a new object
     *
     * @param newWindows81GeneralConfiguration the object to create/update
     * @return the created Windows81GeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81GeneralConfiguration put(final Windows81GeneralConfiguration newWindows81GeneralConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindows81GeneralConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindows81GeneralConfigurationRequest expand(final String value);

}

