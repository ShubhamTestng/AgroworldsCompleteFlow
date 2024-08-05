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

public class DocIRMBaseClass {

	public Logger log = LogManager.getLogger(TraderBaseClass.class);

	public static WebDriver DocIRMdriver;
	public static WebDriverWait wait;
	public static String BDMWindow;
	public static String Traderwindow;

	
	@BeforeClass(groups = {"sanity","Regression","functional","claim","ContractCancellaton"})
	public void setUp() {
		
	    ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        DocIRMdriver = new ChromeDriver(chromeOptions);

        DocIRMdriver.get("https://stage.agroworlds.com/login/user");

        DocIRMdriver.manage().window().maximize();

        DocIRMdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		wait = new WebDriverWait(DocIRMdriver, Duration.ofSeconds(10));

	}
	
	@AfterClass
	public void tearDown() {

		//driver.quit();
	}
}