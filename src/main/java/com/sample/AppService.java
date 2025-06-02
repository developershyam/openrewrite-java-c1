// This is before package
package com.sample;
// This is before import
import java.util.Date;

import org.springframework.stereotype.Component;
// This is before class
public class AppService {

    /**
     * This is before field testAnotherClass.
     */
    private TestAnotherClass testAnotherClass;

    // This is before field date
    private Date date;

    // This is before constructor AppService
    public AppService(TestAnotherClass testAnotherClass) {
        this.testAnotherClass = testAnotherClass;
        this.date = new Date();
    }

    /**
     * This method is used to test the old API call.
     */
    @Deprecated
    // between lines comment
    @SuppressWarnings("deprecation")
    public void testAPICAll(){
        this.date = new Date();
        System.out.println("Current date: " + this.date);
        System.out.println(this.testAnotherClass.anotherMethod("Testing"));
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