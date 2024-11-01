// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleDefinition;
import com.microsoft.graph.requests.extensions.IRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.RoleDefinition;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Role Definition With Reference Request.
 */
public interface IRoleDefinitionWithReferenceRequest extends IHttpRequest {

    void post(final RoleDefinition newRoleDefinition, final IJsonBackedObject payload, final ICallback<? super RoleDefinition> callback);

    RoleDefinition post(final RoleDefinition newRoleDefinition, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super RoleDefinition> callback);

    RoleDefinition get() throws ClientException;

	void delete(final ICallback<? super RoleDefinition> callback);

	void delete() throws ClientException;

	void patch(final RoleDefinition sourceRoleDefinition, final ICallback<? super RoleDefinition> callback);

	RoleDefinition patch(final RoleDefinition sourceRoleDefinition) throws ClientException;

    IRoleDefinitionWithReferenceRequest select(final String value);

    IRoleDefinitionWithReferenceRequest expand(final String value);

}
