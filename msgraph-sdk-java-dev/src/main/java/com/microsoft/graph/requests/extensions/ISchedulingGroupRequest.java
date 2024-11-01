// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SchedulingGroup;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Scheduling Group Request.
 */
public interface ISchedulingGroupRequest extends IHttpRequest {

    /**
     * Gets the SchedulingGroup from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SchedulingGroup> callback);

    /**
     * Gets the SchedulingGroup from the service
     *
     * @return the SchedulingGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SchedulingGroup get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SchedulingGroup> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SchedulingGroup with a source
     *
     * @param sourceSchedulingGroup the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SchedulingGroup sourceSchedulingGroup, final ICallback<? super SchedulingGroup> callback);

    /**
     * Patches this SchedulingGroup with a source
     *
     * @param sourceSchedulingGroup the source object with updates
     * @return the updated SchedulingGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SchedulingGroup patch(final SchedulingGroup sourceSchedulingGroup) throws ClientException;

    /**
     * Posts a SchedulingGroup with a new object
     *
     * @param newSchedulingGroup the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SchedulingGroup newSchedulingGroup, final ICallback<? super SchedulingGroup> callback);

    /**
     * Posts a SchedulingGroup with a new object
     *
     * @param newSchedulingGroup the new object to create
     * @return the created SchedulingGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SchedulingGroup post(final SchedulingGroup newSchedulingGroup) throws ClientException;

    /**
     * Posts a SchedulingGroup with a new object
     *
     * @param newSchedulingGroup the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SchedulingGroup newSchedulingGroup, final ICallback<? super SchedulingGroup> callback);

    /**
     * Posts a SchedulingGroup with a new object
     *
     * @param newSchedulingGroup the object to create/update
     * @return the created SchedulingGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SchedulingGroup put(final SchedulingGroup newSchedulingGroup) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISchedulingGroupRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISchedulingGroupRequest expand(final String value);

}

