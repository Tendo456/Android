// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Team;
import com.microsoft.graph.models.generated.TeamVisibilityType;
import com.microsoft.graph.models.generated.ClonableTeamParts;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITeamRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamCollectionRequest;
import com.microsoft.graph.requests.extensions.ITeamGetAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Team Collection Request Builder.
 */
public interface ITeamCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    ITeamCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    ITeamCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    ITeamRequestBuilder byId(final String id);


    ITeamGetAllMessagesCollectionRequestBuilder getAllMessages();
}
