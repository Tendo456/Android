// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Claims Mapping Policy Collection With References Request.
 */
public class ClaimsMappingPolicyCollectionWithReferencesRequest extends BaseCollectionRequest<ClaimsMappingPolicyCollectionResponse, IClaimsMappingPolicyCollectionPage> implements IClaimsMappingPolicyCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of ClaimsMappingPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ClaimsMappingPolicyCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ClaimsMappingPolicyCollectionResponse.class, IClaimsMappingPolicyCollectionPage.class);
    }

    public void get(final ICallback<? super IClaimsMappingPolicyCollectionWithReferencesPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IClaimsMappingPolicyCollectionWithReferencesPage get() throws ClientException {
        final ClaimsMappingPolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IClaimsMappingPolicyCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    public IClaimsMappingPolicyCollectionWithReferencesRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    public IClaimsMappingPolicyCollectionWithReferencesRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    public IClaimsMappingPolicyCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    public IClaimsMappingPolicyCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    public IClaimsMappingPolicyCollectionWithReferencesPage buildFromResponse(final ClaimsMappingPolicyCollectionResponse response) {
        final IClaimsMappingPolicyCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ClaimsMappingPolicyCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ClaimsMappingPolicyCollectionWithReferencesPage page = new ClaimsMappingPolicyCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
