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
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration Get User Ids With Flagged App Registration Collection Page.
 */
public class ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage extends BaseCollectionPage<String, IManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder> implements IManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage {

    /**
     * A collection page for String.
     *
     * @param response The serialized ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionPage(final ManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionResponse response, final IManagedAppRegistrationGetUserIdsWithFlaggedAppRegistrationCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
