// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DomainDnsRecord;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionPage;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Record Collection Page.
 */
public class DomainDnsRecordCollectionPage extends BaseCollectionPage<DomainDnsRecord, IDomainDnsRecordCollectionRequestBuilder> implements IDomainDnsRecordCollectionPage {

    /**
     * A collection page for DomainDnsRecord
     *
     * @param response the serialized DomainDnsRecordCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DomainDnsRecordCollectionPage(final DomainDnsRecordCollectionResponse response, final IDomainDnsRecordCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
