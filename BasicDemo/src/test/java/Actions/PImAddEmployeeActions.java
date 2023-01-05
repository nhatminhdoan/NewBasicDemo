package Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Locators.PImAddEmployeeLocators;

import Utils.SetUpDriver;

public class PImAddEmployeeActions {
PImAddEmployeeLocators plmAddEmployeeLocators = null;
    
    public  WebElement plmAddPage;
    public PImAddEmployeeActions() {
           
        this.plmAddEmployeeLocators = new PImAddEmployeeLocators();
   
        PageFactory.initElements(SetUpDriver.getDriver(),plmAddEmployeeLocators);
    }
 // Get the User name from PIM Page
    public String getPIMAddEmployeePageText() {
        return plmAddEmployeeLocators.AddEployeeTitle.getText();
    }
    
    // Set first name in textbox
    public void setFirstName(String strFirstName) {
        plmAddEmployeeLocators.firstName.sendKeys(strFirstName);
    }
    // Set middle name in textbox
    public void setMiddleName(String strMiddleName) {
        plmAddEmployeeLocators.middleName.sendKeys(strMiddleName);
    }
    // Set last name in textbox
    public void setLastName(String strLastName) {
        plmAddEmployeeLocators.lastName.sendKeys(strLastName);
    }
// // Set first name in textbox
//    public void setEmployeeID(String strEmployeeID) {
//        plmAddEmployeeLocators.employeeID.sendKeys(strEmployeeID);
//    }
    // Click on Add button
    public void clickBtnSave() {
    	plmAddEmployeeLocators.btnSave.click();
    }
    // Get the Error Message
    public String getsuccessSavedMessage() {
        return plmAddEmployeeLocators.successSavedMessage.getText();
    }
    
	 public void save(String strFirstName, String strMiddleName, String strLastName) throws InterruptedException {
  
        // Fill first name
        this.setFirstName(strFirstName);
  
        // Fill middle name
        this.setMiddleName(strMiddleName);
  
        // Fill middle name
        this.setLastName(strLastName);
        
//     // Fill employeeID 
//        this.setEmployeeID(strEmployeeID);
  
  
        // Click Login button
        this.clickBtnSave();
        Thread.sleep(2000);
    }
}
