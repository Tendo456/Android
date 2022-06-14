// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserInstallStateSummary;
import com.microsoft.graph.requests.extensions.IUserInstallStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserInstallStateSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.UserInstallStateSummaryCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Install State Summary Collection Page.
 */
public class UserInstallStateSummaryCollectionPage extends BaseCollectionPage<UserInstallStateSummary, IUserInstallStateSummaryCollectionRequestBuilder> implements IUserInstallStateSummaryCollectionPage {

    /**
     * A collection page for UserInstallStateSummary
     *
     * @param response the serialized UserInstallStateSummaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserInstallStateSummaryCollectionPage(final UserInstallStateSummaryCollectionResponse response, final IUserInstallStateSummaryCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
