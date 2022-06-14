// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Win32LobApp;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Win32Lob App Request Builder.
 */
public interface IWin32LobAppRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWin32LobAppRequest instance
     */
    IWin32LobAppRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWin32LobAppRequest instance
     */
    IWin32LobAppRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IMobileAppAssignmentCollectionRequestBuilder assignments();

    IMobileAppAssignmentRequestBuilder assignments(final String id);

    IMobileAppCategoryCollectionWithReferencesRequestBuilder categories();

    IMobileAppCategoryWithReferenceRequestBuilder categories(final String id);

    IMobileAppContentCollectionRequestBuilder contentVersions();

    IMobileAppContentRequestBuilder contentVersions(final String id);

}