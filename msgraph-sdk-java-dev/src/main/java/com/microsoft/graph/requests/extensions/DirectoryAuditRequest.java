// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryAudit;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Audit Request.
 */
public class DirectoryAuditRequest extends BaseRequest implements IDirectoryAuditRequest {
	
    /**
     * The request for the DirectoryAudit
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryAuditRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryAudit.class);
    }

    /**
     * Gets the DirectoryAudit from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DirectoryAudit> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DirectoryAudit from the service
     *
     * @return the DirectoryAudit from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryAudit get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DirectoryAudit> callback) {
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
     * Patches this DirectoryAudit with a source
     *
     * @param sourceDirectoryAudit the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DirectoryAudit sourceDirectoryAudit, final ICallback<? super DirectoryAudit> callback) {
        send(HttpMethod.PATCH, callback, sourceDirectoryAudit);
    }

    /**
     * Patches this DirectoryAudit with a source
     *
     * @param sourceDirectoryAudit the source object with updates
     * @return the updated DirectoryAudit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryAudit patch(final DirectoryAudit sourceDirectoryAudit) throws ClientException {
        return send(HttpMethod.PATCH, sourceDirectoryAudit);
    }

    /**
     * Creates a DirectoryAudit with a new object
     *
     * @param newDirectoryAudit the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DirectoryAudit newDirectoryAudit, final ICallback<? super DirectoryAudit> callback) {
        send(HttpMethod.POST, callback, newDirectoryAudit);
    }

    /**
     * Creates a DirectoryAudit with a new object
     *
     * @param newDirectoryAudit the new object to create
     * @return the created DirectoryAudit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryAudit post(final DirectoryAudit newDirectoryAudit) throws ClientException {
        return send(HttpMethod.POST, newDirectoryAudit);
    }

    /**
     * Creates a DirectoryAudit with a new object
     *
     * @param newDirectoryAudit the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DirectoryAudit newDirectoryAudit, final ICallback<? super DirectoryAudit> callback) {
        send(HttpMethod.PUT, callback, newDirectoryAudit);
    }

    /**
     * Creates a DirectoryAudit with a new object
     *
     * @param newDirectoryAudit the object to create/update
     * @return the created DirectoryAudit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryAudit put(final DirectoryAudit newDirectoryAudit) throws ClientException {
        return send(HttpMethod.PUT, newDirectoryAudit);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDirectoryAuditRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DirectoryAuditRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDirectoryAuditRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DirectoryAuditRequest)this;
     }

}

