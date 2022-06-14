// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceActionItemRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Scheduled Action For Rule Request.
 */
public class DeviceComplianceScheduledActionForRuleRequest extends BaseRequest implements IDeviceComplianceScheduledActionForRuleRequest {
	
    /**
     * The request for the DeviceComplianceScheduledActionForRule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceScheduledActionForRuleRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceScheduledActionForRule.class);
    }

    /**
     * Gets the DeviceComplianceScheduledActionForRule from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceComplianceScheduledActionForRule> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceComplianceScheduledActionForRule from the service
     *
     * @return the DeviceComplianceScheduledActionForRule from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceScheduledActionForRule get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceComplianceScheduledActionForRule> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceComplianceScheduledActionForRule with a source
     *
     * @param sourceDeviceComplianceScheduledActionForRule the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceComplianceScheduledActionForRule sourceDeviceComplianceScheduledActionForRule, final ICallback<? super DeviceComplianceScheduledActionForRule> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceComplianceScheduledActionForRule);
    }

    /**
     * Patches this DeviceComplianceScheduledActionForRule with a source
     *
     * @param sourceDeviceComplianceScheduledActionForRule the source object with updates
     * @return the updated DeviceComplianceScheduledActionForRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceScheduledActionForRule patch(final DeviceComplianceScheduledActionForRule sourceDeviceComplianceScheduledActionForRule) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceComplianceScheduledActionForRule);
    }

    /**
     * Creates a DeviceComplianceScheduledActionForRule with a new object
     *
     * @param newDeviceComplianceScheduledActionForRule the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule, final ICallback<? super DeviceComplianceScheduledActionForRule> callback) {
        send(HttpMethod.POST, callback, newDeviceComplianceScheduledActionForRule);
    }

    /**
     * Creates a DeviceComplianceScheduledActionForRule with a new object
     *
     * @param newDeviceComplianceScheduledActionForRule the new object to create
     * @return the created DeviceComplianceScheduledActionForRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceScheduledActionForRule post(final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule) throws ClientException {
        return send(HttpMethod.POST, newDeviceComplianceScheduledActionForRule);
    }

    /**
     * Creates a DeviceComplianceScheduledActionForRule with a new object
     *
     * @param newDeviceComplianceScheduledActionForRule the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule, final ICallback<? super DeviceComplianceScheduledActionForRule> callback) {
        send(HttpMethod.PUT, callback, newDeviceComplianceScheduledActionForRule);
    }

    /**
     * Creates a DeviceComplianceScheduledActionForRule with a new object
     *
     * @param newDeviceComplianceScheduledActionForRule the object to create/update
     * @return the created DeviceComplianceScheduledActionForRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceScheduledActionForRule put(final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule) throws ClientException {
        return send(HttpMethod.PUT, newDeviceComplianceScheduledActionForRule);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceComplianceScheduledActionForRuleRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceComplianceScheduledActionForRuleRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceComplianceScheduledActionForRuleRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceComplianceScheduledActionForRuleRequest)this;
     }

}

