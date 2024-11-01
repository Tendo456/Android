// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Domain;
import com.microsoft.graph.requests.extensions.IDomainVerifyRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Domain Verify Request.
 */
public interface IDomainVerifyRequest extends IHttpRequest {

    /**
     * Creates the DomainVerify
     *
     * @param callback the callback to be called after success or failure
     */
    void post(final ICallback<? super Domain> callback);

    /**
     * Creates the DomainVerify
     *
     * @return the Domain
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Domain post() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDomainVerifyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDomainVerifyRequest expand(final String value);

}
