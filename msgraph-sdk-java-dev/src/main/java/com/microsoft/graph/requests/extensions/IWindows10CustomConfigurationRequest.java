// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Windows10CustomConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows10Custom Configuration Request.
 */
public interface IWindows10CustomConfigurationRequest extends IHttpRequest {

    /**
     * Gets the Windows10CustomConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Windows10CustomConfiguration> callback);

    /**
     * Gets the Windows10CustomConfiguration from the service
     *
     * @return the Windows10CustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10CustomConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Windows10CustomConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Windows10CustomConfiguration with a source
     *
     * @param sourceWindows10CustomConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows10CustomConfiguration sourceWindows10CustomConfiguration, final ICallback<? super Windows10CustomConfiguration> callback);

    /**
     * Patches this Windows10CustomConfiguration with a source
     *
     * @param sourceWindows10CustomConfiguration the source object with updates
     * @return the updated Windows10CustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10CustomConfiguration patch(final Windows10CustomConfiguration sourceWindows10CustomConfiguration) throws ClientException;

    /**
     * Posts a Windows10CustomConfiguration with a new object
     *
     * @param newWindows10CustomConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows10CustomConfiguration newWindows10CustomConfiguration, final ICallback<? super Windows10CustomConfiguration> callback);

    /**
     * Posts a Windows10CustomConfiguration with a new object
     *
     * @param newWindows10CustomConfiguration the new object to create
     * @return the created Windows10CustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10CustomConfiguration post(final Windows10CustomConfiguration newWindows10CustomConfiguration) throws ClientException;

    /**
     * Posts a Windows10CustomConfiguration with a new object
     *
     * @param newWindows10CustomConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Windows10CustomConfiguration newWindows10CustomConfiguration, final ICallback<? super Windows10CustomConfiguration> callback);

    /**
     * Posts a Windows10CustomConfiguration with a new object
     *
     * @param newWindows10CustomConfiguration the object to create/update
     * @return the created Windows10CustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10CustomConfiguration put(final Windows10CustomConfiguration newWindows10CustomConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindows10CustomConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindows10CustomConfigurationRequest expand(final String value);

}

