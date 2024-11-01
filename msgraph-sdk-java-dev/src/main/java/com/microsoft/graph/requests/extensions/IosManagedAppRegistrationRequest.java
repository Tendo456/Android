// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosManagedAppRegistration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Managed App Registration Request.
 */
public class IosManagedAppRegistrationRequest extends BaseRequest implements IIosManagedAppRegistrationRequest {
	
    /**
     * The request for the IosManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosManagedAppRegistrationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosManagedAppRegistration.class);
    }

    /**
     * Gets the IosManagedAppRegistration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super IosManagedAppRegistration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosManagedAppRegistration from the service
     *
     * @return the IosManagedAppRegistration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosManagedAppRegistration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super IosManagedAppRegistration> callback) {
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
     * Patches this IosManagedAppRegistration with a source
     *
     * @param sourceIosManagedAppRegistration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosManagedAppRegistration sourceIosManagedAppRegistration, final ICallback<? super IosManagedAppRegistration> callback) {
        send(HttpMethod.PATCH, callback, sourceIosManagedAppRegistration);
    }

    /**
     * Patches this IosManagedAppRegistration with a source
     *
     * @param sourceIosManagedAppRegistration the source object with updates
     * @return the updated IosManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosManagedAppRegistration patch(final IosManagedAppRegistration sourceIosManagedAppRegistration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosManagedAppRegistration);
    }

    /**
     * Creates a IosManagedAppRegistration with a new object
     *
     * @param newIosManagedAppRegistration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosManagedAppRegistration newIosManagedAppRegistration, final ICallback<? super IosManagedAppRegistration> callback) {
        send(HttpMethod.POST, callback, newIosManagedAppRegistration);
    }

    /**
     * Creates a IosManagedAppRegistration with a new object
     *
     * @param newIosManagedAppRegistration the new object to create
     * @return the created IosManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosManagedAppRegistration post(final IosManagedAppRegistration newIosManagedAppRegistration) throws ClientException {
        return send(HttpMethod.POST, newIosManagedAppRegistration);
    }

    /**
     * Creates a IosManagedAppRegistration with a new object
     *
     * @param newIosManagedAppRegistration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosManagedAppRegistration newIosManagedAppRegistration, final ICallback<? super IosManagedAppRegistration> callback) {
        send(HttpMethod.PUT, callback, newIosManagedAppRegistration);
    }

    /**
     * Creates a IosManagedAppRegistration with a new object
     *
     * @param newIosManagedAppRegistration the object to create/update
     * @return the created IosManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosManagedAppRegistration put(final IosManagedAppRegistration newIosManagedAppRegistration) throws ClientException {
        return send(HttpMethod.PUT, newIosManagedAppRegistration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosManagedAppRegistrationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosManagedAppRegistrationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosManagedAppRegistrationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosManagedAppRegistrationRequest)this;
     }

}

