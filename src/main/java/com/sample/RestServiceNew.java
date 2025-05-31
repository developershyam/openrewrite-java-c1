package com.sample;

public class RestServiceNew {

    private String newUrl;

    public String Call(){
        return " service called: "+ newUrl;
    }
    public void setNewUrl(String newUrl) {
        this.newUrl = newUrl;
    }
    
}
