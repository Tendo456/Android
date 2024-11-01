// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsAppDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Definition Request.
 */
public class TeamsAppDefinitionRequest extends BaseRequest implements ITeamsAppDefinitionRequest {
	
    /**
     * The request for the TeamsAppDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppDefinitionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsAppDefinition.class);
    }

    /**
     * Gets the TeamsAppDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TeamsAppDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TeamsAppDefinition from the service
     *
     * @return the TeamsAppDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsAppDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TeamsAppDefinition> callback) {
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
     * Patches this TeamsAppDefinition with a source
     *
     * @param sourceTeamsAppDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TeamsAppDefinition sourceTeamsAppDefinition, final ICallback<? super TeamsAppDefinition> callback) {
        send(HttpMethod.PATCH, callback, sourceTeamsAppDefinition);
    }

    /**
     * Patches this TeamsAppDefinition with a source
     *
     * @param sourceTeamsAppDefinition the source object with updates
     * @return the updated TeamsAppDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsAppDefinition patch(final TeamsAppDefinition sourceTeamsAppDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsAppDefinition);
    }

    /**
     * Creates a TeamsAppDefinition with a new object
     *
     * @param newTeamsAppDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TeamsAppDefinition newTeamsAppDefinition, final ICallback<? super TeamsAppDefinition> callback) {
        send(HttpMethod.POST, callback, newTeamsAppDefinition);
    }

    /**
     * Creates a TeamsAppDefinition with a new object
     *
     * @param newTeamsAppDefinition the new object to create
     * @return the created TeamsAppDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsAppDefinition post(final TeamsAppDefinition newTeamsAppDefinition) throws ClientException {
        return send(HttpMethod.POST, newTeamsAppDefinition);
    }

    /**
     * Creates a TeamsAppDefinition with a new object
     *
     * @param newTeamsAppDefinition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TeamsAppDefinition newTeamsAppDefinition, final ICallback<? super TeamsAppDefinition> callback) {
        send(HttpMethod.PUT, callback, newTeamsAppDefinition);
    }

    /**
     * Creates a TeamsAppDefinition with a new object
     *
     * @param newTeamsAppDefinition the object to create/update
     * @return the created TeamsAppDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsAppDefinition put(final TeamsAppDefinition newTeamsAppDefinition) throws ClientException {
        return send(HttpMethod.PUT, newTeamsAppDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITeamsAppDefinitionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TeamsAppDefinitionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITeamsAppDefinitionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TeamsAppDefinitionRequest)this;
     }

}

