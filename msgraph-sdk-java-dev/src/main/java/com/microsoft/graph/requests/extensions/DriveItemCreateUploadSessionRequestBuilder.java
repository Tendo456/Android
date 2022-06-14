// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDriveItemCreateUploadSessionRequest;
import com.microsoft.graph.requests.extensions.DriveItemCreateUploadSessionRequest;
import com.microsoft.graph.models.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.models.extensions.UploadSession;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Create Upload Session Request Builder.
 */
public class DriveItemCreateUploadSessionRequestBuilder extends BaseActionRequestBuilder implements IDriveItemCreateUploadSessionRequestBuilder {

    /**
     * The request builder for this DriveItemCreateUploadSession
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param item the item
     */
    public DriveItemCreateUploadSessionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final DriveItemUploadableProperties item) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("item", item);
    }

    /**
     * Creates the IDriveItemCreateUploadSessionRequest
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemCreateUploadSessionRequest instance
     */
    public IDriveItemCreateUploadSessionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IDriveItemCreateUploadSessionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemCreateUploadSessionRequest instance
     */
    public IDriveItemCreateUploadSessionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DriveItemCreateUploadSessionRequest request = new DriveItemCreateUploadSessionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("item")) {
            request.body.item = getParameter("item");
        }

        return request;
    }
}
