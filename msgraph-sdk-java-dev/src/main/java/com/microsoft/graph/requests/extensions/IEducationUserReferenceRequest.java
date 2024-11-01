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
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education User Reference Request.
 */
public interface IEducationUserReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super EducationUser> callback);

    EducationUser delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEducationUserReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEducationUserReferenceRequest expand(final String value);

    /**
     * Puts the EducationUser
     *
     * @param srcEducationUser the EducationUser to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(EducationUser srcEducationUser, final ICallback<? super EducationUser> callback);

    /**
     * Puts the EducationUser
     *
     * @param srcEducationUser the EducationUser to PUT
     * @return the EducationUser
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    EducationUser put(EducationUser srcEducationUser) throws ClientException;
}
