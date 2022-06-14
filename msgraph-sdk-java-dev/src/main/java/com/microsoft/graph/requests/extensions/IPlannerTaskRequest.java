// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PlannerTask;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Task Request.
 */
public interface IPlannerTaskRequest extends IHttpRequest {

    /**
     * Gets the PlannerTask from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PlannerTask> callback);

    /**
     * Gets the PlannerTask from the service
     *
     * @return the PlannerTask from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerTask get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PlannerTask> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PlannerTask with a source
     *
     * @param sourcePlannerTask the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PlannerTask sourcePlannerTask, final ICallback<? super PlannerTask> callback);

    /**
     * Patches this PlannerTask with a source
     *
     * @param sourcePlannerTask the source object with updates
     * @return the updated PlannerTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerTask patch(final PlannerTask sourcePlannerTask) throws ClientException;

    /**
     * Posts a PlannerTask with a new object
     *
     * @param newPlannerTask the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PlannerTask newPlannerTask, final ICallback<? super PlannerTask> callback);

    /**
     * Posts a PlannerTask with a new object
     *
     * @param newPlannerTask the new object to create
     * @return the created PlannerTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerTask post(final PlannerTask newPlannerTask) throws ClientException;

    /**
     * Posts a PlannerTask with a new object
     *
     * @param newPlannerTask the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PlannerTask newPlannerTask, final ICallback<? super PlannerTask> callback);

    /**
     * Posts a PlannerTask with a new object
     *
     * @param newPlannerTask the object to create/update
     * @return the created PlannerTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerTask put(final PlannerTask newPlannerTask) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPlannerTaskRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPlannerTaskRequest expand(final String value);

}

