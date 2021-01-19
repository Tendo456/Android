// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.requests.extensions.IAttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Event Request Builder.
 */
public interface IEventRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IEventRequest instance
     */
    IEventRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IEventRequest instance
     */
    IEventRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IAttachmentCollectionRequestBuilder attachments();

    IAttachmentRequestBuilder attachments(final String id);

    /**
     * Gets the request builder for Calendar
     *
     * @return the ICalendarRequestBuilder instance
     */
    ICalendarRequestBuilder calendar();

    IExtensionCollectionRequestBuilder extensions();

    IExtensionRequestBuilder extensions(final String id);

    IEventCollectionRequestBuilder instances();

    IEventRequestBuilder instances(final String id);

    IMultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties();

    IMultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(final String id);

    ISingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties();

    ISingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(final String id);
    IEventAcceptRequestBuilder accept(final String comment, final Boolean sendResponse);
    IEventCancelRequestBuilder cancel(final String comment);
    IEventDeclineRequestBuilder decline(final String comment, final Boolean sendResponse);
    IEventDismissReminderRequestBuilder dismissReminder();
    IEventForwardRequestBuilder forward(final java.util.List<Recipient> toRecipients, final String comment);
    IEventSnoozeReminderRequestBuilder snoozeReminder(final DateTimeTimeZone newReminderTime);
    IEventTentativelyAcceptRequestBuilder tentativelyAccept(final String comment, final Boolean sendResponse);

}