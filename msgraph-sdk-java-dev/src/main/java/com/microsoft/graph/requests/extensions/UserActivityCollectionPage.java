// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserActivity;
import com.microsoft.graph.requests.extensions.IUserActivityCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserActivityCollectionPage;
import com.microsoft.graph.requests.extensions.UserActivityCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Activity Collection Page.
 */
public class UserActivityCollectionPage extends BaseCollectionPage<UserActivity, IUserActivityCollectionRequestBuilder> implements IUserActivityCollectionPage {

    /**
     * A collection page for UserActivity
     *
     * @param response the serialized UserActivityCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserActivityCollectionPage(final UserActivityCollectionResponse response, final IUserActivityCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
