// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TimeOffReason;
import com.microsoft.graph.requests.extensions.ITimeOffReasonCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.TimeOffReasonCollectionPage;
import com.microsoft.graph.requests.extensions.TimeOffReasonCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Off Reason Collection Page.
 */
public class TimeOffReasonCollectionPage extends BaseCollectionPage<TimeOffReason, ITimeOffReasonCollectionRequestBuilder> implements ITimeOffReasonCollectionPage {

    /**
     * A collection page for TimeOffReason
     *
     * @param response the serialized TimeOffReasonCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TimeOffReasonCollectionPage(final TimeOffReasonCollectionResponse response, final ITimeOffReasonCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
