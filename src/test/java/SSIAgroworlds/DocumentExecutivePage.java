package SSIAgroworlds;

import java.io.IOException;
import java.util.UUID;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.DocExecutiveBaseClass;
import POMpage.CreateTrade;
import POMpage.DocumentExecutive;
import utility.Utility;

public class DocumentExecutivePage extends DocExecutiveBaseClass{
	public Logger log = LogManager.getLogger(DocumentExecutivePage.class);
	DocumentExecutive documentExecutive = new DocumentExecutive(DocExecutivedriver);
	Utility utility = new Utility();
	ProcurementIRMPage procurementIRMPage = new ProcurementIRMPage();
	public static String filePath;
	public static String url;	
	public static String Contractid =null;
	public static String randomString=null;
	public static String tradeIDinContract=null;


	@Test(groups = {"sanity","Regression","claim","ContractCancellaton"},priority = 1)
	public void DocExecutivelogin() throws InterruptedException, EncryptedDocumentException, IOException {

		Thread.sleep(3000);

		documentExecutive = new DocumentExecutive(DocExecutivedriver);

		documentExecutive.getEmail().sendKeys((utility.readExcelFile("SSICredential", 4, 0)));

		documentExecutive.getCountry().click();

		documentExecutive.getCountrycode().click();

		//utility.Dropdown(wait.until(ExpectedConditions.elementToBeClickable((procurementIRM.getCountry()))), "+91");

		documentExecutive.getPhone().sendKeys((utility.readExcelFile("SSICredential", 4, 1)));

		documentExecutive.getVerifyLogin().click();

		documentExecutive.getOTP().sendKeys("1234");

		documentExecutive.getOTPverify().click();


	}

	@Test(groups = {"sanity","Regression"},priority = 2)
	public void generateContract() throws InterruptedException {

		Thread.sleep(2000);

		documentExecutive.getContractManagement().click();

		documentExecutive.getContract().click();

		String tradeID = procurementIRMPage.tradeID;

		String tradeIDinContract = documentExecutive.getTradeIDinContract().getText();

		System.out.println(tradeIDinContract + "trade id in contract");

		if(tradeIDinContract.contains(tradeID)) {

			documentExecutive.getYetToCome().click();

		}


	}

	@Test(groups = {"sanity","Regression"},priority = 3)
	public void defineStageApprove() throws InterruptedException {

		Thread.sleep(2000);

		documentExecutive.getDefineStage().click();

		Actions actions = new Actions(DocExecutivedriver);

		actions.moveToElement(documentExecutive.getBllingDraftCheckbox()).click().build().perform();

		documentExecutive.getSelectStartEvent().click();

		documentExecutive.getETDdate().click();

		documentExecutive.getExtensionRequestTAT().click();

		documentExecutive.getTATinDAYS().click();

		documentExecutive.getPreshipmentNextButton().click();

		Thread.sleep(2000);

		//		for(int i=1 ; i<27 ;i++) {
		//		WebElement draftcheckbox = driver.findElement(By.xpath("//input[@name='contractSubStages["+(i)+"][]']"));
		//				
		//		draftcheckbox.click();
		//		
		//		}

		Actions action = new Actions(DocExecutivedriver);

		action.moveToElement(documentExecutive.getDraftCheckbox()).click().build().perform();

		List<WebElement> draftDocuments = documentExecutive.getDraftDocumentstartShipments();
		for (WebElement draftDocument : draftDocuments) {

			System.out.println(draftDocument + "and draftDocument are");

			draftDocument.click();
		}

		Thread.sleep(2000);

		for(int i=28; i<52; i++) {

			WebElement selecttat = DocExecutivedriver.findElement(By.xpath("//select[@name='contractSubStageTats["+(i)+"][]']"));

			Select tatdropdown = new Select(selecttat);

			tatdropdown.selectByValue("1");

		}

		for(int i=82; i<85; i++) {

			WebElement selecttat = DocExecutivedriver.findElement(By.xpath("//select[@name='contractSubStageTats["+(i)+"][]']"));

			Select tatdropdown = new Select(selecttat);

			tatdropdown.selectByValue("1");

		}

		Select billingofLading = new Select(documentExecutive.getBillofLadingstartEvent());

		billingofLading.selectByVisibleText("Vessel - Actual Time of Departure (ATD)");

		documentExecutive.getShipmentNextButton().click();

		documentExecutive.getPostshipmentNextButton().click();

	}


