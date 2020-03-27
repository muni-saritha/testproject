package stepdefinitionChrome;

import baseclass.WrapperClass;
import cucumber.api.java.en.*;
import pages.ParaMssgtocstmepage;

public class ParaMssgtocstmrlb extends WrapperClass{
	
	ParaMssgtocstmepage pmtc;
	
	@Given("^the user launchs the chrome browser$")
	public void the_user_launchs_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("chrome");
		pmtc= new ParaMssgtocstmepage(driver);
	}

	@When("^the user open the Parabank HomePage$")
	public void the_user_open_the_Parabank_HomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		getUrl();
	}

	@Then("^the user opens the msg and left the details$")
	public void the_user_opens_the_msg_and_left_the_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pmtc.MessageDetails();
	}

	@Then("^send the message to customer care$")
	public void send_the_message_to_customer_care() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pmtc.sendMessage();
	}

}
