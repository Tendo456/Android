// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.EventCollectionPage;
import com.microsoft.graph.requests.extensions.EventCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Collection Page.
 */
public class EventCollectionPage extends BaseCollectionPage<Event, IEventCollectionRequestBuilder> implements IEventCollectionPage {

    /**
     * A collection page for Event
     *
     * @param response the serialized EventCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EventCollectionPage(final EventCollectionResponse response, final IEventCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
