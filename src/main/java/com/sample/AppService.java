// This is before package
package com.sample;
// This is before import
import java.util.Date;

import org.springframework.stereotype.Component;
// This is before class
public class AppService {

    /**
     * This is before field restServiceOld.
     */
    private RestServiceOld restServiceOld;

    // This is before field date
    private Date date;

    // This is before constructor AppService
    public AppService(RestServiceOld restServiceOld) {
        this.restServiceOld = restServiceOld;
        this.date = new Date();
    }

    /**
     * This method is used to test the old API call.
     */
    public void testAPICAll(){
        this.date = new Date();
        System.out.println("Current date: " + this.date);
        System.out.println(this.restServiceOld.oldCall());
    }
    
}

@Component
class TestAnotherClass {
    public void testMethod() {
        System.out.println("This is a test method in TestAnotherClass.");
    }
    
    public String anotherMethod(String input) {
        return "Processed: " + input;
    }
}

interface InnerAppService {
    String testVar="Test";
    void innerMethod();
}