// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Device;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Request Builder.
 */
public class DeviceRequestBuilder extends BaseRequestBuilder implements IDeviceRequestBuilder {

    /**
     * The request builder for the Device
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceRequest instance
     */
    public IDeviceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceRequest instance
     */
    public IDeviceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDirectoryObjectCollectionWithReferencesRequestBuilder memberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder memberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id, getClient(), null);
    }
    public IUserCollectionWithReferencesRequestBuilder memberOfAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserWithReferenceRequestBuilder memberOfAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionWithReferencesRequestBuilder memberOfAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupWithReferenceRequestBuilder memberOfAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionWithReferencesRequestBuilder memberOfAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationWithReferenceRequestBuilder memberOfAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder memberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder memberOfAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionWithReferencesRequestBuilder memberOfAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceWithReferenceRequestBuilder memberOfAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionWithReferencesRequestBuilder memberOfAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactWithReferenceRequestBuilder memberOfAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder registeredOwners() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredOwners"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder registeredOwners(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredOwners") + "/" + id, getClient(), null);
    }
    public IAppRoleAssignmentCollectionWithReferencesRequestBuilder registeredOwnersAsAppRoleAssignment() {
        return new AppRoleAssignmentCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredOwners") + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }

    public IAppRoleAssignmentWithReferenceRequestBuilder registeredOwnersAsAppRoleAssignment(final String id) {
        return new AppRoleAssignmentWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredOwners") + "/" + id + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }
    public IEndpointCollectionWithReferencesRequestBuilder registeredOwnersAsEndpoint() {
        return new EndpointCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredOwners") + "/microsoft.graph.endpoint", getClient(), null);
    }

    public IEndpointWithReferenceRequestBuilder registeredOwnersAsEndpoint(final String id) {
        return new EndpointWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredOwners") + "/" + id + "/microsoft.graph.endpoint", getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder registeredOwnersAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredOwners") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder registeredOwnersAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredOwners") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IUserCollectionWithReferencesRequestBuilder registeredOwnersAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredOwners") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserWithReferenceRequestBuilder registeredOwnersAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredOwners") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder registeredUsers() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredUsers"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder registeredUsers(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredUsers") + "/" + id, getClient(), null);
    }
    public IAppRoleAssignmentCollectionWithReferencesRequestBuilder registeredUsersAsAppRoleAssignment() {
        return new AppRoleAssignmentCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredUsers") + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }

    public IAppRoleAssignmentWithReferenceRequestBuilder registeredUsersAsAppRoleAssignment(final String id) {
        return new AppRoleAssignmentWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredUsers") + "/" + id + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }
    public IEndpointCollectionWithReferencesRequestBuilder registeredUsersAsEndpoint() {
        return new EndpointCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredUsers") + "/microsoft.graph.endpoint", getClient(), null);
    }

    public IEndpointWithReferenceRequestBuilder registeredUsersAsEndpoint(final String id) {
        return new EndpointWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredUsers") + "/" + id + "/microsoft.graph.endpoint", getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder registeredUsersAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredUsers") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder registeredUsersAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredUsers") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IUserCollectionWithReferencesRequestBuilder registeredUsersAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredUsers") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserWithReferenceRequestBuilder registeredUsersAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredUsers") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id, getClient(), null);
    }
    public IUserCollectionWithReferencesRequestBuilder transitiveMemberOfAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.user", getClient(), null);
    }

    public IUserWithReferenceRequestBuilder transitiveMemberOfAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public IGroupCollectionWithReferencesRequestBuilder transitiveMemberOfAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.group", getClient(), null);
    }

    public IGroupWithReferenceRequestBuilder transitiveMemberOfAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public IApplicationCollectionWithReferencesRequestBuilder transitiveMemberOfAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.application", getClient(), null);
    }

    public IApplicationWithReferenceRequestBuilder transitiveMemberOfAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public IServicePrincipalCollectionWithReferencesRequestBuilder transitiveMemberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public IServicePrincipalWithReferenceRequestBuilder transitiveMemberOfAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public IDeviceCollectionWithReferencesRequestBuilder transitiveMemberOfAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.device", getClient(), null);
    }

    public IDeviceWithReferenceRequestBuilder transitiveMemberOfAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public IOrgContactCollectionWithReferencesRequestBuilder transitiveMemberOfAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public IOrgContactWithReferenceRequestBuilder transitiveMemberOfAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public IExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    public IExtensionRequestBuilder extensions(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
}
