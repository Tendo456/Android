// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.InferenceClassification;
import com.microsoft.graph.models.extensions.InferenceClassificationOverride;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IInferenceClassificationOverrideCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IInferenceClassificationOverrideRequestBuilder;
import com.microsoft.graph.requests.extensions.IInferenceClassificationOverrideCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Inference Classification Override Collection Request Builder.
 */
public class InferenceClassificationOverrideCollectionRequestBuilder extends BaseRequestBuilder implements IInferenceClassificationOverrideCollectionRequestBuilder {

    /**
     * The request builder for this collection of InferenceClassification
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InferenceClassificationOverrideCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IInferenceClassificationOverrideCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IInferenceClassificationOverrideCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new InferenceClassificationOverrideCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IInferenceClassificationOverrideRequestBuilder byId(final String id) {
        return new InferenceClassificationOverrideRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
