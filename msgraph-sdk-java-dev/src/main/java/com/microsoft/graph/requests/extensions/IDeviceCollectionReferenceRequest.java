// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.models.extensions.Device;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.Device;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Collection Reference Request.
 */
public interface IDeviceCollectionReferenceRequest {

    void post(final Device newDevice, final ICallback<? super Device> callback);

    Device post(final Device newDevice) throws ClientException;

    IDeviceCollectionReferenceRequest select(final String value);

    IDeviceCollectionReferenceRequest top(final int value);

}
