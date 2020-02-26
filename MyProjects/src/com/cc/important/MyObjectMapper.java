package com.cc.important;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyObjectMapper {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Hello h = new Hello();
		h.m1();
	}
}

class Hello {

	@SuppressWarnings("unchecked")
	void m1() throws JsonParseException, JsonMappingException, IOException {
		Map<String, Object> props = new HashMap<String, Object>();
		String content_type = "json";
		String usernameAndPassword = "eyJ1c2VybmFtZSI6InVtYW1haGVzaHdhci5nQGNvZ2tuaXQuY29tIiwicGFzc3dvcmQiOiJRMjluYTI1cGRFQXhNak09In0=";
		byte[] decoded = DatatypeConverter.parseBase64Binary(usernameAndPassword);
		usernameAndPassword = new String(decoded, "UTF-8");
		System.out.println("usernameAndPassword3:" + usernameAndPassword);
		System.out.println("content type == " + content_type);
		if (content_type.equalsIgnoreCase("json")) {
			ObjectMapper mapper = new ObjectMapper();
			props = mapper.readValue(usernameAndPassword, Map.class);
			System.out.println(props);
		}
	}
}
