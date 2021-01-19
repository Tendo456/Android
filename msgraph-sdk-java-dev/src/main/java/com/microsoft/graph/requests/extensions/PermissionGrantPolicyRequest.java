// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PermissionGrantPolicy;
import com.microsoft.graph.requests.extensions.IPermissionGrantConditionSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionGrantConditionSetRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantConditionSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantConditionSetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Policy Request.
 */
public class PermissionGrantPolicyRequest extends BaseRequest implements IPermissionGrantPolicyRequest {
	
    /**
     * The request for the PermissionGrantPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PermissionGrantPolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PermissionGrantPolicy.class);
    }

    /**
     * Gets the PermissionGrantPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PermissionGrantPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PermissionGrantPolicy from the service
     *
     * @return the PermissionGrantPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PermissionGrantPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PermissionGrantPolicy> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PermissionGrantPolicy with a source
     *
     * @param sourcePermissionGrantPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PermissionGrantPolicy sourcePermissionGrantPolicy, final ICallback<? super PermissionGrantPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourcePermissionGrantPolicy);
    }

    /**
     * Patches this PermissionGrantPolicy with a source
     *
     * @param sourcePermissionGrantPolicy the source object with updates
     * @return the updated PermissionGrantPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PermissionGrantPolicy patch(final PermissionGrantPolicy sourcePermissionGrantPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourcePermissionGrantPolicy);
    }

    /**
     * Creates a PermissionGrantPolicy with a new object
     *
     * @param newPermissionGrantPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PermissionGrantPolicy newPermissionGrantPolicy, final ICallback<? super PermissionGrantPolicy> callback) {
        send(HttpMethod.POST, callback, newPermissionGrantPolicy);
    }

    /**
     * Creates a PermissionGrantPolicy with a new object
     *
     * @param newPermissionGrantPolicy the new object to create
     * @return the created PermissionGrantPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PermissionGrantPolicy post(final PermissionGrantPolicy newPermissionGrantPolicy) throws ClientException {
        return send(HttpMethod.POST, newPermissionGrantPolicy);
    }

    /**
     * Creates a PermissionGrantPolicy with a new object
     *
     * @param newPermissionGrantPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PermissionGrantPolicy newPermissionGrantPolicy, final ICallback<? super PermissionGrantPolicy> callback) {
        send(HttpMethod.PUT, callback, newPermissionGrantPolicy);
    }

    /**
     * Creates a PermissionGrantPolicy with a new object
     *
     * @param newPermissionGrantPolicy the object to create/update
     * @return the created PermissionGrantPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PermissionGrantPolicy put(final PermissionGrantPolicy newPermissionGrantPolicy) throws ClientException {
        return send(HttpMethod.PUT, newPermissionGrantPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPermissionGrantPolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PermissionGrantPolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPermissionGrantPolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PermissionGrantPolicyRequest)this;
     }

}

