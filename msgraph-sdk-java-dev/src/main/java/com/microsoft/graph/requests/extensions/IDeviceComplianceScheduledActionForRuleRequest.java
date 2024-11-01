// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Scheduled Action For Rule Request.
 */
public interface IDeviceComplianceScheduledActionForRuleRequest extends IHttpRequest {

    /**
     * Gets the DeviceComplianceScheduledActionForRule from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceComplianceScheduledActionForRule> callback);

    /**
     * Gets the DeviceComplianceScheduledActionForRule from the service
     *
     * @return the DeviceComplianceScheduledActionForRule from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScheduledActionForRule get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceComplianceScheduledActionForRule> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceComplianceScheduledActionForRule with a source
     *
     * @param sourceDeviceComplianceScheduledActionForRule the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceComplianceScheduledActionForRule sourceDeviceComplianceScheduledActionForRule, final ICallback<? super DeviceComplianceScheduledActionForRule> callback);

    /**
     * Patches this DeviceComplianceScheduledActionForRule with a source
     *
     * @param sourceDeviceComplianceScheduledActionForRule the source object with updates
     * @return the updated DeviceComplianceScheduledActionForRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScheduledActionForRule patch(final DeviceComplianceScheduledActionForRule sourceDeviceComplianceScheduledActionForRule) throws ClientException;

    /**
     * Posts a DeviceComplianceScheduledActionForRule with a new object
     *
     * @param newDeviceComplianceScheduledActionForRule the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule, final ICallback<? super DeviceComplianceScheduledActionForRule> callback);

    /**
     * Posts a DeviceComplianceScheduledActionForRule with a new object
     *
     * @param newDeviceComplianceScheduledActionForRule the new object to create
     * @return the created DeviceComplianceScheduledActionForRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScheduledActionForRule post(final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule) throws ClientException;

    /**
     * Posts a DeviceComplianceScheduledActionForRule with a new object
     *
     * @param newDeviceComplianceScheduledActionForRule the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule, final ICallback<? super DeviceComplianceScheduledActionForRule> callback);

    /**
     * Posts a DeviceComplianceScheduledActionForRule with a new object
     *
     * @param newDeviceComplianceScheduledActionForRule the object to create/update
     * @return the created DeviceComplianceScheduledActionForRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScheduledActionForRule put(final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceComplianceScheduledActionForRuleRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceComplianceScheduledActionForRuleRequest expand(final String value);

}

