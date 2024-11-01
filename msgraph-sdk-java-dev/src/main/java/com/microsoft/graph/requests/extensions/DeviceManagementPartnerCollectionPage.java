// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementPartner;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Partner Collection Page.
 */
public class DeviceManagementPartnerCollectionPage extends BaseCollectionPage<DeviceManagementPartner, IDeviceManagementPartnerCollectionRequestBuilder> implements IDeviceManagementPartnerCollectionPage {

    /**
     * A collection page for DeviceManagementPartner
     *
     * @param response the serialized DeviceManagementPartnerCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementPartnerCollectionPage(final DeviceManagementPartnerCollectionResponse response, final IDeviceManagementPartnerCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
