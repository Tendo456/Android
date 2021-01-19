// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Directory Object Collection With References Request.
 */
public interface IDirectoryObjectCollectionWithReferencesRequest extends IHttpRequest {

    void get(final ICallback<? super IDirectoryObjectCollectionWithReferencesPage> callback);

    IDirectoryObjectCollectionWithReferencesPage get() throws ClientException;

    IDirectoryObjectCollectionWithReferencesRequest expand(final String value);
    
    IDirectoryObjectCollectionWithReferencesRequest select(final String value);

    IDirectoryObjectCollectionWithReferencesRequest top(final int value);

}
