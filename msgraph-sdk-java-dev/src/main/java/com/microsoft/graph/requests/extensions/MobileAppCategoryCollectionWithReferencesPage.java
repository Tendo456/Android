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

import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionResponse;
import com.microsoft.graph.models.extensions.MobileAppCategory;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Category Collection With References Page.
 */
public class MobileAppCategoryCollectionWithReferencesPage extends BaseCollectionPage<MobileAppCategory, IMobileAppCategoryCollectionWithReferencesRequestBuilder> implements IMobileAppCategoryCollectionWithReferencesPage {

    /**
     * A collection page for MobileAppCategory
     *
     * @param response the serialized MobileAppCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppCategoryCollectionWithReferencesPage(final MobileAppCategoryCollectionResponse response, final IMobileAppCategoryCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
