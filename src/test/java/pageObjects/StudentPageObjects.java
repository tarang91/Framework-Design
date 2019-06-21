package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentPageObjects {
	
	WebDriver rdriver;
	public StudentPageObjects(WebDriver ldriver) {
		rdriver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	
	@FindBy(id="tabStudents")
	@CacheLookup
	WebElement studentLink;
	
	
	
	@FindBy(id="addStudent")
	@CacheLookup
	WebElement addStudentBtn;
	
	@FindBy(id="frist_name")
	@CacheLookup
	WebElement firstNameTxt;
	
	@FindBy(id="last_name")
	@CacheLookup
	WebElement lastNameTxt;
	
	@FindBy(id="stu_identification")
	@CacheLookup
	WebElement stuIDTxt;
	
	@FindBy(id="stu_email")
	@CacheLookup
	WebElement stuEmailTxt;
	
	public void clickStudentBtn() {
		WebDriverWait wait = new WebDriverWait(rdriver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loader-wrapper']")));
		studentLink.click();
	}
	public void clickAddStu () {
		WebDriverWait wait = new WebDriverWait(rdriver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loader-wrapper']")));
		addStudentBtn.click();
		
	}
	
	public void stuFirstName(String fname) {
		firstNameTxt.sendKeys(fname);
	}
	
	public void stuLastName(String lname) {
		lastNameTxt.sendKeys(lname);
	}
	public void stuID(String id) {
		stuIDTxt.sendKeys(id);
	}
	public void stuEmail(String email) {
		stuEmailTxt.sendKeys(email);
	}
	
	
}
