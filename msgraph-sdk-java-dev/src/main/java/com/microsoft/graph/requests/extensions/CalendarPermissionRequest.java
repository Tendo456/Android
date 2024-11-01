// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CalendarPermission;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Permission Request.
 */
public class CalendarPermissionRequest extends BaseRequest implements ICalendarPermissionRequest {
	
    /**
     * The request for the CalendarPermission
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarPermissionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CalendarPermission.class);
    }

    /**
     * Gets the CalendarPermission from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super CalendarPermission> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the CalendarPermission from the service
     *
     * @return the CalendarPermission from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CalendarPermission get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super CalendarPermission> callback) {
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
     * Patches this CalendarPermission with a source
     *
     * @param sourceCalendarPermission the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final CalendarPermission sourceCalendarPermission, final ICallback<? super CalendarPermission> callback) {
        send(HttpMethod.PATCH, callback, sourceCalendarPermission);
    }

    /**
     * Patches this CalendarPermission with a source
     *
     * @param sourceCalendarPermission the source object with updates
     * @return the updated CalendarPermission
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CalendarPermission patch(final CalendarPermission sourceCalendarPermission) throws ClientException {
        return send(HttpMethod.PATCH, sourceCalendarPermission);
    }

    /**
     * Creates a CalendarPermission with a new object
     *
     * @param newCalendarPermission the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final CalendarPermission newCalendarPermission, final ICallback<? super CalendarPermission> callback) {
        send(HttpMethod.POST, callback, newCalendarPermission);
    }

    /**
     * Creates a CalendarPermission with a new object
     *
     * @param newCalendarPermission the new object to create
     * @return the created CalendarPermission
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CalendarPermission post(final CalendarPermission newCalendarPermission) throws ClientException {
        return send(HttpMethod.POST, newCalendarPermission);
    }

    /**
     * Creates a CalendarPermission with a new object
     *
     * @param newCalendarPermission the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final CalendarPermission newCalendarPermission, final ICallback<? super CalendarPermission> callback) {
        send(HttpMethod.PUT, callback, newCalendarPermission);
    }

    /**
     * Creates a CalendarPermission with a new object
     *
     * @param newCalendarPermission the object to create/update
     * @return the created CalendarPermission
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CalendarPermission put(final CalendarPermission newCalendarPermission) throws ClientException {
        return send(HttpMethod.PUT, newCalendarPermission);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ICalendarPermissionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (CalendarPermissionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ICalendarPermissionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (CalendarPermissionRequest)this;
     }

}

