package Actions;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Locators.HomeLocators;
import Utils.SetUpDriver;

public class HomeActions {
	 HomeLocators homePageLocators = null;
	    
	    public  WebElement homePageUserName;
	    public HomeActions() {
	           
	        this.homePageLocators = new HomeLocators();
	   
	        PageFactory.initElements(SetUpDriver.getDriver(),homePageLocators);
	    }
	   
	    
	    // Get the User name from Home Page
	    public String getHomePageText() {
	        return homePageLocators.homePageUserName.getText();
	    }
	    // Click on PIM button
	    public void clickBtnPIM() {
	    	homePageLocators.btnPIM.click();
	    }
}

