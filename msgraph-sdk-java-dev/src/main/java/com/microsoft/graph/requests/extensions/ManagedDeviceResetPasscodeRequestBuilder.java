// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceResetPasscodeRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceResetPasscodeRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Reset Passcode Request Builder.
 */
public class ManagedDeviceResetPasscodeRequestBuilder extends BaseActionRequestBuilder implements IManagedDeviceResetPasscodeRequestBuilder {

    /**
     * The request builder for this ManagedDeviceResetPasscode
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceResetPasscodeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IManagedDeviceResetPasscodeRequest
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceResetPasscodeRequest instance
     */
    public IManagedDeviceResetPasscodeRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IManagedDeviceResetPasscodeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceResetPasscodeRequest instance
     */
    public IManagedDeviceResetPasscodeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedDeviceResetPasscodeRequest request = new ManagedDeviceResetPasscodeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
