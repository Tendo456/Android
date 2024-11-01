// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidManagedAppRegistration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Managed App Registration Request.
 */
public interface IAndroidManagedAppRegistrationRequest extends IHttpRequest {

    /**
     * Gets the AndroidManagedAppRegistration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AndroidManagedAppRegistration> callback);

    /**
     * Gets the AndroidManagedAppRegistration from the service
     *
     * @return the AndroidManagedAppRegistration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidManagedAppRegistration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AndroidManagedAppRegistration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidManagedAppRegistration with a source
     *
     * @param sourceAndroidManagedAppRegistration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidManagedAppRegistration sourceAndroidManagedAppRegistration, final ICallback<? super AndroidManagedAppRegistration> callback);

    /**
     * Patches this AndroidManagedAppRegistration with a source
     *
     * @param sourceAndroidManagedAppRegistration the source object with updates
     * @return the updated AndroidManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidManagedAppRegistration patch(final AndroidManagedAppRegistration sourceAndroidManagedAppRegistration) throws ClientException;

    /**
     * Posts a AndroidManagedAppRegistration with a new object
     *
     * @param newAndroidManagedAppRegistration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidManagedAppRegistration newAndroidManagedAppRegistration, final ICallback<? super AndroidManagedAppRegistration> callback);

    /**
     * Posts a AndroidManagedAppRegistration with a new object
     *
     * @param newAndroidManagedAppRegistration the new object to create
     * @return the created AndroidManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidManagedAppRegistration post(final AndroidManagedAppRegistration newAndroidManagedAppRegistration) throws ClientException;

    /**
     * Posts a AndroidManagedAppRegistration with a new object
     *
     * @param newAndroidManagedAppRegistration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidManagedAppRegistration newAndroidManagedAppRegistration, final ICallback<? super AndroidManagedAppRegistration> callback);

    /**
     * Posts a AndroidManagedAppRegistration with a new object
     *
     * @param newAndroidManagedAppRegistration the object to create/update
     * @return the created AndroidManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidManagedAppRegistration put(final AndroidManagedAppRegistration newAndroidManagedAppRegistration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidManagedAppRegistrationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidManagedAppRegistrationRequest expand(final String value);

}

