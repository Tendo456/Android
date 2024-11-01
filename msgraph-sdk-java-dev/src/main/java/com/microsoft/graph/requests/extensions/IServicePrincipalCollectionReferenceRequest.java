// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.ServicePrincipal;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Service Principal Collection Reference Request.
 */
public interface IServicePrincipalCollectionReferenceRequest {

    void post(final ServicePrincipal newServicePrincipal, final ICallback<? super ServicePrincipal> callback);

    ServicePrincipal post(final ServicePrincipal newServicePrincipal) throws ClientException;

    IServicePrincipalCollectionReferenceRequest select(final String value);

    IServicePrincipalCollectionReferenceRequest top(final int value);

}
