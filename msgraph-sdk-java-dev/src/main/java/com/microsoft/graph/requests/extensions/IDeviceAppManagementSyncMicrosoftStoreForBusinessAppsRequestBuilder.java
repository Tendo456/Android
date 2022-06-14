// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device App Management Sync Microsoft Store For Business Apps Request Builder.
 */
public interface IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest instance
     */
    IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest instance
     */
    IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
