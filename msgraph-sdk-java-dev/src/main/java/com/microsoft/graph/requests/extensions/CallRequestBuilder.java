// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.models.extensions.MediaConfig;
import com.microsoft.graph.models.generated.Modality;
import com.microsoft.graph.models.extensions.CancelMediaProcessingOperation;
import com.microsoft.graph.models.generated.ScreenSharingRole;
import com.microsoft.graph.models.extensions.MuteParticipantOperation;
import com.microsoft.graph.models.extensions.Prompt;
import com.microsoft.graph.models.extensions.PlayPromptOperation;
import com.microsoft.graph.models.extensions.RecordOperation;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.models.generated.RejectReason;
import com.microsoft.graph.models.extensions.SubscribeToToneOperation;
import com.microsoft.graph.models.extensions.UnmuteParticipantOperation;
import com.microsoft.graph.models.generated.RecordingStatus;
import com.microsoft.graph.models.extensions.UpdateRecordingStatusOperation;
import com.microsoft.graph.models.extensions.TeleconferenceDeviceQuality;
import com.microsoft.graph.requests.extensions.ICommsOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommsOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.CommsOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CommsOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IParticipantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IParticipantRequestBuilder;
import com.microsoft.graph.requests.extensions.ParticipantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ParticipantRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Request Builder.
 */
public class CallRequestBuilder extends BaseRequestBuilder implements ICallRequestBuilder {

    /**
     * The request builder for the Call
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ICallRequest instance
     */
    public ICallRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ICallRequest instance
     */
    public ICallRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.CallRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ICommsOperationCollectionRequestBuilder operations() {
        return new CommsOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    public ICommsOperationRequestBuilder operations(final String id) {
        return new CommsOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }
    public IParticipantCollectionRequestBuilder participants() {
        return new ParticipantCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("participants"), getClient(), null);
    }

    public IParticipantRequestBuilder participants(final String id) {
        return new ParticipantRequestBuilder(getRequestUrlWithAdditionalSegment("participants") + "/" + id, getClient(), null);
    }

    public ICallAnswerRequestBuilder answer(final String callbackUri, final MediaConfig mediaConfig, final java.util.List<Modality> acceptedModalities) {
        return new CallAnswerRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.answer"), getClient(), null, callbackUri, mediaConfig, acceptedModalities);
    }

    public ICallCancelMediaProcessingRequestBuilder cancelMediaProcessing(final String clientContext) {
        return new CallCancelMediaProcessingRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cancelMediaProcessing"), getClient(), null, clientContext);
    }

    public ICallChangeScreenSharingRoleRequestBuilder changeScreenSharingRole(final ScreenSharingRole role) {
        return new CallChangeScreenSharingRoleRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.changeScreenSharingRole"), getClient(), null, role);
    }

    public ICallKeepAliveRequestBuilder keepAlive() {
        return new CallKeepAliveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.keepAlive"), getClient(), null);
    }

    public ICallMuteRequestBuilder mute(final String clientContext) {
        return new CallMuteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mute"), getClient(), null, clientContext);
    }

    public ICallPlayPromptRequestBuilder playPrompt(final java.util.List<Prompt> prompts, final String clientContext) {
        return new CallPlayPromptRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.playPrompt"), getClient(), null, prompts, clientContext);
    }

    public ICallRecordResponseRequestBuilder recordResponse(final java.util.List<Prompt> prompts, final Boolean bargeInAllowed, final Integer initialSilenceTimeoutInSeconds, final Integer maxSilenceTimeoutInSeconds, final Integer maxRecordDurationInSeconds, final Boolean playBeep, final java.util.List<String> stopTones, final String clientContext) {
        return new CallRecordResponseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.recordResponse"), getClient(), null, prompts, bargeInAllowed, initialSilenceTimeoutInSeconds, maxSilenceTimeoutInSeconds, maxRecordDurationInSeconds, playBeep, stopTones, clientContext);
    }

    public ICallRedirectRequestBuilder redirect(final java.util.List<InvitationParticipantInfo> targets, final Integer timeout, final String callbackUri) {
        return new CallRedirectRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.redirect"), getClient(), null, targets, timeout, callbackUri);
    }

    public ICallRejectRequestBuilder reject(final RejectReason reason, final String callbackUri) {
        return new CallRejectRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reject"), getClient(), null, reason, callbackUri);
    }

    public ICallSubscribeToToneRequestBuilder subscribeToTone(final String clientContext) {
        return new CallSubscribeToToneRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.subscribeToTone"), getClient(), null, clientContext);
    }

    public ICallTransferRequestBuilder transfer(final InvitationParticipantInfo transferTarget) {
        return new CallTransferRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.transfer"), getClient(), null, transferTarget);
    }

    public ICallUnmuteRequestBuilder unmute(final String clientContext) {
        return new CallUnmuteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unmute"), getClient(), null, clientContext);
    }

    public ICallUpdateRecordingStatusRequestBuilder updateRecordingStatus(final RecordingStatus status, final String clientContext) {
        return new CallUpdateRecordingStatusRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateRecordingStatus"), getClient(), null, status, clientContext);
    }
}
