// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.requests.extensions.IMobileAppCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Collection Page.
 */
public class MobileAppCollectionPage extends BaseCollectionPage<MobileApp, IMobileAppCollectionRequestBuilder> implements IMobileAppCollectionPage {

    /**
     * A collection page for MobileApp
     *
     * @param response the serialized MobileAppCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppCollectionPage(final MobileAppCollectionResponse response, final IMobileAppCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
