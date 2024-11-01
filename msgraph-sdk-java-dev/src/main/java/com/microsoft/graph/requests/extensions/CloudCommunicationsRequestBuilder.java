// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CloudCommunications;
import com.microsoft.graph.models.extensions.Presence;
import com.microsoft.graph.requests.extensions.ICallCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICallRequestBuilder;
import com.microsoft.graph.requests.extensions.CallCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CallRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.ICallRecordCollectionRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.ICallRecordRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.CallRecordCollectionRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.CallRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnlineMeetingRequestBuilder;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnlineMeetingRequestBuilder;
import com.microsoft.graph.requests.extensions.IPresenceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPresenceRequestBuilder;
import com.microsoft.graph.requests.extensions.PresenceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PresenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Communications Request Builder.
 */
public class CloudCommunicationsRequestBuilder extends BaseRequestBuilder implements ICloudCommunicationsRequestBuilder {

    /**
     * The request builder for the CloudCommunications
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudCommunicationsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ICloudCommunicationsRequest instance
     */
    public ICloudCommunicationsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ICloudCommunicationsRequest instance
     */
    public ICloudCommunicationsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.CloudCommunicationsRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ICallCollectionRequestBuilder calls() {
        return new CallCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calls"), getClient(), null);
    }

    public ICallRequestBuilder calls(final String id) {
        return new CallRequestBuilder(getRequestUrlWithAdditionalSegment("calls") + "/" + id, getClient(), null);
    }
    public ICallRecordCollectionRequestBuilder callRecords() {
        return new CallRecordCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("callRecords"), getClient(), null);
    }

    public ICallRecordRequestBuilder callRecords(final String id) {
        return new CallRecordRequestBuilder(getRequestUrlWithAdditionalSegment("callRecords") + "/" + id, getClient(), null);
    }
    public IOnlineMeetingCollectionRequestBuilder onlineMeetings() {
        return new OnlineMeetingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("onlineMeetings"), getClient(), null);
    }

    public IOnlineMeetingRequestBuilder onlineMeetings(final String id) {
        return new OnlineMeetingRequestBuilder(getRequestUrlWithAdditionalSegment("onlineMeetings") + "/" + id, getClient(), null);
    }
    public IPresenceCollectionRequestBuilder presences() {
        return new PresenceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("presences"), getClient(), null);
    }

    public IPresenceRequestBuilder presences(final String id) {
        return new PresenceRequestBuilder(getRequestUrlWithAdditionalSegment("presences") + "/" + id, getClient(), null);
    }

    public ICloudCommunicationsGetPresencesByUserIdCollectionRequestBuilder getPresencesByUserId(final java.util.List<String> ids) {
        return new CloudCommunicationsGetPresencesByUserIdCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getPresencesByUserId"), getClient(), null, ids);
    }
}
