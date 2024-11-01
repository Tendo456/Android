// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookRangeFill;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Fill Request.
 */
public class WorkbookRangeFillRequest extends BaseRequest implements IWorkbookRangeFillRequest {
	
    /**
     * The request for the WorkbookRangeFill
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeFillRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRangeFill.class);
    }

    /**
     * Gets the WorkbookRangeFill from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookRangeFill> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRangeFill from the service
     *
     * @return the WorkbookRangeFill from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRangeFill get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookRangeFill> callback) {
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
     * Patches this WorkbookRangeFill with a source
     *
     * @param sourceWorkbookRangeFill the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookRangeFill sourceWorkbookRangeFill, final ICallback<? super WorkbookRangeFill> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookRangeFill);
    }

    /**
     * Patches this WorkbookRangeFill with a source
     *
     * @param sourceWorkbookRangeFill the source object with updates
     * @return the updated WorkbookRangeFill
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRangeFill patch(final WorkbookRangeFill sourceWorkbookRangeFill) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookRangeFill);
    }

    /**
     * Creates a WorkbookRangeFill with a new object
     *
     * @param newWorkbookRangeFill the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookRangeFill newWorkbookRangeFill, final ICallback<? super WorkbookRangeFill> callback) {
        send(HttpMethod.POST, callback, newWorkbookRangeFill);
    }

    /**
     * Creates a WorkbookRangeFill with a new object
     *
     * @param newWorkbookRangeFill the new object to create
     * @return the created WorkbookRangeFill
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRangeFill post(final WorkbookRangeFill newWorkbookRangeFill) throws ClientException {
        return send(HttpMethod.POST, newWorkbookRangeFill);
    }

    /**
     * Creates a WorkbookRangeFill with a new object
     *
     * @param newWorkbookRangeFill the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookRangeFill newWorkbookRangeFill, final ICallback<? super WorkbookRangeFill> callback) {
        send(HttpMethod.PUT, callback, newWorkbookRangeFill);
    }

    /**
     * Creates a WorkbookRangeFill with a new object
     *
     * @param newWorkbookRangeFill the object to create/update
     * @return the created WorkbookRangeFill
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRangeFill put(final WorkbookRangeFill newWorkbookRangeFill) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookRangeFill);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookRangeFillRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookRangeFillRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookRangeFillRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookRangeFillRequest)this;
     }

}

