// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Role Assignment With Reference Request.
 */
public class AppRoleAssignmentWithReferenceRequest extends BaseRequest implements IAppRoleAssignmentWithReferenceRequest {

    /**
     * The request for the AppRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppRoleAssignmentWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppRoleAssignment.class);
    }

    public void post(final AppRoleAssignment newAppRoleAssignment, final IJsonBackedObject payload, final ICallback<? super AppRoleAssignment> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public AppRoleAssignment post(final AppRoleAssignment newAppRoleAssignment, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newAppRoleAssignment;
        }
        return null;
    }

    public void get(final ICallback<? super AppRoleAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public AppRoleAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super AppRoleAssignment> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final AppRoleAssignment sourceAppRoleAssignment, final ICallback<? super AppRoleAssignment> callback) {
		send(HttpMethod.PATCH, callback, sourceAppRoleAssignment);
	}

	public AppRoleAssignment patch(final AppRoleAssignment sourceAppRoleAssignment) throws ClientException {
		return send(HttpMethod.PATCH, sourceAppRoleAssignment);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAppRoleAssignmentWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IAppRoleAssignmentWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAppRoleAssignmentWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AppRoleAssignmentWithReferenceRequest)this;
    }
}
