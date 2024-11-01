// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryRoleTemplate;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Role Template Request.
 */
public class DirectoryRoleTemplateRequest extends BaseRequest implements IDirectoryRoleTemplateRequest {
	
    /**
     * The request for the DirectoryRoleTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryRoleTemplateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryRoleTemplate.class);
    }

    /**
     * Gets the DirectoryRoleTemplate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DirectoryRoleTemplate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DirectoryRoleTemplate from the service
     *
     * @return the DirectoryRoleTemplate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRoleTemplate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DirectoryRoleTemplate> callback) {
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
     * Patches this DirectoryRoleTemplate with a source
     *
     * @param sourceDirectoryRoleTemplate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DirectoryRoleTemplate sourceDirectoryRoleTemplate, final ICallback<? super DirectoryRoleTemplate> callback) {
        send(HttpMethod.PATCH, callback, sourceDirectoryRoleTemplate);
    }

    /**
     * Patches this DirectoryRoleTemplate with a source
     *
     * @param sourceDirectoryRoleTemplate the source object with updates
     * @return the updated DirectoryRoleTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRoleTemplate patch(final DirectoryRoleTemplate sourceDirectoryRoleTemplate) throws ClientException {
        return send(HttpMethod.PATCH, sourceDirectoryRoleTemplate);
    }

    /**
     * Creates a DirectoryRoleTemplate with a new object
     *
     * @param newDirectoryRoleTemplate the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DirectoryRoleTemplate newDirectoryRoleTemplate, final ICallback<? super DirectoryRoleTemplate> callback) {
        send(HttpMethod.POST, callback, newDirectoryRoleTemplate);
    }

    /**
     * Creates a DirectoryRoleTemplate with a new object
     *
     * @param newDirectoryRoleTemplate the new object to create
     * @return the created DirectoryRoleTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRoleTemplate post(final DirectoryRoleTemplate newDirectoryRoleTemplate) throws ClientException {
        return send(HttpMethod.POST, newDirectoryRoleTemplate);
    }

    /**
     * Creates a DirectoryRoleTemplate with a new object
     *
     * @param newDirectoryRoleTemplate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DirectoryRoleTemplate newDirectoryRoleTemplate, final ICallback<? super DirectoryRoleTemplate> callback) {
        send(HttpMethod.PUT, callback, newDirectoryRoleTemplate);
    }

    /**
     * Creates a DirectoryRoleTemplate with a new object
     *
     * @param newDirectoryRoleTemplate the object to create/update
     * @return the created DirectoryRoleTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRoleTemplate put(final DirectoryRoleTemplate newDirectoryRoleTemplate) throws ClientException {
        return send(HttpMethod.PUT, newDirectoryRoleTemplate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDirectoryRoleTemplateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DirectoryRoleTemplateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDirectoryRoleTemplateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DirectoryRoleTemplateRequest)this;
     }

}

