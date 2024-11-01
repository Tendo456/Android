// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile App Request.
 */
public interface IMobileAppRequest extends IHttpRequest {

    /**
     * Gets the MobileApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super MobileApp> callback);

    /**
     * Gets the MobileApp from the service
     *
     * @return the MobileApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super MobileApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MobileApp with a source
     *
     * @param sourceMobileApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MobileApp sourceMobileApp, final ICallback<? super MobileApp> callback);

    /**
     * Patches this MobileApp with a source
     *
     * @param sourceMobileApp the source object with updates
     * @return the updated MobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileApp patch(final MobileApp sourceMobileApp) throws ClientException;

    /**
     * Posts a MobileApp with a new object
     *
     * @param newMobileApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MobileApp newMobileApp, final ICallback<? super MobileApp> callback);

    /**
     * Posts a MobileApp with a new object
     *
     * @param newMobileApp the new object to create
     * @return the created MobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileApp post(final MobileApp newMobileApp) throws ClientException;

    /**
     * Posts a MobileApp with a new object
     *
     * @param newMobileApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MobileApp newMobileApp, final ICallback<? super MobileApp> callback);

    /**
     * Posts a MobileApp with a new object
     *
     * @param newMobileApp the object to create/update
     * @return the created MobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileApp put(final MobileApp newMobileApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMobileAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMobileAppRequest expand(final String value);

}

