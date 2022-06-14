// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MailFolder;
import com.microsoft.graph.requests.extensions.IMailFolderCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MailFolderCollectionPage;
import com.microsoft.graph.requests.extensions.MailFolderCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mail Folder Collection Page.
 */
public class MailFolderCollectionPage extends BaseCollectionPage<MailFolder, IMailFolderCollectionRequestBuilder> implements IMailFolderCollectionPage {

    /**
     * A collection page for MailFolder
     *
     * @param response the serialized MailFolderCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MailFolderCollectionPage(final MailFolderCollectionResponse response, final IMailFolderCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
