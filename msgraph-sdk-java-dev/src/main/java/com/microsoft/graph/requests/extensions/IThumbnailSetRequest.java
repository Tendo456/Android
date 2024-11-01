// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ThumbnailSet;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Thumbnail Set Request.
 */
public interface IThumbnailSetRequest extends IHttpRequest {

    /**
     * Gets the ThumbnailSet from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ThumbnailSet> callback);

    /**
     * Gets the ThumbnailSet from the service
     *
     * @return the ThumbnailSet from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ThumbnailSet get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ThumbnailSet> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ThumbnailSet with a source
     *
     * @param sourceThumbnailSet the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ThumbnailSet sourceThumbnailSet, final ICallback<? super ThumbnailSet> callback);

    /**
     * Patches this ThumbnailSet with a source
     *
     * @param sourceThumbnailSet the source object with updates
     * @return the updated ThumbnailSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ThumbnailSet patch(final ThumbnailSet sourceThumbnailSet) throws ClientException;

    /**
     * Posts a ThumbnailSet with a new object
     *
     * @param newThumbnailSet the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ThumbnailSet newThumbnailSet, final ICallback<? super ThumbnailSet> callback);

    /**
     * Posts a ThumbnailSet with a new object
     *
     * @param newThumbnailSet the new object to create
     * @return the created ThumbnailSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ThumbnailSet post(final ThumbnailSet newThumbnailSet) throws ClientException;

    /**
     * Posts a ThumbnailSet with a new object
     *
     * @param newThumbnailSet the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ThumbnailSet newThumbnailSet, final ICallback<? super ThumbnailSet> callback);

    /**
     * Posts a ThumbnailSet with a new object
     *
     * @param newThumbnailSet the object to create/update
     * @return the created ThumbnailSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ThumbnailSet put(final ThumbnailSet newThumbnailSet) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IThumbnailSetRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IThumbnailSetRequest expand(final String value);

}

