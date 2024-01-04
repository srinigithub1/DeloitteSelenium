package utilities;


import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class HooksDemo {
	
	@Before(order=1) // second in order
    public void beforeScenario(){
        System.out.println("Start the browser and Clear the cookies");
    }	
	@Before(order=0) // Higest Order
    public void beforeScenarioStart(){
        System.out.println("-----------------Start of Scenario-----------------");
    }	
	
	
	@After(order=0)
    public void afterScenarioFinish(){
        System.out.println("-----------------End of Scenario-----------------");
    }
	
	@After(order=1)
    public void afterScenario(){
        System.out.println("Log out the user and close the browser");
    }	

}
