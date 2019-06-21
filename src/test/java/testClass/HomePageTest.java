package testClass;


import org.testng.annotations.Test;
import pageObjects.BaseClass;
import pageObjects.StudentPageObjects;
import pageObjects.HomePageObjects;

public class HomePageTest extends BaseClass{
	
	@Test (priority= 0)
	public void launchHomePage() throws InterruptedException {
		HomePageObjects hp  = new HomePageObjects(driver);
		logger.info("Base URL is launched");
		
		hp.clickLogin1();
		
		Thread.sleep(500);
		
		hp.enterUserName(username);
		logger.info("Username Entered");
		
		hp.enterPassword(password);
		logger.info("Password Entered");
		
		hp.clickLogin2();
		logger.info("Logged in Successfully");
	}
	
}
