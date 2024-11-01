// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITeamUnarchiveRequest;
import com.microsoft.graph.requests.extensions.TeamUnarchiveRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Unarchive Request Builder.
 */
public class TeamUnarchiveRequestBuilder extends BaseActionRequestBuilder implements ITeamUnarchiveRequestBuilder {

    /**
     * The request builder for this TeamUnarchive
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamUnarchiveRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ITeamUnarchiveRequest
     *
     * @param requestOptions the options for the request
     * @return the ITeamUnarchiveRequest instance
     */
    public ITeamUnarchiveRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ITeamUnarchiveRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ITeamUnarchiveRequest instance
     */
    public ITeamUnarchiveRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        TeamUnarchiveRequest request = new TeamUnarchiveRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
