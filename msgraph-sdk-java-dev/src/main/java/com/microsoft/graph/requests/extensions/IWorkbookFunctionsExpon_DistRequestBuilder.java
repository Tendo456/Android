// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsExpon_DistRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Expon_Dist Request Builder.
 */
public interface IWorkbookFunctionsExpon_DistRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsExpon_DistRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsExpon_DistRequest instance
     */
    IWorkbookFunctionsExpon_DistRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsExpon_DistRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsExpon_DistRequest instance
     */
    IWorkbookFunctionsExpon_DistRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
