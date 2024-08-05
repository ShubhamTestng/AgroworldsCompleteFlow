package SSIAgroworlds;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.ProcIRMBaseClass;
import POMpage.CreateTrade;
import POMpage.ProcurementIRM;
import utility.Utility;

public class ProcurementIRMPage extends ProcIRMBaseClass {
	public Logger log = LogManager.getLogger(ProcurementIRMPage.class);

	TraderPage traderPage = new TraderPage();
	ProcurementIRM procurementIRM = new ProcurementIRM(ProcIRMdriver);
	
	public static String tradeID = null;
	public static String SELLERid;

	Utility utility = new Utility();

	@Test(groups = {"sanity","Regression","functional", "ContractCancellaton"},priority = 1)
	public void procIRMlogin() throws InterruptedException, EncryptedDocumentException, IOException {

		Thread.sleep(3000);

		procurementIRM = new ProcurementIRM(ProcIRMdriver);

		procurementIRM.getEmail().sendKeys((utility.readExcelFile("SSICredential", 3, 0)));
		
		procurementIRM.getCountry().click();

		procurementIRM.getCountrycode().click();
        
		//utility.Dropdown(wait.until(ExpectedConditions.elementToBeClickable((procurementIRM.getCountry()))), "+91");

		procurementIRM.getPhone().sendKeys((utility.readExcelFile("SSICredential", 3, 1)));

		procurementIRM.getVerifyLogin().click();

		procurementIRM.getOTP().sendKeys("1234");

		procurementIRM.getOTPverify().click();


	}

	
	public void tradeMangamentModule() throws InterruptedException{
   		
        Thread.sleep(2000);
		
		procurementIRM.getTradeManagementModule().click();
		
		Thread.sleep(2000);
		
		procurementIRM.getTradeManagementDropdown().click();

	}
	

	@Test(groups = {"sanity","Regression", "functional"},priority = 2)
	public void procurementApprove() throws InterruptedException {

		tradeMangamentModule();

		procurementIRM.getTrade().click();

		tradeID = procurementIRM.getTradeId().getText();

		System.out.println(tradeID + "trade bdm is ");


		String readTrade = traderPage.readTradeID();

		System.out.println(readTrade);

		if(tradeID.contains(readTrade)) {

			Thread.sleep(2000);

			procurementIRM.getTradeId().click();
		}

//		Actions action = new Actions(ProcIRMdriver);
//		action.moveToElement(procurementIRM.getProcIRMtradeApproveButton())
//		.click()
//		.perform();
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) procurementIRM.ProcIRMdriver;
		// Scroll to the element
		js.executeScript("arguments[0].scrollIntoView(true);", procurementIRM.getProcIRMtradeApproveButton());

		procurementIRM.getProcIRMtradeApproveButton().click();
		
		Thread.sleep(2000);
		
		procurementIRM.getOperatorReviewDropdown().click();
		
		//Select operatorDropdown = new Select(procurementIRM.getOperatorReviewDropdown());
		
		//operatorDropdown.selectByValue("246");
		
		procurementIRM.getOperatorName().sendKeys("Aayushi", Keys.ENTER);

		procurementIRM.getOperatorApproveButton().click();

		Thread.sleep(3000);

	}
	
	
	@Test(groups= {"functional"}, priority = 3)
	public void addendumProcurementApprove() throws InterruptedException {
        
		//procurementIRM.getNotificationButton().click();
		
		//SELLERid = procurementIRM.getSellerID().getText();
		
		//ProcIRMdriver.findElement(By.xpath("//p[contains(text(),'"+tradeID+", "+SELLERid+"  Sent for HOD Approval')]")).click();
		
       Thread.sleep(2000);
		
		procurementIRM.getTradeManagementModule().click();
		
		Thread.sleep(2000);
		
		procurementIRM.getTradeManagementDropdown().click();

		procurementIRM.getTrade().click();

		tradeID = procurementIRM.getTradeId().getText();

		System.out.println(tradeID + "trade bdm is ");


		String readTrade = traderPage.readTradeID();

		System.out.println(readTrade);

		if(tradeID.equalsIgnoreCase(readTrade)) {

			Thread.sleep(2000);

			procurementIRM.getTradeId().click();
		}

//		Actions action = new Actions(ProcIRMdriver);
//		action.moveToElement(procurementIRM.getProcIRMtradeApproveButton())
//		.click()
//		.perform();
		
		JavascriptExecutor js = (JavascriptExecutor) procurementIRM.ProcIRMdriver;
		// Scroll to the element
		js.executeScript("arguments[0].scrollIntoView(true);", procurementIRM.getProcIRMtradeApproveButton());

		procurementIRM.getProcIRMtradeApproveButton().click();
		
		procurementIRM.getOperatorApproveButton().click();
	}
	
	@Test(groups = {"ContractCancellaton"}, priority = 3)
	public void cancellationUnderProcurmentIRM() throws InterruptedException {
		
		tradeMangamentModule();
		
		procurementIRM.getCancellationListInTrade().click();
		
		Thread.sleep(4000);

		procurementIRM.getTradeId().click();

		Thread.sleep(2000);

		procurementIRM.getApproveCancellationIntrade().click();
	
		procurementIRM.getApproveCancellationRemarks().sendKeys("cancel request approved from BDM");
	
		procurementIRM.getCancelApproveTradeYesButton().click();
	
		
	}


}
