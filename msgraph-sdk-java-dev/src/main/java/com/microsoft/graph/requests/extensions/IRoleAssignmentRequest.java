// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RoleAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Role Assignment Request.
 */
public interface IRoleAssignmentRequest extends IHttpRequest {

    /**
     * Gets the RoleAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super RoleAssignment> callback);

    /**
     * Gets the RoleAssignment from the service
     *
     * @return the RoleAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RoleAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super RoleAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this RoleAssignment with a source
     *
     * @param sourceRoleAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final RoleAssignment sourceRoleAssignment, final ICallback<? super RoleAssignment> callback);

    /**
     * Patches this RoleAssignment with a source
     *
     * @param sourceRoleAssignment the source object with updates
     * @return the updated RoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RoleAssignment patch(final RoleAssignment sourceRoleAssignment) throws ClientException;

    /**
     * Posts a RoleAssignment with a new object
     *
     * @param newRoleAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final RoleAssignment newRoleAssignment, final ICallback<? super RoleAssignment> callback);

    /**
     * Posts a RoleAssignment with a new object
     *
     * @param newRoleAssignment the new object to create
     * @return the created RoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RoleAssignment post(final RoleAssignment newRoleAssignment) throws ClientException;

    /**
     * Posts a RoleAssignment with a new object
     *
     * @param newRoleAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final RoleAssignment newRoleAssignment, final ICallback<? super RoleAssignment> callback);

    /**
     * Posts a RoleAssignment with a new object
     *
     * @param newRoleAssignment the object to create/update
     * @return the created RoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RoleAssignment put(final RoleAssignment newRoleAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IRoleAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IRoleAssignmentRequest expand(final String value);

}

