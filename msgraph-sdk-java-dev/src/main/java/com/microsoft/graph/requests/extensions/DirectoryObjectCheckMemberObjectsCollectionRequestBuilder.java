// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDirectoryObjectCheckMemberObjectsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCheckMemberObjectsCollectionRequest;
import com.microsoft.graph.requests.extensions.DirectoryObjectCheckMemberObjectsCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Check Member Objects Collection Request Builder.
 */
public class DirectoryObjectCheckMemberObjectsCollectionRequestBuilder extends BaseActionRequestBuilder implements IDirectoryObjectCheckMemberObjectsCollectionRequestBuilder {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param ids the ids
     */
    public DirectoryObjectCheckMemberObjectsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<String> ids) {
        super(requestUrl, client, requestOptions);
  	 if(ids!=null){
			bodyParams.put("ids", ids);
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDirectoryObjectCheckMemberObjectsCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDirectoryObjectCheckMemberObjectsCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DirectoryObjectCheckMemberObjectsCollectionRequest request = new DirectoryObjectCheckMemberObjectsCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("ids")) {
            request.body.ids = getParameter("ids");
        }
  
        return request;
    }
}
