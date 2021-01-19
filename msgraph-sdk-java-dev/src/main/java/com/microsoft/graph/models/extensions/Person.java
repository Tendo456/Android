// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PersonType;
import com.microsoft.graph.models.extensions.Phone;
import com.microsoft.graph.models.extensions.Location;
import com.microsoft.graph.models.extensions.ScoredEmailAddress;
import com.microsoft.graph.models.extensions.Website;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person.
 */
public class Person extends Entity implements IJsonBackedObject {


    /**
     * The Birthday.
     * The person's birthday.
     */
    @SerializedName(value = "birthday", alternate = {"Birthday"})
    @Expose
    public String birthday;

    /**
     * The Company Name.
     * The name of the person's company.
     */
    @SerializedName(value = "companyName", alternate = {"CompanyName"})
    @Expose
    public String companyName;

    /**
     * The Department.
     * The person's department.
     */
    @SerializedName(value = "department", alternate = {"Department"})
    @Expose
    public String department;

    /**
     * The Display Name.
     * The person's display name.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Given Name.
     * The person's given name.
     */
    @SerializedName(value = "givenName", alternate = {"GivenName"})
    @Expose
    public String givenName;

    /**
     * The Im Address.
     * The instant message voice over IP (VOIP) session initiation protocol (SIP) address for the user. Read-only.
     */
    @SerializedName(value = "imAddress", alternate = {"ImAddress"})
    @Expose
    public String imAddress;

    /**
     * The Is Favorite.
     * true if the user has flagged this person as a favorite.
     */
    @SerializedName(value = "isFavorite", alternate = {"IsFavorite"})
    @Expose
    public Boolean isFavorite;

    /**
     * The Job Title.
     * The person's job title.
     */
    @SerializedName(value = "jobTitle", alternate = {"JobTitle"})
    @Expose
    public String jobTitle;

    /**
     * The Office Location.
     * The location of the person's office.
     */
    @SerializedName(value = "officeLocation", alternate = {"OfficeLocation"})
    @Expose
    public String officeLocation;

    /**
     * The Person Notes.
     * Free-form notes that the user has taken about this person.
     */
    @SerializedName(value = "personNotes", alternate = {"PersonNotes"})
    @Expose
    public String personNotes;

    /**
     * The Person Type.
     * The type of person.
     */
    @SerializedName(value = "personType", alternate = {"PersonType"})
    @Expose
    public PersonType personType;

    /**
     * The Phones.
     * The person's phone numbers.
     */
    @SerializedName(value = "phones", alternate = {"Phones"})
    @Expose
    public java.util.List<Phone> phones;

    /**
     * The Postal Addresses.
     * The person's addresses.
     */
    @SerializedName(value = "postalAddresses", alternate = {"PostalAddresses"})
    @Expose
    public java.util.List<Location> postalAddresses;

    /**
     * The Profession.
     * The person's profession.
     */
    @SerializedName(value = "profession", alternate = {"Profession"})
    @Expose
    public String profession;

    /**
     * The Scored Email Addresses.
     * The person's email addresses.
     */
    @SerializedName(value = "scoredEmailAddresses", alternate = {"ScoredEmailAddresses"})
    @Expose
    public java.util.List<ScoredEmailAddress> scoredEmailAddresses;

    /**
     * The Surname.
     * The person's surname.
     */
    @SerializedName(value = "surname", alternate = {"Surname"})
    @Expose
    public String surname;

    /**
     * The User Principal Name.
     * The user principal name (UPN) of the person. The UPN is an Internet-style login name for the person based on the Internet standard RFC 822. By convention, this should map to the person's email name. The general format is alias@domain.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;

    /**
     * The Websites.
     * The person's websites.
     */
    @SerializedName(value = "websites", alternate = {"Websites"})
    @Expose
    public java.util.List<Website> websites;

    /**
     * The Yomi Company.
     * The phonetic Japanese name of the person's company.
     */
    @SerializedName(value = "yomiCompany", alternate = {"YomiCompany"})
    @Expose
    public String yomiCompany;


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
