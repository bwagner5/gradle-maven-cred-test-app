package com.tripletech;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

public class DemoApplication {

  public static void main(String[] args){

    System.out.println(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain().getCredentials().getAWSAccessKeyId());

  }
}
