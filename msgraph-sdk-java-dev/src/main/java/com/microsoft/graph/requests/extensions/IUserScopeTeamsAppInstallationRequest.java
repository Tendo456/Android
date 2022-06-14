// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserScopeTeamsAppInstallation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Scope Teams App Installation Request.
 */
public interface IUserScopeTeamsAppInstallationRequest extends IHttpRequest {

    /**
     * Gets the UserScopeTeamsAppInstallation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserScopeTeamsAppInstallation> callback);

    /**
     * Gets the UserScopeTeamsAppInstallation from the service
     *
     * @return the UserScopeTeamsAppInstallation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserScopeTeamsAppInstallation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserScopeTeamsAppInstallation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserScopeTeamsAppInstallation with a source
     *
     * @param sourceUserScopeTeamsAppInstallation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserScopeTeamsAppInstallation sourceUserScopeTeamsAppInstallation, final ICallback<? super UserScopeTeamsAppInstallation> callback);

    /**
     * Patches this UserScopeTeamsAppInstallation with a source
     *
     * @param sourceUserScopeTeamsAppInstallation the source object with updates
     * @return the updated UserScopeTeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserScopeTeamsAppInstallation patch(final UserScopeTeamsAppInstallation sourceUserScopeTeamsAppInstallation) throws ClientException;

    /**
     * Posts a UserScopeTeamsAppInstallation with a new object
     *
     * @param newUserScopeTeamsAppInstallation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation, final ICallback<? super UserScopeTeamsAppInstallation> callback);

    /**
     * Posts a UserScopeTeamsAppInstallation with a new object
     *
     * @param newUserScopeTeamsAppInstallation the new object to create
     * @return the created UserScopeTeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserScopeTeamsAppInstallation post(final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation) throws ClientException;

    /**
     * Posts a UserScopeTeamsAppInstallation with a new object
     *
     * @param newUserScopeTeamsAppInstallation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation, final ICallback<? super UserScopeTeamsAppInstallation> callback);

    /**
     * Posts a UserScopeTeamsAppInstallation with a new object
     *
     * @param newUserScopeTeamsAppInstallation the object to create/update
     * @return the created UserScopeTeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserScopeTeamsAppInstallation put(final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserScopeTeamsAppInstallationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserScopeTeamsAppInstallationRequest expand(final String value);

}

