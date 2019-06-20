package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageObjects {
	WebDriver rdriver;
	public DashboardPageObjects(WebDriver ldriver) {
		rdriver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//p[@class='box-content']/span[2]")
	@CacheLookup
	WebElement assessmentCount;
	
	
	public String getAssessmentCount() {
		String count = assessmentCount.getText();
		return count;
	}
}
