package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {

	@FindBy(name = "username")
    public WebElement userName;
  
    @FindBy(name = "password")
    public WebElement password;
     
    @FindBy(xpath = "//*[contains(text(),'Required')]")
    public WebElement missingUsernameErrorMessage;
     
    @FindBy(xpath = "//div[@class='oxd-form-actions orangehrm-login-action']//button")
    public WebElement login;
  
    @FindBy(xpath = "//*[contains(text(),'Invalid credentials')]")
    public  WebElement errorMessage;
}
