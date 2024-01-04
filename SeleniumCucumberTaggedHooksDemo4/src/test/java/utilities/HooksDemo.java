package utilities;


import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class HooksDemo {
	
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the every Scenario");
    }

	@After
    public void afterScenario(){
        System.out.println("This will run after the every Scenario");
    }

	@Before("@SmokeTest")
    public void beforeFirst(){
        System.out.println("This will run only before the First Scenario");
    }	

	@Before("@RegressionTest")
    public void beforeSecond(){
        System.out.println("This will run only before the Second Scenario");
    }	

	@Before("@Third")
    public void beforeThird(){
        System.out.println("This will run only before the Third Scenario");
    }

	@After("@SmokeTest")
    public void afterFirst(){
        System.out.println("This will run only after the First Scenario");   
    }	

	@After("@RegressionTest")
    public void afterSecond(){
        System.out.println("This will run only after the Second Scenario");   
    }	

	@After("@Third")
    public void afterThird(){
        System.out.println("This will run only after the Third Scenario");   
    }	

}
