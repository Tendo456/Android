// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookRangeFormat;
import com.microsoft.graph.models.extensions.WorkbookRangeBorder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderCollectionRequest;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderCountRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderItemAtRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Border Collection Request Builder.
 */
public interface IWorkbookRangeBorderCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IWorkbookRangeBorderCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IWorkbookRangeBorderCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWorkbookRangeBorderRequestBuilder byId(final String id);

    IWorkbookRangeBorderCountRequestBuilder count();
    IWorkbookRangeBorderItemAtRequestBuilder itemAt(final Integer index);
}
