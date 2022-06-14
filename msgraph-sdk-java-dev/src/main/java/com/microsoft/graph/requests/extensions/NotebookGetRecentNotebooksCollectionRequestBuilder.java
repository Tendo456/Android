// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RecentNotebook;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.INotebookGetRecentNotebooksCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotebookGetRecentNotebooksCollectionRequest;
import com.microsoft.graph.requests.extensions.NotebookGetRecentNotebooksCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notebook Get Recent Notebooks Collection Request Builder.
 */
public class NotebookGetRecentNotebooksCollectionRequestBuilder extends BaseFunctionRequestBuilder implements INotebookGetRecentNotebooksCollectionRequestBuilder {

    /**
     * The request builder for this collection of Notebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param includePersonalNotebooks the includePersonalNotebooks
     */
    public NotebookGetRecentNotebooksCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Boolean includePersonalNotebooks) {
        super(requestUrl, client, requestOptions);
     	 if(includePersonalNotebooks!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("includePersonalNotebooks", includePersonalNotebooks));
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public INotebookGetRecentNotebooksCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public INotebookGetRecentNotebooksCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        NotebookGetRecentNotebooksCollectionRequest request = new NotebookGetRecentNotebooksCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
