// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.NotificationMessageTemplate;
import com.microsoft.graph.requests.extensions.ILocalizedNotificationMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILocalizedNotificationMessageRequestBuilder;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.LocalizedNotificationMessageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notification Message Template Request Builder.
 */
public class NotificationMessageTemplateRequestBuilder extends BaseRequestBuilder implements INotificationMessageTemplateRequestBuilder {

    /**
     * The request builder for the NotificationMessageTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NotificationMessageTemplateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the INotificationMessageTemplateRequest instance
     */
    public INotificationMessageTemplateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the INotificationMessageTemplateRequest instance
     */
    public INotificationMessageTemplateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.NotificationMessageTemplateRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ILocalizedNotificationMessageCollectionRequestBuilder localizedNotificationMessages() {
        return new LocalizedNotificationMessageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("localizedNotificationMessages"), getClient(), null);
    }

    public ILocalizedNotificationMessageRequestBuilder localizedNotificationMessages(final String id) {
        return new LocalizedNotificationMessageRequestBuilder(getRequestUrlWithAdditionalSegment("localizedNotificationMessages") + "/" + id, getClient(), null);
    }

    public INotificationMessageTemplateSendTestMessageRequestBuilder sendTestMessage() {
        return new NotificationMessageTemplateSendTestMessageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sendTestMessage"), getClient(), null);
    }
}