	@Test(groups = {"sanity","Regression"},priority = 4)
	public void tCdOCUMNET() throws InterruptedException{

		Thread.sleep(3000);

		DocExecutivedriver.navigate().back();

		documentExecutive.getYetToCome().click();

		documentExecutive.getTandC().click();

		documentExecutive.getOroginal().click();

		filePath = "C:\\Users\\wbox62\\Downloads\\crashfret.jpg";

		documentExecutive.getUploadfileTanDc().sendKeys(filePath);

		documentExecutive.getOriginalUploadBUtton().click();

		log.info("T and c document uploaded");

		Thread.sleep(2000);


	}


	@Test(groups = {"sanity","Regression"},priority = 5)
	public void contractRegistration() throws InterruptedException {

		DocExecutivedriver.navigate().back();

		documentExecutive.getYetToCome().click();

		documentExecutive.getContractRegistration().click();

		url = DocExecutivedriver.getCurrentUrl();

		System.out.println("And current url is ...." + url );

		String[] parts = url.split("/");

		Contractid = parts[parts.length - 1];

		randomString = "Test Automation flow " + UUID.randomUUID().toString();
		documentExecutive.getContractNumber().sendKeys(randomString);

		//String randomMail = "shubham55@yopmail.com " + UUID.randomUUID().toString();
		documentExecutive.getBuyermailContract().sendKeys("shubham6655@yopmail.com");

		documentExecutive.getContractstepNextButton1().click();

		documentExecutive.getSellermailContract().sendKeys("kulkarni4488@yopmail.com");

		documentExecutive.getContractstepNextButton2().click();

		documentExecutive.getContractstepNextButton3().click();

		documentExecutive.getPercentage().sendKeys("50");

		documentExecutive.getAdvanceAmount().sendKeys("2000");

		documentExecutive.getContractstepNextButton4().click();

		documentExecutive.getQualityAssurance().sendKeys("50");

		documentExecutive.getInsurance().sendKeys("20");

		documentExecutive.getFreedays().sendKeys("30");

		utility.Dropdown(documentExecutive.getSelectPacking(), "25 KG PP BAGS");

		filePath = "C:\\Users\\wbox62\\Downloads\\crashfret.jpg";

		documentExecutive.getUploadPackingfile().sendKeys(filePath);

		documentExecutive.getPackingUploadButton().click();

		Thread.sleep(1000);

		documentExecutive.getContractstepNextButton5().click();

		documentExecutive.getDocumentRequiredShipment().click();

		documentExecutive.getSendToIRMButton().click();

		documentExecutive.getContractRegistrationApproveRequestRemarks().sendKeys("please approve the request");

		documentExecutive.getRemarksSendButton().click();

		log.info("contract registration approve request send");
	}


	@Test(groups= {"claim"}, priority=2)
	public void underClaim() throws InterruptedException {

		actionInContract();

		documentExecutive.getClaimRegisterInAction().click();

		WebElement claimType = DocExecutivedriver.findElement(By.xpath("//select[@id=\"claim_type\"]"));

		Select claim = new Select(claimType);

		for (WebElement option : claim.getOptions()) {
			if (option.getText().trim().equals("QUALITY ISSUE")) {
				option.click();
				break;
			}
		}

		documentExecutive.getClaimReason().sendKeys("getting quality issues");

		Actions action = new Actions(DocExecutivedriver);

		WebElement sendButton = DocExecutivedriver.findElement(By.xpath("//button[@class=\"btn theme-button btn-primary w-100 mb-2 send-btn\"]"));

		action.moveToElement(sendButton)
		.click()
		.build()
		.perform();

		Thread.sleep(2000);

		WebElement claimreviewName = DocExecutivedriver.findElement(By.xpath("//select[@id=\"operation_irm\"]"));

		Select claimName = new Select(claimreviewName);

		claimName.selectByVisibleText("Aayushi Procurement IRM");

		documentExecutive.getClaimReviewSendButton().click();

	}

