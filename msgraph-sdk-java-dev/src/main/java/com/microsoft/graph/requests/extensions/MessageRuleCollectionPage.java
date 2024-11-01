// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MessageRule;
import com.microsoft.graph.requests.extensions.IMessageRuleCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MessageRuleCollectionPage;
import com.microsoft.graph.requests.extensions.MessageRuleCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Rule Collection Page.
 */
public class MessageRuleCollectionPage extends BaseCollectionPage<MessageRule, IMessageRuleCollectionRequestBuilder> implements IMessageRuleCollectionPage {

    /**
     * A collection page for MessageRule
     *
     * @param response the serialized MessageRuleCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MessageRuleCollectionPage(final MessageRuleCollectionResponse response, final IMessageRuleCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
