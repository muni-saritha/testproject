package stepdefinitionFirefox;

import baseclass.WrapperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ParaBillpayinvalidamntpage;

public class Parainvalidamnt extends WrapperClass{
	
	ParaBillpayinvalidamntpage pip;
	
	@Given("^user launches  chrome browser$")
	public void user_launches_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("firefox");
		pip= new ParaBillpayinvalidamntpage(driver);
	}

	@When("^User open the Parabank Login$")
	public void user_open_the_Parabank_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		getUrl();
	}

	@Then("^the User login to the account$")
	public void the_User_login_to_the_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pip.customerLogin();
	}

	@Then("^User gave invalid amount$")
	public void user_gave_invalid_amount() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pip.customerBillPay();
	}

	@Then("^Submit bill pay and close  browser$")
	public void submit_bill_pay_and_close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pip.submitBillPay();
	}


}