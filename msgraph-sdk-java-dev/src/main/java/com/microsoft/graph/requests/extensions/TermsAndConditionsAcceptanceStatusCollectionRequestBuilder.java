// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.models.extensions.TermsAndConditionsAcceptanceStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITermsAndConditionsAcceptanceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAcceptanceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAcceptanceStatusCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Acceptance Status Collection Request Builder.
 */
public class TermsAndConditionsAcceptanceStatusCollectionRequestBuilder extends BaseRequestBuilder implements ITermsAndConditionsAcceptanceStatusCollectionRequestBuilder {

    /**
     * The request builder for this collection of TermsAndConditions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TermsAndConditionsAcceptanceStatusCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ITermsAndConditionsAcceptanceStatusCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ITermsAndConditionsAcceptanceStatusCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TermsAndConditionsAcceptanceStatusCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITermsAndConditionsAcceptanceStatusRequestBuilder byId(final String id) {
        return new TermsAndConditionsAcceptanceStatusRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
