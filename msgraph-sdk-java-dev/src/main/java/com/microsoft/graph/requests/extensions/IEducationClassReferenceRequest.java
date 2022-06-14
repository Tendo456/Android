// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.requests.extensions.IEducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Class Reference Request.
 */
public interface IEducationClassReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super EducationClass> callback);

    EducationClass delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEducationClassReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEducationClassReferenceRequest expand(final String value);

    /**
     * Puts the EducationClass
     *
     * @param srcEducationClass the EducationClass to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(EducationClass srcEducationClass, final ICallback<? super EducationClass> callback);

    /**
     * Puts the EducationClass
     *
     * @param srcEducationClass the EducationClass to PUT
     * @return the EducationClass
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    EducationClass put(EducationClass srcEducationClass) throws ClientException;
}
