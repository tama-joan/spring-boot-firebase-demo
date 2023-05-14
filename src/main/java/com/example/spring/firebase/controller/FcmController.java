package com.example.spring.firebase.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.firebase.service.FcmService;
import com.example.spring.firebase.web.dto.FcmRequest;

@RestController
public class FcmController {

	private final FcmService fcmService;

	public FcmController(FcmService fcmService) {
		this.fcmService = fcmService;
	}

	@PostMapping("/send-fcm")
	public void sendFcm(@RequestBody FcmRequest fcmRequest) throws Exception {

		String response = fcmService.sendMessage(fcmRequest);

		System.out.print("response:" + response);

	}
}
