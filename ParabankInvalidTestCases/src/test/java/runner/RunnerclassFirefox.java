package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\eclipse\\workspace new\\parabankcucumber\\src\\main\\resources\\feature",
		plugin= {"pretty", "html:reports\\cucumber_html_report","json:reports\\cucumber_html_report\\jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports\\Extentreports\\Extentreport.html"},
		glue = {"stepdefinitionFirefox"},	
		monochrome=true
		)

public class RunnerclassFirefox {
	
	@AfterClass
	public static void extendReport()
	{
		Reporter.loadXMLConfig("src\\test\\resources\\extent_config.xml");
	}


}
