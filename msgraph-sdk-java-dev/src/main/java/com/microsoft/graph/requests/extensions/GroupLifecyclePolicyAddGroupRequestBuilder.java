// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyAddGroupRequest;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyAddGroupRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Lifecycle Policy Add Group Request Builder.
 */
public class GroupLifecyclePolicyAddGroupRequestBuilder extends BaseActionRequestBuilder implements IGroupLifecyclePolicyAddGroupRequestBuilder {

    /**
     * The request builder for this GroupLifecyclePolicyAddGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param groupId the groupId
     */
    public GroupLifecyclePolicyAddGroupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String groupId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("groupId", groupId);
    }

    /**
     * Creates the IGroupLifecyclePolicyAddGroupRequest
     *
     * @param requestOptions the options for the request
     * @return the IGroupLifecyclePolicyAddGroupRequest instance
     */
    public IGroupLifecyclePolicyAddGroupRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IGroupLifecyclePolicyAddGroupRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupLifecyclePolicyAddGroupRequest instance
     */
    public IGroupLifecyclePolicyAddGroupRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        GroupLifecyclePolicyAddGroupRequest request = new GroupLifecyclePolicyAddGroupRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("groupId")) {
            request.body.groupId = getParameter("groupId");
        }

        return request;
    }
}
