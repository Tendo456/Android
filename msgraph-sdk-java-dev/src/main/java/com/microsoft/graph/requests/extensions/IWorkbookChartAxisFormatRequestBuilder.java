// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartAxisFormat;
import com.microsoft.graph.requests.extensions.IWorkbookChartFontRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartLineFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Axis Format Request Builder.
 */
public interface IWorkbookChartAxisFormatRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartAxisFormatRequest instance
     */
    IWorkbookChartAxisFormatRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartAxisFormatRequest instance
     */
    IWorkbookChartAxisFormatRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for WorkbookChartFont
     *
     * @return the IWorkbookChartFontRequestBuilder instance
     */
    IWorkbookChartFontRequestBuilder font();

    /**
     * Gets the request builder for WorkbookChartLineFormat
     *
     * @return the IWorkbookChartLineFormatRequestBuilder instance
     */
    IWorkbookChartLineFormatRequestBuilder line();

}