	@Test(groups = {"sanity","Regression"},priority = 6)
	public String getRandomString() {

		//documentExecutive = new DocumentExecutive(DocExecutivedriver);

		System.out.println(randomString + "random string id ");

		return randomString;

	}


	@Test(groups= {"ContractCancellaton"}, priority=2)
	public void raiseCancellation() throws InterruptedException {
		
		actionInContract();
		
		documentExecutive.getCancelRaiseInAction().click();
		
		log.info("cancellation buton clicked");
		
		Thread.sleep(3000);
		
		WebElement cancellationType = DocExecutivedriver.findElement(By.xpath("//Select[@id='cancellation_type']"));
		
		Select canceltype = new Select(cancellationType);
		
		canceltype.selectByVisibleText("Complete Contract Cancellation");
		
	    documentExecutive.getCancelRaiseRemark().sendKeys("please raise cancel request");
	    
	    Thread.sleep(2000);
	    
	    documentExecutive.getCancelRaiseSubmitButton().click();
	    
	    Thread.sleep(4000);
	    
	    documentExecutive.getContractManagement().click();
	    
	    Thread.sleep(2000);
	    
	    documentExecutive.getCancelltionList().click();
	    
	    String tradeIDinCancelltion = documentExecutive.getTradeIdinCancellationList().getText();
		
		String tradeID = procurementIRMPage.tradeID;
		
		String cancelStatus = documentExecutive.getCancellationStatus().getText();
		
		System.out.println(cancelStatus + "cancel status in document executive cancellation list");
		
		if(tradeIDinContract.contains(tradeID) && cancelStatus.equalsIgnoreCase("Pending Approval")) {

			documentExecutive.getTradeIdinCancellationList().click();

			System.out.println(tradeID + "and trade is in cancellation list ");
			
			log.info("get clicked in cancellation list");

		}

        documentExecutive.getCancelApproveButton().click();
        
        documentExecutive.getCancelApproveRemarks().sendKeys("cancel request has approved from document executive");
        
        documentExecutive.getCancelApprovedYesButton().click();
        
        
     
		

	}

	
	
	
	public void actionInContract() throws InterruptedException {
		Thread.sleep(2000);

		documentExecutive.getContractManagement().click();

		documentExecutive.getContract().click();

		tradeIDinContract = documentExecutive.getTradeIDinContract().getText();

		String[] words = tradeIDinContract.split("/");

		String numberTradeiNaCTION = words[words.length - 1];

		System.out.println(numberTradeiNaCTION + "trade number in claim");

		Thread.sleep(2000);

		DocExecutivedriver.findElement(By.xpath("//a[@href=\"https://stage.agroworlds.com/trades/"+numberTradeiNaCTION+"/contract-actions\"]")).click();

		// Thread.sleep(2000);
		log.info("action button clicked ");

		documentExecutive.getActionDropdownButton().click();

		log.info("action dropdwon button clicked final time ");


	}



	//		for(int i=19; i<=44;i++) {
	////		WebElement select1 = driver.findElement(By.xpath("(//span[text()='Select'])["+(i+2)+"]"));
	////		select1.click();
	////		Thread.sleep(500);
	////		WebElement possibleEvent = driver.findElement(By.xpath("(//div[@class='stage-list bg-white br-10 px-3 py-2'])["+i+"]//span[text()='DRAFT BILL OF LADING (Draft)']"));
	////		possibleEvent.click();
	////		
	//		WebElement select2 = driver.findElement(By.xpath("(//span[text()='Select TAT'])["+(i+2)+"]"));
	//		Thread.sleep(500);
	//		WebElement extensionRequest = driver.findElement(By.xpath("(//span[text()='Select TAT'])["+(i-1)+"]"));
	//		extensionRequest.click();
	//		}
	//		




	//
	//		Thread.sleep(2000);
	//		//utility.Dropdown(documentExecutive.getBillingDraftText(),"Vessel - Actual Time of Departure (ATD)");
	//       
	//		List<WebElement> TAT = documentExecutive.getTATShipment();


	//		System.out.println(TAT + "AND TAT ARE ");
	//		
	//		for (WebElement tat : TAT) {
	//			
	//			tat.click();

	//			documentExecutive.getSelectTat().click();




}



