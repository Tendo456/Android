// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtection;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Worksheet Protection Request.
 */
public interface IWorkbookWorksheetProtectionRequest extends IHttpRequest {

    /**
     * Gets the WorkbookWorksheetProtection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookWorksheetProtection> callback);

    /**
     * Gets the WorkbookWorksheetProtection from the service
     *
     * @return the WorkbookWorksheetProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookWorksheetProtection get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WorkbookWorksheetProtection> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookWorksheetProtection with a source
     *
     * @param sourceWorkbookWorksheetProtection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookWorksheetProtection sourceWorkbookWorksheetProtection, final ICallback<? super WorkbookWorksheetProtection> callback);

    /**
     * Patches this WorkbookWorksheetProtection with a source
     *
     * @param sourceWorkbookWorksheetProtection the source object with updates
     * @return the updated WorkbookWorksheetProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookWorksheetProtection patch(final WorkbookWorksheetProtection sourceWorkbookWorksheetProtection) throws ClientException;

    /**
     * Posts a WorkbookWorksheetProtection with a new object
     *
     * @param newWorkbookWorksheetProtection the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookWorksheetProtection newWorkbookWorksheetProtection, final ICallback<? super WorkbookWorksheetProtection> callback);

    /**
     * Posts a WorkbookWorksheetProtection with a new object
     *
     * @param newWorkbookWorksheetProtection the new object to create
     * @return the created WorkbookWorksheetProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookWorksheetProtection post(final WorkbookWorksheetProtection newWorkbookWorksheetProtection) throws ClientException;

    /**
     * Posts a WorkbookWorksheetProtection with a new object
     *
     * @param newWorkbookWorksheetProtection the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WorkbookWorksheetProtection newWorkbookWorksheetProtection, final ICallback<? super WorkbookWorksheetProtection> callback);

    /**
     * Posts a WorkbookWorksheetProtection with a new object
     *
     * @param newWorkbookWorksheetProtection the object to create/update
     * @return the created WorkbookWorksheetProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookWorksheetProtection put(final WorkbookWorksheetProtection newWorkbookWorksheetProtection) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookWorksheetProtectionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookWorksheetProtectionRequest expand(final String value);

}

