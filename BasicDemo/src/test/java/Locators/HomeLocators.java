package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeLocators {
	 
	 @FindBy(xpath = "//*[contains(text(),'Dashboard')]")
     public  WebElement homePageUserName;
	 
	 
	 @FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
	  public WebElement btnPIM;
}
