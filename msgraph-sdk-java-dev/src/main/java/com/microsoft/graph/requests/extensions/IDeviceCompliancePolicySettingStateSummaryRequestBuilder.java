// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.requests.extensions.IDeviceComplianceSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceSettingStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Policy Setting State Summary Request Builder.
 */
public interface IDeviceCompliancePolicySettingStateSummaryRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceCompliancePolicySettingStateSummaryRequest instance
     */
    IDeviceCompliancePolicySettingStateSummaryRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceCompliancePolicySettingStateSummaryRequest instance
     */
    IDeviceCompliancePolicySettingStateSummaryRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDeviceComplianceSettingStateCollectionRequestBuilder deviceComplianceSettingStates();

    IDeviceComplianceSettingStateRequestBuilder deviceComplianceSettingStates(final String id);

}