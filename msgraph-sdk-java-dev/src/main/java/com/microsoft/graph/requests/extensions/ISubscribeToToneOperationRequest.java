// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SubscribeToToneOperation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Subscribe To Tone Operation Request.
 */
public interface ISubscribeToToneOperationRequest extends IHttpRequest {

    /**
     * Gets the SubscribeToToneOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SubscribeToToneOperation> callback);

    /**
     * Gets the SubscribeToToneOperation from the service
     *
     * @return the SubscribeToToneOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SubscribeToToneOperation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SubscribeToToneOperation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SubscribeToToneOperation with a source
     *
     * @param sourceSubscribeToToneOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SubscribeToToneOperation sourceSubscribeToToneOperation, final ICallback<? super SubscribeToToneOperation> callback);

    /**
     * Patches this SubscribeToToneOperation with a source
     *
     * @param sourceSubscribeToToneOperation the source object with updates
     * @return the updated SubscribeToToneOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SubscribeToToneOperation patch(final SubscribeToToneOperation sourceSubscribeToToneOperation) throws ClientException;

    /**
     * Posts a SubscribeToToneOperation with a new object
     *
     * @param newSubscribeToToneOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SubscribeToToneOperation newSubscribeToToneOperation, final ICallback<? super SubscribeToToneOperation> callback);

    /**
     * Posts a SubscribeToToneOperation with a new object
     *
     * @param newSubscribeToToneOperation the new object to create
     * @return the created SubscribeToToneOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SubscribeToToneOperation post(final SubscribeToToneOperation newSubscribeToToneOperation) throws ClientException;

    /**
     * Posts a SubscribeToToneOperation with a new object
     *
     * @param newSubscribeToToneOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SubscribeToToneOperation newSubscribeToToneOperation, final ICallback<? super SubscribeToToneOperation> callback);

    /**
     * Posts a SubscribeToToneOperation with a new object
     *
     * @param newSubscribeToToneOperation the object to create/update
     * @return the created SubscribeToToneOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SubscribeToToneOperation put(final SubscribeToToneOperation newSubscribeToToneOperation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISubscribeToToneOperationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISubscribeToToneOperationRequest expand(final String value);

}

