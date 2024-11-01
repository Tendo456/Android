// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMobileAppContentFileCommitRequest;
import com.microsoft.graph.requests.extensions.MobileAppContentFileCommitRequest;
import com.microsoft.graph.models.extensions.FileEncryptionInfo;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content File Commit Request Builder.
 */
public class MobileAppContentFileCommitRequestBuilder extends BaseActionRequestBuilder implements IMobileAppContentFileCommitRequestBuilder {

    /**
     * The request builder for this MobileAppContentFileCommit
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param fileEncryptionInfo the fileEncryptionInfo
     */
    public MobileAppContentFileCommitRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final FileEncryptionInfo fileEncryptionInfo) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("fileEncryptionInfo", fileEncryptionInfo);
    }

    /**
     * Creates the IMobileAppContentFileCommitRequest
     *
     * @param requestOptions the options for the request
     * @return the IMobileAppContentFileCommitRequest instance
     */
    public IMobileAppContentFileCommitRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IMobileAppContentFileCommitRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMobileAppContentFileCommitRequest instance
     */
    public IMobileAppContentFileCommitRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        MobileAppContentFileCommitRequest request = new MobileAppContentFileCommitRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("fileEncryptionInfo")) {
            request.body.fileEncryptionInfo = getParameter("fileEncryptionInfo");
        }

        return request;
    }
}
