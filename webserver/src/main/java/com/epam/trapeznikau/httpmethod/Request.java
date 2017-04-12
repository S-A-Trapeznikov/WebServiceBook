package com.epam.trapeznikau.httpmethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import com.epam.trapeznikau.logic.BookOperation;

public class Request {
	
	private String method;
	private String uri;
	private String version;
	private String host;
	private String accept;
	private String acceptCharset;
	private String acceptEncoding;
	private String acceptLanguage;
	private String contentType;
	private int contentLength;
	private String userAgent;
	private String body;
	
	public Request(){};
	
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getAccept() {
		return accept;
	}
	public void setAccept(String accept) {
		this.accept = accept;
	}
	public String getAcceptCharset() {
		return acceptCharset;
	}
	public void setAcceptCharset(String acceptCharset) {
		this.acceptCharset = acceptCharset;
	}
	public String getAcceptEncoding() {
		return acceptEncoding;
	}
	public void setAcceptEncoding(String acceptEncoding) {
		this.acceptEncoding = acceptEncoding;
	}
	public String getAcceptLanguage() {
		return acceptLanguage;
	}
	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public int getContentLength() {
		return contentLength;
	}
	public void setContentLength(int contentLength) {
		this.contentLength = contentLength;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
		
	public static Response parseRq(List<String> rq) throws IOException{
		Response rp = new Response();
		Request objRq = new Request();
		
		for (String str: rq){
			String arrStr[] = str.split(" ");
			objRq.setMethod(arrStr[0]);
			objRq.setUri(arrStr[1]);
			if (arrStr[2]!=null){
				objRq.setVersion(arrStr[2]);
			}
			break;
			}
		
		rp.setVersion(objRq.getVersion());		
		
		switch (objRq.getMethod()){
		case "GET":  String body = ""; 
					 int i;
					 InputStreamReader in = BookOperation.read(objRq.getUri());
					 while((i = in.read())!=-1){
						 body += (char) i;
					 }
					 rp.setStatusCode("200");
					 rp.setPhrase("OK");
					 rp.setBody(body);
					 
					 break;
		case "POST": break;
		}
		
		return rp;
		
	}
}
