// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Scheduled Action For Rule Collection Request.
 */
public interface IDeviceComplianceScheduledActionForRuleCollectionRequest extends IHttpRequest {

    void get(final ICallback<? super IDeviceComplianceScheduledActionForRuleCollectionPage> callback);

    IDeviceComplianceScheduledActionForRuleCollectionPage get() throws ClientException;

    void post(final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule, final ICallback<? super DeviceComplianceScheduledActionForRule> callback);

    DeviceComplianceScheduledActionForRule post(final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceComplianceScheduledActionForRuleCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    IDeviceComplianceScheduledActionForRuleCollectionRequest filter(final String value);

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    IDeviceComplianceScheduledActionForRuleCollectionRequest orderBy(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceComplianceScheduledActionForRuleCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDeviceComplianceScheduledActionForRuleCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IDeviceComplianceScheduledActionForRuleCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IDeviceComplianceScheduledActionForRuleCollectionRequest skipToken(final String skipToken);
}
