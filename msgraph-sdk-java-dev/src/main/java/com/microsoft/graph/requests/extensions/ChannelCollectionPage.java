// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Channel;
import com.microsoft.graph.requests.extensions.IChannelCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ChannelCollectionPage;
import com.microsoft.graph.requests.extensions.ChannelCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel Collection Page.
 */
public class ChannelCollectionPage extends BaseCollectionPage<Channel, IChannelCollectionRequestBuilder> implements IChannelCollectionPage {

    /**
     * A collection page for Channel
     *
     * @param response the serialized ChannelCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ChannelCollectionPage(final ChannelCollectionResponse response, final IChannelCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
