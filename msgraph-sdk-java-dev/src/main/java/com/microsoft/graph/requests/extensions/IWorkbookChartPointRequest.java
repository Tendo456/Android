// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChartPoint;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Point Request.
 */
public interface IWorkbookChartPointRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartPoint from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookChartPoint> callback);

    /**
     * Gets the WorkbookChartPoint from the service
     *
     * @return the WorkbookChartPoint from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartPoint get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WorkbookChartPoint> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookChartPoint with a source
     *
     * @param sourceWorkbookChartPoint the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookChartPoint sourceWorkbookChartPoint, final ICallback<? super WorkbookChartPoint> callback);

    /**
     * Patches this WorkbookChartPoint with a source
     *
     * @param sourceWorkbookChartPoint the source object with updates
     * @return the updated WorkbookChartPoint
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartPoint patch(final WorkbookChartPoint sourceWorkbookChartPoint) throws ClientException;

    /**
     * Posts a WorkbookChartPoint with a new object
     *
     * @param newWorkbookChartPoint the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookChartPoint newWorkbookChartPoint, final ICallback<? super WorkbookChartPoint> callback);

    /**
     * Posts a WorkbookChartPoint with a new object
     *
     * @param newWorkbookChartPoint the new object to create
     * @return the created WorkbookChartPoint
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartPoint post(final WorkbookChartPoint newWorkbookChartPoint) throws ClientException;

    /**
     * Posts a WorkbookChartPoint with a new object
     *
     * @param newWorkbookChartPoint the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WorkbookChartPoint newWorkbookChartPoint, final ICallback<? super WorkbookChartPoint> callback);

    /**
     * Posts a WorkbookChartPoint with a new object
     *
     * @param newWorkbookChartPoint the object to create/update
     * @return the created WorkbookChartPoint
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartPoint put(final WorkbookChartPoint newWorkbookChartPoint) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartPointRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartPointRequest expand(final String value);

}

