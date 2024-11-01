// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Operation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Operation Request.
 */
public interface IOperationRequest extends IHttpRequest {

    /**
     * Gets the Operation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Operation> callback);

    /**
     * Gets the Operation from the service
     *
     * @return the Operation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Operation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Operation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Operation with a source
     *
     * @param sourceOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Operation sourceOperation, final ICallback<? super Operation> callback);

    /**
     * Patches this Operation with a source
     *
     * @param sourceOperation the source object with updates
     * @return the updated Operation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Operation patch(final Operation sourceOperation) throws ClientException;

    /**
     * Posts a Operation with a new object
     *
     * @param newOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Operation newOperation, final ICallback<? super Operation> callback);

    /**
     * Posts a Operation with a new object
     *
     * @param newOperation the new object to create
     * @return the created Operation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Operation post(final Operation newOperation) throws ClientException;

    /**
     * Posts a Operation with a new object
     *
     * @param newOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Operation newOperation, final ICallback<? super Operation> callback);

    /**
     * Posts a Operation with a new object
     *
     * @param newOperation the object to create/update
     * @return the created Operation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Operation put(final Operation newOperation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOperationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOperationRequest expand(final String value);

}

