package StepDefinitions;

//import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.SetUpDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	    @Before
	    public static void setUp()  {
	       new SetUpDriver();
	    }
	 
	    @After
	    public static void tearDown(Scenario scenario) {
	 
	        //validate if scenario has failed
	        if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) SetUpDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	        }   
	         
	        SetUpDriver.tearDown();
	    }
	    
}
