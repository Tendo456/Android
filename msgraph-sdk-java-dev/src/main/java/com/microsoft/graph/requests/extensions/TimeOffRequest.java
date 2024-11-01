// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TimeOff;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Off Request.
 */
public class TimeOffRequest extends BaseRequest implements ITimeOffRequest {
	
    /**
     * The request for the TimeOff
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TimeOffRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TimeOff.class);
    }

    /**
     * Gets the TimeOff from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TimeOff> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TimeOff from the service
     *
     * @return the TimeOff from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TimeOff get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TimeOff> callback) {
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
     * Patches this TimeOff with a source
     *
     * @param sourceTimeOff the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TimeOff sourceTimeOff, final ICallback<? super TimeOff> callback) {
        send(HttpMethod.PATCH, callback, sourceTimeOff);
    }

    /**
     * Patches this TimeOff with a source
     *
     * @param sourceTimeOff the source object with updates
     * @return the updated TimeOff
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TimeOff patch(final TimeOff sourceTimeOff) throws ClientException {
        return send(HttpMethod.PATCH, sourceTimeOff);
    }

    /**
     * Creates a TimeOff with a new object
     *
     * @param newTimeOff the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TimeOff newTimeOff, final ICallback<? super TimeOff> callback) {
        send(HttpMethod.POST, callback, newTimeOff);
    }

    /**
     * Creates a TimeOff with a new object
     *
     * @param newTimeOff the new object to create
     * @return the created TimeOff
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TimeOff post(final TimeOff newTimeOff) throws ClientException {
        return send(HttpMethod.POST, newTimeOff);
    }

    /**
     * Creates a TimeOff with a new object
     *
     * @param newTimeOff the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TimeOff newTimeOff, final ICallback<? super TimeOff> callback) {
        send(HttpMethod.PUT, callback, newTimeOff);
    }

    /**
     * Creates a TimeOff with a new object
     *
     * @param newTimeOff the object to create/update
     * @return the created TimeOff
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TimeOff put(final TimeOff newTimeOff) throws ClientException {
        return send(HttpMethod.PUT, newTimeOff);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITimeOffRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TimeOffRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITimeOffRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TimeOffRequest)this;
     }

}

