// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentityContainer;
import com.microsoft.graph.requests.extensions.IConditionalAccessRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessRootRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Container Request.
 */
public class IdentityContainerRequest extends BaseRequest implements IIdentityContainerRequest {
	
    /**
     * The request for the IdentityContainer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityContainerRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IdentityContainer.class);
    }

    /**
     * Gets the IdentityContainer from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super IdentityContainer> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IdentityContainer from the service
     *
     * @return the IdentityContainer from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IdentityContainer get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super IdentityContainer> callback) {
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
     * Patches this IdentityContainer with a source
     *
     * @param sourceIdentityContainer the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IdentityContainer sourceIdentityContainer, final ICallback<? super IdentityContainer> callback) {
        send(HttpMethod.PATCH, callback, sourceIdentityContainer);
    }

    /**
     * Patches this IdentityContainer with a source
     *
     * @param sourceIdentityContainer the source object with updates
     * @return the updated IdentityContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IdentityContainer patch(final IdentityContainer sourceIdentityContainer) throws ClientException {
        return send(HttpMethod.PATCH, sourceIdentityContainer);
    }

    /**
     * Creates a IdentityContainer with a new object
     *
     * @param newIdentityContainer the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IdentityContainer newIdentityContainer, final ICallback<? super IdentityContainer> callback) {
        send(HttpMethod.POST, callback, newIdentityContainer);
    }

    /**
     * Creates a IdentityContainer with a new object
     *
     * @param newIdentityContainer the new object to create
     * @return the created IdentityContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IdentityContainer post(final IdentityContainer newIdentityContainer) throws ClientException {
        return send(HttpMethod.POST, newIdentityContainer);
    }

    /**
     * Creates a IdentityContainer with a new object
     *
     * @param newIdentityContainer the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IdentityContainer newIdentityContainer, final ICallback<? super IdentityContainer> callback) {
        send(HttpMethod.PUT, callback, newIdentityContainer);
    }

    /**
     * Creates a IdentityContainer with a new object
     *
     * @param newIdentityContainer the object to create/update
     * @return the created IdentityContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IdentityContainer put(final IdentityContainer newIdentityContainer) throws ClientException {
        return send(HttpMethod.PUT, newIdentityContainer);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIdentityContainerRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IdentityContainerRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIdentityContainerRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IdentityContainerRequest)this;
     }

}

