// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidCustomConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Custom Configuration Request.
 */
public interface IAndroidCustomConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AndroidCustomConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AndroidCustomConfiguration> callback);

    /**
     * Gets the AndroidCustomConfiguration from the service
     *
     * @return the AndroidCustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidCustomConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AndroidCustomConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidCustomConfiguration with a source
     *
     * @param sourceAndroidCustomConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidCustomConfiguration sourceAndroidCustomConfiguration, final ICallback<? super AndroidCustomConfiguration> callback);

    /**
     * Patches this AndroidCustomConfiguration with a source
     *
     * @param sourceAndroidCustomConfiguration the source object with updates
     * @return the updated AndroidCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidCustomConfiguration patch(final AndroidCustomConfiguration sourceAndroidCustomConfiguration) throws ClientException;

    /**
     * Posts a AndroidCustomConfiguration with a new object
     *
     * @param newAndroidCustomConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidCustomConfiguration newAndroidCustomConfiguration, final ICallback<? super AndroidCustomConfiguration> callback);

    /**
     * Posts a AndroidCustomConfiguration with a new object
     *
     * @param newAndroidCustomConfiguration the new object to create
     * @return the created AndroidCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidCustomConfiguration post(final AndroidCustomConfiguration newAndroidCustomConfiguration) throws ClientException;

    /**
     * Posts a AndroidCustomConfiguration with a new object
     *
     * @param newAndroidCustomConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidCustomConfiguration newAndroidCustomConfiguration, final ICallback<? super AndroidCustomConfiguration> callback);

    /**
     * Posts a AndroidCustomConfiguration with a new object
     *
     * @param newAndroidCustomConfiguration the object to create/update
     * @return the created AndroidCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidCustomConfiguration put(final AndroidCustomConfiguration newAndroidCustomConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidCustomConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidCustomConfigurationRequest expand(final String value);

}

