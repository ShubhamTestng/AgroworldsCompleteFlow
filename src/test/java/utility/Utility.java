package utility;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import POMpage.BDM;

public class Utility  {
	public static WebDriver BDMdriver ;
	public static WebDriverWait wait;

	 public String readExcelFile(String sheetName, int rowNumber, int columnNumber) throws IOException, EncryptedDocumentException {
		 
	        FileInputStream fis = new FileInputStream("C:\\Users\\wbox62\\eclipse-workspace\\SSI_Agroworlds_TestNG_Shubham_Project\\target\\SSITestData.xlsx");
	        
	        Workbook workbook = WorkbookFactory.create(fis);  
	        Sheet sheet = workbook.getSheet(sheetName);
	        Row row = sheet.getRow(rowNumber);
            Cell cell = row.getCell(columnNumber, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);

	        // Use DataFormatter to handle both numeric and string values
	        DataFormatter dataFormatter = new DataFormatter();
	        return dataFormatter.formatCellValue(cell);
	    }
	


	public void Dropdown(WebElement dropdownElement, String dropDowntext) {

		Select INCOTERN = new Select(dropdownElement);

		INCOTERN.selectByVisibleText(dropDowntext);

	}


	public void getYopmail(WebDriver BDMdriver, String yopmail) throws InterruptedException {

		BDM bdm = new BDM(BDMdriver);
		
		Thread.sleep(5000);

		BDMdriver.get("https://yopmail.com/en");

		Thread.sleep(2000);

		bdm.getYopmailLogin().sendKeys(yopmail, Keys.ENTER);

		BDMdriver.switchTo().frame(2);

		   JavascriptExecutor js = (JavascriptExecutor) BDMdriver;
	        try {
	            // Try to scroll to the reviewtradeseller element
	            js.executeScript("arguments[0].scrollIntoView(true);", bdm.getReviewtradeseller());
	        } catch (NoSuchElementException e) {
	            try {
	                // If reviewtradeseller is not found, scroll to the cancellationReviewTrade element
	                js.executeScript("arguments[0].scrollIntoView(true);", bdm.getCancellationReviewTrade());
	            } catch (NoSuchElementException ex) {
	                // Handle the case where both elements are not found
	                System.out.println("Neither element is available on the page.");
	            }
	        }

		String OTP;

		try {
		    // Attempt to get the text from the first element
		    OTP = bdm.getSellerOTP().getText();
		} catch (NoSuchElementException e) {
		    try {
		        // If the first element is not found, attempt to get the text from the second element
		        OTP = bdm.getCancellationSellerOTP().getText();
		    } catch (NoSuchElementException ex) {
		        // Handle the case where both elements are not found
		        System.out.println("Neither element is available on the page.");
		        OTP = ""; // Assign an empty string or handle it appropriately
		    }
		}

		Thread.sleep(1000);

		try {
		    // Attempt to click the first element
		    bdm.getReviewtradeseller().click();
		} catch (NoSuchElementException e) {
		    try {
		        // If the first element is not found, attempt to click the second element
		        bdm.getCancellationReviewTrade().click();
		    } catch (NoSuchElementException ex) {
		        // Handle the case where both elements are not found
		        System.out.println("Neither element is available on the page.");
		    }
		}


		Set<String> allWindowHandles = BDMdriver.getWindowHandles();

		Iterator<String> windowIterator = allWindowHandles.iterator();

		while (windowIterator.hasNext()) {
			String currentWindow = windowIterator.next();
			BDMdriver.switchTo().window(currentWindow);

			System.out.println("Title of current window: " + BDMdriver.getTitle());
		}


		// Pass the found OTP into the password field, if OTP is not empty
		if (!OTP.isEmpty()) {
		    bdm.getSellerOTPpassword().sendKeys(OTP);
		} else {
		    System.out.println("No OTP value to send to the password field.");
		}

		bdm.getSellerAccessButton().click();

		Thread.sleep(2000);

//		Actions action = new Actions(BDMdriver);
//
//		action.moveToElement(bdm.getSellerApproval() || bdm.getCancellationSellerApprove())
//		.click()
//		.perform();
		
	

//		
		        Actions action = new Actions(BDMdriver);
		        WebDriverWait wait = new WebDriverWait(BDMdriver, Duration.ofSeconds(10));

		        try {
		            // Try to find the first element
		            WebElement element = null;
		            try {
		                element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submit_for_approval")));
		                System.out.println("Found element with id 'submit_for_approval'");
		            } catch (TimeoutException e) {
		                System.out.println("Element with id 'submit_for_approval' not found within timeout");
		            }

		            // If the first element is found, check its visibility and click it
		            if (element != null && element.isDisplayed() && element.isEnabled()) {
		                System.out.println("Clicking element with id 'submit_for_approval'");
		             // Scroll the element into view
		                ((JavascriptExecutor) BDMdriver).executeScript("arguments[0].scrollIntoView(true);", element);

		                // Click the element
		                ((JavascriptExecutor) BDMdriver).executeScript("arguments[0].click();", element);
		            } else {
		                // Try to find the second element
		                try {
		                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Approve Cancellation')]")));
		                    System.out.println("Found element with xpath 'Approve Cancellation'");
		                } catch (TimeoutException e) {
		                    System.out.println("Element with xpath 'Approve Cancellation' not found within timeout");
		                }

		                // If the second element is found, check its visibility and click it
		                if (element != null && element.isDisplayed() && element.isEnabled()) {
		                    System.out.println("Clicking element with xpath 'Approve Cancellation'");
		                    // Scroll the element into view
			                ((JavascriptExecutor) BDMdriver).executeScript("arguments[0].scrollIntoView(true);", element);

			                // Click the element
			                ((JavascriptExecutor) BDMdriver).executeScript("arguments[0].click();", element);
			                
			                bdm.getCancelApproveSellerandBuyer().sendKeys("Approved by seller/buyer");
			                
			                bdm.getYesButtonCancelSellerAndBuyer().click();
			                
			                Thread.sleep(3000);
			                
		                } else {
		                    System.out.println("Neither element is available for clicking");
		                }
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        } 
		        
		    }
		

		//driver.close();

		//bdm.getHomebutton().click();

		//bdm.getCloseButton().click();
	}

	



