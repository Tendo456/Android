// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosVppEBook;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp EBook Request.
 */
public class IosVppEBookRequest extends BaseRequest implements IIosVppEBookRequest {
	
    /**
     * The request for the IosVppEBook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosVppEBookRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosVppEBook.class);
    }

    /**
     * Gets the IosVppEBook from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super IosVppEBook> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosVppEBook from the service
     *
     * @return the IosVppEBook from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVppEBook get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super IosVppEBook> callback) {
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
     * Patches this IosVppEBook with a source
     *
     * @param sourceIosVppEBook the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosVppEBook sourceIosVppEBook, final ICallback<? super IosVppEBook> callback) {
        send(HttpMethod.PATCH, callback, sourceIosVppEBook);
    }

    /**
     * Patches this IosVppEBook with a source
     *
     * @param sourceIosVppEBook the source object with updates
     * @return the updated IosVppEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVppEBook patch(final IosVppEBook sourceIosVppEBook) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosVppEBook);
    }

    /**
     * Creates a IosVppEBook with a new object
     *
     * @param newIosVppEBook the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosVppEBook newIosVppEBook, final ICallback<? super IosVppEBook> callback) {
        send(HttpMethod.POST, callback, newIosVppEBook);
    }

    /**
     * Creates a IosVppEBook with a new object
     *
     * @param newIosVppEBook the new object to create
     * @return the created IosVppEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVppEBook post(final IosVppEBook newIosVppEBook) throws ClientException {
        return send(HttpMethod.POST, newIosVppEBook);
    }

    /**
     * Creates a IosVppEBook with a new object
     *
     * @param newIosVppEBook the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosVppEBook newIosVppEBook, final ICallback<? super IosVppEBook> callback) {
        send(HttpMethod.PUT, callback, newIosVppEBook);
    }

    /**
     * Creates a IosVppEBook with a new object
     *
     * @param newIosVppEBook the object to create/update
     * @return the created IosVppEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVppEBook put(final IosVppEBook newIosVppEBook) throws ClientException {
        return send(HttpMethod.PUT, newIosVppEBook);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosVppEBookRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosVppEBookRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosVppEBookRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosVppEBookRequest)this;
     }

}

