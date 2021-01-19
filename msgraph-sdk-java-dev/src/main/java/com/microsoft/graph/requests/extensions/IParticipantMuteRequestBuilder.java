// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IParticipantMuteRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Participant Mute Request Builder.
 */
public interface IParticipantMuteRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IParticipantMuteRequest
     *
     * @param requestOptions the options for the request
     * @return the IParticipantMuteRequest instance
     */
    IParticipantMuteRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IParticipantMuteRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IParticipantMuteRequest instance
     */
    IParticipantMuteRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
