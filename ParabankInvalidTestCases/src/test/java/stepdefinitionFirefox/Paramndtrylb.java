package stepdefinitionFirefox;

import baseclass.WrapperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ParaBillpaymndtrylbpage;

public class Paramndtrylb extends WrapperClass
{
	ParaBillpaymndtrylbpage pbpm;
	
	@Given("^user launch the chrome browser$")
	public void user_launch_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("firefox");
		pbpm= new ParaBillpaymndtrylbpage(driver);
	}

	@When("^user open the Parabank Login Page$")
	public void user_open_the_Parabank_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		getUrl();
	}

	@Then("^user login to the account$")
	public void user_login_to_the_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pbpm.customerLogin();
	}

	@Then("^user left one of the mandatoryfield of the bill pay$")
	public void user_left_one_of_the_mandatoryfield_of_the_bill_pay() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pbpm.customerBillPay();
	}

	@Then("^Submit the bill pay and close the browser$")
	public void submit_the_bill_pay_and_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pbpm.submitBillPay();
	}


}

