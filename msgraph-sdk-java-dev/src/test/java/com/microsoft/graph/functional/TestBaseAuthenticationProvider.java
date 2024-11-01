package com.microsoft.graph.functional;

import com.microsoft.graph.authentication.IAuthenticationProvider;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.httpcore.ICoreAuthenticationProvider;

import okhttp3.Request;

public class TestBaseAuthenticationProvider implements IAuthenticationProvider, ICoreAuthenticationProvider {
    private String _accessToken;
    private String hostNameToCheck = "graph";
    public TestBaseAuthenticationProvider(String accessToken) {
        _accessToken = accessToken;
    }
    @Override
    public Request authenticateRequest(Request request) {
        if(request.url().host().toLowerCase().contains(hostNameToCheck))
            return request.newBuilder().addHeader("Authorization", "Bearer " + _accessToken).build();
        else
            return request;
    }

    @Override
    public void authenticateRequest(IHttpRequest request) {
        if(request.getRequestUrl().getHost().toLowerCase().contains(hostNameToCheck))
            request.addHeader("Authorization",
                                "Bearer " + _accessToken);
    }
    
}
