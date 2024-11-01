// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SignIn;
import com.microsoft.graph.requests.extensions.ISignInCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SignInCollectionPage;
import com.microsoft.graph.requests.extensions.SignInCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sign In Collection Page.
 */
public class SignInCollectionPage extends BaseCollectionPage<SignIn, ISignInCollectionRequestBuilder> implements ISignInCollectionPage {

    /**
     * A collection page for SignIn
     *
     * @param response the serialized SignInCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SignInCollectionPage(final SignInCollectionResponse response, final ISignInCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
