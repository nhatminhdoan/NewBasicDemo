package StepDefinitions;

import org.junit.Assert;

import Actions.HomeActions;
import Actions.LoginActions;
import Actions.PIMActions;
import Actions.PImAddEmployeeActions;
import Utils.SetUpDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeDefinitions {
	public String empFullName;
	boolean status;
	
	LoginActions objLogin = new LoginActions();
    HomeActions objHomePage = new HomeActions();
    PIMActions objPIMpage = new PIMActions();
    PImAddEmployeeActions objPImAddEmployee = new PImAddEmployeeActions ();
	
	// background
	@Given("User opens URL {string}")
	public void user_opens_url(String url) {
		SetUpDriver.openPage(url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	@When("User Enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String userName, String passWord) throws InterruptedException {
		// login to application
        objLogin.login(userName, passWord);
	}

    //Add

	@When("User hover over PIM menu")
	public void user_hover_over_pim_menu() {
	    objHomePage.clickBtnPIM();
	}

	@And("clicks on Add Employee menu item")
	public void clicks_on_add_employee_menu_item() {
	    objPIMpage.clickBtnAdd();
	}

	@Then("User fills info of new Employee {string} {string} {string}")
	public void user_fills_info_of_new_employee(String firstName, String middleName, String lastName) throws InterruptedException {
		objPImAddEmployee.save(firstName, middleName, lastName);
		empFullName = firstName + middleName + lastName ;
	}

	@Then("clicks on Save button")
	public void clicks_on_save_button() {
	    objPImAddEmployee.clickBtnSave();
	}

	@Then("User is added successfully")
	public void user_is_added_successfully() {
	  
	}
    
	//Search
	@When("Clicks on Employee List menu item")
	public void clicks_on_employee_list_menu_item() {
		objPIMpage.clickItemEmployeeList();
	}

	@When("User searchs for this employee {string}")
	public void user_searchs_for_this_employee(String employeeName) throws InterruptedException {
	    objPIMpage.setEmployeeName(employeeName);
	    Thread.sleep(1000);
	}

	@When("clicks on Search button")
	public void clicks_on_search_button() {
	   objPIMpage.clickBtnSearch();
	}

	@Then("it displays {string}")
	public void it_displays_results(String RecordFoundMessage) {
		 Assert.assertEquals(objPIMpage.getRecordFoundMessage(),RecordFoundMessage);
	}

	@When("User clicks on select all")
	public void user_clicks_on_select_all() {
	    objPIMpage.clickChkSelectAll();
	}

	@When("clicks on delete button")
	public void clicks_on_delete_button() {
	   objPIMpage.clickBtnDelete();
	}

	@Then("confirmation pop up will appear")
	public void confirmation_pop_up_will_appear() {
	    objPIMpage.clickConfirmBtnDelete();
	}

	@Then("record will be deleted")
	public void record_will_be_deleted(String employeeName, String NorecordsFoundMessage ) {
		//return search employee Name
		objPIMpage.setEmployeeName(employeeName);
		//message no found
		Assert.assertEquals(objPIMpage.getNoRecordsFoundMessage(),NorecordsFoundMessage);
	}

}
