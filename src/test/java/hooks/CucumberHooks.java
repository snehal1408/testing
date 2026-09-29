package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class CucumberHooks {
//    @Before(order = -3)
//    public void setUp(){
//        System.out.println("...Before class order -3....");
//    }
    @Before(order = 1)
    public void setUp1(){
        System.out.println("...Before class order 1....");
    }
    @After
    public void tearDown(){
        System.out.println("...After class....");
    }
    @BeforeStep
    public void setUpStep(){
        System.out.println("...BeforeStep class....");
    }
    @AfterStep
    public void tearDownStep(){
        System.out.println("...AfterStep class....");
    }
}
