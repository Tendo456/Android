// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SoftwareUpdateStatusSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.SoftwareUpdateStatusSummary;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Software Update Status Summary Reference Request.
 */
public interface ISoftwareUpdateStatusSummaryReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super SoftwareUpdateStatusSummary> callback);

    SoftwareUpdateStatusSummary delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISoftwareUpdateStatusSummaryReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISoftwareUpdateStatusSummaryReferenceRequest expand(final String value);

    /**
     * Puts the SoftwareUpdateStatusSummary
     *
     * @param srcSoftwareUpdateStatusSummary the SoftwareUpdateStatusSummary to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(SoftwareUpdateStatusSummary srcSoftwareUpdateStatusSummary, final ICallback<? super SoftwareUpdateStatusSummary> callback);

    /**
     * Puts the SoftwareUpdateStatusSummary
     *
     * @param srcSoftwareUpdateStatusSummary the SoftwareUpdateStatusSummary to PUT
     * @return the SoftwareUpdateStatusSummary
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    SoftwareUpdateStatusSummary put(SoftwareUpdateStatusSummary srcSoftwareUpdateStatusSummary) throws ClientException;
}
