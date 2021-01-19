// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.requests.extensions.IWorkbookTableCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookTableCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookTableCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Collection Page.
 */
public class WorkbookTableCollectionPage extends BaseCollectionPage<WorkbookTable, IWorkbookTableCollectionRequestBuilder> implements IWorkbookTableCollectionPage {

    /**
     * A collection page for WorkbookTable
     *
     * @param response the serialized WorkbookTableCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookTableCollectionPage(final WorkbookTableCollectionResponse response, final IWorkbookTableCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
