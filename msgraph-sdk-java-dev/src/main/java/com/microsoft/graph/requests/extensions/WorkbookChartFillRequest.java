// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartFill;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Fill Request.
 */
public class WorkbookChartFillRequest extends BaseRequest implements IWorkbookChartFillRequest {
	
    /**
     * The request for the WorkbookChartFill
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartFillRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartFill.class);
    }

    /**
     * Gets the WorkbookChartFill from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookChartFill> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartFill from the service
     *
     * @return the WorkbookChartFill from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartFill get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookChartFill> callback) {
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
     * Patches this WorkbookChartFill with a source
     *
     * @param sourceWorkbookChartFill the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartFill sourceWorkbookChartFill, final ICallback<? super WorkbookChartFill> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartFill);
    }

    /**
     * Patches this WorkbookChartFill with a source
     *
     * @param sourceWorkbookChartFill the source object with updates
     * @return the updated WorkbookChartFill
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartFill patch(final WorkbookChartFill sourceWorkbookChartFill) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartFill);
    }

    /**
     * Creates a WorkbookChartFill with a new object
     *
     * @param newWorkbookChartFill the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartFill newWorkbookChartFill, final ICallback<? super WorkbookChartFill> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartFill);
    }

    /**
     * Creates a WorkbookChartFill with a new object
     *
     * @param newWorkbookChartFill the new object to create
     * @return the created WorkbookChartFill
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartFill post(final WorkbookChartFill newWorkbookChartFill) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartFill);
    }

    /**
     * Creates a WorkbookChartFill with a new object
     *
     * @param newWorkbookChartFill the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookChartFill newWorkbookChartFill, final ICallback<? super WorkbookChartFill> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartFill);
    }

    /**
     * Creates a WorkbookChartFill with a new object
     *
     * @param newWorkbookChartFill the object to create/update
     * @return the created WorkbookChartFill
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartFill put(final WorkbookChartFill newWorkbookChartFill) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartFill);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookChartFillRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookChartFillRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookChartFillRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookChartFillRequest)this;
     }

}

