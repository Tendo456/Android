// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.BaseItemVersion;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Item Version Request.
 */
public interface IBaseItemVersionRequest extends IHttpRequest {

    /**
     * Gets the BaseItemVersion from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super BaseItemVersion> callback);

    /**
     * Gets the BaseItemVersion from the service
     *
     * @return the BaseItemVersion from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BaseItemVersion get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super BaseItemVersion> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this BaseItemVersion with a source
     *
     * @param sourceBaseItemVersion the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final BaseItemVersion sourceBaseItemVersion, final ICallback<? super BaseItemVersion> callback);

    /**
     * Patches this BaseItemVersion with a source
     *
     * @param sourceBaseItemVersion the source object with updates
     * @return the updated BaseItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BaseItemVersion patch(final BaseItemVersion sourceBaseItemVersion) throws ClientException;

    /**
     * Posts a BaseItemVersion with a new object
     *
     * @param newBaseItemVersion the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final BaseItemVersion newBaseItemVersion, final ICallback<? super BaseItemVersion> callback);

    /**
     * Posts a BaseItemVersion with a new object
     *
     * @param newBaseItemVersion the new object to create
     * @return the created BaseItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BaseItemVersion post(final BaseItemVersion newBaseItemVersion) throws ClientException;

    /**
     * Posts a BaseItemVersion with a new object
     *
     * @param newBaseItemVersion the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final BaseItemVersion newBaseItemVersion, final ICallback<? super BaseItemVersion> callback);

    /**
     * Posts a BaseItemVersion with a new object
     *
     * @param newBaseItemVersion the object to create/update
     * @return the created BaseItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BaseItemVersion put(final BaseItemVersion newBaseItemVersion) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseItemVersionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseItemVersionRequest expand(final String value);

}

