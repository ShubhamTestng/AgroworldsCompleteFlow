package Base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class BDMBaseClass {

	public Logger log = LogManager.getLogger(TraderBaseClass.class);

	public static WebDriver BDMdriver;
	public static WebDriverWait wait;
	public static String BDMWindow;
	public static String Traderwindow;

	public static WebDriver getDriver() {
		
		return BDMdriver;
	}
	
	@BeforeClass(groups = {"sanity","Regression","functional","claim","ContractCancellaton"})
	public void setUp() throws IOException {
		LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        logPrefs.enable(LogType.DRIVER, Level.INFO);
        logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
        
	    ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.setCapability("goog:loggingPrefs", logPrefs);
        
        chromeOptions.addArguments("--incognito");
        // Allow notifications
        chromeOptions.addArguments("--enable-notifications");
        // Additional preference to always allow notifications; required for some Chrome versions
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 1);
        chromeOptions.setExperimentalOption("prefs", prefs);
    
        BDMdriver = new ChromeDriver(chromeOptions);
        
        BDMdriver.get("https://stage.agroworlds.com/login/user");

        BDMdriver.manage().window().maximize();
    	System.out.println("Got the driver " + BDMdriver.getCurrentUrl());
        BDMdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		wait = new WebDriverWait(BDMdriver, Duration.ofSeconds(3));
	
		BDMdriver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);

		LogEntries les = BDMdriver.manage().logs().get(LogType.PERFORMANCE);

		File fout = new File("network.log");
		FileOutputStream fos = new FileOutputStream(fout);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

		for (LogEntry le : les) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			JsonParser jp = new JsonParser();
			JsonElement je = jp.parse(le.getMessage());
			String prettyJsonString = gson.toJson(je);

			bw.write(prettyJsonString);
			bw.newLine();
		}

		bw.close();
		
		System.out.println("Test complete. please close browser and find network logs under <PROJECT-FOLDER>/network.log file");

	}
	
	
	
	@AfterClass
	public void tearDown() {

		//driver.quit();
	}
	

	
}