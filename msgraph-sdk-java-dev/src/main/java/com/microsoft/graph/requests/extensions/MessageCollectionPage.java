// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.requests.extensions.IMessageCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MessageCollectionPage;
import com.microsoft.graph.requests.extensions.MessageCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Collection Page.
 */
public class MessageCollectionPage extends BaseCollectionPage<Message, IMessageCollectionRequestBuilder> implements IMessageCollectionPage {

    /**
     * A collection page for Message
     *
     * @param response the serialized MessageCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MessageCollectionPage(final MessageCollectionResponse response, final IMessageCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
