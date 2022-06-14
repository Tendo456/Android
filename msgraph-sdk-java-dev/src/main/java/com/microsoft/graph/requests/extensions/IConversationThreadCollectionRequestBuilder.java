// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Conversation;
import com.microsoft.graph.models.extensions.ConversationThread;
import com.microsoft.graph.models.extensions.Post;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IConversationThreadRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Conversation Thread Collection Request Builder.
 */
public interface IConversationThreadCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IConversationThreadCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IConversationThreadCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IConversationThreadRequestBuilder byId(final String id);

}
