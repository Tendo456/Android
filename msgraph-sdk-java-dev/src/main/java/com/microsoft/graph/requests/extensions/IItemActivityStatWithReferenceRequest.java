// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.requests.extensions.IItemActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemActivityRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Item Activity Stat With Reference Request.
 */
public interface IItemActivityStatWithReferenceRequest extends IHttpRequest {

    void post(final ItemActivityStat newItemActivityStat, final IJsonBackedObject payload, final ICallback<? super ItemActivityStat> callback);

    ItemActivityStat post(final ItemActivityStat newItemActivityStat, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super ItemActivityStat> callback);

    ItemActivityStat get() throws ClientException;

	void delete(final ICallback<? super ItemActivityStat> callback);

	void delete() throws ClientException;

	void patch(final ItemActivityStat sourceItemActivityStat, final ICallback<? super ItemActivityStat> callback);

	ItemActivityStat patch(final ItemActivityStat sourceItemActivityStat) throws ClientException;

    IItemActivityStatWithReferenceRequest select(final String value);

    IItemActivityStatWithReferenceRequest expand(final String value);

}
