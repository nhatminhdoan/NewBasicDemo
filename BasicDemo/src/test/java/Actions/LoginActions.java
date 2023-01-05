package Actions;

import org.openqa.selenium.support.PageFactory;

import Locators.LoginLocators;
import Utils.SetUpDriver;

public class LoginActions {
	LoginLocators loginPageLocators = null; 
    
    public LoginActions() {
 
        this.loginPageLocators = new LoginLocators();
 
        PageFactory.initElements(SetUpDriver.getDriver(),loginPageLocators);
    }
  
    // Set user name in textbox
    public void setUserName(String strUserName) {
        loginPageLocators.userName.sendKeys(strUserName);
    }
  
    // Set password in password textbox
    public void setPassword(String strPassword) {
        loginPageLocators.password.sendKeys(strPassword);
    }
  
    // Click on login button
    public void clickLogin() {
        loginPageLocators.login.click();
    }
  
     
   // Get the error message when username is blank
    public String getMissingUsernameText() {
        return loginPageLocators.missingUsernameErrorMessage.getText();
    }
       
    // Get the Error Message
    public String getErrorMessage() {
        return loginPageLocators.errorMessage.getText();
    }
  
    public void login(String strUserName, String strPassword) throws InterruptedException {
  
        // Fill user name
        this.setUserName(strUserName);
  
        // Fill password
        this.setPassword(strPassword);
  
        // Click Login button
        this.clickLogin();
        Thread.sleep(2000);
    }
}
