package com.biz.data.config;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;

public class RestTempInterceptor implements ClientHttpResponse{

	@Override
	public InputStream getBody() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpHeaders getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpStatus getStatusCode() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRawStatusCode() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getStatusText() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
