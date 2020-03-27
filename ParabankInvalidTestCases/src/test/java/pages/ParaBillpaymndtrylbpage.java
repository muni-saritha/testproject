package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParaBillpaymndtrylbpage {
	WebDriver driver;
	 
	  By username=By.name("username");
By password=By.name("password");
By login=By.xpath("//*[@id='loginPanel']/form/div[3]/input");
	  By billpay=By.xpath("//*[@id='leftPanel']/ul/li[4]/a");
	  By payeename=By.name("payee.name");
	  By address=By.name("payee.address.street");
	  By payeecity=By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[3]/td[2]/input");
	  By payeestate=By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[4]/td[2]/input");
	  By payeeZipcode=By.xpath("//table[@class='form2']//tbody//tr[5]//input");
	  By payeephoneno=By.xpath("//table[@class='form2']//tr[6]//td[2]/input");
	  By accountno=By.name("payee.accountNumber");
	  By verifyaccount=By.xpath("//input[@name='verifyAccount']");
	  By amount=By.name("amount");
	  By submit=By.xpath("//table[@class='form2']//tr[14]//input");
	  
	  
	public ParaBillpaymndtrylbpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void customerLogin() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(username).sendKeys("sari0");
		driver.findElement(password).sendKeys("sari01");
		driver.findElement(login).click();
	}
	
	public void customerBillPay() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(billpay).click();
		driver.findElement(payeename).sendKeys("");
		driver.findElement(address).sendKeys("sp colony 3rd street");
		driver.findElement(payeecity).sendKeys("banglore");
		driver.findElement(payeestate).sendKeys("Karnataka");
		driver.findElement(payeeZipcode).sendKeys("526051");
		driver.findElement(payeephoneno).sendKeys("1230987654");
		driver.findElement(accountno).sendKeys("6543");
		driver.findElement(verifyaccount).sendKeys("6543");
		driver.findElement(amount).sendKeys("10");
		
	}

	public void submitBillPay() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(submit).click();
		Thread.sleep(3000);
		driver.close();
	}
}
