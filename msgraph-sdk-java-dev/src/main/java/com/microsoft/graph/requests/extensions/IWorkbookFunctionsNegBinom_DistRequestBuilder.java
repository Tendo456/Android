// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNegBinom_DistRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Neg Binom_Dist Request Builder.
 */
public interface IWorkbookFunctionsNegBinom_DistRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsNegBinom_DistRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNegBinom_DistRequest instance
     */
    IWorkbookFunctionsNegBinom_DistRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsNegBinom_DistRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNegBinom_DistRequest instance
     */
    IWorkbookFunctionsNegBinom_DistRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
