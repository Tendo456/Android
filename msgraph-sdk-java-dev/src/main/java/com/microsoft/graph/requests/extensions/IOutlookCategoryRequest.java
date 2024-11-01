// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OutlookCategory;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Outlook Category Request.
 */
public interface IOutlookCategoryRequest extends IHttpRequest {

    /**
     * Gets the OutlookCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super OutlookCategory> callback);

    /**
     * Gets the OutlookCategory from the service
     *
     * @return the OutlookCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookCategory get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super OutlookCategory> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OutlookCategory with a source
     *
     * @param sourceOutlookCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OutlookCategory sourceOutlookCategory, final ICallback<? super OutlookCategory> callback);

    /**
     * Patches this OutlookCategory with a source
     *
     * @param sourceOutlookCategory the source object with updates
     * @return the updated OutlookCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookCategory patch(final OutlookCategory sourceOutlookCategory) throws ClientException;

    /**
     * Posts a OutlookCategory with a new object
     *
     * @param newOutlookCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OutlookCategory newOutlookCategory, final ICallback<? super OutlookCategory> callback);

    /**
     * Posts a OutlookCategory with a new object
     *
     * @param newOutlookCategory the new object to create
     * @return the created OutlookCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookCategory post(final OutlookCategory newOutlookCategory) throws ClientException;

    /**
     * Posts a OutlookCategory with a new object
     *
     * @param newOutlookCategory the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final OutlookCategory newOutlookCategory, final ICallback<? super OutlookCategory> callback);

    /**
     * Posts a OutlookCategory with a new object
     *
     * @param newOutlookCategory the object to create/update
     * @return the created OutlookCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OutlookCategory put(final OutlookCategory newOutlookCategory) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOutlookCategoryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOutlookCategoryRequest expand(final String value);

}

