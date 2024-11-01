// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsApp;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Request Builder.
 */
public class TeamsAppRequestBuilder extends BaseRequestBuilder implements ITeamsAppRequestBuilder {

    /**
     * The request builder for the TeamsApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ITeamsAppRequest instance
     */
    public ITeamsAppRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITeamsAppRequest instance
     */
    public ITeamsAppRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.TeamsAppRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ITeamsAppDefinitionCollectionRequestBuilder appDefinitions() {
        return new TeamsAppDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appDefinitions"), getClient(), null);
    }

    public ITeamsAppDefinitionRequestBuilder appDefinitions(final String id) {
        return new TeamsAppDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("appDefinitions") + "/" + id, getClient(), null);
    }
}
