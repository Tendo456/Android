// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosManagedAppProtection;
import com.microsoft.graph.requests.extensions.IManagedMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyDeploymentSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyDeploymentSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Managed App Protection Request.
 */
public class IosManagedAppProtectionRequest extends BaseRequest implements IIosManagedAppProtectionRequest {
	
    /**
     * The request for the IosManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosManagedAppProtectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosManagedAppProtection.class);
    }

    /**
     * Gets the IosManagedAppProtection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super IosManagedAppProtection> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosManagedAppProtection from the service
     *
     * @return the IosManagedAppProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosManagedAppProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super IosManagedAppProtection> callback) {
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
     * Patches this IosManagedAppProtection with a source
     *
     * @param sourceIosManagedAppProtection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosManagedAppProtection sourceIosManagedAppProtection, final ICallback<? super IosManagedAppProtection> callback) {
        send(HttpMethod.PATCH, callback, sourceIosManagedAppProtection);
    }

    /**
     * Patches this IosManagedAppProtection with a source
     *
     * @param sourceIosManagedAppProtection the source object with updates
     * @return the updated IosManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosManagedAppProtection patch(final IosManagedAppProtection sourceIosManagedAppProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosManagedAppProtection);
    }

    /**
     * Creates a IosManagedAppProtection with a new object
     *
     * @param newIosManagedAppProtection the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosManagedAppProtection newIosManagedAppProtection, final ICallback<? super IosManagedAppProtection> callback) {
        send(HttpMethod.POST, callback, newIosManagedAppProtection);
    }

    /**
     * Creates a IosManagedAppProtection with a new object
     *
     * @param newIosManagedAppProtection the new object to create
     * @return the created IosManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosManagedAppProtection post(final IosManagedAppProtection newIosManagedAppProtection) throws ClientException {
        return send(HttpMethod.POST, newIosManagedAppProtection);
    }

    /**
     * Creates a IosManagedAppProtection with a new object
     *
     * @param newIosManagedAppProtection the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosManagedAppProtection newIosManagedAppProtection, final ICallback<? super IosManagedAppProtection> callback) {
        send(HttpMethod.PUT, callback, newIosManagedAppProtection);
    }

    /**
     * Creates a IosManagedAppProtection with a new object
     *
     * @param newIosManagedAppProtection the object to create/update
     * @return the created IosManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosManagedAppProtection put(final IosManagedAppProtection newIosManagedAppProtection) throws ClientException {
        return send(HttpMethod.PUT, newIosManagedAppProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosManagedAppProtectionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosManagedAppProtectionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosManagedAppProtectionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosManagedAppProtectionRequest)this;
     }

}
