// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.requests.extensions.IDetectedAppCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionPage;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Detected App Collection Page.
 */
public class DetectedAppCollectionPage extends BaseCollectionPage<DetectedApp, IDetectedAppCollectionRequestBuilder> implements IDetectedAppCollectionPage {

    /**
     * A collection page for DetectedApp
     *
     * @param response the serialized DetectedAppCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DetectedAppCollectionPage(final DetectedAppCollectionResponse response, final IDetectedAppCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
