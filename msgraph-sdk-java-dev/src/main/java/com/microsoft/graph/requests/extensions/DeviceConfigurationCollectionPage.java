// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Collection Page.
 */
public class DeviceConfigurationCollectionPage extends BaseCollectionPage<DeviceConfiguration, IDeviceConfigurationCollectionRequestBuilder> implements IDeviceConfigurationCollectionPage {

    /**
     * A collection page for DeviceConfiguration
     *
     * @param response the serialized DeviceConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceConfigurationCollectionPage(final DeviceConfigurationCollectionResponse response, final IDeviceConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
