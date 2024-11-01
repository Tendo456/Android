// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.requests.extensions.IPlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanDetailsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Plan Request Builder.
 */
public class PlannerPlanRequestBuilder extends BaseRequestBuilder implements IPlannerPlanRequestBuilder {

    /**
     * The request builder for the PlannerPlan
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerPlanRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPlannerPlanRequest instance
     */
    public IPlannerPlanRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPlannerPlanRequest instance
     */
    public IPlannerPlanRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PlannerPlanRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IPlannerBucketCollectionRequestBuilder buckets() {
        return new PlannerBucketCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("buckets"), getClient(), null);
    }

    public IPlannerBucketRequestBuilder buckets(final String id) {
        return new PlannerBucketRequestBuilder(getRequestUrlWithAdditionalSegment("buckets") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for PlannerPlanDetails
     *
     * @return the IPlannerPlanDetailsRequestBuilder instance
     */
    public IPlannerPlanDetailsRequestBuilder details() {
        return new PlannerPlanDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("details"), getClient(), null);
    }
    public IPlannerTaskCollectionRequestBuilder tasks() {
        return new PlannerTaskCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tasks"), getClient(), null);
    }

    public IPlannerTaskRequestBuilder tasks(final String id) {
        return new PlannerTaskRequestBuilder(getRequestUrlWithAdditionalSegment("tasks") + "/" + id, getClient(), null);
    }
}
