// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MailSearchFolder;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mail Search Folder Request.
 */
public interface IMailSearchFolderRequest extends IHttpRequest {

    /**
     * Gets the MailSearchFolder from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super MailSearchFolder> callback);

    /**
     * Gets the MailSearchFolder from the service
     *
     * @return the MailSearchFolder from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MailSearchFolder get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super MailSearchFolder> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MailSearchFolder with a source
     *
     * @param sourceMailSearchFolder the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MailSearchFolder sourceMailSearchFolder, final ICallback<? super MailSearchFolder> callback);

    /**
     * Patches this MailSearchFolder with a source
     *
     * @param sourceMailSearchFolder the source object with updates
     * @return the updated MailSearchFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MailSearchFolder patch(final MailSearchFolder sourceMailSearchFolder) throws ClientException;

    /**
     * Posts a MailSearchFolder with a new object
     *
     * @param newMailSearchFolder the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MailSearchFolder newMailSearchFolder, final ICallback<? super MailSearchFolder> callback);

    /**
     * Posts a MailSearchFolder with a new object
     *
     * @param newMailSearchFolder the new object to create
     * @return the created MailSearchFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MailSearchFolder post(final MailSearchFolder newMailSearchFolder) throws ClientException;

    /**
     * Posts a MailSearchFolder with a new object
     *
     * @param newMailSearchFolder the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MailSearchFolder newMailSearchFolder, final ICallback<? super MailSearchFolder> callback);

    /**
     * Posts a MailSearchFolder with a new object
     *
     * @param newMailSearchFolder the object to create/update
     * @return the created MailSearchFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MailSearchFolder put(final MailSearchFolder newMailSearchFolder) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMailSearchFolderRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMailSearchFolderRequest expand(final String value);

}

