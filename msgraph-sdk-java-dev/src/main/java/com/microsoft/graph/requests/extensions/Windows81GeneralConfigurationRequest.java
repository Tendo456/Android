// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows81GeneralConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows81General Configuration Request.
 */
public class Windows81GeneralConfigurationRequest extends BaseRequest implements IWindows81GeneralConfigurationRequest {
	
    /**
     * The request for the Windows81GeneralConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows81GeneralConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows81GeneralConfiguration.class);
    }

    /**
     * Gets the Windows81GeneralConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Windows81GeneralConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows81GeneralConfiguration from the service
     *
     * @return the Windows81GeneralConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81GeneralConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Windows81GeneralConfiguration> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Windows81GeneralConfiguration with a source
     *
     * @param sourceWindows81GeneralConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows81GeneralConfiguration sourceWindows81GeneralConfiguration, final ICallback<? super Windows81GeneralConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows81GeneralConfiguration);
    }

    /**
     * Patches this Windows81GeneralConfiguration with a source
     *
     * @param sourceWindows81GeneralConfiguration the source object with updates
     * @return the updated Windows81GeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81GeneralConfiguration patch(final Windows81GeneralConfiguration sourceWindows81GeneralConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows81GeneralConfiguration);
    }

    /**
     * Creates a Windows81GeneralConfiguration with a new object
     *
     * @param newWindows81GeneralConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows81GeneralConfiguration newWindows81GeneralConfiguration, final ICallback<? super Windows81GeneralConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindows81GeneralConfiguration);
    }

    /**
     * Creates a Windows81GeneralConfiguration with a new object
     *
     * @param newWindows81GeneralConfiguration the new object to create
     * @return the created Windows81GeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81GeneralConfiguration post(final Windows81GeneralConfiguration newWindows81GeneralConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows81GeneralConfiguration);
    }

    /**
     * Creates a Windows81GeneralConfiguration with a new object
     *
     * @param newWindows81GeneralConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Windows81GeneralConfiguration newWindows81GeneralConfiguration, final ICallback<? super Windows81GeneralConfiguration> callback) {
        send(HttpMethod.PUT, callback, newWindows81GeneralConfiguration);
    }

    /**
     * Creates a Windows81GeneralConfiguration with a new object
     *
     * @param newWindows81GeneralConfiguration the object to create/update
     * @return the created Windows81GeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81GeneralConfiguration put(final Windows81GeneralConfiguration newWindows81GeneralConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindows81GeneralConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows81GeneralConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Windows81GeneralConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows81GeneralConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Windows81GeneralConfigurationRequest)this;
     }

}
