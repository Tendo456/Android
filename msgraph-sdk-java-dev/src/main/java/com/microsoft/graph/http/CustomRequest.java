// ------------------------------------------------------------------------------
// Copyright (c) 2017 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.http;

import com.google.gson.JsonObject;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

public class CustomRequest<T> extends BaseRequest {
	
	public CustomRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Class<T> responseClass) {
		super(requestUrl, client, requestOptions, responseClass);
    }
	
	public static CustomRequest<JsonObject> create(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        return new CustomRequest<JsonObject>(requestUrl, client, requestOptions, JsonObject.class);
    }

    public T get() throws ClientException {
        return send(HttpMethod.GET, null);
    }
    
    public void get(final ICallback<T> callback) {
    	send(HttpMethod.GET, callback, null);
    }
    
    /**
     * Delete this item from the service
     * 
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     * 
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this item with a source
     * 
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ICallback<T> callback) {
        send(HttpMethod.PATCH, callback, super.getResponseType());
    }

    /**
     * Patches this item with a source
     * 
     * @param sourceObject     the source object with updates
     * @return                 the updated item
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public T patch(final T sourceObject) throws ClientException {
        return send(HttpMethod.PATCH, sourceObject);
    }

    /**
     * Creates a new object
     * 
     * @param newObject the new object to create
     * @param callback  the callback to be called after success or failure
     */
    public void post(final T newObject, final ICallback<T> callback) {
        send(HttpMethod.POST, callback, newObject);
    }

    /**
     * Creates a new object
     * 
     * @param newObject        the new object to create
     * @return                 the created object
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public T post(final T newObject) throws ClientException {
        return send(HttpMethod.POST, newObject);
    }
    
    /**
     * Creates a new object
     * 
     * @param putObject the new object to create
     * @param callback  the callback to be called after success or failure
     */
    public void put(final T putObject, final ICallback<T> callback) {
        send(HttpMethod.PUT, callback, putObject);
    }
    
    /**
     * Creates a new object
     * 
     * @param putObject        the new object to create
     * @return                 the created object
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public T put(final T putObject) throws ClientException {
        return send(HttpMethod.PUT, putObject);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return      the updated request
     */
     public CustomRequest<T> select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return      the updated request
     */
     public CustomRequest<T> expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return this;
     }
}
