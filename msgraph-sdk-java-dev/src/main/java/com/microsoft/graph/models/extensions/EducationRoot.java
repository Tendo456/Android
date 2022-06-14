// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EducationClassCollectionPage;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionPage;
import com.microsoft.graph.requests.extensions.EducationUserCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Root.
 */
public class EducationRoot extends Entity implements IJsonBackedObject {


    /**
     * The Classes.
     * Read-only. Nullable.
     */
    @SerializedName(value = "classes", alternate = {"Classes"})
    @Expose
    public EducationClassCollectionPage classes;

    /**
     * The Me.
     * Read-only. Nullable.
     */
    @SerializedName(value = "me", alternate = {"Me"})
    @Expose
    public EducationUser me;

    /**
     * The Schools.
     * Read-only. Nullable.
     */
    @SerializedName(value = "schools", alternate = {"Schools"})
    @Expose
    public EducationSchoolCollectionPage schools;

    /**
     * The Users.
     * Read-only. Nullable.
     */
    @SerializedName(value = "users", alternate = {"Users"})
    @Expose
    public EducationUserCollectionPage users;


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


        if (json.has("classes")) {
            classes = serializer.deserializeObject(json.get("classes").toString(), EducationClassCollectionPage.class);
        }

        if (json.has("schools")) {
            schools = serializer.deserializeObject(json.get("schools").toString(), EducationSchoolCollectionPage.class);
        }

        if (json.has("users")) {
            users = serializer.deserializeObject(json.get("users").toString(), EducationUserCollectionPage.class);
        }
    }
}
