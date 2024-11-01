// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Application;
import com.microsoft.graph.requests.extensions.IApplicationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ApplicationCollectionPage;
import com.microsoft.graph.requests.extensions.ApplicationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Collection Page.
 */
public class ApplicationCollectionPage extends BaseCollectionPage<Application, IApplicationCollectionRequestBuilder> implements IApplicationCollectionPage {

    /**
     * A collection page for Application
     *
     * @param response the serialized ApplicationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ApplicationCollectionPage(final ApplicationCollectionResponse response, final IApplicationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
