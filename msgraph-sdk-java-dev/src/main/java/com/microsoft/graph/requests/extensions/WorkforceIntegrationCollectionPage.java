// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkforceIntegration;
import com.microsoft.graph.requests.extensions.IWorkforceIntegrationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WorkforceIntegrationCollectionPage;
import com.microsoft.graph.requests.extensions.WorkforceIntegrationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workforce Integration Collection Page.
 */
public class WorkforceIntegrationCollectionPage extends BaseCollectionPage<WorkforceIntegration, IWorkforceIntegrationCollectionRequestBuilder> implements IWorkforceIntegrationCollectionPage {

    /**
     * A collection page for WorkforceIntegration
     *
     * @param response the serialized WorkforceIntegrationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkforceIntegrationCollectionPage(final WorkforceIntegrationCollectionResponse response, final IWorkforceIntegrationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
