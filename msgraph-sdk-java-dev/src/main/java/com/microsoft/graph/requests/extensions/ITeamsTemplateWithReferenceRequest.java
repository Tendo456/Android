// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsTemplate;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.TeamsTemplate;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams Template With Reference Request.
 */
public interface ITeamsTemplateWithReferenceRequest extends IHttpRequest {

    void post(final TeamsTemplate newTeamsTemplate, final IJsonBackedObject payload, final ICallback<? super TeamsTemplate> callback);

    TeamsTemplate post(final TeamsTemplate newTeamsTemplate, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super TeamsTemplate> callback);

    TeamsTemplate get() throws ClientException;

	void delete(final ICallback<? super TeamsTemplate> callback);

	void delete() throws ClientException;

	void patch(final TeamsTemplate sourceTeamsTemplate, final ICallback<? super TeamsTemplate> callback);

	TeamsTemplate patch(final TeamsTemplate sourceTeamsTemplate) throws ClientException;

    ITeamsTemplateWithReferenceRequest select(final String value);

    ITeamsTemplateWithReferenceRequest expand(final String value);

}
