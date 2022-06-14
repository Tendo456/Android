// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AppCatalogs;
import com.microsoft.graph.requests.extensions.ITeamsAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Catalogs Request.
 */
public class AppCatalogsRequest extends BaseRequest implements IAppCatalogsRequest {
	
    /**
     * The request for the AppCatalogs
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppCatalogsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppCatalogs.class);
    }

    /**
     * Gets the AppCatalogs from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AppCatalogs> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AppCatalogs from the service
     *
     * @return the AppCatalogs from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppCatalogs get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AppCatalogs> callback) {
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
     * Patches this AppCatalogs with a source
     *
     * @param sourceAppCatalogs the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AppCatalogs sourceAppCatalogs, final ICallback<? super AppCatalogs> callback) {
        send(HttpMethod.PATCH, callback, sourceAppCatalogs);
    }

    /**
     * Patches this AppCatalogs with a source
     *
     * @param sourceAppCatalogs the source object with updates
     * @return the updated AppCatalogs
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppCatalogs patch(final AppCatalogs sourceAppCatalogs) throws ClientException {
        return send(HttpMethod.PATCH, sourceAppCatalogs);
    }

    /**
     * Creates a AppCatalogs with a new object
     *
     * @param newAppCatalogs the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AppCatalogs newAppCatalogs, final ICallback<? super AppCatalogs> callback) {
        send(HttpMethod.POST, callback, newAppCatalogs);
    }

    /**
     * Creates a AppCatalogs with a new object
     *
     * @param newAppCatalogs the new object to create
     * @return the created AppCatalogs
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppCatalogs post(final AppCatalogs newAppCatalogs) throws ClientException {
        return send(HttpMethod.POST, newAppCatalogs);
    }

    /**
     * Creates a AppCatalogs with a new object
     *
     * @param newAppCatalogs the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AppCatalogs newAppCatalogs, final ICallback<? super AppCatalogs> callback) {
        send(HttpMethod.PUT, callback, newAppCatalogs);
    }

    /**
     * Creates a AppCatalogs with a new object
     *
     * @param newAppCatalogs the object to create/update
     * @return the created AppCatalogs
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppCatalogs put(final AppCatalogs newAppCatalogs) throws ClientException {
        return send(HttpMethod.PUT, newAppCatalogs);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAppCatalogsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AppCatalogsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAppCatalogsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AppCatalogsRequest)this;
     }

}

