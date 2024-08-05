package Base;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class DocExecutiveBaseClass {

	public Logger log = LogManager.getLogger(TraderBaseClass.class);

	public static WebDriver DocExecutivedriver;
	public static WebDriverWait wait;
	public static String BDMWindow;
	public static String Traderwindow;

	
	@BeforeClass(groups = {"sanity","Regression","functional","claim", "ContractCancellaton"})
	public void setUp() {
		
	    ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        
        DocExecutivedriver = new ChromeDriver(chromeOptions);

        DocExecutivedriver.get("https://stage.agroworlds.com/login/user");

        DocExecutivedriver.manage().window().maximize();

        DocExecutivedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		wait = new WebDriverWait(DocExecutivedriver, Duration.ofSeconds(3));

	}
	
	@AfterClass
	public void tearDown() {

		//driver.quit();
	}
}