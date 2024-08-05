package POMpage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentExecutive {
	

	WebDriver DocExecutivedriver;
		
	public DocumentExecutive(WebDriver DocExecutivedriver) {
		
		this.DocExecutivedriver = DocExecutivedriver;
		PageFactory.initElements(DocExecutivedriver, this);
		
	}
	

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getCountrycode() {
		return countrycode;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getVerifyLogin() {
		return verifyLogin;
	}

	public WebElement getOTP() {
		return OTP;
	}

	public WebElement getOTPverify() {
		return OTPverify;
	}

	public WebElement getContractManagement() {
		return ContractManagement;
	}

	public WebElement getContract() {
		return contract;
	}

	public WebElement getYetToCome() {
		return yetToCome;
	}

	public WebElement getDefineStage() {
		return DefineStage;
	}
	
	@FindBy(xpath="//*[@id=\"example2\"]/tbody/tr[1]/td[2]/p[2]") 
    WebElement tradeIDinContract;
	
	public WebElement getTradeIDinContract() {
		return tradeIDinContract;
	}

	@FindBy(xpath="//input[@type=\"email\"]")
	WebElement Email;
	
	@FindBy(xpath="html/body/div/div/div[2]/div[2]/div/div/form/div[2]/div/div/span/span[1]/span/span[2]")
	WebElement Country;
	
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li[2]/span[2]")
	WebElement countrycode;
	

	@FindBy(xpath="//input[@name=\"phone\"]")
	WebElement phone;
	
	@FindBy(xpath="//button[text()='Verify']")
	WebElement verifyLogin;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement OTP;
	
	@FindBy(xpath="//button[@id=\"verify\"]")
	WebElement OTPverify;
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a/p/i")
	WebElement ContractManagement;
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/ul/li[1]/a")
	WebElement contract;
	
	@FindBy(xpath="//*[@id=\"example2\"]/tbody/tr[1]/td[2]/p[2]/preceding::button[1]")
	WebElement yetToCome;
	
	@FindBy(xpath="//*[@id=\"action-dropdown-wrapper\"]/ul/li[1]/a")
	WebElement DefineStage;
	
	
	@FindBy(xpath="//*[@id=\"pre-shipment\"]/div/div[10]/div/div[1]/div[2]/h6")
	WebElement billingDraftText;

	public WebElement getBillingDraftText() {
		return billingDraftText;
	}

	public WebElement getBllingDraftCheckbox() {
		return bllingDraftCheckbox;
	}

	public WebElement getETDdate() {
		return ETDdate;
	}

	public WebElement getExtensionRequestTAT() {
		return extensionRequestTAT;
	}

	public WebElement getTATinDAYS() {
		return TATinDAYS;
	}

	public WebElement getPreshipmentNextButton() {
		return preshipmentNextButton;
	}

	@FindBy(xpath="//*[@id=\"pre-shipment\"]/div/div[10]/div/div[1]/div[1]/label/div")
	WebElement bllingDraftCheckbox;
	
	public WebElement getSelectStartEvent() {
		return selectStartEvent;
	}

	@FindBy(xpath="//*[@id=\"pre-shipment\"]/div/div[10]/div/div[2]/div/div/div[2]/div/div[1]/span/span[1]/span/span[2]")
	WebElement selectStartEvent;
	
	@FindBy(xpath="//li[text()=\"Vessel - Estimated Time of Departure (ETD)\"]")
	WebElement ETDdate;
	
	@FindBy(xpath="//*[@id=\"pre-shipment\"]/div/div[10]/div/div[2]/div/div/div[2]/div/div[2]/span/span[1]/span/span[2]")
	WebElement extensionRequestTAT;
	
	@FindBy(xpath="//li[contains(text(), '96')]")
	WebElement TATinDAYS;
	
	@FindBy(xpath="(//*[@id=\"next-tab\"])[1]")
	WebElement preshipmentNextButton;
	
	@FindBy(xpath="//*[text()='DRAFT BILL OF LADING (Draft)']")
	List<WebElement> draftDocumentstartShipments;
	


	public List<WebElement> getDraftDocumentstartShipments() {
		return draftDocumentstartShipments;
	}


	public List<WebElement> getTATShipment() {
		return TATShipment;
	}

	@FindBy(xpath="//div[@class=\"stage-card selected-card\"]//select[@class=\"contract-substage-tat form-control small-box-input select2 select2-hidden-accessible\"]")
	List<WebElement>  TATShipment;
	
//	@FindBy(xpath="//select[@name=\"contractSubStageTats[28][]\"]")
//	WebElement selectTat;
//	
//	public WebElement getSelectTat() {
//		return selectTat;
//	}

	@FindBy(xpath="//*[@id=\"shipment\"]/div/div[1]/div/div[1]/div[1]")
	WebElement draftCheckbox;
	//*[@id=\"shipment\"]/div/div[1]/div/div[1]/div[1]/label
	//*[@id=\"contract-stage-16\"]
	//*[@id=\"shipment\"]/div/div[1]/div/div[1]/div[1]/label/div
	

	public WebElement getDraftCheckbox() {
		return draftCheckbox;
	}
	
	@FindBy(xpath="//select[@name=\"contractSubStageEvents[84][]\"]")
	WebElement BillofLadingstartEvent;

	public WebElement getBillofLadingstartEvent() {
		return BillofLadingstartEvent;
	}
	
	@FindBy(xpath="(//*[@id=\"next-tab\"])[2]")
	WebElement shipmentNextButton;

	public WebElement getShipmentNextButton() {
		return shipmentNextButton;
	}
	
	@FindBy(xpath="//*[@id='save-with-irm']")
	WebElement postshipmentNextButton;

	public WebElement getPostshipmentNextButton() {
		return postshipmentNextButton;
	}
	
	
	@FindBy(xpath="//*[@id=\"action-dropdown-wrapper\"]/ul/li[2]/a")
	WebElement TandC;

	public WebElement getTandC() {
		return TandC;
	}
	
	@FindBy(xpath="//a[text()='Original']")
	WebElement oroginal;

	public WebElement getOroginal() {
		return oroginal;
	}
	
	@FindBy(xpath="//*[@id=\"upload-contract-original\"]")
	WebElement uploadfileTanDc;

	public WebElement getUploadfileTanDc() {
		return uploadfileTanDc;
	}
	
	public WebElement getOriginalUploadBUtton() {
		return originalUploadBUtton;
	}

	@FindBy(xpath="//*[@id=\"contract-file-upload-original\"]")
	WebElement originalUploadBUtton;
	
	
	@FindBy(xpath="//*[@id=\"action-dropdown-wrapper\"]/ul/li[3]/a")
	WebElement contractRegistration;
	
	public WebElement getContractRegistration() {
		return contractRegistration;
	}

	public WebElement getContractNumber() {
		return contractNumber;
	}

	public WebElement getBuyermailContract() {
		return buyermailContract;
	}

	public WebElement getContractstepNextButton1() {
		return contractstepNextButton1;
	}

	public WebElement getSellermailContract() {
		return sellermailContract;
	}

	public WebElement getContractstepNextButton2() {
		return contractstepNextButton2;
	}

	public WebElement getContractstepNextButton3() {
		return contractstepNextButton3;
	}

	public WebElement getContractstepNextButton4() {
		return contractstepNextButton4;
	}

	public WebElement getPercentage() {
		return percentage;
	}

	public WebElement getAdvanceAmount() {
		return advanceAmount;
	}

	public WebElement getQualityAssurance() {
		return qualityAssurance;
	}

	public WebElement getInsurance() {
		return insurance;
	}

	public WebElement getFreedays() {
		return freedays;
	}

	public WebElement getSelectPacking() {
		return selectPacking;
	}

	public WebElement getUploadPackingfile() {
		return uploadPackingfile;
	}

	public WebElement getPackingUploadButton() {
		return packingUploadButton;
	}

	public WebElement getContractstepNextButton5() {
		return contractstepNextButton5;
	}

	public WebElement getDocumentRequiredShipment() {
		return DocumentRequiredShipment;
	}

	public WebElement getSendToIRMButton() {
		return SendToIRMButton;
	}

	public WebElement getContractRegistrationApproveRequestRemarks() {
		return ContractRegistrationApproveRequestRemarks;
	}

	public WebElement getRemarksSendButton() {
		return remarksSendButton;
	}

	@FindBy(xpath="//*[@id=\"contract_number\"]")
	WebElement contractNumber;
	
	@FindBy(xpath="//*[@id=\"buyer_email\"]")
	WebElement buyermailContract;
	
	@FindBy(xpath="//*[@id=\"contract-step-11\"]")
	WebElement contractstepNextButton1;
	
	@FindBy(xpath="//*[@id=\"seller_email\"]")
	WebElement sellermailContract;
	
	@FindBy(xpath="//*[@id=\"contract-step-2\"]")
	WebElement contractstepNextButton2;

	@FindBy(xpath="//*[@id=\"contract-step-3\"]")
	WebElement contractstepNextButton3;

	@FindBy(xpath="//*[@id=\"contract-step-41\"]")
	WebElement contractstepNextButton4;
	
	@FindBy(xpath="//*[@id=\"percentage\"]")
	WebElement percentage;
	
	@FindBy(xpath="//*[@id=\"remaining_amount\"]")
	WebElement advanceAmount;
	
	@FindBy(xpath="//*[@id=\"contract-step-dev-42\"]/div/form/div[1]/div[1]/div/input")
	WebElement qualityAssurance;
	
	@FindBy(xpath="//*[@id=\"contract-step-dev-42\"]/div/form/div[1]/div[2]/div/input")
	WebElement insurance;
	
	@FindBy(xpath="//*[@id=\"contract-step-dev-42\"]/div/form/div[1]/div[3]/div/input")
	WebElement freedays;
	
	@FindBy(xpath="//*[@id=\"contract-step-dev-42\"]/div/form/div[1]/div[7]/div/div[1]/div[1]/div/select")
	WebElement selectPacking;
	
	//25 KG PP BAGS
	
	@FindBy(xpath="//*[@id=\"contract-step-dev-42\"]/div/form/div[1]/div[7]/div/div[1]/div[3]/div/div[1]/div/input")
	WebElement uploadPackingfile;
	
	@FindBy(xpath="//*[@id=\"contract-step-dev-42\"]/div/form/div[1]/div[7]/div/div[1]/div[3]/div/div[1]/button")
	WebElement packingUploadButton;
	
	@FindBy(xpath="//*[@id=\"contract-step-42\"]")
	WebElement contractstepNextButton5;
 
	@FindBy(xpath="//*[@id=\"contract-creation-module\"]/div[1]/div/div/div[2]/div/div[2]/div[5]/div/form/div/div[1]/div/div[1]/div/div/div[31]")
	WebElement DocumentRequiredShipment;
	
	@FindBy(xpath="//*[@id=\"contract-step-5\"]")
	WebElement SendToIRMButton;
	
	@FindBy(xpath="//*[@id=\"document-approve-request\"]/div[2]/textarea")
	WebElement ContractRegistrationApproveRequestRemarks;

	@FindBy(xpath="//*[@id=\"document-approve-request\"]/div[3]/button[2]")
	WebElement remarksSendButton;
	
	public WebElement getClaimReviewSendButton() {
		return claimReviewSendButton;
	}

	@FindBy(xpath="//button[@class=\"btn btn-primary theme-button\"]")
	WebElement claimReviewSendButton;
	
	@FindBy(xpath="//textarea[@id=\"claim_reason\"]")
	WebElement claimReason;


	public WebElement getClaimReason() {
		return claimReason;
	}
	
	@FindBy(xpath="(//*[local-name()='svg'])[14]")
	WebElement claimRegisterInAction;


	public WebElement getClaimRegisterInAction() {
		return claimRegisterInAction;
	}
	
	public WebElement getActionDropdownButton() {
		return actionDropdownButton;
	}
	
	@FindBy(xpath="//button[@class=\"mb-menu custom-dropdown-btn\"]")
	WebElement actionDropdownButton;
	
	@FindBy(xpath="(//*[local-name()='svg'])[13]")
	WebElement cancelRaiseInAction;

	public WebElement getCancelRaiseInAction() {
		return cancelRaiseInAction;
	}
	
	@FindBy(xpath="//textarea[@id=\"cancel_remark\"]")
	WebElement cancelRaiseRemark;

	public WebElement getCancelRaiseRemark() {
		return cancelRaiseRemark;
	}
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement cancelRaiseSubmitButton;

	public WebElement getCancelRaiseSubmitButton() {
		return cancelRaiseSubmitButton;
	}
	
	
	public WebElement getCancelltionList() {
		return cancelltionList;
	}

	@FindBy(xpath="//a[@href='https://stage.agroworlds.com/trades/cancellation']")
	WebElement cancelltionList;
	
	@FindBy(xpath="//*[@id=\"example2\"]/tbody/tr[1]/td[1]/span/u/a")
	WebElement tradeIdinCancellationList;

	public WebElement getTradeIdinCancellationList() {
		return tradeIdinCancellationList;
	}
	
	
	@FindBy(xpath="//*[@id=\"example2\"]/tbody/tr[1]/td[1]/small")
	WebElement cancellationStatus;

	public WebElement getCancellationStatus() {
		return cancellationStatus;
	}
	
	@FindBy(xpath="//button[contains(text(),'Approve Request')]")
	WebElement cancelApproveButton;

	public WebElement getCancelApproveButton() {
		return cancelApproveButton;
	}
	
	
	public WebElement getCancelApproveRemarks() {
		return cancelApproveRemarks;
	}

	@FindBy(xpath="(//textarea[@id=\"cancel_remark\"])[2]")
	WebElement cancelApproveRemarks;
	
	public WebElement getCancelApprovedYesButton() {
		return cancelApprovedYesButton;
	}

	@FindBy(xpath="//*[@id=\"pending-approval-form\"]/div[3]/button[2]")
	WebElement cancelApprovedYesButton;
}
