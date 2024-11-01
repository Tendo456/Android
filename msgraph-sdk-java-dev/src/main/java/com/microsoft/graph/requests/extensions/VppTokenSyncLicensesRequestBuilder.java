// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IVppTokenSyncLicensesRequest;
import com.microsoft.graph.requests.extensions.VppTokenSyncLicensesRequest;
import com.microsoft.graph.models.extensions.VppToken;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpp Token Sync Licenses Request Builder.
 */
public class VppTokenSyncLicensesRequestBuilder extends BaseActionRequestBuilder implements IVppTokenSyncLicensesRequestBuilder {

    /**
     * The request builder for this VppTokenSyncLicenses
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public VppTokenSyncLicensesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IVppTokenSyncLicensesRequest
     *
     * @param requestOptions the options for the request
     * @return the IVppTokenSyncLicensesRequest instance
     */
    public IVppTokenSyncLicensesRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IVppTokenSyncLicensesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IVppTokenSyncLicensesRequest instance
     */
    public IVppTokenSyncLicensesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        VppTokenSyncLicensesRequest request = new VppTokenSyncLicensesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
