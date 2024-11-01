// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.requests.extensions.IOrgContactCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.OrgContactCollectionPage;
import com.microsoft.graph.requests.extensions.OrgContactCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Org Contact Collection Page.
 */
public class OrgContactCollectionPage extends BaseCollectionPage<OrgContact, IOrgContactCollectionRequestBuilder> implements IOrgContactCollectionPage {

    /**
     * A collection page for OrgContact
     *
     * @param response the serialized OrgContactCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OrgContactCollectionPage(final OrgContactCollectionResponse response, final IOrgContactCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
