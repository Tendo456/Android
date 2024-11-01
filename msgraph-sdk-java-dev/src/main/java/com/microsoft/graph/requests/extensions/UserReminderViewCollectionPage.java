// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Reminder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUserReminderViewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserReminderViewCollectionPage;
import com.microsoft.graph.requests.extensions.UserReminderViewCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Reminder View Collection Page.
 */
public class UserReminderViewCollectionPage extends BaseCollectionPage<Reminder, IUserReminderViewCollectionRequestBuilder> implements IUserReminderViewCollectionPage {

    /**
     * A collection page for Reminder.
     *
     * @param response The serialized UserReminderViewCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UserReminderViewCollectionPage(final UserReminderViewCollectionResponse response, final IUserReminderViewCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
