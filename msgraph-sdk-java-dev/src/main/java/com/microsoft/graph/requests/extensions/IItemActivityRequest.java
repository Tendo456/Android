// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ItemActivity;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Item Activity Request.
 */
public interface IItemActivityRequest extends IHttpRequest {

    /**
     * Gets the ItemActivity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ItemActivity> callback);

    /**
     * Gets the ItemActivity from the service
     *
     * @return the ItemActivity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemActivity get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ItemActivity> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ItemActivity with a source
     *
     * @param sourceItemActivity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ItemActivity sourceItemActivity, final ICallback<? super ItemActivity> callback);

    /**
     * Patches this ItemActivity with a source
     *
     * @param sourceItemActivity the source object with updates
     * @return the updated ItemActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemActivity patch(final ItemActivity sourceItemActivity) throws ClientException;

    /**
     * Posts a ItemActivity with a new object
     *
     * @param newItemActivity the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ItemActivity newItemActivity, final ICallback<? super ItemActivity> callback);

    /**
     * Posts a ItemActivity with a new object
     *
     * @param newItemActivity the new object to create
     * @return the created ItemActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemActivity post(final ItemActivity newItemActivity) throws ClientException;

    /**
     * Posts a ItemActivity with a new object
     *
     * @param newItemActivity the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ItemActivity newItemActivity, final ICallback<? super ItemActivity> callback);

    /**
     * Posts a ItemActivity with a new object
     *
     * @param newItemActivity the object to create/update
     * @return the created ItemActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemActivity put(final ItemActivity newItemActivity) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IItemActivityRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IItemActivityRequest expand(final String value);

}

