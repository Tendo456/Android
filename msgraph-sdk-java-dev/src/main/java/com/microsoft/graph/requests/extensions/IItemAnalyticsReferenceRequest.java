// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemAnalytics;
import com.microsoft.graph.requests.extensions.IItemActivityStatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemActivityStatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ItemAnalytics;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Item Analytics Reference Request.
 */
public interface IItemAnalyticsReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super ItemAnalytics> callback);

    ItemAnalytics delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IItemAnalyticsReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IItemAnalyticsReferenceRequest expand(final String value);

    /**
     * Puts the ItemAnalytics
     *
     * @param srcItemAnalytics the ItemAnalytics to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(ItemAnalytics srcItemAnalytics, final ICallback<? super ItemAnalytics> callback);

    /**
     * Puts the ItemAnalytics
     *
     * @param srcItemAnalytics the ItemAnalytics to PUT
     * @return the ItemAnalytics
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    ItemAnalytics put(ItemAnalytics srcItemAnalytics) throws ClientException;
}
