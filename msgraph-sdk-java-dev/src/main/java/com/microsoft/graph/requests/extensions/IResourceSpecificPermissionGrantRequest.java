// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ResourceSpecificPermissionGrant;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Resource Specific Permission Grant Request.
 */
public interface IResourceSpecificPermissionGrantRequest extends IHttpRequest {

    /**
     * Gets the ResourceSpecificPermissionGrant from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ResourceSpecificPermissionGrant> callback);

    /**
     * Gets the ResourceSpecificPermissionGrant from the service
     *
     * @return the ResourceSpecificPermissionGrant from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ResourceSpecificPermissionGrant get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ResourceSpecificPermissionGrant> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ResourceSpecificPermissionGrant with a source
     *
     * @param sourceResourceSpecificPermissionGrant the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ResourceSpecificPermissionGrant sourceResourceSpecificPermissionGrant, final ICallback<? super ResourceSpecificPermissionGrant> callback);

    /**
     * Patches this ResourceSpecificPermissionGrant with a source
     *
     * @param sourceResourceSpecificPermissionGrant the source object with updates
     * @return the updated ResourceSpecificPermissionGrant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ResourceSpecificPermissionGrant patch(final ResourceSpecificPermissionGrant sourceResourceSpecificPermissionGrant) throws ClientException;

    /**
     * Posts a ResourceSpecificPermissionGrant with a new object
     *
     * @param newResourceSpecificPermissionGrant the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ResourceSpecificPermissionGrant newResourceSpecificPermissionGrant, final ICallback<? super ResourceSpecificPermissionGrant> callback);

    /**
     * Posts a ResourceSpecificPermissionGrant with a new object
     *
     * @param newResourceSpecificPermissionGrant the new object to create
     * @return the created ResourceSpecificPermissionGrant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ResourceSpecificPermissionGrant post(final ResourceSpecificPermissionGrant newResourceSpecificPermissionGrant) throws ClientException;

    /**
     * Posts a ResourceSpecificPermissionGrant with a new object
     *
     * @param newResourceSpecificPermissionGrant the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ResourceSpecificPermissionGrant newResourceSpecificPermissionGrant, final ICallback<? super ResourceSpecificPermissionGrant> callback);

    /**
     * Posts a ResourceSpecificPermissionGrant with a new object
     *
     * @param newResourceSpecificPermissionGrant the object to create/update
     * @return the created ResourceSpecificPermissionGrant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ResourceSpecificPermissionGrant put(final ResourceSpecificPermissionGrant newResourceSpecificPermissionGrant) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IResourceSpecificPermissionGrantRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IResourceSpecificPermissionGrantRequest expand(final String value);

}

