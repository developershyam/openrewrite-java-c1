package com.sample;

public class AppService {

    private RestServiceOld restServiceOld;

    public AppService(RestServiceOld restServiceOld) {
        this.restServiceOld = restServiceOld;
    }


    public void testAPICAll(){
        System.out.println(this.restServiceOld.oldCall());
    }
    
}
