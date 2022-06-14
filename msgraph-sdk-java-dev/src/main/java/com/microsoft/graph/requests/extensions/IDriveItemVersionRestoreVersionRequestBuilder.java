// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDriveItemVersionRestoreVersionRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Drive Item Version Restore Version Request Builder.
 */
public interface IDriveItemVersionRestoreVersionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDriveItemVersionRestoreVersionRequest
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemVersionRestoreVersionRequest instance
     */
    IDriveItemVersionRestoreVersionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDriveItemVersionRestoreVersionRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemVersionRestoreVersionRequest instance
     */
    IDriveItemVersionRestoreVersionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
