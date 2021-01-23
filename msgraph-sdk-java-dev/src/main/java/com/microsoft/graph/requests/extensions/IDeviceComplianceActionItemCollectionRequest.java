// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.models.extensions.DeviceComplianceActionItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Action Item Collection Request.
 */
public interface IDeviceComplianceActionItemCollectionRequest extends IHttpRequest {

    void get(final ICallback<? super IDeviceComplianceActionItemCollectionPage> callback);

    IDeviceComplianceActionItemCollectionPage get() throws ClientException;

    void post(final DeviceComplianceActionItem newDeviceComplianceActionItem, final ICallback<? super DeviceComplianceActionItem> callback);

    DeviceComplianceActionItem post(final DeviceComplianceActionItem newDeviceComplianceActionItem) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceComplianceActionItemCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    IDeviceComplianceActionItemCollectionRequest filter(final String value);

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    IDeviceComplianceActionItemCollectionRequest orderBy(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceComplianceActionItemCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDeviceComplianceActionItemCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IDeviceComplianceActionItemCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IDeviceComplianceActionItemCollectionRequest skipToken(final String skipToken);
}