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

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.EducationUser;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education User Collection Reference Request.
 */
public interface IEducationUserCollectionReferenceRequest {

    void post(final EducationUser newEducationUser, final ICallback<? super EducationUser> callback);

    EducationUser post(final EducationUser newEducationUser) throws ClientException;

    IEducationUserCollectionReferenceRequest select(final String value);

    IEducationUserCollectionReferenceRequest top(final int value);

}
