// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserFindMeetingTimesRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Find Meeting Times Request Builder.
 */
public interface IUserFindMeetingTimesRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IUserFindMeetingTimesRequest
     *
     * @param requestOptions the options for the request
     * @return the IUserFindMeetingTimesRequest instance
     */
    IUserFindMeetingTimesRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IUserFindMeetingTimesRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IUserFindMeetingTimesRequest instance
     */
    IUserFindMeetingTimesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
