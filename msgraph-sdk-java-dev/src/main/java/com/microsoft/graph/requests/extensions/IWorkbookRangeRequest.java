// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookRange;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Request.
 */
public interface IWorkbookRangeRequest extends IHttpRequest {

    /**
     * Gets the WorkbookRange from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookRange> callback);

    /**
     * Gets the WorkbookRange from the service
     *
     * @return the WorkbookRange from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookRange get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WorkbookRange> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookRange with a source
     *
     * @param sourceWorkbookRange the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookRange sourceWorkbookRange, final ICallback<? super WorkbookRange> callback);

    /**
     * Patches this WorkbookRange with a source
     *
     * @param sourceWorkbookRange the source object with updates
     * @return the updated WorkbookRange
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookRange patch(final WorkbookRange sourceWorkbookRange) throws ClientException;

    /**
     * Posts a WorkbookRange with a new object
     *
     * @param newWorkbookRange the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookRange newWorkbookRange, final ICallback<? super WorkbookRange> callback);

    /**
     * Posts a WorkbookRange with a new object
     *
     * @param newWorkbookRange the new object to create
     * @return the created WorkbookRange
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookRange post(final WorkbookRange newWorkbookRange) throws ClientException;

    /**
     * Posts a WorkbookRange with a new object
     *
     * @param newWorkbookRange the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WorkbookRange newWorkbookRange, final ICallback<? super WorkbookRange> callback);

    /**
     * Posts a WorkbookRange with a new object
     *
     * @param newWorkbookRange the object to create/update
     * @return the created WorkbookRange
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookRange put(final WorkbookRange newWorkbookRange) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookRangeRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookRangeRequest expand(final String value);

}

