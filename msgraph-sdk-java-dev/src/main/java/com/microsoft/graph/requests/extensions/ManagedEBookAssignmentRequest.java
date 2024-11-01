// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedEBookAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Assignment Request.
 */
public class ManagedEBookAssignmentRequest extends BaseRequest implements IManagedEBookAssignmentRequest {
	
    /**
     * The request for the ManagedEBookAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagedEBookAssignmentRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends ManagedEBookAssignment> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagedEBookAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedEBookAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedEBookAssignment.class);
    }

    /**
     * Gets the ManagedEBookAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ManagedEBookAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedEBookAssignment from the service
     *
     * @return the ManagedEBookAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedEBookAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ManagedEBookAssignment> callback) {
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
     * Patches this ManagedEBookAssignment with a source
     *
     * @param sourceManagedEBookAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedEBookAssignment sourceManagedEBookAssignment, final ICallback<? super ManagedEBookAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedEBookAssignment);
    }

    /**
     * Patches this ManagedEBookAssignment with a source
     *
     * @param sourceManagedEBookAssignment the source object with updates
     * @return the updated ManagedEBookAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedEBookAssignment patch(final ManagedEBookAssignment sourceManagedEBookAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedEBookAssignment);
    }

    /**
     * Creates a ManagedEBookAssignment with a new object
     *
     * @param newManagedEBookAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedEBookAssignment newManagedEBookAssignment, final ICallback<? super ManagedEBookAssignment> callback) {
        send(HttpMethod.POST, callback, newManagedEBookAssignment);
    }

    /**
     * Creates a ManagedEBookAssignment with a new object
     *
     * @param newManagedEBookAssignment the new object to create
     * @return the created ManagedEBookAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedEBookAssignment post(final ManagedEBookAssignment newManagedEBookAssignment) throws ClientException {
        return send(HttpMethod.POST, newManagedEBookAssignment);
    }

    /**
     * Creates a ManagedEBookAssignment with a new object
     *
     * @param newManagedEBookAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ManagedEBookAssignment newManagedEBookAssignment, final ICallback<? super ManagedEBookAssignment> callback) {
        send(HttpMethod.PUT, callback, newManagedEBookAssignment);
    }

    /**
     * Creates a ManagedEBookAssignment with a new object
     *
     * @param newManagedEBookAssignment the object to create/update
     * @return the created ManagedEBookAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedEBookAssignment put(final ManagedEBookAssignment newManagedEBookAssignment) throws ClientException {
        return send(HttpMethod.PUT, newManagedEBookAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedEBookAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ManagedEBookAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedEBookAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ManagedEBookAssignmentRequest)this;
     }

}

