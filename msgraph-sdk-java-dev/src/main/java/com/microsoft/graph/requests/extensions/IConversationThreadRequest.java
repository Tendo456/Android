// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ConversationThread;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Conversation Thread Request.
 */
public interface IConversationThreadRequest extends IHttpRequest {

    /**
     * Gets the ConversationThread from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ConversationThread> callback);

    /**
     * Gets the ConversationThread from the service
     *
     * @return the ConversationThread from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConversationThread get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ConversationThread> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ConversationThread with a source
     *
     * @param sourceConversationThread the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ConversationThread sourceConversationThread, final ICallback<? super ConversationThread> callback);

    /**
     * Patches this ConversationThread with a source
     *
     * @param sourceConversationThread the source object with updates
     * @return the updated ConversationThread
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConversationThread patch(final ConversationThread sourceConversationThread) throws ClientException;

    /**
     * Posts a ConversationThread with a new object
     *
     * @param newConversationThread the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ConversationThread newConversationThread, final ICallback<? super ConversationThread> callback);

    /**
     * Posts a ConversationThread with a new object
     *
     * @param newConversationThread the new object to create
     * @return the created ConversationThread
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConversationThread post(final ConversationThread newConversationThread) throws ClientException;

    /**
     * Posts a ConversationThread with a new object
     *
     * @param newConversationThread the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ConversationThread newConversationThread, final ICallback<? super ConversationThread> callback);

    /**
     * Posts a ConversationThread with a new object
     *
     * @param newConversationThread the object to create/update
     * @return the created ConversationThread
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ConversationThread put(final ConversationThread newConversationThread) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IConversationThreadRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IConversationThreadRequest expand(final String value);

}

