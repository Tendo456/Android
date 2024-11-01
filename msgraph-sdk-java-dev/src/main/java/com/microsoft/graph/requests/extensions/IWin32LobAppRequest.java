// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Win32LobApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Win32Lob App Request.
 */
public interface IWin32LobAppRequest extends IHttpRequest {

    /**
     * Gets the Win32LobApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Win32LobApp> callback);

    /**
     * Gets the Win32LobApp from the service
     *
     * @return the Win32LobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Win32LobApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Win32LobApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Win32LobApp with a source
     *
     * @param sourceWin32LobApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Win32LobApp sourceWin32LobApp, final ICallback<? super Win32LobApp> callback);

    /**
     * Patches this Win32LobApp with a source
     *
     * @param sourceWin32LobApp the source object with updates
     * @return the updated Win32LobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Win32LobApp patch(final Win32LobApp sourceWin32LobApp) throws ClientException;

    /**
     * Posts a Win32LobApp with a new object
     *
     * @param newWin32LobApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Win32LobApp newWin32LobApp, final ICallback<? super Win32LobApp> callback);

    /**
     * Posts a Win32LobApp with a new object
     *
     * @param newWin32LobApp the new object to create
     * @return the created Win32LobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Win32LobApp post(final Win32LobApp newWin32LobApp) throws ClientException;

    /**
     * Posts a Win32LobApp with a new object
     *
     * @param newWin32LobApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Win32LobApp newWin32LobApp, final ICallback<? super Win32LobApp> callback);

    /**
     * Posts a Win32LobApp with a new object
     *
     * @param newWin32LobApp the object to create/update
     * @return the created Win32LobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Win32LobApp put(final Win32LobApp newWin32LobApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWin32LobAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWin32LobAppRequest expand(final String value);

}

