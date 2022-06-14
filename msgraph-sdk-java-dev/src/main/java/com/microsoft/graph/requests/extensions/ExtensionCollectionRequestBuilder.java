// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TodoTask;
import com.microsoft.graph.models.extensions.Extension;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Extension Collection Request Builder.
 */
public class ExtensionCollectionRequestBuilder extends BaseRequestBuilder implements IExtensionCollectionRequestBuilder {

    /**
     * The request builder for this collection of TodoTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExtensionCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IExtensionCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IExtensionCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ExtensionCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IExtensionRequestBuilder byId(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
