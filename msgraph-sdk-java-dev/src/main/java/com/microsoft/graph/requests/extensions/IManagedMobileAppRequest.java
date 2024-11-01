// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedMobileApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Mobile App Request.
 */
public interface IManagedMobileAppRequest extends IHttpRequest {

    /**
     * Gets the ManagedMobileApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ManagedMobileApp> callback);

    /**
     * Gets the ManagedMobileApp from the service
     *
     * @return the ManagedMobileApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedMobileApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ManagedMobileApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagedMobileApp with a source
     *
     * @param sourceManagedMobileApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedMobileApp sourceManagedMobileApp, final ICallback<? super ManagedMobileApp> callback);

    /**
     * Patches this ManagedMobileApp with a source
     *
     * @param sourceManagedMobileApp the source object with updates
     * @return the updated ManagedMobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedMobileApp patch(final ManagedMobileApp sourceManagedMobileApp) throws ClientException;

    /**
     * Posts a ManagedMobileApp with a new object
     *
     * @param newManagedMobileApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedMobileApp newManagedMobileApp, final ICallback<? super ManagedMobileApp> callback);

    /**
     * Posts a ManagedMobileApp with a new object
     *
     * @param newManagedMobileApp the new object to create
     * @return the created ManagedMobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedMobileApp post(final ManagedMobileApp newManagedMobileApp) throws ClientException;

    /**
     * Posts a ManagedMobileApp with a new object
     *
     * @param newManagedMobileApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ManagedMobileApp newManagedMobileApp, final ICallback<? super ManagedMobileApp> callback);

    /**
     * Posts a ManagedMobileApp with a new object
     *
     * @param newManagedMobileApp the object to create/update
     * @return the created ManagedMobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedMobileApp put(final ManagedMobileApp newManagedMobileApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedMobileAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedMobileAppRequest expand(final String value);

}

