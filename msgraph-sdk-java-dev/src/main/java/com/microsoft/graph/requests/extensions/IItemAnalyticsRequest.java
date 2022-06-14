// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ItemAnalytics;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Item Analytics Request.
 */
public interface IItemAnalyticsRequest extends IHttpRequest {

    /**
     * Gets the ItemAnalytics from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ItemAnalytics> callback);

    /**
     * Gets the ItemAnalytics from the service
     *
     * @return the ItemAnalytics from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemAnalytics get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ItemAnalytics> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ItemAnalytics with a source
     *
     * @param sourceItemAnalytics the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ItemAnalytics sourceItemAnalytics, final ICallback<? super ItemAnalytics> callback);

    /**
     * Patches this ItemAnalytics with a source
     *
     * @param sourceItemAnalytics the source object with updates
     * @return the updated ItemAnalytics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemAnalytics patch(final ItemAnalytics sourceItemAnalytics) throws ClientException;

    /**
     * Posts a ItemAnalytics with a new object
     *
     * @param newItemAnalytics the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ItemAnalytics newItemAnalytics, final ICallback<? super ItemAnalytics> callback);

    /**
     * Posts a ItemAnalytics with a new object
     *
     * @param newItemAnalytics the new object to create
     * @return the created ItemAnalytics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemAnalytics post(final ItemAnalytics newItemAnalytics) throws ClientException;

    /**
     * Posts a ItemAnalytics with a new object
     *
     * @param newItemAnalytics the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ItemAnalytics newItemAnalytics, final ICallback<? super ItemAnalytics> callback);

    /**
     * Posts a ItemAnalytics with a new object
     *
     * @param newItemAnalytics the object to create/update
     * @return the created ItemAnalytics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemAnalytics put(final ItemAnalytics newItemAnalytics) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IItemAnalyticsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IItemAnalyticsRequest expand(final String value);

}

