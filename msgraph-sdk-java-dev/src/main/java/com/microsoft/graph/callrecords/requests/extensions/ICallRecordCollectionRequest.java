// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CloudCommunications;
import com.microsoft.graph.callrecords.models.extensions.CallRecord;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Call Record Collection Request.
 */
public interface ICallRecordCollectionRequest extends IHttpRequest {

    void get(final ICallback<? super ICallRecordCollectionPage> callback);

    ICallRecordCollectionPage get() throws ClientException;

    void post(final CallRecord newCallRecord, final ICallback<? super CallRecord> callback);

    CallRecord post(final CallRecord newCallRecord) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICallRecordCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    ICallRecordCollectionRequest filter(final String value);

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    ICallRecordCollectionRequest orderBy(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICallRecordCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    ICallRecordCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    ICallRecordCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	ICallRecordCollectionRequest skipToken(final String skipToken);
}
