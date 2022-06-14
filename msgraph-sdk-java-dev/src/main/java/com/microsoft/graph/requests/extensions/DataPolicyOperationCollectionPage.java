// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DataPolicyOperation;
import com.microsoft.graph.requests.extensions.IDataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DataPolicyOperationCollectionPage;
import com.microsoft.graph.requests.extensions.DataPolicyOperationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Policy Operation Collection Page.
 */
public class DataPolicyOperationCollectionPage extends BaseCollectionPage<DataPolicyOperation, IDataPolicyOperationCollectionRequestBuilder> implements IDataPolicyOperationCollectionPage {

    /**
     * A collection page for DataPolicyOperation
     *
     * @param response the serialized DataPolicyOperationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DataPolicyOperationCollectionPage(final DataPolicyOperationCollectionResponse response, final IDataPolicyOperationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
