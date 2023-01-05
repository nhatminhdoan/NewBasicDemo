package StepDefinitions;

import org.junit.Assert;

import Actions.HomeActions;
import Actions.LoginActions;
import Utils.SetUpDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinitions {
	
	LoginActions objLogin = new LoginActions();
    HomeActions objHomePage = new HomeActions();
    @Given("User is on {string} page")
    public void user_is_on_page(String url) {
    	SetUpDriver.openPage(url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("User login with success account {string} and {string}")
    public void user_login_with_success_account_and(String userName, String passWord) throws InterruptedException {
    	// login to application
        objLogin.login(userName, passWord);
        Thread.sleep(1000);
    }

    @Then("User is taken to Dashboard page")
    public void user_is_taken_to_dashboard_page() {
    	// Verify home page
        Assert.assertTrue(objHomePage.getHomePageText().contains("Dashboard"));
    }

    @When("User login with {string} and {string}")
    public void user_login_with_and(String userName, String passWord) throws InterruptedException {
    	// login to application
        objLogin.login(userName, passWord);
    }

    @Then("The {string} is displayed")
    public void the_is_displayed(String expectedErrorMessage) {
    	 Assert.assertEquals(objLogin.getErrorMessage(),expectedErrorMessage);
    }

    @When("User enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String userName, String passWord) throws InterruptedException {
    	// login to application
        objLogin.login(userName, passWord);
    }

    @Then("The {string} error is displayed under Username field")
    public void the_error_is_displayed_under_username_field(String message) {
    	  Assert.assertEquals(objLogin.getMissingUsernameText(),message);
    }
}
