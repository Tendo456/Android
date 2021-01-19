// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequest;
import com.microsoft.graph.requests.extensions.ISiteAddCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRemoveCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Collection Request Builder.
 */
public class SiteCollectionRequestBuilder extends BaseRequestBuilder implements ISiteCollectionRequestBuilder {

    /**
     * The request builder for this collection of Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ISiteCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ISiteCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new SiteCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ISiteRequestBuilder byId(final String id) {
        return new SiteRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public ISiteAddCollectionRequestBuilder add(final java.util.List<Site> value) {
        return new SiteAddCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.add"), getClient(), null, value);
    }

    public ISiteRemoveCollectionRequestBuilder remove(final java.util.List<Site> value) {
        return new SiteRemoveCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.remove"), getClient(), null, value);
    }
}
