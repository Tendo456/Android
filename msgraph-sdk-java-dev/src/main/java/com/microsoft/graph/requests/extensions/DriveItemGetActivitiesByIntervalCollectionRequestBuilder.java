// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDriveItemGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemGetActivitiesByIntervalCollectionRequest;
import com.microsoft.graph.requests.extensions.DriveItemGetActivitiesByIntervalCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Get Activities By Interval Collection Request Builder.
 */
public class DriveItemGetActivitiesByIntervalCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IDriveItemGetActivitiesByIntervalCollectionRequestBuilder {

    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemGetActivitiesByIntervalCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startDateTime the startDateTime
     * @param endDateTime the endDateTime
     * @param interval the interval
     */
    public DriveItemGetActivitiesByIntervalCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String startDateTime, final String endDateTime, final String interval) {
        super(requestUrl, client, requestOptions);
     	 if(startDateTime!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("startDateTime", startDateTime));
		}
       	 if(endDateTime!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("endDateTime", endDateTime));
		}
       	 if(interval!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("interval", interval));
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDriveItemGetActivitiesByIntervalCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDriveItemGetActivitiesByIntervalCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DriveItemGetActivitiesByIntervalCollectionRequest request = new DriveItemGetActivitiesByIntervalCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
