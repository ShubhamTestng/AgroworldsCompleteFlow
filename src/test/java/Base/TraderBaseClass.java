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

public class TraderBaseClass {

	public Logger log = LogManager.getLogger(TraderBaseClass.class);

	public static WebDriver Traderdriver;
	public static WebDriverWait wait;
	public static String BDMWindow;
	public static String Traderwindow;

	
	@BeforeClass(groups = {"sanity","Regression","functional","claim","ContractCancellaton"})
	public void setUp() {
		
	    ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        Traderdriver = new ChromeDriver(chromeOptions);


        Traderdriver.get("https://stage.agroworlds.com/login/user");

        Traderdriver.manage().window().maximize();

        Traderdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		wait = new WebDriverWait(Traderdriver, Duration.ofSeconds(3));

	}


	@AfterClass
	public void tearDown() {

		//driver.quit();
	}
}


//for multiple tab we can follow below 
//for(int i=1;i<=4;i++) {
//driver.switchTo().newWindow(WindowType.WINDOW);
//driver.get(url);
//}
//
//
//
//Set <String> windows= driver.getWindowHandles();
//List<String> windowList = new ArrayList<>(windows);
//
//Traderwindow = windowList.get(0);
//BDMWindow = windowList.get(1);
//String DocExecutiveWindow = windowList.get(2);
//String user4 = windowList.get(3);
//String user5 = windowList.get(4);

//public void synchronised(By locator, WebElement element)  {
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//wait.until(ExpectedConditions.elementToBeClickable(element));    
//wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//try {
//	Thread.sleep(1000); }
//catch (InterruptedException e) {
//	e.printStackTrace();    
//}
//}

