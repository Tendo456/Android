// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.UserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User Request Builder.
 */
public class EducationUserRequestBuilder extends BaseRequestBuilder implements IEducationUserRequestBuilder {

    /**
     * The request builder for the EducationUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationUserRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IEducationUserRequest instance
     */
    public IEducationUserRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IEducationUserRequest instance
     */
    public IEducationUserRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.EducationUserRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IEducationClassCollectionWithReferencesRequestBuilder classes() {
        return new EducationClassCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("classes"), getClient(), null);
    }

    public IEducationClassWithReferenceRequestBuilder classes(final String id) {
        return new EducationClassWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("classes") + "/" + id, getClient(), null);
    }
    public IEducationSchoolCollectionWithReferencesRequestBuilder schools() {
        return new EducationSchoolCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("schools"), getClient(), null);
    }

    public IEducationSchoolWithReferenceRequestBuilder schools(final String id) {
        return new EducationSchoolWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("schools") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for User
     *
     * @return the IUserWithReferenceRequestBuilder instance
     */
    public IUserWithReferenceRequestBuilder user() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("user"), getClient(), null);
    }
}
