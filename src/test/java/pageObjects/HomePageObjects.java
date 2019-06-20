package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	WebDriver rdriver;
	public HomePageObjects(WebDriver ldriver){
		rdriver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//button[@class='btn btn-login']")
	@CacheLookup
	WebElement loginButton1;
	
	@FindBy(xpath="//div[@class='input-group width100']/input[1]")
	@CacheLookup
	WebElement username;  
	
	@FindBy(id="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(id="userLoginButton")
	@CacheLookup
	WebElement loginButton2;
	
	
	public void clickLogin1() {
		loginButton1.click();
	}
	
	public void enterUserName(String email) {
		username.sendKeys(email);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickLogin2() {
		loginButton2.click();
	}
}
