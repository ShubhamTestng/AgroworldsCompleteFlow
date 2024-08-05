package POMpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentIRM {
	
	WebDriver DocIRMdriver;
		
	public DocumentIRM(WebDriver DocIRMdriver) {
		
		this.DocIRMdriver = DocIRMdriver;
		PageFactory.initElements(DocIRMdriver, this);
		
	}
	
	@FindBy(xpath="//input[@type=\"email\"]")
	WebElement Email;
	//id="countrycode"
	///html/body/div/div/div[2]/div[2]/div/div/form/div[2]/div/div/span/span[1]/span/span[2]
	///html/body/span/span/span[2]/ul/li[2]/span[2]
	@FindBy(xpath="html/body/div/div/div[2]/div[2]/div/div/form/div[2]/div/div/span/span[1]/span/span[2]")
	WebElement Country;
	
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li[2]/span[2]")
	WebElement countrycode;
	
	public WebElement getCountrycode() {
		return countrycode;
	}

	
	@FindBy(xpath="//input[@name=\"phone\"]")
	WebElement phone;
	
	@FindBy(xpath="//button[text()='Verify']")
	WebElement verifyLogin;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement OTP;
	
	@FindBy(xpath="//button[@id=\"verify\"]")
	WebElement OTPverify;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/div[1]/a")
	WebElement contractManagementModule;
	
	public WebElement getContractManagementModule() {
		return contractManagementModule;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getCountry() {
		return Country;
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

	
	@FindBy(xpath="(//a[@id=\"nav_link_trade\"])[1]")
	WebElement ContractManagement;

	public WebElement getContractManagement() {
		return ContractManagement;
	}

	public WebElement getContract() {
		return contract;
	}

	public WebElement getContractSearch() {
		return contractSearch;
	}

	public WebElement getTradeStatus() {
		return tradeStatus;
	}

	public WebElement getAssignToTeam() {
		return AssignToTeam;
	}

	public WebElement getSelectOpeartiveExecutiveDropdown() {
		return selectOpeartiveExecutiveDropdown;
	}

	public WebElement getContractAssignButton() {
		return ContractAssignButton;
	}

	public WebElement getClearFilter() {
		return clearFilter;
	}

	public WebElement getGenerateContract() {
		return GenerateContract;
	}


	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/ul/li[1]/a")
	WebElement contract;
	
	@FindBy(xpath="//*[@id=\"search-id\"]")
	WebElement contractSearch;
	
	@FindBy(xpath="//*[@id=\"status\"]")
	WebElement tradeStatus;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div[2]/table/tbody/tr/td[1]/div/a")
	WebElement AssignToTeam;

	@FindBy(xpath="//*[@id=\"operation_executive\"]")
	WebElement selectOpeartiveExecutiveDropdown;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[4]/div/div/div/form/div[4]/button[2]")
	WebElement ContractAssignButton;
	
	@FindBy(xpath= "(//div[@class='tooltip-new'])[3]")
	WebElement clearFilter;
	
	@FindBy(xpath="//*[@id=\"example2\"]/tbody/tr[1]/td[2]/p[2]") 
    WebElement tradeIDinContract;
	
	public WebElement getTradeIDinContract() {
		return tradeIDinContract;
	}

	@FindBy(xpath = "//*[@id=\"example2\"]/tbody/tr[1]/td[2]/p[2]/preceding::a[text()='Generate Contract']")
	WebElement GenerateContract;
	
	@FindBy(xpath="//*[@id=\"example2\"]/tbody/tr[1]/td[2]/p[2]/preceding::button[1]")
	WebElement yetToCome;

	public WebElement getYetToCome() {
		return yetToCome;
	}
	
	
	@FindBy(xpath="//*[@id=\"pre-shipment\"]/button")
	WebElement preshipmentNextApprove;
	
	public WebElement getPreshipmentNextApprove() {
		return preshipmentNextApprove;
	}

	public WebElement getShipmentNextApprove() {
		return shipmentNextApprove;
	}

	public WebElement getApproveButton() {
		return approveButton;
	}

	@FindBy(xpath="//*[@id=\"shipment\"]/button[2]")
	WebElement shipmentNextApprove;
	
	@FindBy(xpath="//*[@id=\"post-shipment\"]/div[3]/a[1]")
	WebElement approveButton;
	
	public WebElement getDefineStage() {
		return DefineStage;
	}

	@FindBy(xpath="//*[@id=\"action-dropdown-wrapper\"]/ul/li[1]/a")
	WebElement DefineStage;
	
	@FindBy(xpath="//textarea[@id=\"remark\"]")
	WebElement defineStageApprovalRemarks;
	
	public WebElement getDefineStageApprovalRemarks() {
		return defineStageApprovalRemarks;
	}

	public WebElement getYesButton() {
		return yesButton;
	}

	@FindBy(xpath="//button[text()='Yes']")
	WebElement yesButton;
	
	@FindBy(xpath="//*[@id=\"action-dropdown-wrapper\"]/ul/li[3]/a")
	WebElement viewContractRegistration;
	
	public WebElement getViewContractRegistration() {
		return viewContractRegistration;
	}

	public WebElement getContractstepNextButton1() {
		return contractstepNextButton1;
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

	public WebElement getContractstepNextButton5() {
		return contractstepNextButton5;
	}

	public WebElement getContractRegistrationApproved() {
		return contractRegistrationApproved;
	}

	@FindBy(xpath="//*[@id=\"contract-step-11\"]")
	WebElement contractstepNextButton1;
	
	@FindBy(xpath="//*[@id=\"contract-step-2\"]")
	WebElement contractstepNextButton2;

	@FindBy(xpath="//*[@id=\"contract-step-3\"]")
	WebElement contractstepNextButton3;

	@FindBy(xpath="//*[@id=\"contract-step-41\"]")
	WebElement contractstepNextButton4;
	
	@FindBy(xpath="//*[@id=\"contract-step-42\"]")
	WebElement contractstepNextButton5;
	
	@FindBy(xpath="//button[text()='Approve']")
	WebElement contractRegistrationApproved;
	
	public WebElement getManageLots() {
		return manageLots;
	}

	public WebElement getAddLotButton() {
		return AddLotButton;
	}

	public WebElement getBillNo() {
		return BillNo;
	}

	public WebElement getSelectOriginLots() {
		return selectOriginLots;
	}

	public WebElement getShippingLine() {
		return shippingLine;
	}

	public WebElement getQuanity() {
		return quanity;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	@FindBy(xpath="//*[@id=\"action-dropdown-wrapper\"]/ul/li[3]/a")
	WebElement manageLots;
	
	@FindBy(xpath="//button[@class=\"btn btn-tertiary-outline theme-button btn-add-trade-lot\"]")
	WebElement AddLotButton;
	
	@FindBy(xpath="//input[@name=\"lots[1][bl_no]\"]")
	WebElement BillNo;
	
	@FindBy(xpath="//*[@id=\"lot_origin_id_1\"]")
	WebElement selectOriginLots;
	
	@FindBy(xpath="//input[@id=\"lot_shipping_link_1\"]")
	WebElement shippingLine;
	
	@FindBy(xpath="//input[@id=\"lot_products_qty_0\"]")
	WebElement quanity;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveButton;
	
	public WebElement getBalanceQuanity() {
		return balanceQuanity;
	}

	@FindBy(xpath="//*[@id=\"lot-form\"]/div/div/div[1]/div/div[2]/span[1]/span")
	WebElement balanceQuanity;
	
	@FindBy(xpath="(//a[contains(text(), 'Contract Execution')])[2]")
	WebElement contractExecution;
	
	public WebElement getContractExecution() {
		return contractExecution;
	}

	public WebElement getPreshipmentCompletedButton() {
		return preshipmentCompletedButton;
	}

	public WebElement getSelectAllButton() {
		return selectAllButton;
	}

	public WebElement getSaveButtoninSelect() {
		return saveButtoninSelect;
	}

	public WebElement getSelectLotsFromDropdown() {
		return selectLotsFromDropdown;
	}

	@FindBy(xpath="(//div[@class=\"col-12 col-sm-6 col-xl-7 mb-3 mb-sm-0 \"])[1]")
	////*[@id=\"pre-shipment\"]//descendant::*[contains(@class, \"col-12 col-sm-auto\")]
	WebElement preshipmentCompletedButton;
	
	@FindBy(xpath="//*[@id=\"pre-shipment\"]/descendant::*[contains(@class, \"checklist-select-btn btn btn-sm btn-primary-outline\")]")
	WebElement selectAllButton;
	
	@FindBy(xpath="//*[@id=\"pre-shipment\"]/descendant::*[contains(@class, \"checklist-save-btn btn btn-sm btn-primary mr-1\")]")
	WebElement saveButtoninSelect;
	
	@FindBy(xpath="//select[@class=\"select2 form-control select2-hidden-accessible\"]")
	WebElement selectLotsFromDropdown;
	
	@FindBy(xpath="(//*[@id=\"dropdownContractButton\"])[1]")
	WebElement dropDownContractButton;

	public WebElement getDropDownContractButton() {
		return dropDownContractButton;
	}
	
	@FindBy(xpath="//a[@id=\"shipment-tab\"]")
	WebElement shipmentTab;
	
	public WebElement getShipmentTab() {
		return shipmentTab;
	}

	public WebElement getShipmentDraftDocument() {
		return ShipmentDraftDocument;
	}

	@FindBy(xpath="//div[@class=\"col-12 col-sm-6 col-xl-7 mb-3 mb-sm-0 \"]")
	WebElement ShipmentDraftDocument;
	
	@FindBy(xpath="(//a[@class=\"btn btn-primary theme-button w-auto mr-3\"])[2]")
	WebElement shipmentDocumentExcutionButton;
	
	public WebElement getShipmentDocumentExcutionButton() {
		return shipmentDocumentExcutionButton;
	}

	public WebElement getPreshipmentSaveButton() {
		return preshipmentSaveButton;
	}

	public WebElement getPreshipmentNextButton() {
		return preshipmentNextButton;
	}

	public WebElement getShipmentNextButton() {
		return shipmentNextButton;
	}

	public WebElement getShipmentUploadButton() {
		return shipmentUploadButton;
	}

	public WebElement getAddFileButton() {
		return addFileButton;
	}

	public WebElement getShipmentfileUploadButton() {
		return shipmentfileUploadButton;
	}

	@FindBy(xpath="(//a[@class='checklist-save-btn btn btn-sm btn-primary mr-1'])[1]")
	WebElement preshipmentSaveButton;
	
	@FindBy(xpath="(//button[@id=\"next-tab\"])[1]")
	WebElement preshipmentNextButton;
	
	@FindBy(xpath="(//button[@id=\"next-tab\"])[2]")
	WebElement shipmentNextButton;
	
	@FindBy(xpath="//a[@id=\"documents-nav-three-tab-78\"]")
	WebElement shipmentUploadButton;
	
	@FindBy(xpath="//input[@id=\"upload-contract0\"]")
	WebElement addFileButton;
	
	@FindBy(xpath="(//button[text()='Upload'])[1]")
	WebElement shipmentfileUploadButton;
	
	@FindBy(xpath="(//button[text()='Save'])[1]")
	WebElement postShipmetSaveButton;

	public WebElement getPostShipmetSaveButton() {
		return postShipmetSaveButton;
	}
	
	@FindBy(xpath="//input[@id=\"buyerselectall\"]")
	WebElement BuyerCheckbOXinUploadDocumnet;
	
	public WebElement getBuyerCheckbOXinUploadDocumnet() {
		return BuyerCheckbOXinUploadDocumnet;
	}

	public WebElement getSellerCheckbOXinUploadDocumnet() {
		return SellerCheckbOXinUploadDocumnet;
	}

	public WebElement getBuyersellerUploadButton() {
		return buyersellerUploadButton;
	}

	@FindBy(xpath="//input[@id=\"sellerselectall\"]")
	WebElement SellerCheckbOXinUploadDocumnet;
	
	@FindBy(xpath="(//button[text()='Upload'])[2]")
	WebElement buyersellerUploadButton;
	
	@FindBy(xpath="//button[@id=\"complete-checklist\"]")
	WebElement completeCheckListButton;

	public WebElement getCompleteCheckListButton() {
		return completeCheckListButton;
	}
	
	public WebElement getVarianceCheckbox() {
		return varianceCheckbox;
	}

	@FindBy(xpath="//div[@class=\"custom-checkbox\"]")
	WebElement varianceCheckbox;
	
	@FindBy(xpath="//*[@id=\"lot_heading_1\"]/div/button")
	WebElement variancedownArrowButton;

	public WebElement getVariancedownArrowButton() {
		return variancedownArrowButton;
	}
	
	public WebElement getActiopnButtonIncontract() {
		return actiopnButtonIncontract;
	}

	public WebElement getActionDropdownButton() {
		return actionDropdownButton;
	}

	public WebElement getRequestToCompleteButton() {
		return requestToCompleteButton;
	}

	
	
	@FindBy(xpath="//a[@href=\"https://stage.agroworlds.com/trades/1075/contract-actions\"]")
	WebElement actiopnButtonIncontract;
	
	@FindBy(xpath="//button[@class=\"mb-menu custom-dropdown-btn\"]")
	WebElement actionDropdownButton;
	
	@FindBy(xpath="//a[@onclick=\"requestContractComplete(1075, 1137)\"]")
	WebElement requestToCompleteButton;
	
	@FindBy(xpath="//textarea[@id=\"contract_request_remark\"]")
	WebElement contractCompleteRequestRemark;
	
	public WebElement getContractCompleteRequestRemark() {
		return contractCompleteRequestRemark;
	}

	public WebElement getsendBuutonInReuestToCompleteContract() {
		return sendBuutonInReuestToCompleteContract;
	}

	public WebElement getCompletContractRequest() {
		return completContractRequest;
	}

	public WebElement getContractApproveRemarks() {
		return ContractApproveRemarks;
	}

	public WebElement getCompleterequestApproveButton() {
		return CompleterequestApproveButton;
	}

	@FindBy(xpath="//button[text()='Send']")
	WebElement sendBuutonInReuestToCompleteContract;
	
	@FindBy(xpath="//a[@onclick=\"approveContractComplete(1075, 1137)\"]")
	WebElement completContractRequest;
	
	@FindBy(xpath="//textarea[@id=\"contract_approve_remark\"]")
	WebElement ContractApproveRemarks;
	
	@FindBy(xpath="//button[@id=\"complete-request-approve\"]")
	WebElement CompleterequestApproveButton;
	
	@FindBy(xpath="//a[@id=\"nav-post-shipment-tab\"]")
	WebElement postshipmentButton;

	public WebElement getPostshipmentButton() {
		return postshipmentButton;
	}
	
	@FindBy(xpath="//a[contains(text(), 'Contract Execution')]")
	WebElement contractExecutionAfterPostshipmentSaveDocumnet;

	public WebElement getContractExecutionAfterPostshipmentSaveDocumnet() {
		return contractExecutionAfterPostshipmentSaveDocumnet;
	}
	
	@FindBy(xpath="(//a[contains(text(),'Manage')])[2]")
	WebElement managaeLotafterSearchAgain;

	public WebElement getManagaeLotafterSearchAgain() {
		return managaeLotafterSearchAgain;
	}
	
	
	public WebElement getDefineContractPreshipment() {
		return DefineContractPreshipment;
	}

	@FindBy(xpath="//input[@id=\"contract-substage-89\"]")
	WebElement DefineContractPreshipment;
	
	
	public WebElement getDefineContractShipment() {
		return DefineContractShipment;
	}

	@FindBy(xpath="//input[@id=\"contract-substage-93\"]")
	WebElement DefineContractShipment;
	
	
	public WebElement getDefinePostshipment() {
		return DefinePostshipment;
	}

	@FindBy(xpath="//input[@id=\"contract-substage-90\"]")
	WebElement DefinePostshipment;
	
	public WebElement getSaveandSendIRM() {
		return SaveandSendIRM;
	}

	@FindBy(xpath="//button[@id=\"save-with-irm\"]")
	WebElement SaveandSendIRM;
	
	public WebElement getClaimMangement() {
		return claimMangement;
	}

	@FindBy(xpath="(//a[@id=\"nav_link_trade\"])[3]")
	WebElement claimMangement;
	
	@FindBy(xpath="(//a[@class=\"nav-link\"])[10]")
	WebElement claims;


	public WebElement getClaim() {
		return claims;
	}
	
	public WebElement getContractNumberInclaim() {
		return contractNumberInclaim;
	}

	@FindBy(xpath="(//table[@class=\"table table-accordion-main mb-0 trade-list-table table-fixed-column-last\"]//tbody//tr[1]//td[1])[1]")
	WebElement contractNumberInclaim;
	
	@FindBy(xpath="(//button[@class=\"accordian-arrow btn btn-link btn-block mt-0 p-0 text-left collapsed\"])[1]")
	WebElement claimActionButton;


	public WebElement getClaimActionButton() {
		return claimActionButton;
	}
	
	@FindBy(xpath="//*[@class=\"previewTotalCollapseRow collapse show\"]/div/div/table/tbody/tr/td[6]/div/div/a")
	WebElement claimViewButton;


	public WebElement getClaimViewButton() {
		return claimViewButton;
	}
	
	
	@FindBy(xpath="//button[text()='Assign']")
	WebElement claimAssignButton;


	public WebElement getClaimAssignButton() {
		return claimAssignButton;
	}
	
	public WebElement getClaimApproveButton() {
		return claimApproveButton;
	}

	@FindBy(xpath="//button[text()='Approve/Reject']")
	WebElement claimApproveButton;
	
	public WebElement getCliamConfirmReamrk() {
		return cliamConfirmReamrk;
	}

	@FindBy(xpath="//textarea[@id=\"confirm_remark\"]")
	WebElement cliamConfirmReamrk;
	
	
	@FindBy(xpath="//button[text()='Approve']")
	WebElement claimApproveConfirm;


	public WebElement getClaimApproveConfirm() {
		return claimApproveConfirm;
	}
	
	
	public WebElement getClaimSendToReview() {
		return claimSendToReview;
	}

	@FindBy(xpath="//button[text()='Send to Review']")
	WebElement claimSendToReview;
	
	
	
	@FindBy(xpath = "(//a[@href='https://stage.agroworlds.com/trades/cancellation'])[1]") // "(//a[@class=\"nav-link active\"])[2]"
	WebElement cancellationListInTrade;


	public WebElement getCancellationListInTrade() {
		return cancellationListInTrade;
	}
	
	
	@FindBy(xpath="//*[@id='example2']/tbody/tr[1]/td[1]/span/u/a")
	WebElement tradeId;
	
	
	public WebElement getTradeId() {
		return tradeId;
	}
	
	

	@FindBy(xpath="//button[@class=\"btn theme-button btn-primary w-100 mb-2 approve-btn\"]")
	WebElement approveCancellationIntrade;


	public WebElement getApproveCancellationIntrade() {
		return approveCancellationIntrade;
	}
	
	
	@FindBy(xpath="(//textarea[@id=\"cancel_remark\"])[3]")
	WebElement approveCancellationRemarks;


	public WebElement getApproveCancellationRemarks() {
		return approveCancellationRemarks;
	}
	
	@FindBy(xpath="(//button[text()='Yes'])[2]")
	WebElement cancelApproveTradeYesButton;


	public WebElement getCancelApproveTradeYesButton() {
		return cancelApproveTradeYesButton;
	}

}


