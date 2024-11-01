// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppContent;
import com.microsoft.graph.models.extensions.MobileAppContentFile;
import com.microsoft.graph.models.extensions.FileEncryptionInfo;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IMobileAppContentFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppContentFileRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppContentFileCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content File Collection Request Builder.
 */
public class MobileAppContentFileCollectionRequestBuilder extends BaseRequestBuilder implements IMobileAppContentFileCollectionRequestBuilder {

    /**
     * The request builder for this collection of MobileAppContent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppContentFileCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IMobileAppContentFileCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IMobileAppContentFileCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new MobileAppContentFileCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMobileAppContentFileRequestBuilder byId(final String id) {
        return new MobileAppContentFileRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
