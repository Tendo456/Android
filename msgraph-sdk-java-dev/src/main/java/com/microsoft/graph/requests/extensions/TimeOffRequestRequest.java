// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TimeOffRequest;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Off Request Request.
 */
public class TimeOffRequestRequest extends BaseRequest implements ITimeOffRequestRequest {
	
    /**
     * The request for the TimeOffRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TimeOffRequestRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TimeOffRequest.class);
    }

    /**
     * Gets the TimeOffRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TimeOffRequest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TimeOffRequest from the service
     *
     * @return the TimeOffRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TimeOffRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TimeOffRequest> callback) {
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
     * Patches this TimeOffRequest with a source
     *
     * @param sourceTimeOffRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TimeOffRequest sourceTimeOffRequest, final ICallback<? super TimeOffRequest> callback) {
        send(HttpMethod.PATCH, callback, sourceTimeOffRequest);
    }

    /**
     * Patches this TimeOffRequest with a source
     *
     * @param sourceTimeOffRequest the source object with updates
     * @return the updated TimeOffRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TimeOffRequest patch(final TimeOffRequest sourceTimeOffRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceTimeOffRequest);
    }

    /**
     * Creates a TimeOffRequest with a new object
     *
     * @param newTimeOffRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TimeOffRequest newTimeOffRequest, final ICallback<? super TimeOffRequest> callback) {
        send(HttpMethod.POST, callback, newTimeOffRequest);
    }

    /**
     * Creates a TimeOffRequest with a new object
     *
     * @param newTimeOffRequest the new object to create
     * @return the created TimeOffRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TimeOffRequest post(final TimeOffRequest newTimeOffRequest) throws ClientException {
        return send(HttpMethod.POST, newTimeOffRequest);
    }

    /**
     * Creates a TimeOffRequest with a new object
     *
     * @param newTimeOffRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TimeOffRequest newTimeOffRequest, final ICallback<? super TimeOffRequest> callback) {
        send(HttpMethod.PUT, callback, newTimeOffRequest);
    }

    /**
     * Creates a TimeOffRequest with a new object
     *
     * @param newTimeOffRequest the object to create/update
     * @return the created TimeOffRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TimeOffRequest put(final TimeOffRequest newTimeOffRequest) throws ClientException {
        return send(HttpMethod.PUT, newTimeOffRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITimeOffRequestRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TimeOffRequestRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITimeOffRequestRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TimeOffRequestRequest)this;
     }

}

