// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageStorageRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageStorageRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get One Drive Usage Storage Request.
 */
public class ReportRootGetOneDriveUsageStorageRequest extends BaseRequest implements IReportRootGetOneDriveUsageStorageRequest {

    /**
     * The request for this ReportRootGetOneDriveUsageStorage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOneDriveUsageStorageRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Report.class);
    }

    /**
     * Patches the ReportRootGetOneDriveUsageStorage
     * @param srcReport the Report with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(Report srcReport, final ICallback<? super Report> callback) {
        send(HttpMethod.PATCH, callback, srcReport);
    }

    /**
     * Patches the ReportRootGetOneDriveUsageStorage
     *
     * @param srcReport the Report with which to PATCH
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public Report patch(Report srcReport) throws ClientException {
        return this.send(HttpMethod.PATCH, srcReport);
    }

    /**
     * Puts the ReportRootGetOneDriveUsageStorage
     *
     * @param srcReport the Report to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(Report srcReport, final ICallback<? super Report> callback) {
        send(HttpMethod.PUT, callback, srcReport);
    }

    /**
     * Puts the ReportRootGetOneDriveUsageStorage
     *
     * @param srcReport the Report to PUT
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public Report put(Report srcReport) throws ClientException {
        return this.send(HttpMethod.PUT, srcReport);
    }
    /**
     * Gets the Report
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Report> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Report
     *
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Report get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetOneDriveUsageStorageRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ReportRootGetOneDriveUsageStorageRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetOneDriveUsageStorageRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ReportRootGetOneDriveUsageStorageRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IReportRootGetOneDriveUsageStorageRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ReportRootGetOneDriveUsageStorageRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IReportRootGetOneDriveUsageStorageRequest orderBy(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ReportRootGetOneDriveUsageStorageRequest)this;
    }

}
