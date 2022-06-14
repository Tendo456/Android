// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookRangeBorder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderItemAtRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Border Item At Request.
 */
public interface IWorkbookRangeBorderItemAtRequest extends IHttpRequest {

    /**
     * Patches the WorkbookRangeBorderItemAt
     *
     * @param srcWorkbookRangeBorder the WorkbookRangeBorder with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    void patch(WorkbookRangeBorder srcWorkbookRangeBorder, final ICallback<? super WorkbookRangeBorder> callback);

    /**
     * Patches the WorkbookRangeBorderItemAt
     *
     * @param srcWorkbookRangeBorder the WorkbookRangeBorder with which to PATCH
     * @return the WorkbookRangeBorder
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookRangeBorder patch(WorkbookRangeBorder srcWorkbookRangeBorder) throws ClientException;

    /**
     * Puts the WorkbookRangeBorderItemAt
     *
     * @param srcWorkbookRangeBorder the WorkbookRangeBorder to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WorkbookRangeBorder srcWorkbookRangeBorder, final ICallback<? super WorkbookRangeBorder> callback);

    /**
     * Puts the WorkbookRangeBorderItemAt
     *
     * @param srcWorkbookRangeBorder the WorkbookRangeBorder to PUT
     * @return the WorkbookRangeBorder
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     WorkbookRangeBorder put(WorkbookRangeBorder srcWorkbookRangeBorder) throws ClientException;
    /**
     * Gets the WorkbookRangeBorder
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookRangeBorder> callback);

    /**
     * Gets the WorkbookRangeBorder
     *
     * @return the WorkbookRangeBorder
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookRangeBorder get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookRangeBorderItemAtRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookRangeBorderItemAtRequest expand(final String value);

}
