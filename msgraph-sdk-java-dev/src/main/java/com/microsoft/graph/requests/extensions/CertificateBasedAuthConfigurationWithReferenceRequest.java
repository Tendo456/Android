// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CertificateBasedAuthConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Certificate Based Auth Configuration With Reference Request.
 */
public class CertificateBasedAuthConfigurationWithReferenceRequest extends BaseRequest implements ICertificateBasedAuthConfigurationWithReferenceRequest {

    /**
     * The request for the CertificateBasedAuthConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CertificateBasedAuthConfigurationWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CertificateBasedAuthConfiguration.class);
    }

    public void post(final CertificateBasedAuthConfiguration newCertificateBasedAuthConfiguration, final IJsonBackedObject payload, final ICallback<? super CertificateBasedAuthConfiguration> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public CertificateBasedAuthConfiguration post(final CertificateBasedAuthConfiguration newCertificateBasedAuthConfiguration, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newCertificateBasedAuthConfiguration;
        }
        return null;
    }

    public void get(final ICallback<? super CertificateBasedAuthConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public CertificateBasedAuthConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super CertificateBasedAuthConfiguration> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final CertificateBasedAuthConfiguration sourceCertificateBasedAuthConfiguration, final ICallback<? super CertificateBasedAuthConfiguration> callback) {
		send(HttpMethod.PATCH, callback, sourceCertificateBasedAuthConfiguration);
	}

	public CertificateBasedAuthConfiguration patch(final CertificateBasedAuthConfiguration sourceCertificateBasedAuthConfiguration) throws ClientException {
		return send(HttpMethod.PATCH, sourceCertificateBasedAuthConfiguration);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICertificateBasedAuthConfigurationWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ICertificateBasedAuthConfigurationWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICertificateBasedAuthConfigurationWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CertificateBasedAuthConfigurationWithReferenceRequest)this;
    }
}
