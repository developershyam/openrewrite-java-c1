package com.sample;

public class RestServiceOld {
    

    private String url;

    public String oldCall(){
        return "Old service called: "+ url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
