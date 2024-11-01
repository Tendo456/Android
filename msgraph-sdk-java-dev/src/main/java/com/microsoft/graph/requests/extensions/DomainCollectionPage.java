// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Domain;
import com.microsoft.graph.requests.extensions.IDomainCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DomainCollectionPage;
import com.microsoft.graph.requests.extensions.DomainCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Collection Page.
 */
public class DomainCollectionPage extends BaseCollectionPage<Domain, IDomainCollectionRequestBuilder> implements IDomainCollectionPage {

    /**
     * A collection page for Domain
     *
     * @param response the serialized DomainCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DomainCollectionPage(final DomainCollectionResponse response, final IDomainCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
