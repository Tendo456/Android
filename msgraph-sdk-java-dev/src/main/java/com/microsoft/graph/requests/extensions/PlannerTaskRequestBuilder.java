// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerTask;
import com.microsoft.graph.requests.extensions.IPlannerAssignedToTaskBoardTaskFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerAssignedToTaskBoardTaskFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketTaskBoardTaskFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerBucketTaskBoardTaskFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerProgressTaskBoardTaskFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerProgressTaskBoardTaskFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Task Request Builder.
 */
public class PlannerTaskRequestBuilder extends BaseRequestBuilder implements IPlannerTaskRequestBuilder {

    /**
     * The request builder for the PlannerTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerTaskRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPlannerTaskRequest instance
     */
    public IPlannerTaskRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPlannerTaskRequest instance
     */
    public IPlannerTaskRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PlannerTaskRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for PlannerAssignedToTaskBoardTaskFormat
     *
     * @return the IPlannerAssignedToTaskBoardTaskFormatRequestBuilder instance
     */
    public IPlannerAssignedToTaskBoardTaskFormatRequestBuilder assignedToTaskBoardFormat() {
        return new PlannerAssignedToTaskBoardTaskFormatRequestBuilder(getRequestUrlWithAdditionalSegment("assignedToTaskBoardFormat"), getClient(), null);
    }

    /**
     * Gets the request builder for PlannerBucketTaskBoardTaskFormat
     *
     * @return the IPlannerBucketTaskBoardTaskFormatRequestBuilder instance
     */
    public IPlannerBucketTaskBoardTaskFormatRequestBuilder bucketTaskBoardFormat() {
        return new PlannerBucketTaskBoardTaskFormatRequestBuilder(getRequestUrlWithAdditionalSegment("bucketTaskBoardFormat"), getClient(), null);
    }

    /**
     * Gets the request builder for PlannerTaskDetails
     *
     * @return the IPlannerTaskDetailsRequestBuilder instance
     */
    public IPlannerTaskDetailsRequestBuilder details() {
        return new PlannerTaskDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("details"), getClient(), null);
    }

    /**
     * Gets the request builder for PlannerProgressTaskBoardTaskFormat
     *
     * @return the IPlannerProgressTaskBoardTaskFormatRequestBuilder instance
     */
    public IPlannerProgressTaskBoardTaskFormatRequestBuilder progressTaskBoardFormat() {
        return new PlannerProgressTaskBoardTaskFormatRequestBuilder(getRequestUrlWithAdditionalSegment("progressTaskBoardFormat"), getClient(), null);
    }
}
