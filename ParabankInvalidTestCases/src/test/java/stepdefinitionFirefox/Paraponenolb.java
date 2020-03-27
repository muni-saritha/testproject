package stepdefinitionFirefox;

import baseclass.WrapperClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ParaBillpayponenolbpage;

public class Paraponenolb extends WrapperClass{
	
	ParaBillpayponenolbpage pplb;

	@Given("^user Launch the Chrome browser$")
	public void user_Launch_the_Chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("firefox");
		pplb= new ParaBillpayponenolbpage(driver);
	}

	@When("^User open the Parabank Login Page$")
	public void user_open_the_Parabank_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		getUrl();
	}

	@Then("^User login to the account$")
	public void user_login_to_the_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pplb.customerLogin();
	}

	@Then("^User left phone no field of the bill pay$")
	public void user_left_phone_no_field_of_the_bill_pay() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pplb.customerBillPay();
	}

	@Then("^Submit bill pay and close the browser$")
	public void submit_bill_pay_and_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pplb.submitBillPay();
	}

}

