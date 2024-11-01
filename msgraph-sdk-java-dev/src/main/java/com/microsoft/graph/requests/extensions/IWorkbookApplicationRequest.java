// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookApplication;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Application Request.
 */
public interface IWorkbookApplicationRequest extends IHttpRequest {

    /**
     * Gets the WorkbookApplication from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookApplication> callback);

    /**
     * Gets the WorkbookApplication from the service
     *
     * @return the WorkbookApplication from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookApplication get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WorkbookApplication> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookApplication with a source
     *
     * @param sourceWorkbookApplication the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookApplication sourceWorkbookApplication, final ICallback<? super WorkbookApplication> callback);

    /**
     * Patches this WorkbookApplication with a source
     *
     * @param sourceWorkbookApplication the source object with updates
     * @return the updated WorkbookApplication
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookApplication patch(final WorkbookApplication sourceWorkbookApplication) throws ClientException;

    /**
     * Posts a WorkbookApplication with a new object
     *
     * @param newWorkbookApplication the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookApplication newWorkbookApplication, final ICallback<? super WorkbookApplication> callback);

    /**
     * Posts a WorkbookApplication with a new object
     *
     * @param newWorkbookApplication the new object to create
     * @return the created WorkbookApplication
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookApplication post(final WorkbookApplication newWorkbookApplication) throws ClientException;

    /**
     * Posts a WorkbookApplication with a new object
     *
     * @param newWorkbookApplication the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WorkbookApplication newWorkbookApplication, final ICallback<? super WorkbookApplication> callback);

    /**
     * Posts a WorkbookApplication with a new object
     *
     * @param newWorkbookApplication the object to create/update
     * @return the created WorkbookApplication
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookApplication put(final WorkbookApplication newWorkbookApplication) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookApplicationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookApplicationRequest expand(final String value);

}

