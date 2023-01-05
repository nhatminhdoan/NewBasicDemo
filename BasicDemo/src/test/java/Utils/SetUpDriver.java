package Utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import Utils.SetUpDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUpDriver {
  //private static SetUpDriver setupDriver;
    
    private static WebDriver driver;
    public final static int TIMEOUT = 10;
       
     public SetUpDriver()  {
        driver = setUpDriver();
     }      
               
    public static void openPage(String url) {
        driver.get(url);
    }
     
    public static WebDriver getDriver() {
        return driver;              
    }
       
    public static WebDriver setUpDriver()  {
    	int number = 3;
    	switch (number) {
  	 // local
  	  case 1:
  		    WebDriverManager.chromedriver().setup();
  	    	WebDriver driver = new ChromeDriver();
  	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
  	        driver.manage().window().maximize();
  	        return driver;
  	        
  	   //grid     
  	  case 2:      
  		  ChromeOptions chromeOptions = new ChromeOptions();
  		  //chromeOptions.setCapability("browserVersion", "100");
  		  //chromeOptions.setCapability("platformName", "Windows");
  		  // Showing a test name instead of the session id in the Grid UI
  		  //chromeOptions.setCapability("se:name", "My simple test"); 
  		  // Other type of metadata can be seen in the Grid UI by clicking on the 
  		  // session info or via GraphQL
  		 // chromeOptions.setCapability("se:sampleMetadata", "Sample metadata value"); 
  		  try {
				return new RemoteWebDriver(new URL(" http://10.134.112.250:4444"), chromeOptions);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  		     break;
  	   case 3:  
  		   ChromeOptions browserOptions = new ChromeOptions();
			//browserOptions.setPlatformName("Windows 11");
  	    	//browserOptions.setBrowserVersion("107");
  	    	//Map<String, Object> sauceOptions = new HashMap<>();
  	    	//sauceOptions.put("build", "selenium-build-G1PUL");
  	    	//((MutableCapabilities) sauceOptions).setCapability("name", "hfdl");
  	    	//browserOptions.setCapability("sauce:options", sauceOptions);
  	    	
  	    	URL url = null;
  			try {
  				url = new URL("https://oauth-minhqqq09-1feb7:*****eeec@ondemand.us-west-1.saucelabs.com:443/wd/hub");
  			} catch (MalformedURLException e) {
  				// TODO Auto-generated catch block
  				e.printStackTrace();
  			}
  	    			return new RemoteWebDriver(url, browserOptions);
  	    	
  		  }
    	
		return null;
    	  
    }
       
    public static void tearDown() {
            
        if(driver!=null) {
             driver.close();
             driver.quit();
        }
            
      // setupDriver = null;
   } 
}
