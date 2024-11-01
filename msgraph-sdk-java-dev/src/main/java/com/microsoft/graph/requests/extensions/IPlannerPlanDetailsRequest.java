// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PlannerPlanDetails;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Plan Details Request.
 */
public interface IPlannerPlanDetailsRequest extends IHttpRequest {

    /**
     * Gets the PlannerPlanDetails from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PlannerPlanDetails> callback);

    /**
     * Gets the PlannerPlanDetails from the service
     *
     * @return the PlannerPlanDetails from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerPlanDetails get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PlannerPlanDetails> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PlannerPlanDetails with a source
     *
     * @param sourcePlannerPlanDetails the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PlannerPlanDetails sourcePlannerPlanDetails, final ICallback<? super PlannerPlanDetails> callback);

    /**
     * Patches this PlannerPlanDetails with a source
     *
     * @param sourcePlannerPlanDetails the source object with updates
     * @return the updated PlannerPlanDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerPlanDetails patch(final PlannerPlanDetails sourcePlannerPlanDetails) throws ClientException;

    /**
     * Posts a PlannerPlanDetails with a new object
     *
     * @param newPlannerPlanDetails the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PlannerPlanDetails newPlannerPlanDetails, final ICallback<? super PlannerPlanDetails> callback);

    /**
     * Posts a PlannerPlanDetails with a new object
     *
     * @param newPlannerPlanDetails the new object to create
     * @return the created PlannerPlanDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerPlanDetails post(final PlannerPlanDetails newPlannerPlanDetails) throws ClientException;

    /**
     * Posts a PlannerPlanDetails with a new object
     *
     * @param newPlannerPlanDetails the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PlannerPlanDetails newPlannerPlanDetails, final ICallback<? super PlannerPlanDetails> callback);

    /**
     * Posts a PlannerPlanDetails with a new object
     *
     * @param newPlannerPlanDetails the object to create/update
     * @return the created PlannerPlanDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerPlanDetails put(final PlannerPlanDetails newPlannerPlanDetails) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPlannerPlanDetailsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPlannerPlanDetailsRequest expand(final String value);

}

