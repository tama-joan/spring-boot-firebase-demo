package com.example.spring.firebase.service;

import org.springframework.stereotype.Service;

import com.example.spring.firebase.web.dto.FcmRequest;
import com.google.firebase.messaging.AndroidConfig;
import com.google.firebase.messaging.AndroidNotification;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;

@Service
public class FcmService {
  
  
  public String sendMessage(FcmRequest request) throws FirebaseMessagingException{
	  
    AndroidNotification androidNotification = AndroidNotification.builder()
        .setTitle(request.getTitle())
        .setBody(request.getMessage())
        .build();
    
    AndroidConfig androidConfig = AndroidConfig.builder().setNotification(androidNotification).build();
    
    Message message = Message.builder().setToken(request.getToken()).setAndroidConfig(androidConfig).build();
    
    return FirebaseMessaging.getInstance().send(message);
  }

}
