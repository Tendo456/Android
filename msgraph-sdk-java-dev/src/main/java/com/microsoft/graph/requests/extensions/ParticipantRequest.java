// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Participant;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.models.extensions.InviteParticipantsOperation;
import com.microsoft.graph.models.extensions.MuteParticipantOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant Request.
 */
public class ParticipantRequest extends BaseRequest implements IParticipantRequest {
	
    /**
     * The request for the Participant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ParticipantRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Participant.class);
    }

    /**
     * Gets the Participant from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Participant> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Participant from the service
     *
     * @return the Participant from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Participant get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Participant> callback) {
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
     * Patches this Participant with a source
     *
     * @param sourceParticipant the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Participant sourceParticipant, final ICallback<? super Participant> callback) {
        send(HttpMethod.PATCH, callback, sourceParticipant);
    }

    /**
     * Patches this Participant with a source
     *
     * @param sourceParticipant the source object with updates
     * @return the updated Participant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Participant patch(final Participant sourceParticipant) throws ClientException {
        return send(HttpMethod.PATCH, sourceParticipant);
    }

    /**
     * Creates a Participant with a new object
     *
     * @param newParticipant the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Participant newParticipant, final ICallback<? super Participant> callback) {
        send(HttpMethod.POST, callback, newParticipant);
    }

    /**
     * Creates a Participant with a new object
     *
     * @param newParticipant the new object to create
     * @return the created Participant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Participant post(final Participant newParticipant) throws ClientException {
        return send(HttpMethod.POST, newParticipant);
    }

    /**
     * Creates a Participant with a new object
     *
     * @param newParticipant the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Participant newParticipant, final ICallback<? super Participant> callback) {
        send(HttpMethod.PUT, callback, newParticipant);
    }

    /**
     * Creates a Participant with a new object
     *
     * @param newParticipant the object to create/update
     * @return the created Participant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Participant put(final Participant newParticipant) throws ClientException {
        return send(HttpMethod.PUT, newParticipant);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IParticipantRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ParticipantRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IParticipantRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ParticipantRequest)this;
     }

}

