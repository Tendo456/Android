// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Targeted Managed App Policy Assignment Request.
 */
public interface ITargetedManagedAppPolicyAssignmentRequest extends IHttpRequest {

    /**
     * Gets the TargetedManagedAppPolicyAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TargetedManagedAppPolicyAssignment> callback);

    /**
     * Gets the TargetedManagedAppPolicyAssignment from the service
     *
     * @return the TargetedManagedAppPolicyAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TargetedManagedAppPolicyAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TargetedManagedAppPolicyAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TargetedManagedAppPolicyAssignment with a source
     *
     * @param sourceTargetedManagedAppPolicyAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TargetedManagedAppPolicyAssignment sourceTargetedManagedAppPolicyAssignment, final ICallback<? super TargetedManagedAppPolicyAssignment> callback);

    /**
     * Patches this TargetedManagedAppPolicyAssignment with a source
     *
     * @param sourceTargetedManagedAppPolicyAssignment the source object with updates
     * @return the updated TargetedManagedAppPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TargetedManagedAppPolicyAssignment patch(final TargetedManagedAppPolicyAssignment sourceTargetedManagedAppPolicyAssignment) throws ClientException;

    /**
     * Posts a TargetedManagedAppPolicyAssignment with a new object
     *
     * @param newTargetedManagedAppPolicyAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TargetedManagedAppPolicyAssignment newTargetedManagedAppPolicyAssignment, final ICallback<? super TargetedManagedAppPolicyAssignment> callback);

    /**
     * Posts a TargetedManagedAppPolicyAssignment with a new object
     *
     * @param newTargetedManagedAppPolicyAssignment the new object to create
     * @return the created TargetedManagedAppPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TargetedManagedAppPolicyAssignment post(final TargetedManagedAppPolicyAssignment newTargetedManagedAppPolicyAssignment) throws ClientException;

    /**
     * Posts a TargetedManagedAppPolicyAssignment with a new object
     *
     * @param newTargetedManagedAppPolicyAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TargetedManagedAppPolicyAssignment newTargetedManagedAppPolicyAssignment, final ICallback<? super TargetedManagedAppPolicyAssignment> callback);

    /**
     * Posts a TargetedManagedAppPolicyAssignment with a new object
     *
     * @param newTargetedManagedAppPolicyAssignment the object to create/update
     * @return the created TargetedManagedAppPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TargetedManagedAppPolicyAssignment put(final TargetedManagedAppPolicyAssignment newTargetedManagedAppPolicyAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITargetedManagedAppPolicyAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITargetedManagedAppPolicyAssignmentRequest expand(final String value);

}

