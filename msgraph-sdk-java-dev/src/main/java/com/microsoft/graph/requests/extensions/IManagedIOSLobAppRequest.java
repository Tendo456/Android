// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedIOSLobApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed IOSLob App Request.
 */
public interface IManagedIOSLobAppRequest extends IHttpRequest {

    /**
     * Gets the ManagedIOSLobApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ManagedIOSLobApp> callback);

    /**
     * Gets the ManagedIOSLobApp from the service
     *
     * @return the ManagedIOSLobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedIOSLobApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ManagedIOSLobApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagedIOSLobApp with a source
     *
     * @param sourceManagedIOSLobApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedIOSLobApp sourceManagedIOSLobApp, final ICallback<? super ManagedIOSLobApp> callback);

    /**
     * Patches this ManagedIOSLobApp with a source
     *
     * @param sourceManagedIOSLobApp the source object with updates
     * @return the updated ManagedIOSLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedIOSLobApp patch(final ManagedIOSLobApp sourceManagedIOSLobApp) throws ClientException;

    /**
     * Posts a ManagedIOSLobApp with a new object
     *
     * @param newManagedIOSLobApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedIOSLobApp newManagedIOSLobApp, final ICallback<? super ManagedIOSLobApp> callback);

    /**
     * Posts a ManagedIOSLobApp with a new object
     *
     * @param newManagedIOSLobApp the new object to create
     * @return the created ManagedIOSLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedIOSLobApp post(final ManagedIOSLobApp newManagedIOSLobApp) throws ClientException;

    /**
     * Posts a ManagedIOSLobApp with a new object
     *
     * @param newManagedIOSLobApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ManagedIOSLobApp newManagedIOSLobApp, final ICallback<? super ManagedIOSLobApp> callback);

    /**
     * Posts a ManagedIOSLobApp with a new object
     *
     * @param newManagedIOSLobApp the object to create/update
     * @return the created ManagedIOSLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedIOSLobApp put(final ManagedIOSLobApp newManagedIOSLobApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedIOSLobAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedIOSLobAppRequest expand(final String value);

}

