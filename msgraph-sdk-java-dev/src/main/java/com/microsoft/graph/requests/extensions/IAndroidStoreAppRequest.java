// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidStoreApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Store App Request.
 */
public interface IAndroidStoreAppRequest extends IHttpRequest {

    /**
     * Gets the AndroidStoreApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AndroidStoreApp> callback);

    /**
     * Gets the AndroidStoreApp from the service
     *
     * @return the AndroidStoreApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidStoreApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AndroidStoreApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidStoreApp with a source
     *
     * @param sourceAndroidStoreApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidStoreApp sourceAndroidStoreApp, final ICallback<? super AndroidStoreApp> callback);

    /**
     * Patches this AndroidStoreApp with a source
     *
     * @param sourceAndroidStoreApp the source object with updates
     * @return the updated AndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidStoreApp patch(final AndroidStoreApp sourceAndroidStoreApp) throws ClientException;

    /**
     * Posts a AndroidStoreApp with a new object
     *
     * @param newAndroidStoreApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidStoreApp newAndroidStoreApp, final ICallback<? super AndroidStoreApp> callback);

    /**
     * Posts a AndroidStoreApp with a new object
     *
     * @param newAndroidStoreApp the new object to create
     * @return the created AndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidStoreApp post(final AndroidStoreApp newAndroidStoreApp) throws ClientException;

    /**
     * Posts a AndroidStoreApp with a new object
     *
     * @param newAndroidStoreApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidStoreApp newAndroidStoreApp, final ICallback<? super AndroidStoreApp> callback);

    /**
     * Posts a AndroidStoreApp with a new object
     *
     * @param newAndroidStoreApp the object to create/update
     * @return the created AndroidStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidStoreApp put(final AndroidStoreApp newAndroidStoreApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidStoreAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidStoreAppRequest expand(final String value);

}

