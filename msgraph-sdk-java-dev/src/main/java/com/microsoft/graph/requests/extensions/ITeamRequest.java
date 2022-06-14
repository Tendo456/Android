// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Team;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Team Request.
 */
public interface ITeamRequest extends IHttpRequest {

    /**
     * Gets the Team from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Team> callback);

    /**
     * Gets the Team from the service
     *
     * @return the Team from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Team get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Team> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Team with a source
     *
     * @param sourceTeam the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Team sourceTeam, final ICallback<? super Team> callback);

    /**
     * Patches this Team with a source
     *
     * @param sourceTeam the source object with updates
     * @return the updated Team
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Team patch(final Team sourceTeam) throws ClientException;

    /**
     * Posts a Team with a new object
     *
     * @param newTeam the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Team newTeam, final ICallback<? super Team> callback);

    /**
     * Posts a Team with a new object
     *
     * @param newTeam the new object to create
     * @return the created Team
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Team post(final Team newTeam) throws ClientException;

    /**
     * Posts a Team with a new object
     *
     * @param newTeam the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Team newTeam, final ICallback<? super Team> callback);

    /**
     * Posts a Team with a new object
     *
     * @param newTeam the object to create/update
     * @return the created Team
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Team put(final Team newTeam) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITeamRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITeamRequest expand(final String value);

}

