package com.meme.webservice;

/**
 * Created by zhangb on 20/11/2015.
 */
public class MainEntry {
    public static void main(String[] args){
        HelloWorldWService helloWorldWService = new HelloWorldWService();
        HelloWorldWS helloWorldWS = helloWorldWService.getHelloWorldWSPort();

        System.out.println(helloWorldWS.getHelloWorld());

        System.out.println(helloWorldWS.getUserDetails(200));

        System.out.println(helloWorldWS.getUserDetails(0));
    }
}
