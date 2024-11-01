// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDeviceOverview;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ManagedDeviceOverview;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Overview With Reference Request.
 */
public interface IManagedDeviceOverviewWithReferenceRequest extends IHttpRequest {

    void post(final ManagedDeviceOverview newManagedDeviceOverview, final IJsonBackedObject payload, final ICallback<? super ManagedDeviceOverview> callback);

    ManagedDeviceOverview post(final ManagedDeviceOverview newManagedDeviceOverview, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super ManagedDeviceOverview> callback);

    ManagedDeviceOverview get() throws ClientException;

	void delete(final ICallback<? super ManagedDeviceOverview> callback);

	void delete() throws ClientException;

	void patch(final ManagedDeviceOverview sourceManagedDeviceOverview, final ICallback<? super ManagedDeviceOverview> callback);

	ManagedDeviceOverview patch(final ManagedDeviceOverview sourceManagedDeviceOverview) throws ClientException;

    IManagedDeviceOverviewWithReferenceRequest select(final String value);

    IManagedDeviceOverviewWithReferenceRequest expand(final String value);

}
