// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed App Registration Request.
 */
public interface IManagedAppRegistrationRequest extends IHttpRequest {

    /**
     * Gets the ManagedAppRegistration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ManagedAppRegistration> callback);

    /**
     * Gets the ManagedAppRegistration from the service
     *
     * @return the ManagedAppRegistration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppRegistration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ManagedAppRegistration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagedAppRegistration with a source
     *
     * @param sourceManagedAppRegistration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedAppRegistration sourceManagedAppRegistration, final ICallback<? super ManagedAppRegistration> callback);

    /**
     * Patches this ManagedAppRegistration with a source
     *
     * @param sourceManagedAppRegistration the source object with updates
     * @return the updated ManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppRegistration patch(final ManagedAppRegistration sourceManagedAppRegistration) throws ClientException;

    /**
     * Posts a ManagedAppRegistration with a new object
     *
     * @param newManagedAppRegistration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedAppRegistration newManagedAppRegistration, final ICallback<? super ManagedAppRegistration> callback);

    /**
     * Posts a ManagedAppRegistration with a new object
     *
     * @param newManagedAppRegistration the new object to create
     * @return the created ManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppRegistration post(final ManagedAppRegistration newManagedAppRegistration) throws ClientException;

    /**
     * Posts a ManagedAppRegistration with a new object
     *
     * @param newManagedAppRegistration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ManagedAppRegistration newManagedAppRegistration, final ICallback<? super ManagedAppRegistration> callback);

    /**
     * Posts a ManagedAppRegistration with a new object
     *
     * @param newManagedAppRegistration the object to create/update
     * @return the created ManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedAppRegistration put(final ManagedAppRegistration newManagedAppRegistration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedAppRegistrationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedAppRegistrationRequest expand(final String value);

}

