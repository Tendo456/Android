// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IApplicationRemovePasswordRequest;
import com.microsoft.graph.requests.extensions.ApplicationRemovePasswordRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Remove Password Request Builder.
 */
public class ApplicationRemovePasswordRequestBuilder extends BaseActionRequestBuilder implements IApplicationRemovePasswordRequestBuilder {

    /**
     * The request builder for this ApplicationRemovePassword
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param keyId the keyId
     */
    public ApplicationRemovePasswordRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.UUID keyId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("keyId", keyId);
    }

    /**
     * Creates the IApplicationRemovePasswordRequest
     *
     * @param requestOptions the options for the request
     * @return the IApplicationRemovePasswordRequest instance
     */
    public IApplicationRemovePasswordRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IApplicationRemovePasswordRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IApplicationRemovePasswordRequest instance
     */
    public IApplicationRemovePasswordRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ApplicationRemovePasswordRequest request = new ApplicationRemovePasswordRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("keyId")) {
            request.body.keyId = getParameter("keyId");
        }

        return request;
    }
}
