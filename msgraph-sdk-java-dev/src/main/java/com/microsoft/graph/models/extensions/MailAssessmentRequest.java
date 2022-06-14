// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.MailDestinationRoutingReason;
import com.microsoft.graph.models.extensions.ThreatAssessmentRequest;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mail Assessment Request.
 */
public class MailAssessmentRequest extends ThreatAssessmentRequest implements IJsonBackedObject {


    /**
     * The Destination Routing Reason.
     * The reason for mail routed to its destination. Possible values are: none, mailFlowRule, safeSender, blockedSender, advancedSpamFiltering, domainAllowList, domainBlockList, notInAddressBook, firstTimeSender, autoPurgeToInbox, autoPurgeToJunk, autoPurgeToDeleted, outbound, notJunk, junk.
     */
    @SerializedName(value = "destinationRoutingReason", alternate = {"DestinationRoutingReason"})
    @Expose
    public MailDestinationRoutingReason destinationRoutingReason;

    /**
     * The Message Uri.
     * The resource URI of the mail message for assessment.
     */
    @SerializedName(value = "messageUri", alternate = {"MessageUri"})
    @Expose
    public String messageUri;

    /**
     * The Recipient Email.
     * The mail recipient whose policies are used to assess the mail.
     */
    @SerializedName(value = "recipientEmail", alternate = {"RecipientEmail"})
    @Expose
    public String recipientEmail;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
