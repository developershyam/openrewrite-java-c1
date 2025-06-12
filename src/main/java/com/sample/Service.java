package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.api1.RestAPI1;

@Component
public class Service {

     @Autowired
     RestAPI1 api1;
     
     public void callAPI() {
        // Call the API method
        String response = api1.getData("Sample Input");
                
        // Process the response
        System.out.println("Response from API: " + response);
     }
}
