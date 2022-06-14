// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnenoteResource;
import com.microsoft.graph.requests.extensions.IOnenoteResourceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.OnenoteResourceCollectionPage;
import com.microsoft.graph.requests.extensions.OnenoteResourceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Resource Collection Page.
 */
public class OnenoteResourceCollectionPage extends BaseCollectionPage<OnenoteResource, IOnenoteResourceCollectionRequestBuilder> implements IOnenoteResourceCollectionPage {

    /**
     * A collection page for OnenoteResource
     *
     * @param response the serialized OnenoteResourceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OnenoteResourceCollectionPage(final OnenoteResourceCollectionResponse response, final IOnenoteResourceCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
