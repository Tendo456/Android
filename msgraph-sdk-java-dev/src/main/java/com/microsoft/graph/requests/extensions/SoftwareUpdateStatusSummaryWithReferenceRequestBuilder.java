// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SoftwareUpdateStatusSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Software Update Status Summary With Reference Request Builder.
 */
public class SoftwareUpdateStatusSummaryWithReferenceRequestBuilder extends BaseRequestBuilder implements ISoftwareUpdateStatusSummaryWithReferenceRequestBuilder {

    /**
     * The request builder for the SoftwareUpdateStatusSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SoftwareUpdateStatusSummaryWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISoftwareUpdateStatusSummaryWithReferenceRequest instance
     */
    public ISoftwareUpdateStatusSummaryWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the ISoftwareUpdateStatusSummaryWithReferenceRequest instance
     */
    public ISoftwareUpdateStatusSummaryWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new SoftwareUpdateStatusSummaryWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ISoftwareUpdateStatusSummaryReferenceRequestBuilder reference(){
        return new SoftwareUpdateStatusSummaryReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
