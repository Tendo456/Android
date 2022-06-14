// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Device;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.AppRoleAssignment;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the App Role Assignment Collection Reference Request.
 */
public interface IAppRoleAssignmentCollectionReferenceRequest {

    void post(final AppRoleAssignment newAppRoleAssignment, final ICallback<? super AppRoleAssignment> callback);

    AppRoleAssignment post(final AppRoleAssignment newAppRoleAssignment) throws ClientException;

    IAppRoleAssignmentCollectionReferenceRequest select(final String value);

    IAppRoleAssignmentCollectionReferenceRequest top(final int value);

}
