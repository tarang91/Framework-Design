package testClass;


import java.io.IOException;

import org.testng.annotations.Test;

import utilities.XLUtils;

import pageObjects.BaseClass;
import pageObjects.HomePageObjects;
import pageObjects.StudentPageObjects;

public class StudentCreationTest extends BaseClass{
	

	
	@Test(priority=0)
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
	
	@Test (priority=1)
	public void CreateStudent() throws IOException, InterruptedException {
		StudentPageObjects sp = new StudentPageObjects(driver);

		sp.clickStudentBtn();
		logger.info("Clicked on Student Tab");
		sp.clickAddStu();
		logger.info("Preparing to add student");
		String path = System.getProperty("user.dir")+"/src/test/java/testData/StudentData.xlsx";
		String fname = XLUtils.getCellData(path, "Sheet1", 1, 0);
		String lname = XLUtils.getCellData(path, "Sheet1", 1, 1);
		String id = XLUtils.getCellData(path, "Sheet1", 1, 2);
		String email = XLUtils.getCellData(path, "Sheet1", 1, 3);
		
		sp.stuFirstName(fname);
		
		sp.stuLastName(lname);
		
		sp.stuID(id);
		
		sp.stuEmail(email);
		logger.info("Student Details added");
		
		
	}
}
