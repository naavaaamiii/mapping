package com.restconsume;

import org.springframework.web.client.RestTemplate;

public class Consume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://localhost:8035/restcrud/webapi/message";
		RestTemplate rest=new RestTemplate();
		String s=rest.getForObject(url, String.class);
		System.out.println(s);

	}

}
