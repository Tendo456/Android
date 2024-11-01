// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TodoTaskList;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITodoTaskListDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TodoTaskListDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.TodoTaskListDeltaCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Task List Delta Collection Page.
 */
public class TodoTaskListDeltaCollectionPage extends BaseCollectionPage<TodoTaskList, ITodoTaskListDeltaCollectionRequestBuilder> implements ITodoTaskListDeltaCollectionPage {

    /**
     * The opaque link to query delta after the 
     * initial request
     */
    public String deltaLink;

    /**
     * A collection page for TodoTaskList.
     *
     * @param response The serialized TodoTaskListDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public TodoTaskListDeltaCollectionPage(final TodoTaskListDeltaCollectionResponse response, final ITodoTaskListDeltaCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());

        if (response.getRawObject().get("@odata.deltaLink") != null) {
            deltaLink = response.getRawObject().get("@odata.deltaLink").getAsString();
        } else {
            deltaLink = null;
        }
    }
    /**
     * The deltaLink to make future delta requests
     *
     * @return String The deltaLink URL
     */
    public String deltaLink() {
        return deltaLink;
    }
}
