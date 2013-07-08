package com.plivo.helper;

import java.util.LinkedHashMap;
import com.plivo.helper.api.client.RestAPI;
import com.plivo.helper.exception.PlivoException;
import com.plivo.helper.api.response.message.MessageResponse;

public class SendSms {
  public static void main(String[] args) {

		RestAPI restAPI = new RestAPI("", "", "v1");

		LinkedHashMap<String, String> params = new LinkedHashMap<String, String>();
		params.put("src", "14156121187");
		params.put("dst", "14156121186");
		params.put("text", "put text message here.");
		params.put("url", "");

		MessageResponse response;
		try {

			response = restAPI.sendMessage(params);
			System.out.println(response.apiId);
		} 
		catch (PlivoException e) {
			System.out.println(e.getMessage());
		}

	}

}
