// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.requests.extensions.IAttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Request.
 */
public class MessageRequest extends BaseRequest implements IMessageRequest {
	
    /**
     * The request for the Message
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public MessageRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends Message> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the Message
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MessageRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Message.class);
    }

    /**
     * Gets the Message from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Message> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Message from the service
     *
     * @return the Message from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Message get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Message> callback) {
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
     * Patches this Message with a source
     *
     * @param sourceMessage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Message sourceMessage, final ICallback<? super Message> callback) {
        send(HttpMethod.PATCH, callback, sourceMessage);
    }

    /**
     * Patches this Message with a source
     *
     * @param sourceMessage the source object with updates
     * @return the updated Message
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Message patch(final Message sourceMessage) throws ClientException {
        return send(HttpMethod.PATCH, sourceMessage);
    }

    /**
     * Creates a Message with a new object
     *
     * @param newMessage the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Message newMessage, final ICallback<? super Message> callback) {
        send(HttpMethod.POST, callback, newMessage);
    }

    /**
     * Creates a Message with a new object
     *
     * @param newMessage the new object to create
     * @return the created Message
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Message post(final Message newMessage) throws ClientException {
        return send(HttpMethod.POST, newMessage);
    }

    /**
     * Creates a Message with a new object
     *
     * @param newMessage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Message newMessage, final ICallback<? super Message> callback) {
        send(HttpMethod.PUT, callback, newMessage);
    }

    /**
     * Creates a Message with a new object
     *
     * @param newMessage the object to create/update
     * @return the created Message
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Message put(final Message newMessage) throws ClientException {
        return send(HttpMethod.PUT, newMessage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMessageRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MessageRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMessageRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MessageRequest)this;
     }

}

