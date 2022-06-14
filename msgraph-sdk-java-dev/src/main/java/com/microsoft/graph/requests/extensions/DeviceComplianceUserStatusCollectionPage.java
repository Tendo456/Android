// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceComplianceUserStatus;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance User Status Collection Page.
 */
public class DeviceComplianceUserStatusCollectionPage extends BaseCollectionPage<DeviceComplianceUserStatus, IDeviceComplianceUserStatusCollectionRequestBuilder> implements IDeviceComplianceUserStatusCollectionPage {

    /**
     * A collection page for DeviceComplianceUserStatus
     *
     * @param response the serialized DeviceComplianceUserStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceComplianceUserStatusCollectionPage(final DeviceComplianceUserStatusCollectionResponse response, final IDeviceComplianceUserStatusCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
