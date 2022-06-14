// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OfficeGraphInsights;
import com.microsoft.graph.requests.extensions.ISharedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedInsightRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedInsightRequestBuilder;
import com.microsoft.graph.requests.extensions.ITrendingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITrendingRequestBuilder;
import com.microsoft.graph.requests.extensions.TrendingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TrendingRequestBuilder;
import com.microsoft.graph.requests.extensions.IUsedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUsedInsightRequestBuilder;
import com.microsoft.graph.requests.extensions.UsedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UsedInsightRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Graph Insights Request Builder.
 */
public class OfficeGraphInsightsRequestBuilder extends BaseRequestBuilder implements IOfficeGraphInsightsRequestBuilder {

    /**
     * The request builder for the OfficeGraphInsights
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OfficeGraphInsightsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IOfficeGraphInsightsRequest instance
     */
    public IOfficeGraphInsightsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IOfficeGraphInsightsRequest instance
     */
    public IOfficeGraphInsightsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.OfficeGraphInsightsRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ISharedInsightCollectionRequestBuilder shared() {
        return new SharedInsightCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("shared"), getClient(), null);
    }

    public ISharedInsightRequestBuilder shared(final String id) {
        return new SharedInsightRequestBuilder(getRequestUrlWithAdditionalSegment("shared") + "/" + id, getClient(), null);
    }
    public ITrendingCollectionRequestBuilder trending() {
        return new TrendingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("trending"), getClient(), null);
    }

    public ITrendingRequestBuilder trending(final String id) {
        return new TrendingRequestBuilder(getRequestUrlWithAdditionalSegment("trending") + "/" + id, getClient(), null);
    }
    public IUsedInsightCollectionRequestBuilder used() {
        return new UsedInsightCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("used"), getClient(), null);
    }

    public IUsedInsightRequestBuilder used(final String id) {
        return new UsedInsightRequestBuilder(getRequestUrlWithAdditionalSegment("used") + "/" + id, getClient(), null);
    }
}
