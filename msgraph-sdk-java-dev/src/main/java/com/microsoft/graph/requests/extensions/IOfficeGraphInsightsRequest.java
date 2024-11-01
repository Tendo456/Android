// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OfficeGraphInsights;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Office Graph Insights Request.
 */
public interface IOfficeGraphInsightsRequest extends IHttpRequest {

    /**
     * Gets the OfficeGraphInsights from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super OfficeGraphInsights> callback);

    /**
     * Gets the OfficeGraphInsights from the service
     *
     * @return the OfficeGraphInsights from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfficeGraphInsights get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super OfficeGraphInsights> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OfficeGraphInsights with a source
     *
     * @param sourceOfficeGraphInsights the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OfficeGraphInsights sourceOfficeGraphInsights, final ICallback<? super OfficeGraphInsights> callback);

    /**
     * Patches this OfficeGraphInsights with a source
     *
     * @param sourceOfficeGraphInsights the source object with updates
     * @return the updated OfficeGraphInsights
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfficeGraphInsights patch(final OfficeGraphInsights sourceOfficeGraphInsights) throws ClientException;

    /**
     * Posts a OfficeGraphInsights with a new object
     *
     * @param newOfficeGraphInsights the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OfficeGraphInsights newOfficeGraphInsights, final ICallback<? super OfficeGraphInsights> callback);

    /**
     * Posts a OfficeGraphInsights with a new object
     *
     * @param newOfficeGraphInsights the new object to create
     * @return the created OfficeGraphInsights
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfficeGraphInsights post(final OfficeGraphInsights newOfficeGraphInsights) throws ClientException;

    /**
     * Posts a OfficeGraphInsights with a new object
     *
     * @param newOfficeGraphInsights the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final OfficeGraphInsights newOfficeGraphInsights, final ICallback<? super OfficeGraphInsights> callback);

    /**
     * Posts a OfficeGraphInsights with a new object
     *
     * @param newOfficeGraphInsights the object to create/update
     * @return the created OfficeGraphInsights
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfficeGraphInsights put(final OfficeGraphInsights newOfficeGraphInsights) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOfficeGraphInsightsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOfficeGraphInsightsRequest expand(final String value);

}

