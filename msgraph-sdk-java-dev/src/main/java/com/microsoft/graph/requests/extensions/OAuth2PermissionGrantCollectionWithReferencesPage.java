// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionResponse;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the OAuth2Permission Grant Collection With References Page.
 */
public class OAuth2PermissionGrantCollectionWithReferencesPage extends BaseCollectionPage<OAuth2PermissionGrant, IOAuth2PermissionGrantCollectionWithReferencesRequestBuilder> implements IOAuth2PermissionGrantCollectionWithReferencesPage {

    /**
     * A collection page for OAuth2PermissionGrant
     *
     * @param response the serialized OAuth2PermissionGrantCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OAuth2PermissionGrantCollectionWithReferencesPage(final OAuth2PermissionGrantCollectionResponse response, final IOAuth2PermissionGrantCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
