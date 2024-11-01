// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OpenShift;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Open Shift Request.
 */
public interface IOpenShiftRequest extends IHttpRequest {

    /**
     * Gets the OpenShift from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super OpenShift> callback);

    /**
     * Gets the OpenShift from the service
     *
     * @return the OpenShift from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OpenShift get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super OpenShift> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OpenShift with a source
     *
     * @param sourceOpenShift the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OpenShift sourceOpenShift, final ICallback<? super OpenShift> callback);

    /**
     * Patches this OpenShift with a source
     *
     * @param sourceOpenShift the source object with updates
     * @return the updated OpenShift
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OpenShift patch(final OpenShift sourceOpenShift) throws ClientException;

    /**
     * Posts a OpenShift with a new object
     *
     * @param newOpenShift the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OpenShift newOpenShift, final ICallback<? super OpenShift> callback);

    /**
     * Posts a OpenShift with a new object
     *
     * @param newOpenShift the new object to create
     * @return the created OpenShift
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OpenShift post(final OpenShift newOpenShift) throws ClientException;

    /**
     * Posts a OpenShift with a new object
     *
     * @param newOpenShift the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final OpenShift newOpenShift, final ICallback<? super OpenShift> callback);

    /**
     * Posts a OpenShift with a new object
     *
     * @param newOpenShift the object to create/update
     * @return the created OpenShift
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OpenShift put(final OpenShift newOpenShift) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOpenShiftRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOpenShiftRequest expand(final String value);

}

