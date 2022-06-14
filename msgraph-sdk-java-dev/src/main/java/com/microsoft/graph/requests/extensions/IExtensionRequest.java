// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Extension;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Extension Request.
 */
public interface IExtensionRequest extends IHttpRequest {

    /**
     * Gets the Extension from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Extension> callback);

    /**
     * Gets the Extension from the service
     *
     * @return the Extension from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Extension get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Extension> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Extension with a source
     *
     * @param sourceExtension the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Extension sourceExtension, final ICallback<? super Extension> callback);

    /**
     * Patches this Extension with a source
     *
     * @param sourceExtension the source object with updates
     * @return the updated Extension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Extension patch(final Extension sourceExtension) throws ClientException;

    /**
     * Posts a Extension with a new object
     *
     * @param newExtension the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Extension newExtension, final ICallback<? super Extension> callback);

    /**
     * Posts a Extension with a new object
     *
     * @param newExtension the new object to create
     * @return the created Extension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Extension post(final Extension newExtension) throws ClientException;

    /**
     * Posts a Extension with a new object
     *
     * @param newExtension the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Extension newExtension, final ICallback<? super Extension> callback);

    /**
     * Posts a Extension with a new object
     *
     * @param newExtension the object to create/update
     * @return the created Extension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Extension put(final Extension newExtension) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IExtensionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IExtensionRequest expand(final String value);

}

