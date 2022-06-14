// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Place;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Place Request.
 */
public interface IPlaceRequest extends IHttpRequest {

    /**
     * Gets the Place from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Place> callback);

    /**
     * Gets the Place from the service
     *
     * @return the Place from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Place get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Place> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Place with a source
     *
     * @param sourcePlace the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Place sourcePlace, final ICallback<? super Place> callback);

    /**
     * Patches this Place with a source
     *
     * @param sourcePlace the source object with updates
     * @return the updated Place
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Place patch(final Place sourcePlace) throws ClientException;

    /**
     * Posts a Place with a new object
     *
     * @param newPlace the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Place newPlace, final ICallback<? super Place> callback);

    /**
     * Posts a Place with a new object
     *
     * @param newPlace the new object to create
     * @return the created Place
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Place post(final Place newPlace) throws ClientException;

    /**
     * Posts a Place with a new object
     *
     * @param newPlace the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Place newPlace, final ICallback<? super Place> callback);

    /**
     * Posts a Place with a new object
     *
     * @param newPlace the object to create/update
     * @return the created Place
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Place put(final Place newPlace) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPlaceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPlaceRequest expand(final String value);

}

