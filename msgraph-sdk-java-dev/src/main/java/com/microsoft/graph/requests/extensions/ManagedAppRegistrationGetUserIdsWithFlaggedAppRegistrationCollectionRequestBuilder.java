// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration Get User Ids With Flagged App Registration Collection Request Builder.
 */
public class ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder {

    /**
     * The request builder for this collection of ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest request = new ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
