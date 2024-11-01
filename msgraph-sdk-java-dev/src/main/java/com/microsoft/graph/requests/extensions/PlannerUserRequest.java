// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerUser;
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner User Request.
 */
public class PlannerUserRequest extends BaseRequest implements IPlannerUserRequest {
	
    /**
     * The request for the PlannerUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerUserRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerUser.class);
    }

    /**
     * Gets the PlannerUser from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PlannerUser> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerUser from the service
     *
     * @return the PlannerUser from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerUser get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PlannerUser> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PlannerUser with a source
     *
     * @param sourcePlannerUser the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerUser sourcePlannerUser, final ICallback<? super PlannerUser> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerUser);
    }

    /**
     * Patches this PlannerUser with a source
     *
     * @param sourcePlannerUser the source object with updates
     * @return the updated PlannerUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerUser patch(final PlannerUser sourcePlannerUser) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerUser);
    }

    /**
     * Creates a PlannerUser with a new object
     *
     * @param newPlannerUser the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerUser newPlannerUser, final ICallback<? super PlannerUser> callback) {
        send(HttpMethod.POST, callback, newPlannerUser);
    }

    /**
     * Creates a PlannerUser with a new object
     *
     * @param newPlannerUser the new object to create
     * @return the created PlannerUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerUser post(final PlannerUser newPlannerUser) throws ClientException {
        return send(HttpMethod.POST, newPlannerUser);
    }

    /**
     * Creates a PlannerUser with a new object
     *
     * @param newPlannerUser the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PlannerUser newPlannerUser, final ICallback<? super PlannerUser> callback) {
        send(HttpMethod.PUT, callback, newPlannerUser);
    }

    /**
     * Creates a PlannerUser with a new object
     *
     * @param newPlannerUser the object to create/update
     * @return the created PlannerUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerUser put(final PlannerUser newPlannerUser) throws ClientException {
        return send(HttpMethod.PUT, newPlannerUser);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerUserRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PlannerUserRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerUserRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PlannerUserRequest)this;
     }

}

