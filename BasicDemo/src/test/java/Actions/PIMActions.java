package Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Locators.PIMLocators;
import Utils.SetUpDriver;

 public class PIMActions { 
  
	 PIMLocators pimPageLocators = null;
	    
	    public  WebElement homePageUserName;
	    public PIMActions() {
	           
	        this.pimPageLocators = new PIMLocators();
	   
	        PageFactory.initElements(SetUpDriver.getDriver(),pimPageLocators);
	    }
	   
	    
	    // Get the User name from PIM Page
	    public String getPIMPageText() {
	        return pimPageLocators.pimUserName.getText();
	    }
	    // Click on Add button
	    public void clickBtnAdd() {
	    	pimPageLocators.btnAdd.click();
	    }
	    
	    // Set employee name in text box
	    public void setEmployeeName(String strEmployeeName) {
	        pimPageLocators.txtEmployeeName.sendKeys(strEmployeeName);
	    }
	    // Click on Search button
	    public void clickBtnSearch() {
	    	pimPageLocators.btnSearch.click();
	    }
	    
	    // Click on Delete button
	    public void clickBtnDelete() {
	    	pimPageLocators.btnDelete.click();
	    }
	    
	    // Click on Delete button
	    public void clickConfirmBtnDelete() {
	    	pimPageLocators.btnConfirmDelete.click();
	    }
	    
	    // Click on Delete button
	    public void clickItemEmployeeList() {
	    	pimPageLocators.itemEmployeeList.click();
	    }
	    
	    // Click on Select check box 
	    public void clickChkSelectAll() {
	    	pimPageLocators.chkSelectAll.click();
	    }
	    
	    // Get the Record Found Message
	    public String getRecordFoundMessage() {
	        return pimPageLocators.RecordFound.getText();
	    }
	    
	    // Get the Record Found Message
	    public String getNoRecordsFoundMessage() {
	        return pimPageLocators.NoRecordsFound.getText();
	    }

}
