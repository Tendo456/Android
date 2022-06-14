// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DirectoryObject;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Role Assignment.
 */
public class AppRoleAssignment extends DirectoryObject implements IJsonBackedObject {


    /**
     * The App Role Id.
     * The identifier (id) for the app role which is assigned to the principal. This app role must be exposed in the appRoles property on the resource application's service principal (resourceId). If the resource application has not declared any app roles, a default app role ID of 00000000-0000-0000-0000-000000000000 can be specified to signal that the principal is assigned to the resource app without any specific app roles. Required on create. Does not support $filter.
     */
    @SerializedName(value = "appRoleId", alternate = {"AppRoleId"})
    @Expose
    public java.util.UUID appRoleId;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Principal Display Name.
     * The display name of the user, group, or service principal that was granted the app role assignment. Read-only. Supports $filter (eq and startswith).
     */
    @SerializedName(value = "principalDisplayName", alternate = {"PrincipalDisplayName"})
    @Expose
    public String principalDisplayName;

    /**
     * The Principal Id.
     * The unique identifier (id) for the user, group or service principal being granted the app role. Required on create. Does not support $filter.
     */
    @SerializedName(value = "principalId", alternate = {"PrincipalId"})
    @Expose
    public java.util.UUID principalId;

    /**
     * The Principal Type.
     * The type of the assigned principal. This can either be 'User', 'Group' or 'ServicePrincipal'. Read-only. Does not support $filter.
     */
    @SerializedName(value = "principalType", alternate = {"PrincipalType"})
    @Expose
    public String principalType;

    /**
     * The Resource Display Name.
     * The display name of the resource app's service principal to which the assignment is made. Does not support $filter.
     */
    @SerializedName(value = "resourceDisplayName", alternate = {"ResourceDisplayName"})
    @Expose
    public String resourceDisplayName;

    /**
     * The Resource Id.
     * The unique identifier (id) for the resource service principal for which the assignment is made. Required on create. Supports $filter (eq only).
     */
    @SerializedName(value = "resourceId", alternate = {"ResourceId"})
    @Expose
    public java.util.UUID resourceId;


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
