package selneiumTests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;	



//@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"StepDefinition"},publish=true)						
//public class Runner 				
//{		
//
//}


@RunWith(Cucumber.class) 
//@CucumberOptions(features="Features", glue={"StepDefinition"},plugin = {"pretty", "html:target/Destination"} ) 
//@CucumberOptions( plugin={"json:target/Destination/cucumber.json"},features="Features", glue={"StepDefinition"})

/*
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber.html"},
		features = {"Features"},
		glue={"StepDefinition"},
		monochrome = true,
//		tags = {"@contactus"},
		dryRun = false
//		strict = true
		)
*/

//Specifying pretty as a format option ensure that HTML report will be generated. 
//When we specify html:target/Destination - It will generate the HTML report 

//inside the Destination folder, in the target folder of the maven project. 

public class Runner { 
	
}

