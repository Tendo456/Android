// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UrlAssessmentRequest;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Url Assessment Request Request.
 */
public class UrlAssessmentRequestRequest extends BaseRequest implements IUrlAssessmentRequestRequest {
	
    /**
     * The request for the UrlAssessmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UrlAssessmentRequestRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UrlAssessmentRequest.class);
    }

    /**
     * Gets the UrlAssessmentRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UrlAssessmentRequest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UrlAssessmentRequest from the service
     *
     * @return the UrlAssessmentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UrlAssessmentRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UrlAssessmentRequest> callback) {
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
     * Patches this UrlAssessmentRequest with a source
     *
     * @param sourceUrlAssessmentRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UrlAssessmentRequest sourceUrlAssessmentRequest, final ICallback<? super UrlAssessmentRequest> callback) {
        send(HttpMethod.PATCH, callback, sourceUrlAssessmentRequest);
    }

    /**
     * Patches this UrlAssessmentRequest with a source
     *
     * @param sourceUrlAssessmentRequest the source object with updates
     * @return the updated UrlAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UrlAssessmentRequest patch(final UrlAssessmentRequest sourceUrlAssessmentRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceUrlAssessmentRequest);
    }

    /**
     * Creates a UrlAssessmentRequest with a new object
     *
     * @param newUrlAssessmentRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UrlAssessmentRequest newUrlAssessmentRequest, final ICallback<? super UrlAssessmentRequest> callback) {
        send(HttpMethod.POST, callback, newUrlAssessmentRequest);
    }

    /**
     * Creates a UrlAssessmentRequest with a new object
     *
     * @param newUrlAssessmentRequest the new object to create
     * @return the created UrlAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UrlAssessmentRequest post(final UrlAssessmentRequest newUrlAssessmentRequest) throws ClientException {
        return send(HttpMethod.POST, newUrlAssessmentRequest);
    }

    /**
     * Creates a UrlAssessmentRequest with a new object
     *
     * @param newUrlAssessmentRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UrlAssessmentRequest newUrlAssessmentRequest, final ICallback<? super UrlAssessmentRequest> callback) {
        send(HttpMethod.PUT, callback, newUrlAssessmentRequest);
    }

    /**
     * Creates a UrlAssessmentRequest with a new object
     *
     * @param newUrlAssessmentRequest the object to create/update
     * @return the created UrlAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UrlAssessmentRequest put(final UrlAssessmentRequest newUrlAssessmentRequest) throws ClientException {
        return send(HttpMethod.PUT, newUrlAssessmentRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUrlAssessmentRequestRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UrlAssessmentRequestRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUrlAssessmentRequestRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UrlAssessmentRequestRequest)this;
     }

}

