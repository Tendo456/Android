// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.models.extensions.WorkbookRange;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWorkbookTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableCollectionRequest;
import com.microsoft.graph.requests.extensions.IWorkbookTableAddRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableCountRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableItemAtRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Collection Request Builder.
 */
public class WorkbookTableCollectionRequestBuilder extends BaseRequestBuilder implements IWorkbookTableCollectionRequestBuilder {

    /**
     * The request builder for this collection of WorkbookWorksheet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IWorkbookTableCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IWorkbookTableCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookTableCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookTableRequestBuilder byId(final String id) {
        return new WorkbookTableRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IWorkbookTableAddRequestBuilder add(final String address, final Boolean hasHeaders) {
        return new WorkbookTableAddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.add"), getClient(), null, address, hasHeaders);
    }

    public IWorkbookTableCountRequestBuilder count() {
        return new WorkbookTableCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }

    public IWorkbookTableItemAtRequestBuilder itemAt(final Integer index) {
        return new WorkbookTableItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, index);
    }
}
