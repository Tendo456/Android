// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookNamedItem;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Named Item Request.
 */
public class WorkbookNamedItemRequest extends BaseRequest implements IWorkbookNamedItemRequest {
	
    /**
     * The request for the WorkbookNamedItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookNamedItemRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookNamedItem.class);
    }

    /**
     * Gets the WorkbookNamedItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookNamedItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookNamedItem from the service
     *
     * @return the WorkbookNamedItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookNamedItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookNamedItem> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookNamedItem with a source
     *
     * @param sourceWorkbookNamedItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookNamedItem sourceWorkbookNamedItem, final ICallback<? super WorkbookNamedItem> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookNamedItem);
    }

    /**
     * Patches this WorkbookNamedItem with a source
     *
     * @param sourceWorkbookNamedItem the source object with updates
     * @return the updated WorkbookNamedItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookNamedItem patch(final WorkbookNamedItem sourceWorkbookNamedItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookNamedItem);
    }

    /**
     * Creates a WorkbookNamedItem with a new object
     *
     * @param newWorkbookNamedItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookNamedItem newWorkbookNamedItem, final ICallback<? super WorkbookNamedItem> callback) {
        send(HttpMethod.POST, callback, newWorkbookNamedItem);
    }

    /**
     * Creates a WorkbookNamedItem with a new object
     *
     * @param newWorkbookNamedItem the new object to create
     * @return the created WorkbookNamedItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookNamedItem post(final WorkbookNamedItem newWorkbookNamedItem) throws ClientException {
        return send(HttpMethod.POST, newWorkbookNamedItem);
    }

    /**
     * Creates a WorkbookNamedItem with a new object
     *
     * @param newWorkbookNamedItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookNamedItem newWorkbookNamedItem, final ICallback<? super WorkbookNamedItem> callback) {
        send(HttpMethod.PUT, callback, newWorkbookNamedItem);
    }

    /**
     * Creates a WorkbookNamedItem with a new object
     *
     * @param newWorkbookNamedItem the object to create/update
     * @return the created WorkbookNamedItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookNamedItem put(final WorkbookNamedItem newWorkbookNamedItem) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookNamedItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookNamedItemRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookNamedItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookNamedItemRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookNamedItemRequest)this;
     }

}

