// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Entity;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Entity With Reference Request.
 */
public interface IEntityWithReferenceRequest extends IHttpRequest {

    void post(final Entity newEntity, final IJsonBackedObject payload, final ICallback<? super Entity> callback);

    Entity post(final Entity newEntity, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super Entity> callback);

    Entity get() throws ClientException;

	void delete(final ICallback<? super Entity> callback);

	void delete() throws ClientException;

	void patch(final Entity sourceEntity, final ICallback<? super Entity> callback);

	Entity patch(final Entity sourceEntity) throws ClientException;

    IEntityWithReferenceRequest select(final String value);

    IEntityWithReferenceRequest expand(final String value);

}
