// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationsUserCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationsUserCountsRequest;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Activations User Counts Request Builder.
 */
public class ReportRootGetOffice365ActivationsUserCountsRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetOffice365ActivationsUserCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetOffice365ActivationsUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOffice365ActivationsUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IReportRootGetOffice365ActivationsUserCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOffice365ActivationsUserCountsRequest instance
     */
    public IReportRootGetOffice365ActivationsUserCountsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IReportRootGetOffice365ActivationsUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetOffice365ActivationsUserCountsRequest instance
     */
    public IReportRootGetOffice365ActivationsUserCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetOffice365ActivationsUserCountsRequest request = new ReportRootGetOffice365ActivationsUserCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
