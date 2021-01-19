// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PlannerProgressTaskBoardTaskFormat;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Progress Task Board Task Format Request.
 */
public interface IPlannerProgressTaskBoardTaskFormatRequest extends IHttpRequest {

    /**
     * Gets the PlannerProgressTaskBoardTaskFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PlannerProgressTaskBoardTaskFormat> callback);

    /**
     * Gets the PlannerProgressTaskBoardTaskFormat from the service
     *
     * @return the PlannerProgressTaskBoardTaskFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerProgressTaskBoardTaskFormat get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PlannerProgressTaskBoardTaskFormat> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PlannerProgressTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerProgressTaskBoardTaskFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PlannerProgressTaskBoardTaskFormat sourcePlannerProgressTaskBoardTaskFormat, final ICallback<? super PlannerProgressTaskBoardTaskFormat> callback);

    /**
     * Patches this PlannerProgressTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerProgressTaskBoardTaskFormat the source object with updates
     * @return the updated PlannerProgressTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerProgressTaskBoardTaskFormat patch(final PlannerProgressTaskBoardTaskFormat sourcePlannerProgressTaskBoardTaskFormat) throws ClientException;

    /**
     * Posts a PlannerProgressTaskBoardTaskFormat with a new object
     *
     * @param newPlannerProgressTaskBoardTaskFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PlannerProgressTaskBoardTaskFormat newPlannerProgressTaskBoardTaskFormat, final ICallback<? super PlannerProgressTaskBoardTaskFormat> callback);

    /**
     * Posts a PlannerProgressTaskBoardTaskFormat with a new object
     *
     * @param newPlannerProgressTaskBoardTaskFormat the new object to create
     * @return the created PlannerProgressTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerProgressTaskBoardTaskFormat post(final PlannerProgressTaskBoardTaskFormat newPlannerProgressTaskBoardTaskFormat) throws ClientException;

    /**
     * Posts a PlannerProgressTaskBoardTaskFormat with a new object
     *
     * @param newPlannerProgressTaskBoardTaskFormat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PlannerProgressTaskBoardTaskFormat newPlannerProgressTaskBoardTaskFormat, final ICallback<? super PlannerProgressTaskBoardTaskFormat> callback);

    /**
     * Posts a PlannerProgressTaskBoardTaskFormat with a new object
     *
     * @param newPlannerProgressTaskBoardTaskFormat the object to create/update
     * @return the created PlannerProgressTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerProgressTaskBoardTaskFormat put(final PlannerProgressTaskBoardTaskFormat newPlannerProgressTaskBoardTaskFormat) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPlannerProgressTaskBoardTaskFormatRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPlannerProgressTaskBoardTaskFormatRequest expand(final String value);

}

