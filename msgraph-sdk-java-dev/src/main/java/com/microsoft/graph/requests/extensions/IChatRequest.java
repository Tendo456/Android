// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Chat;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Chat Request.
 */
public interface IChatRequest extends IHttpRequest {

    /**
     * Gets the Chat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Chat> callback);

    /**
     * Gets the Chat from the service
     *
     * @return the Chat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Chat get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Chat> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Chat with a source
     *
     * @param sourceChat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Chat sourceChat, final ICallback<? super Chat> callback);

    /**
     * Patches this Chat with a source
     *
     * @param sourceChat the source object with updates
     * @return the updated Chat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Chat patch(final Chat sourceChat) throws ClientException;

    /**
     * Posts a Chat with a new object
     *
     * @param newChat the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Chat newChat, final ICallback<? super Chat> callback);

    /**
     * Posts a Chat with a new object
     *
     * @param newChat the new object to create
     * @return the created Chat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Chat post(final Chat newChat) throws ClientException;

    /**
     * Posts a Chat with a new object
     *
     * @param newChat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Chat newChat, final ICallback<? super Chat> callback);

    /**
     * Posts a Chat with a new object
     *
     * @param newChat the object to create/update
     * @return the created Chat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Chat put(final Chat newChat) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IChatRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IChatRequest expand(final String value);

}

