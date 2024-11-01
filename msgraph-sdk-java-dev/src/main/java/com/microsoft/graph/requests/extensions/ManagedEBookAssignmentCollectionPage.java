// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedEBookAssignment;
import com.microsoft.graph.requests.extensions.IManagedEBookAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Assignment Collection Page.
 */
public class ManagedEBookAssignmentCollectionPage extends BaseCollectionPage<ManagedEBookAssignment, IManagedEBookAssignmentCollectionRequestBuilder> implements IManagedEBookAssignmentCollectionPage {

    /**
     * A collection page for ManagedEBookAssignment
     *
     * @param response the serialized ManagedEBookAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedEBookAssignmentCollectionPage(final ManagedEBookAssignmentCollectionResponse response, final IManagedEBookAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
