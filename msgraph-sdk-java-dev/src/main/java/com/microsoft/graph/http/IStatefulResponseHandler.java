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


import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.serializer.ISerializer;

import okhttp3.Response;

/**
 * The handler interface for requests having stateful response from server.
 * The handler will custom the HTTP connection if needed and generate request
 * result based on the server HTTP response.
 *
 * @param <ResultType>       the result to return
 * @param <DeserializedType> the deserialize type for serializer
 */
public interface IStatefulResponseHandler<ResultType, DeserializedType> {
    /**
     * Configure the connection before get response
     *
     * @param connection the HTTP connection
     */
    void configConnection(final IConnection connection);
    
    /**
     * Configure the response
     *
     * @param response the HTTP response
     */
    void configConnection(final Response response);

    /**
     * Generate result after receiving response
     *
     * @param request    the HTTP request
     * @param connection the HTTP connection
     * @param serializer the serializer for parsing response
     * @param logger     the logger
     * @return           the result generated by this handler
     * @throws Exception an exception occurs if the request was unable to complete for any reason
     */
    ResultType generateResult(final IHttpRequest request,
                              final IConnection connection,
                              final ISerializer serializer,
                              final ILogger logger) throws Exception;
    
    /**
     * Generate result after receiving response
     *
     * @param request    the HTTP request
     * @param response the HTTP connection
     * @param serializer the serializer for parsing response
     * @param logger     the logger
     * @return           the result generated by this handler
     * @throws Exception an exception occurs if the request was unable to complete for any reason
     */
    ResultType generateResult(final IHttpRequest request,
                              final Response response,
                              final ISerializer serializer,
                              final ILogger logger) throws Exception;
}
