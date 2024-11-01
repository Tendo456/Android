// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorSyncRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorSyncRequest;
import com.microsoft.graph.models.generated.DeviceManagementExchangeConnectorSyncType;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Exchange Connector Sync Request Builder.
 */
public class DeviceManagementExchangeConnectorSyncRequestBuilder extends BaseActionRequestBuilder implements IDeviceManagementExchangeConnectorSyncRequestBuilder {

    /**
     * The request builder for this DeviceManagementExchangeConnectorSync
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param syncType the syncType
     */
    public DeviceManagementExchangeConnectorSyncRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final DeviceManagementExchangeConnectorSyncType syncType) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("syncType", syncType);
    }

    /**
     * Creates the IDeviceManagementExchangeConnectorSyncRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementExchangeConnectorSyncRequest instance
     */
    public IDeviceManagementExchangeConnectorSyncRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IDeviceManagementExchangeConnectorSyncRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementExchangeConnectorSyncRequest instance
     */
    public IDeviceManagementExchangeConnectorSyncRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementExchangeConnectorSyncRequest request = new DeviceManagementExchangeConnectorSyncRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("syncType")) {
            request.body.syncType = getParameter("syncType");
        }

        return request;
    }
}
