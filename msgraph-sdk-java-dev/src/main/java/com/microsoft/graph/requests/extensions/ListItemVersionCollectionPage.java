// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ListItemVersion;
import com.microsoft.graph.requests.extensions.IListItemVersionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ListItemVersionCollectionPage;
import com.microsoft.graph.requests.extensions.ListItemVersionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item Version Collection Page.
 */
public class ListItemVersionCollectionPage extends BaseCollectionPage<ListItemVersion, IListItemVersionCollectionRequestBuilder> implements IListItemVersionCollectionPage {

    /**
     * A collection page for ListItemVersion
     *
     * @param response the serialized ListItemVersionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ListItemVersionCollectionPage(final ListItemVersionCollectionResponse response, final IListItemVersionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}