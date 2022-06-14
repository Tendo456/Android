// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityUserDetailRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get One Drive Activity User Detail Request.
 */
public interface IReportRootGetOneDriveActivityUserDetailRequest extends IHttpRequest {

    /**
     * Patches the ReportRootGetOneDriveActivityUserDetail
     *
     * @param srcReport the Report with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    void patch(Report srcReport, final ICallback<? super Report> callback);

    /**
     * Patches the ReportRootGetOneDriveActivityUserDetail
     *
     * @param srcReport the Report with which to PATCH
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Report patch(Report srcReport) throws ClientException;

    /**
     * Puts the ReportRootGetOneDriveActivityUserDetail
     *
     * @param srcReport the Report to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(Report srcReport, final ICallback<? super Report> callback);

    /**
     * Puts the ReportRootGetOneDriveActivityUserDetail
     *
     * @param srcReport the Report to PUT
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     Report put(Report srcReport) throws ClientException;
    /**
     * Gets the Report
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Report> callback);

    /**
     * Gets the Report
     *
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Report get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IReportRootGetOneDriveActivityUserDetailRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IReportRootGetOneDriveActivityUserDetailRequest expand(final String value);

}
