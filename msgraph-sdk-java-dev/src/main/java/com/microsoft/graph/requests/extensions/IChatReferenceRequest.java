// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Chat;
import com.microsoft.graph.models.extensions.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Chat;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Chat Reference Request.
 */
public interface IChatReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super Chat> callback);

    Chat delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IChatReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IChatReferenceRequest expand(final String value);

    /**
     * Puts the Chat
     *
     * @param srcChat the Chat to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(Chat srcChat, final ICallback<? super Chat> callback);

    /**
     * Puts the Chat
     *
     * @param srcChat the Chat to PUT
     * @return the Chat
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Chat put(Chat srcChat) throws ClientException;
}
