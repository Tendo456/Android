// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OutlookUser;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Outlook User Request.
 */
public interface IOutlookUserRequest extends IHttpRequest {

    /**
     * Gets the OutlookUser from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super OutlookUser> callback);

    /**
     * Gets the OutlookUser from the service
     *
     * @return the OutlookUser from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookUser get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super OutlookUser> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OutlookUser with a source
     *
     * @param sourceOutlookUser the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OutlookUser sourceOutlookUser, final ICallback<? super OutlookUser> callback);

    /**
     * Patches this OutlookUser with a source
     *
     * @param sourceOutlookUser the source object with updates
     * @return the updated OutlookUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookUser patch(final OutlookUser sourceOutlookUser) throws ClientException;

    /**
     * Posts a OutlookUser with a new object
     *
     * @param newOutlookUser the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OutlookUser newOutlookUser, final ICallback<? super OutlookUser> callback);

    /**
     * Posts a OutlookUser with a new object
     *
     * @param newOutlookUser the new object to create
     * @return the created OutlookUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookUser post(final OutlookUser newOutlookUser) throws ClientException;

    /**
     * Posts a OutlookUser with a new object
     *
     * @param newOutlookUser the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final OutlookUser newOutlookUser, final ICallback<? super OutlookUser> callback);

    /**
     * Posts a OutlookUser with a new object
     *
     * @param newOutlookUser the object to create/update
     * @return the created OutlookUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookUser put(final OutlookUser newOutlookUser) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOutlookUserRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOutlookUserRequest expand(final String value);

}

