// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SettingStateDeviceSummary;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Setting State Device Summary Collection Page.
 */
public class SettingStateDeviceSummaryCollectionPage extends BaseCollectionPage<SettingStateDeviceSummary, ISettingStateDeviceSummaryCollectionRequestBuilder> implements ISettingStateDeviceSummaryCollectionPage {

    /**
     * A collection page for SettingStateDeviceSummary
     *
     * @param response the serialized SettingStateDeviceSummaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SettingStateDeviceSummaryCollectionPage(final SettingStateDeviceSummaryCollectionResponse response, final ISettingStateDeviceSummaryCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
