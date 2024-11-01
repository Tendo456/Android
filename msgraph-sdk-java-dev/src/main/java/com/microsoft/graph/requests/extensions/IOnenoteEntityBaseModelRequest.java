// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnenoteEntityBaseModel;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Onenote Entity Base Model Request.
 */
public interface IOnenoteEntityBaseModelRequest extends IHttpRequest {

    /**
     * Gets the OnenoteEntityBaseModel from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super OnenoteEntityBaseModel> callback);

    /**
     * Gets the OnenoteEntityBaseModel from the service
     *
     * @return the OnenoteEntityBaseModel from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteEntityBaseModel get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super OnenoteEntityBaseModel> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OnenoteEntityBaseModel with a source
     *
     * @param sourceOnenoteEntityBaseModel the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OnenoteEntityBaseModel sourceOnenoteEntityBaseModel, final ICallback<? super OnenoteEntityBaseModel> callback);

    /**
     * Patches this OnenoteEntityBaseModel with a source
     *
     * @param sourceOnenoteEntityBaseModel the source object with updates
     * @return the updated OnenoteEntityBaseModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteEntityBaseModel patch(final OnenoteEntityBaseModel sourceOnenoteEntityBaseModel) throws ClientException;

    /**
     * Posts a OnenoteEntityBaseModel with a new object
     *
     * @param newOnenoteEntityBaseModel the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OnenoteEntityBaseModel newOnenoteEntityBaseModel, final ICallback<? super OnenoteEntityBaseModel> callback);

    /**
     * Posts a OnenoteEntityBaseModel with a new object
     *
     * @param newOnenoteEntityBaseModel the new object to create
     * @return the created OnenoteEntityBaseModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteEntityBaseModel post(final OnenoteEntityBaseModel newOnenoteEntityBaseModel) throws ClientException;

    /**
     * Posts a OnenoteEntityBaseModel with a new object
     *
     * @param newOnenoteEntityBaseModel the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final OnenoteEntityBaseModel newOnenoteEntityBaseModel, final ICallback<? super OnenoteEntityBaseModel> callback);

    /**
     * Posts a OnenoteEntityBaseModel with a new object
     *
     * @param newOnenoteEntityBaseModel the object to create/update
     * @return the created OnenoteEntityBaseModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OnenoteEntityBaseModel put(final OnenoteEntityBaseModel newOnenoteEntityBaseModel) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOnenoteEntityBaseModelRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOnenoteEntityBaseModelRequest expand(final String value);

}

