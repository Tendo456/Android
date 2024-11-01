// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Claims Mapping Policy Reference Request.
 */
public interface IClaimsMappingPolicyReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super ClaimsMappingPolicy> callback);

    ClaimsMappingPolicy delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IClaimsMappingPolicyReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IClaimsMappingPolicyReferenceRequest expand(final String value);

    /**
     * Puts the ClaimsMappingPolicy
     *
     * @param srcClaimsMappingPolicy the ClaimsMappingPolicy to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(ClaimsMappingPolicy srcClaimsMappingPolicy, final ICallback<? super ClaimsMappingPolicy> callback);

    /**
     * Puts the ClaimsMappingPolicy
     *
     * @param srcClaimsMappingPolicy the ClaimsMappingPolicy to PUT
     * @return the ClaimsMappingPolicy
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    ClaimsMappingPolicy put(ClaimsMappingPolicy srcClaimsMappingPolicy) throws ClientException;
}
