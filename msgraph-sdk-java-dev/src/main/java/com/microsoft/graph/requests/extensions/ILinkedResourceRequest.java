// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.LinkedResource;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Linked Resource Request.
 */
public interface ILinkedResourceRequest extends IHttpRequest {

    /**
     * Gets the LinkedResource from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super LinkedResource> callback);

    /**
     * Gets the LinkedResource from the service
     *
     * @return the LinkedResource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    LinkedResource get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super LinkedResource> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this LinkedResource with a source
     *
     * @param sourceLinkedResource the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final LinkedResource sourceLinkedResource, final ICallback<? super LinkedResource> callback);

    /**
     * Patches this LinkedResource with a source
     *
     * @param sourceLinkedResource the source object with updates
     * @return the updated LinkedResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    LinkedResource patch(final LinkedResource sourceLinkedResource) throws ClientException;

    /**
     * Posts a LinkedResource with a new object
     *
     * @param newLinkedResource the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final LinkedResource newLinkedResource, final ICallback<? super LinkedResource> callback);

    /**
     * Posts a LinkedResource with a new object
     *
     * @param newLinkedResource the new object to create
     * @return the created LinkedResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    LinkedResource post(final LinkedResource newLinkedResource) throws ClientException;

    /**
     * Posts a LinkedResource with a new object
     *
     * @param newLinkedResource the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final LinkedResource newLinkedResource, final ICallback<? super LinkedResource> callback);

    /**
     * Posts a LinkedResource with a new object
     *
     * @param newLinkedResource the object to create/update
     * @return the created LinkedResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    LinkedResource put(final LinkedResource newLinkedResource) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ILinkedResourceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ILinkedResourceRequest expand(final String value);

}

