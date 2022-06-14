// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.ExchangeIdFormat;
import com.microsoft.graph.models.extensions.ConvertIdResult;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.http.IHttpRequest;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Translate Exchange Ids Collection Request.
 */
public interface IUserTranslateExchangeIdsCollectionRequest extends IHttpRequest {

    void post(final ICallback<? super IUserTranslateExchangeIdsCollectionPage> callback);

    IUserTranslateExchangeIdsCollectionPage post() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserTranslateExchangeIdsCollectionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserTranslateExchangeIdsCollectionRequest expand(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IUserTranslateExchangeIdsCollectionRequest top(final int value);

}
