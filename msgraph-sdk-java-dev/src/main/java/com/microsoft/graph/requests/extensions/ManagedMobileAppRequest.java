// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Mobile App Request.
 */
public class ManagedMobileAppRequest extends BaseRequest implements IManagedMobileAppRequest {
	
    /**
     * The request for the ManagedMobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedMobileAppRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedMobileApp.class);
    }

    /**
     * Gets the ManagedMobileApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ManagedMobileApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedMobileApp from the service
     *
     * @return the ManagedMobileApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedMobileApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ManagedMobileApp> callback) {
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
     * Patches this ManagedMobileApp with a source
     *
     * @param sourceManagedMobileApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedMobileApp sourceManagedMobileApp, final ICallback<? super ManagedMobileApp> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedMobileApp);
    }

    /**
     * Patches this ManagedMobileApp with a source
     *
     * @param sourceManagedMobileApp the source object with updates
     * @return the updated ManagedMobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedMobileApp patch(final ManagedMobileApp sourceManagedMobileApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedMobileApp);
    }

    /**
     * Creates a ManagedMobileApp with a new object
     *
     * @param newManagedMobileApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedMobileApp newManagedMobileApp, final ICallback<? super ManagedMobileApp> callback) {
        send(HttpMethod.POST, callback, newManagedMobileApp);
    }

    /**
     * Creates a ManagedMobileApp with a new object
     *
     * @param newManagedMobileApp the new object to create
     * @return the created ManagedMobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedMobileApp post(final ManagedMobileApp newManagedMobileApp) throws ClientException {
        return send(HttpMethod.POST, newManagedMobileApp);
    }

    /**
     * Creates a ManagedMobileApp with a new object
     *
     * @param newManagedMobileApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ManagedMobileApp newManagedMobileApp, final ICallback<? super ManagedMobileApp> callback) {
        send(HttpMethod.PUT, callback, newManagedMobileApp);
    }

    /**
     * Creates a ManagedMobileApp with a new object
     *
     * @param newManagedMobileApp the object to create/update
     * @return the created ManagedMobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedMobileApp put(final ManagedMobileApp newManagedMobileApp) throws ClientException {
        return send(HttpMethod.PUT, newManagedMobileApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedMobileAppRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ManagedMobileAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedMobileAppRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ManagedMobileAppRequest)this;
     }

}
