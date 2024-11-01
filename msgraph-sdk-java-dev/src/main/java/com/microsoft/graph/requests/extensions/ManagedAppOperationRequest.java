// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Operation Request.
 */
public class ManagedAppOperationRequest extends BaseRequest implements IManagedAppOperationRequest {
	
    /**
     * The request for the ManagedAppOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppOperation.class);
    }

    /**
     * Gets the ManagedAppOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ManagedAppOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedAppOperation from the service
     *
     * @return the ManagedAppOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ManagedAppOperation> callback) {
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
     * Patches this ManagedAppOperation with a source
     *
     * @param sourceManagedAppOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedAppOperation sourceManagedAppOperation, final ICallback<? super ManagedAppOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedAppOperation);
    }

    /**
     * Patches this ManagedAppOperation with a source
     *
     * @param sourceManagedAppOperation the source object with updates
     * @return the updated ManagedAppOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppOperation patch(final ManagedAppOperation sourceManagedAppOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedAppOperation);
    }

    /**
     * Creates a ManagedAppOperation with a new object
     *
     * @param newManagedAppOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedAppOperation newManagedAppOperation, final ICallback<? super ManagedAppOperation> callback) {
        send(HttpMethod.POST, callback, newManagedAppOperation);
    }

    /**
     * Creates a ManagedAppOperation with a new object
     *
     * @param newManagedAppOperation the new object to create
     * @return the created ManagedAppOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppOperation post(final ManagedAppOperation newManagedAppOperation) throws ClientException {
        return send(HttpMethod.POST, newManagedAppOperation);
    }

    /**
     * Creates a ManagedAppOperation with a new object
     *
     * @param newManagedAppOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ManagedAppOperation newManagedAppOperation, final ICallback<? super ManagedAppOperation> callback) {
        send(HttpMethod.PUT, callback, newManagedAppOperation);
    }

    /**
     * Creates a ManagedAppOperation with a new object
     *
     * @param newManagedAppOperation the object to create/update
     * @return the created ManagedAppOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppOperation put(final ManagedAppOperation newManagedAppOperation) throws ClientException {
        return send(HttpMethod.PUT, newManagedAppOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedAppOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ManagedAppOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedAppOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ManagedAppOperationRequest)this;
     }

}

