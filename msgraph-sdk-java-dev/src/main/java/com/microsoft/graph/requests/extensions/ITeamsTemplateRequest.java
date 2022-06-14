// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TeamsTemplate;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams Template Request.
 */
public interface ITeamsTemplateRequest extends IHttpRequest {

    /**
     * Gets the TeamsTemplate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TeamsTemplate> callback);

    /**
     * Gets the TeamsTemplate from the service
     *
     * @return the TeamsTemplate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsTemplate get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TeamsTemplate> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TeamsTemplate with a source
     *
     * @param sourceTeamsTemplate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TeamsTemplate sourceTeamsTemplate, final ICallback<? super TeamsTemplate> callback);

    /**
     * Patches this TeamsTemplate with a source
     *
     * @param sourceTeamsTemplate the source object with updates
     * @return the updated TeamsTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsTemplate patch(final TeamsTemplate sourceTeamsTemplate) throws ClientException;

    /**
     * Posts a TeamsTemplate with a new object
     *
     * @param newTeamsTemplate the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TeamsTemplate newTeamsTemplate, final ICallback<? super TeamsTemplate> callback);

    /**
     * Posts a TeamsTemplate with a new object
     *
     * @param newTeamsTemplate the new object to create
     * @return the created TeamsTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsTemplate post(final TeamsTemplate newTeamsTemplate) throws ClientException;

    /**
     * Posts a TeamsTemplate with a new object
     *
     * @param newTeamsTemplate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TeamsTemplate newTeamsTemplate, final ICallback<? super TeamsTemplate> callback);

    /**
     * Posts a TeamsTemplate with a new object
     *
     * @param newTeamsTemplate the object to create/update
     * @return the created TeamsTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsTemplate put(final TeamsTemplate newTeamsTemplate) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITeamsTemplateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITeamsTemplateRequest expand(final String value);

}

