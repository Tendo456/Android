// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.models.extensions.MobileAppCategory;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.MobileAppCategory;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile App Category Collection Reference Request.
 */
public interface IMobileAppCategoryCollectionReferenceRequest {

    void post(final MobileAppCategory newMobileAppCategory, final ICallback<? super MobileAppCategory> callback);

    MobileAppCategory post(final MobileAppCategory newMobileAppCategory) throws ClientException;

    IMobileAppCategoryCollectionReferenceRequest select(final String value);

    IMobileAppCategoryCollectionReferenceRequest top(final int value);

}
