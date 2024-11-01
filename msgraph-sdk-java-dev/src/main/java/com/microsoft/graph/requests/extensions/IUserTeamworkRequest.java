// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserTeamwork;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Teamwork Request.
 */
public interface IUserTeamworkRequest extends IHttpRequest {

    /**
     * Gets the UserTeamwork from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserTeamwork> callback);

    /**
     * Gets the UserTeamwork from the service
     *
     * @return the UserTeamwork from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserTeamwork get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserTeamwork> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserTeamwork with a source
     *
     * @param sourceUserTeamwork the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserTeamwork sourceUserTeamwork, final ICallback<? super UserTeamwork> callback);

    /**
     * Patches this UserTeamwork with a source
     *
     * @param sourceUserTeamwork the source object with updates
     * @return the updated UserTeamwork
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserTeamwork patch(final UserTeamwork sourceUserTeamwork) throws ClientException;

    /**
     * Posts a UserTeamwork with a new object
     *
     * @param newUserTeamwork the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserTeamwork newUserTeamwork, final ICallback<? super UserTeamwork> callback);

    /**
     * Posts a UserTeamwork with a new object
     *
     * @param newUserTeamwork the new object to create
     * @return the created UserTeamwork
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserTeamwork post(final UserTeamwork newUserTeamwork) throws ClientException;

    /**
     * Posts a UserTeamwork with a new object
     *
     * @param newUserTeamwork the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserTeamwork newUserTeamwork, final ICallback<? super UserTeamwork> callback);

    /**
     * Posts a UserTeamwork with a new object
     *
     * @param newUserTeamwork the object to create/update
     * @return the created UserTeamwork
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserTeamwork put(final UserTeamwork newUserTeamwork) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserTeamworkRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserTeamworkRequest expand(final String value);

}

