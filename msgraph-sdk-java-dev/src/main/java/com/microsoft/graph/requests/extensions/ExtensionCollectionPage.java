// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Extension Collection Page.
 */
public class ExtensionCollectionPage extends BaseCollectionPage<Extension, IExtensionCollectionRequestBuilder> implements IExtensionCollectionPage {

    /**
     * A collection page for Extension
     *
     * @param response the serialized ExtensionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ExtensionCollectionPage(final ExtensionCollectionResponse response, final IExtensionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
