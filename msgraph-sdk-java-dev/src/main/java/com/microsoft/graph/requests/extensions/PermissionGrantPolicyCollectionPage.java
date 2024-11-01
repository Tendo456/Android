// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PermissionGrantPolicy;
import com.microsoft.graph.requests.extensions.IPermissionGrantPolicyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Policy Collection Page.
 */
public class PermissionGrantPolicyCollectionPage extends BaseCollectionPage<PermissionGrantPolicy, IPermissionGrantPolicyCollectionRequestBuilder> implements IPermissionGrantPolicyCollectionPage {

    /**
     * A collection page for PermissionGrantPolicy
     *
     * @param response the serialized PermissionGrantPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PermissionGrantPolicyCollectionPage(final PermissionGrantPolicyCollectionResponse response, final IPermissionGrantPolicyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
