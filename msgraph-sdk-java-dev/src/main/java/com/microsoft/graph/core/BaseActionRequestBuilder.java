// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.core;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base method request builder class used for POST actions
 */
public class BaseActionRequestBuilder extends BaseRequestBuilder {

    /**
     * The body parameters to add to this request
     */
    protected Map<String, Object> bodyParams = new HashMap<>();

    /**
     * Constructs a new {@link BaseActionRequestBuilder}
     *
     * @param requestUrl the URL for the request
     * @param client     the {@link IBaseClient} for handling requests
     * @param options    {@link List} of {@link Option}s to add to this request
     */
    public BaseActionRequestBuilder(
            final String requestUrl,
            final IBaseClient client,
            final List<? extends Option> options
    ) {
        super(requestUrl, client, options);
    }

    /**
     * Checks if the parameter map contains a object accessible by the supplied key
     *
     * @param name the key used to access the stored body parameter
     * @return true, if {@link BaseActionRequestBuilder#bodyParams} contains the key, otherwise false
     */
    protected boolean hasParameter(final String name) {
        return bodyParams.containsKey(name);
    }

    /**
     * Gets the requested parameter if present, otherwise null
     *
     * @param name the named object to retrieve
     * @param <T>  the type to which this object should be cast
     * @return the stored instance of T, otherwise null
     */
    @SuppressWarnings("unchecked")
    protected <T> T getParameter(final String name) {
        return (T) bodyParams.get(name);
    }
}
