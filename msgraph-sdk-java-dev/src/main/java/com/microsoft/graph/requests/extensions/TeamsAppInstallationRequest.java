// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsAppInstallation;
import com.microsoft.graph.requests.extensions.ITeamsAppRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Installation Request.
 */
public class TeamsAppInstallationRequest extends BaseRequest implements ITeamsAppInstallationRequest {
	
    /**
     * The request for the TeamsAppInstallation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public TeamsAppInstallationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends TeamsAppInstallation> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the TeamsAppInstallation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppInstallationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsAppInstallation.class);
    }

    /**
     * Gets the TeamsAppInstallation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TeamsAppInstallation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TeamsAppInstallation from the service
     *
     * @return the TeamsAppInstallation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsAppInstallation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TeamsAppInstallation> callback) {
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
     * Patches this TeamsAppInstallation with a source
     *
     * @param sourceTeamsAppInstallation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TeamsAppInstallation sourceTeamsAppInstallation, final ICallback<? super TeamsAppInstallation> callback) {
        send(HttpMethod.PATCH, callback, sourceTeamsAppInstallation);
    }

    /**
     * Patches this TeamsAppInstallation with a source
     *
     * @param sourceTeamsAppInstallation the source object with updates
     * @return the updated TeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsAppInstallation patch(final TeamsAppInstallation sourceTeamsAppInstallation) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsAppInstallation);
    }

    /**
     * Creates a TeamsAppInstallation with a new object
     *
     * @param newTeamsAppInstallation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TeamsAppInstallation newTeamsAppInstallation, final ICallback<? super TeamsAppInstallation> callback) {
        send(HttpMethod.POST, callback, newTeamsAppInstallation);
    }

    /**
     * Creates a TeamsAppInstallation with a new object
     *
     * @param newTeamsAppInstallation the new object to create
     * @return the created TeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsAppInstallation post(final TeamsAppInstallation newTeamsAppInstallation) throws ClientException {
        return send(HttpMethod.POST, newTeamsAppInstallation);
    }

    /**
     * Creates a TeamsAppInstallation with a new object
     *
     * @param newTeamsAppInstallation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TeamsAppInstallation newTeamsAppInstallation, final ICallback<? super TeamsAppInstallation> callback) {
        send(HttpMethod.PUT, callback, newTeamsAppInstallation);
    }

    /**
     * Creates a TeamsAppInstallation with a new object
     *
     * @param newTeamsAppInstallation the object to create/update
     * @return the created TeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsAppInstallation put(final TeamsAppInstallation newTeamsAppInstallation) throws ClientException {
        return send(HttpMethod.PUT, newTeamsAppInstallation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITeamsAppInstallationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TeamsAppInstallationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITeamsAppInstallationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TeamsAppInstallationRequest)this;
     }

}

