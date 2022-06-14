// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SubscribedSku;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Subscribed Sku Request.
 */
public interface ISubscribedSkuRequest extends IHttpRequest {

    /**
     * Gets the SubscribedSku from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SubscribedSku> callback);

    /**
     * Gets the SubscribedSku from the service
     *
     * @return the SubscribedSku from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SubscribedSku get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SubscribedSku> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SubscribedSku with a source
     *
     * @param sourceSubscribedSku the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SubscribedSku sourceSubscribedSku, final ICallback<? super SubscribedSku> callback);

    /**
     * Patches this SubscribedSku with a source
     *
     * @param sourceSubscribedSku the source object with updates
     * @return the updated SubscribedSku
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SubscribedSku patch(final SubscribedSku sourceSubscribedSku) throws ClientException;

    /**
     * Posts a SubscribedSku with a new object
     *
     * @param newSubscribedSku the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SubscribedSku newSubscribedSku, final ICallback<? super SubscribedSku> callback);

    /**
     * Posts a SubscribedSku with a new object
     *
     * @param newSubscribedSku the new object to create
     * @return the created SubscribedSku
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SubscribedSku post(final SubscribedSku newSubscribedSku) throws ClientException;

    /**
     * Posts a SubscribedSku with a new object
     *
     * @param newSubscribedSku the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SubscribedSku newSubscribedSku, final ICallback<? super SubscribedSku> callback);

    /**
     * Posts a SubscribedSku with a new object
     *
     * @param newSubscribedSku the object to create/update
     * @return the created SubscribedSku
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SubscribedSku put(final SubscribedSku newSubscribedSku) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISubscribedSkuRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISubscribedSkuRequest expand(final String value);

}

