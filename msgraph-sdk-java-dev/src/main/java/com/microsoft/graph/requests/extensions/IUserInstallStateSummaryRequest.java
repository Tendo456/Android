// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserInstallStateSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Install State Summary Request.
 */
public interface IUserInstallStateSummaryRequest extends IHttpRequest {

    /**
     * Gets the UserInstallStateSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserInstallStateSummary> callback);

    /**
     * Gets the UserInstallStateSummary from the service
     *
     * @return the UserInstallStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserInstallStateSummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserInstallStateSummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserInstallStateSummary with a source
     *
     * @param sourceUserInstallStateSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserInstallStateSummary sourceUserInstallStateSummary, final ICallback<? super UserInstallStateSummary> callback);

    /**
     * Patches this UserInstallStateSummary with a source
     *
     * @param sourceUserInstallStateSummary the source object with updates
     * @return the updated UserInstallStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserInstallStateSummary patch(final UserInstallStateSummary sourceUserInstallStateSummary) throws ClientException;

    /**
     * Posts a UserInstallStateSummary with a new object
     *
     * @param newUserInstallStateSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserInstallStateSummary newUserInstallStateSummary, final ICallback<? super UserInstallStateSummary> callback);

    /**
     * Posts a UserInstallStateSummary with a new object
     *
     * @param newUserInstallStateSummary the new object to create
     * @return the created UserInstallStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserInstallStateSummary post(final UserInstallStateSummary newUserInstallStateSummary) throws ClientException;

    /**
     * Posts a UserInstallStateSummary with a new object
     *
     * @param newUserInstallStateSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserInstallStateSummary newUserInstallStateSummary, final ICallback<? super UserInstallStateSummary> callback);

    /**
     * Posts a UserInstallStateSummary with a new object
     *
     * @param newUserInstallStateSummary the object to create/update
     * @return the created UserInstallStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserInstallStateSummary put(final UserInstallStateSummary newUserInstallStateSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserInstallStateSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserInstallStateSummaryRequest expand(final String value);

}

