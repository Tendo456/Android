// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Team;
import com.microsoft.graph.models.generated.TeamVisibilityType;
import com.microsoft.graph.models.generated.ClonableTeamParts;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.requests.extensions.IChannelCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChannelRequestBuilder;
import com.microsoft.graph.requests.extensions.ChannelCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChannelRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAsyncOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAsyncOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAsyncOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAsyncOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IScheduleRequestBuilder;
import com.microsoft.graph.requests.extensions.ScheduleRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTemplateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Request Builder.
 */
public class TeamRequestBuilder extends BaseRequestBuilder implements ITeamRequestBuilder {

    /**
     * The request builder for the Team
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ITeamRequest instance
     */
    public ITeamRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITeamRequest instance
     */
    public ITeamRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.TeamRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Schedule
     *
     * @return the IScheduleRequestBuilder instance
     */
    public IScheduleRequestBuilder schedule() {
        return new ScheduleRequestBuilder(getRequestUrlWithAdditionalSegment("schedule"), getClient(), null);
    }
    public IChannelCollectionRequestBuilder channels() {
        return new ChannelCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("channels"), getClient(), null);
    }

    public IChannelRequestBuilder channels(final String id) {
        return new ChannelRequestBuilder(getRequestUrlWithAdditionalSegment("channels") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Group
     *
     * @return the IGroupWithReferenceRequestBuilder instance
     */
    public IGroupWithReferenceRequestBuilder group() {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("group"), getClient(), null);
    }
    public ITeamsAppInstallationCollectionRequestBuilder installedApps() {
        return new TeamsAppInstallationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("installedApps"), getClient(), null);
    }

    public ITeamsAppInstallationRequestBuilder installedApps(final String id) {
        return new TeamsAppInstallationRequestBuilder(getRequestUrlWithAdditionalSegment("installedApps") + "/" + id, getClient(), null);
    }
    public IConversationMemberCollectionRequestBuilder members() {
        return new ConversationMemberCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    public IConversationMemberRequestBuilder members(final String id) {
        return new ConversationMemberRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
    public ITeamsAsyncOperationCollectionRequestBuilder operations() {
        return new TeamsAsyncOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    public ITeamsAsyncOperationRequestBuilder operations(final String id) {
        return new TeamsAsyncOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Channel
     *
     * @return the IChannelRequestBuilder instance
     */
    public IChannelRequestBuilder primaryChannel() {
        return new ChannelRequestBuilder(getRequestUrlWithAdditionalSegment("primaryChannel"), getClient(), null);
    }

    /**
     * Gets the request builder for TeamsTemplate
     *
     * @return the ITeamsTemplateWithReferenceRequestBuilder instance
     */
    public ITeamsTemplateWithReferenceRequestBuilder template() {
        return new TeamsTemplateWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("template"), getClient(), null);
    }

    public ITeamArchiveRequestBuilder archive(final Boolean shouldSetSpoSiteReadOnlyForMembers) {
        return new TeamArchiveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.archive"), getClient(), null, shouldSetSpoSiteReadOnlyForMembers);
    }

    public ITeamCloneRequestBuilder clone(final String displayName, final String description, final String mailNickname, final String classification, final TeamVisibilityType visibility, final EnumSet<ClonableTeamParts> partsToClone) {
        return new TeamCloneRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clone"), getClient(), null, displayName, description, mailNickname, classification, visibility, partsToClone);
    }

    public ITeamUnarchiveRequestBuilder unarchive() {
        return new TeamUnarchiveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unarchive"), getClient(), null);
    }
}
