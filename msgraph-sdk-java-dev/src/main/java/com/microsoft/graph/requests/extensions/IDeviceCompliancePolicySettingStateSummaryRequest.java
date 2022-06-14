// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingStateSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Policy Setting State Summary Request.
 */
public interface IDeviceCompliancePolicySettingStateSummaryRequest extends IHttpRequest {

    /**
     * Gets the DeviceCompliancePolicySettingStateSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceCompliancePolicySettingStateSummary> callback);

    /**
     * Gets the DeviceCompliancePolicySettingStateSummary from the service
     *
     * @return the DeviceCompliancePolicySettingStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicySettingStateSummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceCompliancePolicySettingStateSummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceCompliancePolicySettingStateSummary with a source
     *
     * @param sourceDeviceCompliancePolicySettingStateSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceCompliancePolicySettingStateSummary sourceDeviceCompliancePolicySettingStateSummary, final ICallback<? super DeviceCompliancePolicySettingStateSummary> callback);

    /**
     * Patches this DeviceCompliancePolicySettingStateSummary with a source
     *
     * @param sourceDeviceCompliancePolicySettingStateSummary the source object with updates
     * @return the updated DeviceCompliancePolicySettingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicySettingStateSummary patch(final DeviceCompliancePolicySettingStateSummary sourceDeviceCompliancePolicySettingStateSummary) throws ClientException;

    /**
     * Posts a DeviceCompliancePolicySettingStateSummary with a new object
     *
     * @param newDeviceCompliancePolicySettingStateSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary, final ICallback<? super DeviceCompliancePolicySettingStateSummary> callback);

    /**
     * Posts a DeviceCompliancePolicySettingStateSummary with a new object
     *
     * @param newDeviceCompliancePolicySettingStateSummary the new object to create
     * @return the created DeviceCompliancePolicySettingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicySettingStateSummary post(final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary) throws ClientException;

    /**
     * Posts a DeviceCompliancePolicySettingStateSummary with a new object
     *
     * @param newDeviceCompliancePolicySettingStateSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary, final ICallback<? super DeviceCompliancePolicySettingStateSummary> callback);

    /**
     * Posts a DeviceCompliancePolicySettingStateSummary with a new object
     *
     * @param newDeviceCompliancePolicySettingStateSummary the object to create/update
     * @return the created DeviceCompliancePolicySettingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicySettingStateSummary put(final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceCompliancePolicySettingStateSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceCompliancePolicySettingStateSummaryRequest expand(final String value);

}

