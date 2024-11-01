// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DriveItemCollectionPage;
import com.microsoft.graph.requests.extensions.DriveItemCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Collection Page.
 */
public class DriveItemCollectionPage extends BaseCollectionPage<DriveItem, IDriveItemCollectionRequestBuilder> implements IDriveItemCollectionPage {

    /**
     * A collection page for DriveItem
     *
     * @param response the serialized DriveItemCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DriveItemCollectionPage(final DriveItemCollectionResponse response, final IDriveItemCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
