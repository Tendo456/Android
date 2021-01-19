// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetProtectionProtectRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Worksheet Protection Protect Request Builder.
 */
public interface IWorkbookWorksheetProtectionProtectRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookWorksheetProtectionProtectRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookWorksheetProtectionProtectRequest instance
     */
    IWorkbookWorksheetProtectionProtectRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookWorksheetProtectionProtectRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookWorksheetProtectionProtectRequest instance
     */
    IWorkbookWorksheetProtectionProtectRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
