// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedMobileLobApp;
import com.microsoft.graph.requests.extensions.IManagedMobileLobAppCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedMobileLobAppCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedMobileLobAppCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Mobile Lob App Collection Page.
 */
public class ManagedMobileLobAppCollectionPage extends BaseCollectionPage<ManagedMobileLobApp, IManagedMobileLobAppCollectionRequestBuilder> implements IManagedMobileLobAppCollectionPage {

    /**
     * A collection page for ManagedMobileLobApp
     *
     * @param response the serialized ManagedMobileLobAppCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedMobileLobAppCollectionPage(final ManagedMobileLobAppCollectionResponse response, final IManagedMobileLobAppCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
