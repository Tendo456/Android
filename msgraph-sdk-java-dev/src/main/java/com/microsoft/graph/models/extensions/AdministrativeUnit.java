// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.ScopedRoleMembership;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Administrative Unit.
 */
public class AdministrativeUnit extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Description.
     * An optional description for the administrative unit.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * Display name for the administrative unit.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Visibility.
     * Controls whether the administrative unit and its members are hidden or public. Can be set to HiddenMembership or Public. If not set, default behavior is Public. When set to HiddenMembership, only members of the administrative unit can list other members of the adminstrative unit.
     */
    @SerializedName(value = "visibility", alternate = {"Visibility"})
    @Expose
    public String visibility;

    /**
     * The Members.
     * Users and groups that are members of this Adminsitrative Unit. HTTP Methods: GET (list members), POST (add members), DELETE (remove members).
     */
    public DirectoryObjectCollectionPage members;

    /**
     * The Scoped Role Members.
     * Scoped-role members of this Administrative Unit.  HTTP Methods: GET (list scopedRoleMemberships), POST (add scopedRoleMembership), DELETE (remove scopedRoleMembership).
     */
    @SerializedName(value = "scopedRoleMembers", alternate = {"ScopedRoleMembers"})
    @Expose
    public ScopedRoleMembershipCollectionPage scopedRoleMembers;

    /**
     * The Extensions.
     * 
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
    public ExtensionCollectionPage extensions;


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


        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("scopedRoleMembers")) {
            scopedRoleMembers = serializer.deserializeObject(json.get("scopedRoleMembers").toString(), ScopedRoleMembershipCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions").toString(), ExtensionCollectionPage.class);
        }
    }
}
