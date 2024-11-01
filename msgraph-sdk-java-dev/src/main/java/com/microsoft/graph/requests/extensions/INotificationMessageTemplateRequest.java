// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.NotificationMessageTemplate;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Notification Message Template Request.
 */
public interface INotificationMessageTemplateRequest extends IHttpRequest {

    /**
     * Gets the NotificationMessageTemplate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super NotificationMessageTemplate> callback);

    /**
     * Gets the NotificationMessageTemplate from the service
     *
     * @return the NotificationMessageTemplate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NotificationMessageTemplate get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super NotificationMessageTemplate> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this NotificationMessageTemplate with a source
     *
     * @param sourceNotificationMessageTemplate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final NotificationMessageTemplate sourceNotificationMessageTemplate, final ICallback<? super NotificationMessageTemplate> callback);

    /**
     * Patches this NotificationMessageTemplate with a source
     *
     * @param sourceNotificationMessageTemplate the source object with updates
     * @return the updated NotificationMessageTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NotificationMessageTemplate patch(final NotificationMessageTemplate sourceNotificationMessageTemplate) throws ClientException;

    /**
     * Posts a NotificationMessageTemplate with a new object
     *
     * @param newNotificationMessageTemplate the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final NotificationMessageTemplate newNotificationMessageTemplate, final ICallback<? super NotificationMessageTemplate> callback);

    /**
     * Posts a NotificationMessageTemplate with a new object
     *
     * @param newNotificationMessageTemplate the new object to create
     * @return the created NotificationMessageTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NotificationMessageTemplate post(final NotificationMessageTemplate newNotificationMessageTemplate) throws ClientException;

    /**
     * Posts a NotificationMessageTemplate with a new object
     *
     * @param newNotificationMessageTemplate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final NotificationMessageTemplate newNotificationMessageTemplate, final ICallback<? super NotificationMessageTemplate> callback);

    /**
     * Posts a NotificationMessageTemplate with a new object
     *
     * @param newNotificationMessageTemplate the object to create/update
     * @return the created NotificationMessageTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NotificationMessageTemplate put(final NotificationMessageTemplate newNotificationMessageTemplate) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    INotificationMessageTemplateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    INotificationMessageTemplateRequest expand(final String value);

}

