// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.models.extensions.Notebook;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.models.extensions.CopyNotebookModel;
import com.microsoft.graph.models.extensions.RecentNotebook;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.INotebookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.INotebookCollectionRequest;
import com.microsoft.graph.requests.extensions.INotebookGetNotebookFromWebUrlRequestBuilder;
import com.microsoft.graph.requests.extensions.INotebookGetRecentNotebooksCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notebook Collection Request Builder.
 */
public class NotebookCollectionRequestBuilder extends BaseRequestBuilder implements INotebookCollectionRequestBuilder {

    /**
     * The request builder for this collection of Onenote
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NotebookCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public INotebookCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public INotebookCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new NotebookCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public INotebookRequestBuilder byId(final String id) {
        return new NotebookRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public INotebookGetNotebookFromWebUrlRequestBuilder getNotebookFromWebUrl(final String webUrl) {
        return new NotebookGetNotebookFromWebUrlRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getNotebookFromWebUrl"), getClient(), null, webUrl);
    }

    public INotebookGetRecentNotebooksCollectionRequestBuilder getRecentNotebooks(final Boolean includePersonalNotebooks) {
        return new NotebookGetRecentNotebooksCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getRecentNotebooks"), getClient(), null, includePersonalNotebooks);
    }
}
