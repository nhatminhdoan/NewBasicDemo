package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMLocators {
	 
	 @FindBy(xpath = "//*[contains(text(),'PIM')]")
	 public  WebElement pimUserName;
	
	 @FindBy(xpath = "//div[@class='orangehrm-header-container']//button")
	 public WebElement btnAdd;
	 //Search
	 @FindBy(xpath = "//input[@placeholder='Type for hints...']")
	 public  WebElement txtEmployeeName;
	 
	 @FindBy(xpath = "//div[@class='oxd-form-actions']//button[2]")
	 public WebElement btnSearch;
	 //Delete
	 @FindBy(xpath = "//div[@class='oxd-table-cell-actions']//button")
	 public WebElement btnDelete;
	 
	 @FindBy(xpath = "//div[@class='orangehrm-modal-footer']//button[2]")
	 public WebElement btnConfirmDelete;
	 
	 @FindBy(xpath = "//*[contains(text(),'Employee List')]")
	 public WebElement itemEmployeeList;
	 
	 @FindBy(xpath = "//div[@class='oxd-table-header']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	 public WebElement chkSelectAll;
	 
	 @FindBy(xpath = "//*[contains(text(),'(1) Record Found')]")
	 public  WebElement RecordFound;
	 
	 @FindBy(xpath = "//*[contains(text(),'No Records Found')] ")
	 public  WebElement NoRecordsFound;
}
