// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PlannerAssignedToTaskBoardTaskFormat;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Assigned To Task Board Task Format Request.
 */
public interface IPlannerAssignedToTaskBoardTaskFormatRequest extends IHttpRequest {

    /**
     * Gets the PlannerAssignedToTaskBoardTaskFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PlannerAssignedToTaskBoardTaskFormat> callback);

    /**
     * Gets the PlannerAssignedToTaskBoardTaskFormat from the service
     *
     * @return the PlannerAssignedToTaskBoardTaskFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerAssignedToTaskBoardTaskFormat get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PlannerAssignedToTaskBoardTaskFormat> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PlannerAssignedToTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerAssignedToTaskBoardTaskFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PlannerAssignedToTaskBoardTaskFormat sourcePlannerAssignedToTaskBoardTaskFormat, final ICallback<? super PlannerAssignedToTaskBoardTaskFormat> callback);

    /**
     * Patches this PlannerAssignedToTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerAssignedToTaskBoardTaskFormat the source object with updates
     * @return the updated PlannerAssignedToTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerAssignedToTaskBoardTaskFormat patch(final PlannerAssignedToTaskBoardTaskFormat sourcePlannerAssignedToTaskBoardTaskFormat) throws ClientException;

    /**
     * Posts a PlannerAssignedToTaskBoardTaskFormat with a new object
     *
     * @param newPlannerAssignedToTaskBoardTaskFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PlannerAssignedToTaskBoardTaskFormat newPlannerAssignedToTaskBoardTaskFormat, final ICallback<? super PlannerAssignedToTaskBoardTaskFormat> callback);

    /**
     * Posts a PlannerAssignedToTaskBoardTaskFormat with a new object
     *
     * @param newPlannerAssignedToTaskBoardTaskFormat the new object to create
     * @return the created PlannerAssignedToTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerAssignedToTaskBoardTaskFormat post(final PlannerAssignedToTaskBoardTaskFormat newPlannerAssignedToTaskBoardTaskFormat) throws ClientException;

    /**
     * Posts a PlannerAssignedToTaskBoardTaskFormat with a new object
     *
     * @param newPlannerAssignedToTaskBoardTaskFormat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PlannerAssignedToTaskBoardTaskFormat newPlannerAssignedToTaskBoardTaskFormat, final ICallback<? super PlannerAssignedToTaskBoardTaskFormat> callback);

    /**
     * Posts a PlannerAssignedToTaskBoardTaskFormat with a new object
     *
     * @param newPlannerAssignedToTaskBoardTaskFormat the object to create/update
     * @return the created PlannerAssignedToTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerAssignedToTaskBoardTaskFormat put(final PlannerAssignedToTaskBoardTaskFormat newPlannerAssignedToTaskBoardTaskFormat) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPlannerAssignedToTaskBoardTaskFormatRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPlannerAssignedToTaskBoardTaskFormatRequest expand(final String value);

}

