// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceEnrollmentWindowsHelloForBusinessConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Windows Hello For Business Configuration Request Builder.
 */
public class DeviceEnrollmentWindowsHelloForBusinessConfigurationRequestBuilder extends BaseRequestBuilder implements IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequestBuilder {

    /**
     * The request builder for the DeviceEnrollmentWindowsHelloForBusinessConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceEnrollmentWindowsHelloForBusinessConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest instance
     */
    public IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest instance
     */
    public IDeviceEnrollmentWindowsHelloForBusinessConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceEnrollmentWindowsHelloForBusinessConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IEnrollmentConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new EnrollmentConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IEnrollmentConfigurationAssignmentRequestBuilder assignments(final String id) {
        return new EnrollmentConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
}
