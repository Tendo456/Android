// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Endpoint;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Endpoint;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Endpoint With Reference Request.
 */
public interface IEndpointWithReferenceRequest extends IHttpRequest {

    void post(final Endpoint newEndpoint, final IJsonBackedObject payload, final ICallback<? super Endpoint> callback);

    Endpoint post(final Endpoint newEndpoint, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super Endpoint> callback);

    Endpoint get() throws ClientException;

	void delete(final ICallback<? super Endpoint> callback);

	void delete() throws ClientException;

	void patch(final Endpoint sourceEndpoint, final ICallback<? super Endpoint> callback);

	Endpoint patch(final Endpoint sourceEndpoint) throws ClientException;

    IEndpointWithReferenceRequest select(final String value);

    IEndpointWithReferenceRequest expand(final String value);

}
