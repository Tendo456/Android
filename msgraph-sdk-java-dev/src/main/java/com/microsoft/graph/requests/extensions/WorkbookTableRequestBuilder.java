// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableRowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableRowRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableSortRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableSortRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Request Builder.
 */
public class WorkbookTableRequestBuilder extends BaseRequestBuilder implements IWorkbookTableRequestBuilder {

    /**
     * The request builder for the WorkbookTable
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookTableRequest instance
     */
    public IWorkbookTableRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookTableRequest instance
     */
    public IWorkbookTableRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookTableRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IWorkbookTableColumnCollectionRequestBuilder columns() {
        return new WorkbookTableColumnCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("columns"), getClient(), null);
    }

    public IWorkbookTableColumnRequestBuilder columns(final String id) {
        return new WorkbookTableColumnRequestBuilder(getRequestUrlWithAdditionalSegment("columns") + "/" + id, getClient(), null);
    }
    public IWorkbookTableRowCollectionRequestBuilder rows() {
        return new WorkbookTableRowCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("rows"), getClient(), null);
    }

    public IWorkbookTableRowRequestBuilder rows(final String id) {
        return new WorkbookTableRowRequestBuilder(getRequestUrlWithAdditionalSegment("rows") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookTableSort
     *
     * @return the IWorkbookTableSortRequestBuilder instance
     */
    public IWorkbookTableSortRequestBuilder sort() {
        return new WorkbookTableSortRequestBuilder(getRequestUrlWithAdditionalSegment("sort"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the IWorkbookWorksheetRequestBuilder instance
     */
    public IWorkbookWorksheetRequestBuilder worksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }

    public IWorkbookTableClearFiltersRequestBuilder clearFilters() {
        return new WorkbookTableClearFiltersRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clearFilters"), getClient(), null);
    }

    public IWorkbookTableConvertToRangeRequestBuilder convertToRange() {
        return new WorkbookTableConvertToRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.convertToRange"), getClient(), null);
    }

    public IWorkbookTableReapplyFiltersRequestBuilder reapplyFilters() {
        return new WorkbookTableReapplyFiltersRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reapplyFilters"), getClient(), null);
    }

    public IWorkbookTableDataBodyRangeRequestBuilder dataBodyRange() {
        return new WorkbookTableDataBodyRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dataBodyRange"), getClient(), null);
    }

    public IWorkbookTableHeaderRowRangeRequestBuilder headerRowRange() {
        return new WorkbookTableHeaderRowRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.headerRowRange"), getClient(), null);
    }

    public IWorkbookTableRangeRequestBuilder range() {
        return new WorkbookTableRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null);
    }

    public IWorkbookTableTotalRowRangeRequestBuilder totalRowRange() {
        return new WorkbookTableTotalRowRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.totalRowRange"), getClient(), null);
    }
}
