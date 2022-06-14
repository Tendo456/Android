// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.DelegatedPermissionClassification;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Delegated Permission Classification Collection Request.
 */
public interface IDelegatedPermissionClassificationCollectionRequest extends IHttpRequest {

    void get(final ICallback<? super IDelegatedPermissionClassificationCollectionPage> callback);

    IDelegatedPermissionClassificationCollectionPage get() throws ClientException;

    void post(final DelegatedPermissionClassification newDelegatedPermissionClassification, final ICallback<? super DelegatedPermissionClassification> callback);

    DelegatedPermissionClassification post(final DelegatedPermissionClassification newDelegatedPermissionClassification) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDelegatedPermissionClassificationCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    IDelegatedPermissionClassificationCollectionRequest filter(final String value);

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    IDelegatedPermissionClassificationCollectionRequest orderBy(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDelegatedPermissionClassificationCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDelegatedPermissionClassificationCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IDelegatedPermissionClassificationCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IDelegatedPermissionClassificationCollectionRequest skipToken(final String skipToken);
}
