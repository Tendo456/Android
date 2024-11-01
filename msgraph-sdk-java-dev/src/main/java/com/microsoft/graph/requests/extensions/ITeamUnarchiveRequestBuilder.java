// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITeamUnarchiveRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Team Unarchive Request Builder.
 */
public interface ITeamUnarchiveRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ITeamUnarchiveRequest
     *
     * @param requestOptions the options for the request
     * @return the ITeamUnarchiveRequest instance
     */
    ITeamUnarchiveRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the ITeamUnarchiveRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ITeamUnarchiveRequest instance
     */
    ITeamUnarchiveRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
