// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ComplianceManagementPartner;
import com.microsoft.graph.requests.extensions.IComplianceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Compliance Management Partner Collection Page.
 */
public class ComplianceManagementPartnerCollectionPage extends BaseCollectionPage<ComplianceManagementPartner, IComplianceManagementPartnerCollectionRequestBuilder> implements IComplianceManagementPartnerCollectionPage {

    /**
     * A collection page for ComplianceManagementPartner
     *
     * @param response the serialized ComplianceManagementPartnerCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ComplianceManagementPartnerCollectionPage(final ComplianceManagementPartnerCollectionResponse response, final IComplianceManagementPartnerCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
