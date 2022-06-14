// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserDetailRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageUserDetailRequest;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Yammer Device Usage User Detail Request Builder.
 */
public class ReportRootGetYammerDeviceUsageUserDetailRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetYammerDeviceUsageUserDetailRequestBuilder {

    /**
     * The request builder for this ReportRootGetYammerDeviceUsageUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param date the date
     */
    public ReportRootGetYammerDeviceUsageUserDetailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.microsoft.graph.models.extensions.DateOnly date) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("date", date));
    }
    /**
     * The request builder for this ReportRootGetYammerDeviceUsageUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetYammerDeviceUsageUserDetailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetYammerDeviceUsageUserDetailRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetYammerDeviceUsageUserDetailRequest instance
     */
    public IReportRootGetYammerDeviceUsageUserDetailRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IReportRootGetYammerDeviceUsageUserDetailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetYammerDeviceUsageUserDetailRequest instance
     */
    public IReportRootGetYammerDeviceUsageUserDetailRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetYammerDeviceUsageUserDetailRequest request = new ReportRootGetYammerDeviceUsageUserDetailRequest(
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
