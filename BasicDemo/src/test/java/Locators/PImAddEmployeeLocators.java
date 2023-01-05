package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PImAddEmployeeLocators {
	
	@FindBy(xpath="//*[contains(text(),'Add Employee')]")
	public WebElement AddEployeeTitle;

	@FindBy(name = "firstName")
    public WebElement firstName;
	
	@FindBy(name = "middleName")
    public WebElement middleName;
	
	@FindBy(name = "lastName")
    public WebElement lastName;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
	public WebElement employeeID;
	
	@FindBy(id = "oxd-toaster_1")
    public WebElement successSavedMessage;
	
	@FindBy(xpath = "//div[@class='oxd-form-actions']//button[2]")
	public WebElement btnSave;

	
}
