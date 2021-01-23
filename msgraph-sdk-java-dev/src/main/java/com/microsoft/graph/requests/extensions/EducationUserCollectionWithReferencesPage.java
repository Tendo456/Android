// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.models.extensions.EducationUser;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IEducationUserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.EducationUserCollectionResponse;
import com.microsoft.graph.models.extensions.EducationUser;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User Collection With References Page.
 */
public class EducationUserCollectionWithReferencesPage extends BaseCollectionPage<EducationUser, IEducationUserCollectionWithReferencesRequestBuilder> implements IEducationUserCollectionWithReferencesPage {

    /**
     * A collection page for EducationUser
     *
     * @param response the serialized EducationUserCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationUserCollectionWithReferencesPage(final EducationUserCollectionResponse response, final IEducationUserCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}