package com.example.spring.firebase.dto;

public class FcmRequest {

  private String title;
  private String message;
//  private String token;

  public FcmRequest() {
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

//  public String getToken() {
//    return token;
//  }
//
//  public void setToken(String token) {
//    this.token = token;
//  }

}
