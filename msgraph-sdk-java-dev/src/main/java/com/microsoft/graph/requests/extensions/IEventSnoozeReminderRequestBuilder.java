// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEventSnoozeReminderRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Event Snooze Reminder Request Builder.
 */
public interface IEventSnoozeReminderRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IEventSnoozeReminderRequest
     *
     * @param requestOptions the options for the request
     * @return the IEventSnoozeReminderRequest instance
     */
    IEventSnoozeReminderRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IEventSnoozeReminderRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IEventSnoozeReminderRequest instance
     */
    IEventSnoozeReminderRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
