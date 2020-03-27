package stepdefinitionChrome;

import baseclass.WrapperClass;
import cucumber.api.java.en.*;
import pages.ParaBillpayInvalidacntnopage;


public class ParaBillpayinvalidacntnoChrome extends WrapperClass
{
	ParaBillpayInvalidacntnopage pbp;
	
	@Given("^the user launch the chrome browser$")
	public void the_user_launch_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("chrome");
		pbp= new ParaBillpayInvalidacntnopage(driver);
	}

	@When("^the user open the Parabank Login Page$")
	public void the_user_open_the_Parabank_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		getUrl();
	}

	@Then("^the user login to the account$")
	public void the_user_login_to_the_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pbp.customerLogin();
	}

	@Then("^the user fills the details of the bill pay$")
	public void the_user_fills_the_details_of_the_bill_pay() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pbp.customerBillPay();
	}

	@Then("^submit the bill pay and close the browser$")
	public void submit_the_bill_pay_and_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pbp.submitBillPay();
	}

}	
