// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OfferShiftRequest;
import com.microsoft.graph.requests.extensions.IOfferShiftRequestCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.OfferShiftRequestCollectionPage;
import com.microsoft.graph.requests.extensions.OfferShiftRequestCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Offer Shift Request Collection Page.
 */
public class OfferShiftRequestCollectionPage extends BaseCollectionPage<OfferShiftRequest, IOfferShiftRequestCollectionRequestBuilder> implements IOfferShiftRequestCollectionPage {

    /**
     * A collection page for OfferShiftRequest
     *
     * @param response the serialized OfferShiftRequestCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OfferShiftRequestCollectionPage(final OfferShiftRequestCollectionResponse response, final IOfferShiftRequestCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
