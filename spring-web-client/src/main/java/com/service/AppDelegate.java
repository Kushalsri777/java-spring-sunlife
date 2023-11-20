package com.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppDelegate {
	RestTemplate template = new RestTemplate();
	
	public String loademp() {
		String data = template.exchange("http://localhost:5000/userapp/getAllUsers", 
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
				}).getBody();
		return data;
	}
	
	public String loademp2() {
		String data = template.exchange("http://localhost:8060/mainline/loadAll", 
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
				}).getBody();
		return data;
	}
}
