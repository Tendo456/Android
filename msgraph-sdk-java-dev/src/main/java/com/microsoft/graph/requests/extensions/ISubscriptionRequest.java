// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Subscription;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Subscription Request.
 */
public interface ISubscriptionRequest extends IHttpRequest {

    /**
     * Gets the Subscription from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Subscription> callback);

    /**
     * Gets the Subscription from the service
     *
     * @return the Subscription from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Subscription get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Subscription> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Subscription with a source
     *
     * @param sourceSubscription the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Subscription sourceSubscription, final ICallback<? super Subscription> callback);

    /**
     * Patches this Subscription with a source
     *
     * @param sourceSubscription the source object with updates
     * @return the updated Subscription
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Subscription patch(final Subscription sourceSubscription) throws ClientException;

    /**
     * Posts a Subscription with a new object
     *
     * @param newSubscription the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Subscription newSubscription, final ICallback<? super Subscription> callback);

    /**
     * Posts a Subscription with a new object
     *
     * @param newSubscription the new object to create
     * @return the created Subscription
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Subscription post(final Subscription newSubscription) throws ClientException;

    /**
     * Posts a Subscription with a new object
     *
     * @param newSubscription the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Subscription newSubscription, final ICallback<? super Subscription> callback);

    /**
     * Posts a Subscription with a new object
     *
     * @param newSubscription the object to create/update
     * @return the created Subscription
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Subscription put(final Subscription newSubscription) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISubscriptionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISubscriptionRequest expand(final String value);

}

