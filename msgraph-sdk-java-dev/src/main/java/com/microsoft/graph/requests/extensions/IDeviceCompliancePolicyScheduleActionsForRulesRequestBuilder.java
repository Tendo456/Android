// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyScheduleActionsForRulesRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Policy Schedule Actions For Rules Request Builder.
 */
public interface IDeviceCompliancePolicyScheduleActionsForRulesRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceCompliancePolicyScheduleActionsForRulesRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceCompliancePolicyScheduleActionsForRulesRequest instance
     */
    IDeviceCompliancePolicyScheduleActionsForRulesRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDeviceCompliancePolicyScheduleActionsForRulesRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceCompliancePolicyScheduleActionsForRulesRequest instance
     */
    IDeviceCompliancePolicyScheduleActionsForRulesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
