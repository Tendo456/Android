// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ListItem;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.requests.extensions.IListItemVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IFieldValueSetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the List Item Request Builder.
 */
public interface IListItemRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IListItemRequest instance
     */
    IListItemRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IListItemRequest instance
     */
    IListItemRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for User
     *
     * @return the IUserWithReferenceRequestBuilder instance
     */
    IUserWithReferenceRequestBuilder createdByUser();

    /**
     * Gets the request builder for User
     *
     * @return the IUserWithReferenceRequestBuilder instance
     */
    IUserWithReferenceRequestBuilder lastModifiedByUser();

    /**
     * Gets the request builder for ItemAnalytics
     *
     * @return the IItemAnalyticsWithReferenceRequestBuilder instance
     */
    IItemAnalyticsWithReferenceRequestBuilder analytics();

    /**
     * Gets the request builder for DriveItem
     *
     * @return the IDriveItemRequestBuilder instance
     */
    IDriveItemRequestBuilder driveItem();

    /**
     * Gets the request builder for FieldValueSet
     *
     * @return the IFieldValueSetRequestBuilder instance
     */
    IFieldValueSetRequestBuilder fields();

    IListItemVersionCollectionRequestBuilder versions();

    IListItemVersionRequestBuilder versions(final String id);

    IListItemGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval();

    IListItemGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval(final String startDateTime, final String endDateTime, final String interval);

}