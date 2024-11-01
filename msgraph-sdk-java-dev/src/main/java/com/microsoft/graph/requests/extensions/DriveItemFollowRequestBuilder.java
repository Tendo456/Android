// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDriveItemFollowRequest;
import com.microsoft.graph.requests.extensions.DriveItemFollowRequest;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Follow Request Builder.
 */
public class DriveItemFollowRequestBuilder extends BaseActionRequestBuilder implements IDriveItemFollowRequestBuilder {

    /**
     * The request builder for this DriveItemFollow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemFollowRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IDriveItemFollowRequest
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemFollowRequest instance
     */
    public IDriveItemFollowRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IDriveItemFollowRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemFollowRequest instance
     */
    public IDriveItemFollowRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DriveItemFollowRequest request = new DriveItemFollowRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
