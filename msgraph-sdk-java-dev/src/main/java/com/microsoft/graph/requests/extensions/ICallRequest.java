// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Call;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Call Request.
 */
public interface ICallRequest extends IHttpRequest {

    /**
     * Gets the Call from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Call> callback);

    /**
     * Gets the Call from the service
     *
     * @return the Call from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Call get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Call> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Call with a source
     *
     * @param sourceCall the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Call sourceCall, final ICallback<? super Call> callback);

    /**
     * Patches this Call with a source
     *
     * @param sourceCall the source object with updates
     * @return the updated Call
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Call patch(final Call sourceCall) throws ClientException;

    /**
     * Posts a Call with a new object
     *
     * @param newCall the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Call newCall, final ICallback<? super Call> callback);

    /**
     * Posts a Call with a new object
     *
     * @param newCall the new object to create
     * @return the created Call
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Call post(final Call newCall) throws ClientException;

    /**
     * Posts a Call with a new object
     *
     * @param newCall the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Call newCall, final ICallback<? super Call> callback);

    /**
     * Posts a Call with a new object
     *
     * @param newCall the object to create/update
     * @return the created Call
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Call put(final Call newCall) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICallRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICallRequest expand(final String value);

}

