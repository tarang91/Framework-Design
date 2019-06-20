package pageObjects;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilities.ReadConfigFile;


public class BaseClass {
	public static WebDriver driver;
	public static Logger logger;
	ReadConfigFile cfg = new ReadConfigFile();
	public String baseurl = cfg.getBaseURL();
	public String username = cfg.getUsername();
	public String password = cfg.getPassword();
	@Parameters("browser")
	@BeforeClass
	public void setup (String br) {
		if(br.equals("chrome"))	
		{
			System.setProperty("webdriver.chrome.driver", cfg.getchromePath());
			driver = new ChromeDriver();
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", cfg.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		else if (br.equals("ie")){
			System.setProperty("webdriver.ie.driver", cfg.getIEPath());
			driver = new InternetExplorerDriver();
		}
		logger  = Logger.getLogger("Test Demo Website");
		PropertyConfigurator.configure("log4j.properties");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	@AfterClass
	public void tearDown()
	{
	//	driver.quit();
	}

}
