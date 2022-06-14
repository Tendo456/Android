// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Directory Object Request Builder.
 */
public interface IDirectoryObjectRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDirectoryObjectRequest instance
     */
    IDirectoryObjectRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDirectoryObjectRequest instance
     */
    IDirectoryObjectRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDirectoryObjectCheckMemberGroupsCollectionRequestBuilder checkMemberGroups(final java.util.List<String> groupIds);

    IDirectoryObjectCheckMemberObjectsCollectionRequestBuilder checkMemberObjects(final java.util.List<String> ids);

    IDirectoryObjectGetMemberGroupsCollectionRequestBuilder getMemberGroups(final Boolean securityEnabledOnly);

    IDirectoryObjectGetMemberObjectsCollectionRequestBuilder getMemberObjects(final Boolean securityEnabledOnly);
    IDirectoryObjectRestoreRequestBuilder restore();

}