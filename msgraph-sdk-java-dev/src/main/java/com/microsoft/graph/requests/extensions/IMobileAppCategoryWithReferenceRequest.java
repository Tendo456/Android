// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppCategory;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.MobileAppCategory;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile App Category With Reference Request.
 */
public interface IMobileAppCategoryWithReferenceRequest extends IHttpRequest {

    void post(final MobileAppCategory newMobileAppCategory, final IJsonBackedObject payload, final ICallback<? super MobileAppCategory> callback);

    MobileAppCategory post(final MobileAppCategory newMobileAppCategory, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super MobileAppCategory> callback);

    MobileAppCategory get() throws ClientException;

	void delete(final ICallback<? super MobileAppCategory> callback);

	void delete() throws ClientException;

	void patch(final MobileAppCategory sourceMobileAppCategory, final ICallback<? super MobileAppCategory> callback);

	MobileAppCategory patch(final MobileAppCategory sourceMobileAppCategory) throws ClientException;

    IMobileAppCategoryWithReferenceRequest select(final String value);

    IMobileAppCategoryWithReferenceRequest expand(final String value);

}
