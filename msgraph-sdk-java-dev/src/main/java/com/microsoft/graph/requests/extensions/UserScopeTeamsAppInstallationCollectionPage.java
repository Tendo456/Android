// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserScopeTeamsAppInstallation;
import com.microsoft.graph.requests.extensions.IUserScopeTeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserScopeTeamsAppInstallationCollectionPage;
import com.microsoft.graph.requests.extensions.UserScopeTeamsAppInstallationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Scope Teams App Installation Collection Page.
 */
public class UserScopeTeamsAppInstallationCollectionPage extends BaseCollectionPage<UserScopeTeamsAppInstallation, IUserScopeTeamsAppInstallationCollectionRequestBuilder> implements IUserScopeTeamsAppInstallationCollectionPage {

    /**
     * A collection page for UserScopeTeamsAppInstallation
     *
     * @param response the serialized UserScopeTeamsAppInstallationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserScopeTeamsAppInstallationCollectionPage(final UserScopeTeamsAppInstallationCollectionResponse response, final IUserScopeTeamsAppInstallationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
