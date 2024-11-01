// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnenotePage;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Onenote Page Request.
 */
public interface IOnenotePageRequest extends IHttpRequest {

    /**
     * Gets the OnenotePage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super OnenotePage> callback);

    /**
     * Gets the OnenotePage from the service
     *
     * @return the OnenotePage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenotePage get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super OnenotePage> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OnenotePage with a source
     *
     * @param sourceOnenotePage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OnenotePage sourceOnenotePage, final ICallback<? super OnenotePage> callback);

    /**
     * Patches this OnenotePage with a source
     *
     * @param sourceOnenotePage the source object with updates
     * @return the updated OnenotePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenotePage patch(final OnenotePage sourceOnenotePage) throws ClientException;

    /**
     * Posts a OnenotePage with a new object
     *
     * @param newOnenotePage the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final byte[] newOnenotePage, final ICallback<? super OnenotePage> callback);

    /**
     * Posts a OnenotePage with a new object
     *
     * @param newOnenotePage the new object to create
     * @return the created OnenotePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenotePage post(final byte[] newOnenotePage) throws ClientException;

    /**
     * Posts a OnenotePage with a new object
     *
     * @param newOnenotePage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final OnenotePage newOnenotePage, final ICallback<? super OnenotePage> callback);

    /**
     * Posts a OnenotePage with a new object
     *
     * @param newOnenotePage the object to create/update
     * @return the created OnenotePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenotePage put(final OnenotePage newOnenotePage) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOnenotePageRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOnenotePageRequest expand(final String value);

}

