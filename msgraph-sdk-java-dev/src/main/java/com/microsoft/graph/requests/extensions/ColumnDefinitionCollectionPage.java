// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ColumnDefinition;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Column Definition Collection Page.
 */
public class ColumnDefinitionCollectionPage extends BaseCollectionPage<ColumnDefinition, IColumnDefinitionCollectionRequestBuilder> implements IColumnDefinitionCollectionPage {

    /**
     * A collection page for ColumnDefinition
     *
     * @param response the serialized ColumnDefinitionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ColumnDefinitionCollectionPage(final ColumnDefinitionCollectionResponse response, final IColumnDefinitionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}