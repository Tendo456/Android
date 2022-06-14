// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IdentitySecurityDefaultsEnforcementPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Identity Security Defaults Enforcement Policy Request.
 */
public interface IIdentitySecurityDefaultsEnforcementPolicyRequest extends IHttpRequest {

    /**
     * Gets the IdentitySecurityDefaultsEnforcementPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super IdentitySecurityDefaultsEnforcementPolicy> callback);

    /**
     * Gets the IdentitySecurityDefaultsEnforcementPolicy from the service
     *
     * @return the IdentitySecurityDefaultsEnforcementPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IdentitySecurityDefaultsEnforcementPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super IdentitySecurityDefaultsEnforcementPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IdentitySecurityDefaultsEnforcementPolicy with a source
     *
     * @param sourceIdentitySecurityDefaultsEnforcementPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IdentitySecurityDefaultsEnforcementPolicy sourceIdentitySecurityDefaultsEnforcementPolicy, final ICallback<? super IdentitySecurityDefaultsEnforcementPolicy> callback);

    /**
     * Patches this IdentitySecurityDefaultsEnforcementPolicy with a source
     *
     * @param sourceIdentitySecurityDefaultsEnforcementPolicy the source object with updates
     * @return the updated IdentitySecurityDefaultsEnforcementPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IdentitySecurityDefaultsEnforcementPolicy patch(final IdentitySecurityDefaultsEnforcementPolicy sourceIdentitySecurityDefaultsEnforcementPolicy) throws ClientException;

    /**
     * Posts a IdentitySecurityDefaultsEnforcementPolicy with a new object
     *
     * @param newIdentitySecurityDefaultsEnforcementPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IdentitySecurityDefaultsEnforcementPolicy newIdentitySecurityDefaultsEnforcementPolicy, final ICallback<? super IdentitySecurityDefaultsEnforcementPolicy> callback);

    /**
     * Posts a IdentitySecurityDefaultsEnforcementPolicy with a new object
     *
     * @param newIdentitySecurityDefaultsEnforcementPolicy the new object to create
     * @return the created IdentitySecurityDefaultsEnforcementPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IdentitySecurityDefaultsEnforcementPolicy post(final IdentitySecurityDefaultsEnforcementPolicy newIdentitySecurityDefaultsEnforcementPolicy) throws ClientException;

    /**
     * Posts a IdentitySecurityDefaultsEnforcementPolicy with a new object
     *
     * @param newIdentitySecurityDefaultsEnforcementPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final IdentitySecurityDefaultsEnforcementPolicy newIdentitySecurityDefaultsEnforcementPolicy, final ICallback<? super IdentitySecurityDefaultsEnforcementPolicy> callback);

    /**
     * Posts a IdentitySecurityDefaultsEnforcementPolicy with a new object
     *
     * @param newIdentitySecurityDefaultsEnforcementPolicy the object to create/update
     * @return the created IdentitySecurityDefaultsEnforcementPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IdentitySecurityDefaultsEnforcementPolicy put(final IdentitySecurityDefaultsEnforcementPolicy newIdentitySecurityDefaultsEnforcementPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIdentitySecurityDefaultsEnforcementPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIdentitySecurityDefaultsEnforcementPolicyRequest expand(final String value);

}

