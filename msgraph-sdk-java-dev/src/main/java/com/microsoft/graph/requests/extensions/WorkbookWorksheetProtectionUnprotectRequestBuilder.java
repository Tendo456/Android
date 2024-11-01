// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetProtectionUnprotectRequest;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetProtectionUnprotectRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Protection Unprotect Request Builder.
 */
public class WorkbookWorksheetProtectionUnprotectRequestBuilder extends BaseActionRequestBuilder implements IWorkbookWorksheetProtectionUnprotectRequestBuilder {

    /**
     * The request builder for this WorkbookWorksheetProtectionUnprotect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookWorksheetProtectionUnprotectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookWorksheetProtectionUnprotectRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookWorksheetProtectionUnprotectRequest instance
     */
    public IWorkbookWorksheetProtectionUnprotectRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookWorksheetProtectionUnprotectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookWorksheetProtectionUnprotectRequest instance
     */
    public IWorkbookWorksheetProtectionUnprotectRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookWorksheetProtectionUnprotectRequest request = new WorkbookWorksheetProtectionUnprotectRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
