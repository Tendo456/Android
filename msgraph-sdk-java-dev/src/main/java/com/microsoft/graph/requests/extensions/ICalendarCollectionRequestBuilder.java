// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CalendarGroup;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.extensions.ScheduleInformation;
import com.microsoft.graph.models.generated.CalendarRoleType;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ICalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Calendar Collection Request Builder.
 */
public interface ICalendarCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    ICalendarCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    ICalendarCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    ICalendarRequestBuilder byId(final String id);

}
