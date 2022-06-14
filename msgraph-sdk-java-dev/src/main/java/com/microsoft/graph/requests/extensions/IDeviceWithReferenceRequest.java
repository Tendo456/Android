// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Device;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Device;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device With Reference Request.
 */
public interface IDeviceWithReferenceRequest extends IHttpRequest {

    void post(final Device newDevice, final IJsonBackedObject payload, final ICallback<? super Device> callback);

    Device post(final Device newDevice, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super Device> callback);

    Device get() throws ClientException;

	void delete(final ICallback<? super Device> callback);

	void delete() throws ClientException;

	void patch(final Device sourceDevice, final ICallback<? super Device> callback);

	Device patch(final Device sourceDevice) throws ClientException;

    IDeviceWithReferenceRequest select(final String value);

    IDeviceWithReferenceRequest expand(final String value);

}
