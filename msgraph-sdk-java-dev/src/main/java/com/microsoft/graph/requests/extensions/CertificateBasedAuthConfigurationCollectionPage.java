// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CertificateBasedAuthConfiguration;
import com.microsoft.graph.requests.extensions.ICertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Certificate Based Auth Configuration Collection Page.
 */
public class CertificateBasedAuthConfigurationCollectionPage extends BaseCollectionPage<CertificateBasedAuthConfiguration, ICertificateBasedAuthConfigurationCollectionRequestBuilder> implements ICertificateBasedAuthConfigurationCollectionPage {

    /**
     * A collection page for CertificateBasedAuthConfiguration
     *
     * @param response the serialized CertificateBasedAuthConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CertificateBasedAuthConfigurationCollectionPage(final CertificateBasedAuthConfigurationCollectionResponse response, final ICertificateBasedAuthConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
