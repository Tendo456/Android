// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupSettingTemplate;
import com.microsoft.graph.requests.extensions.IGroupSettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.GroupSettingTemplateCollectionPage;
import com.microsoft.graph.requests.extensions.GroupSettingTemplateCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Setting Template Collection Page.
 */
public class GroupSettingTemplateCollectionPage extends BaseCollectionPage<GroupSettingTemplate, IGroupSettingTemplateCollectionRequestBuilder> implements IGroupSettingTemplateCollectionPage {

    /**
     * A collection page for GroupSettingTemplate
     *
     * @param response the serialized GroupSettingTemplateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupSettingTemplateCollectionPage(final GroupSettingTemplateCollectionResponse response, final IGroupSettingTemplateCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
