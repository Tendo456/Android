// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SharedDriveItem;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IListRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Shared Drive Item Request Builder.
 */
public interface ISharedDriveItemRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISharedDriveItemRequest instance
     */
    ISharedDriveItemRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISharedDriveItemRequest instance
     */
    ISharedDriveItemRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


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
     * Gets the request builder for DriveItem
     *
     * @return the IDriveItemRequestBuilder instance
     */
    IDriveItemRequestBuilder driveItem();

    IDriveItemCollectionRequestBuilder items();

    IDriveItemRequestBuilder items(final String id);

    /**
     * Gets the request builder for List
     *
     * @return the IListRequestBuilder instance
     */
    IListRequestBuilder list();

    /**
     * Gets the request builder for ListItem
     *
     * @return the IListItemRequestBuilder instance
     */
    IListItemRequestBuilder listItem();

    /**
     * Gets the request builder for Permission
     *
     * @return the IPermissionRequestBuilder instance
     */
    IPermissionRequestBuilder permission();

    /**
     * Gets the request builder for DriveItem
     *
     * @return the IDriveItemRequestBuilder instance
     */
    IDriveItemRequestBuilder root();

    /**
     * Gets the request builder for Site
     *
     * @return the ISiteRequestBuilder instance
     */
    ISiteRequestBuilder site();

}