package POMpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTrade {

	public WebDriver Traderdriver;
	
	
	public CreateTrade(WebDriver Traderdriver) {
		
		this.Traderdriver = Traderdriver;
		
        PageFactory.initElements(Traderdriver, this);

	}
	
	@FindBy(xpath="//input[@type=\"email\"]")
	WebElement Email;
	
	
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
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a/p/i")
	WebElement tradeDropdown;
	
	
	@FindBy(xpath="//p[text()='Create Trade']")
	WebElement createTrade;
	
	@FindBy(xpath="//*[@id=\"trade_type_id\"]")
	WebElement Tradetype;
	
	@FindBy(xpath="//input[@name=\"trade_date\"]")
	WebElement tradeDate;
	
	@FindBy(xpath="//select[@name=\"selling_contry_id\"]")
	WebElement countrySelect;
	
	@FindBy(xpath="//*[@id=\"trades-step-dev-1\"]/form/div/div[1]/div[8]/div/select")
	WebElement payterm;
	
	@FindBy(xpath="//*[@id=\"fcl_id\"]")
	WebElement containerLoad;
	
	@FindBy(xpath="//*[@id=\"trades-step-1\"]")
	WebElement TradeNextButton;
	
	@FindBy(xpath="//*[@id=\"fromdate\"]/input")
	WebElement fromDate;
	
	@FindBy(xpath="//*[@id=\"todate\"]/input")
	WebElement toDate;
	
	@FindBy(xpath="//*[@id=\"trades-step-dev-2\"]/form/div/div[1]/div[2]/div[2]/div/select")
	WebElement incotern;
	
	@FindBy(xpath="//*[@id=\"trades-step-dev-2\"]/form/div/div[1]/div[2]/div[3]/div/select")
	WebElement portLoading;
	
	@FindBy(xpath="//*[@id=\"trades-step-dev-2\"]/form/div/div[1]/div[2]/div[4]/div/select")
	WebElement portDischarge;
	
	@FindBy(xpath="//*[@id=\"trades-step-dev-2\"]/form/div/div[1]/div[2]/div[6]/div/select")
	WebElement Contractissuer;
	
	@FindBy(xpath="//*[@id=\"trades-step-2\"]")
	WebElement shipmentNextButton;

	@FindBy(xpath="//*[@id=\"category_id_0\"]")
	WebElement category;

	@FindBy(xpath="//ancestor::div[@class=\"form-group\"]//select[@data-placeholder=\"Select Product\"]")	
	WebElement product;
	
	@FindBy(xpath="//*[@id=\"product[0][5][booked_qty]\"]")
	WebElement bookedQuantity;
	
	@FindBy(xpath="//*[@id=\"product[0][5][rate]\"]")
	WebElement productRate;
	
	@FindBy(xpath="//*[@id=\"collapseOne0\"]/div/div/div[1]/div/div[5]/div/span/span[1]/span/ul")
	WebElement origin;
	
	@FindBy(xpath="/html/body/span/span/span/ul/li[4]")
	WebElement countryName;
	
	@FindBy(xpath="//*[@id=\"product[0][5][contanier_type]\"]")
	WebElement containerType;
	
	@FindBy(xpath="//*[@id=\"product[0][5][no_of_container]\"]")
	WebElement NoOfContainers;
			
	@FindBy(xpath="//*[@id=\"product[0][5][container_size]\"]")
	WebElement containerSize;


	@FindBy(xpath="//*[@id=\"collapseOne0\"]/div/div/div[2]/div/div[2]/div[2]/button")
	WebElement AddSpecialisation;
	
	@FindBy(xpath="//select[@id=\"specification-modal\"]")
	WebElement specilisation;
	
	@FindBy(xpath="//*[@id=\"unit-id\"]")
	WebElement unit;
	
	@FindBy(xpath="//*[@id=\"range-to\"]")
	WebElement univalue;
	
	@FindBy(xpath="//*[@id=\"add-Sepcification\"]")
	WebElement Addbutton;
	
	@FindBy(xpath="//*[@id=\"trades-step-3\"]")
	WebElement ProductnextButton;
	
	
	@FindBy(xpath="//*[@id=\"seller_details_form\"]/div/div[1]/div[1]/div/select")
	WebElement seller;
	
	@FindBy(xpath="//*[@id=\"seller_email\"]")
	WebElement SearchMail;
	
	@FindBy(xpath="//*[@id=\"seller_details_form\"]/div/div[1]/div[3]/div/div/div/select")
	WebElement sellerCommision;
	
	@FindBy(xpath="//*[@id=\"seller_details_form\"]/div/div[1]/div[3]/div/div/input")
	WebElement sellercommisionInput;
	
	@FindBy(xpath="//*[@id=\"seller_cc_email\"]")
	WebElement SellerccMail;
	
	
	@FindBy(xpath="//*[@id=\"seller-details\"]")
	WebElement sellerNextButton;
	
	@FindBy(xpath="//*[@id=\"buyer_details_form\"]/div/div[1]/div[1]/div/select")
	WebElement buyer;
	
	@FindBy(xpath="//*[@id=\"buyer_email\"]")
	WebElement searchBuyermail;
	
	@FindBy(xpath="//*[@id=\"buyer_cc_email\"]")
	WebElement buyerCCMail;
	
	@FindBy(xpath="(//*[@id=\"buyer-details\"])[1]")
	WebElement buyernextButton;
	
	@FindBy(xpath="//*[@id=\"buyer-part1\"]/button[3]")
	WebElement addTrade;
	
	@FindBy(xpath="//*[@id=\"bdm_id\"]")
	WebElement reviewForBDM;
	
	@FindBy(xpath="//*[@id=\"Send_Trade\"]")
    WebElement sendTrade;
	
	@FindBy(xpath= "//*[@id=\"example2\"]/tbody/tr[1]/td[1]/span/u/a")
	WebElement readtrade;
	

	@FindBy(xpath= "/html/body/div[3]/nav/ul[2]/li[3]/a") 
	WebElement profile;
	
	@FindBy(xpath = "/html/body/div[3]/nav/ul[2]/li[3]/ul[1]/li/a/span") 
	WebElement logout;
	

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

	
	public WebElement getTradeDropdown() {
		return tradeDropdown;
	}

	public WebElement getCreateTrade() {
		return createTrade;
	}

	public WebElement getTradetype() {
		return Tradetype;
	}

	public WebElement getTradeDate() {
		return tradeDate;
	}

	public WebElement getCountrySelect() {
		return countrySelect;
	}

	public WebElement getPayterm() {
		return payterm;
	}

	public WebElement getContainerLoad() {
		return containerLoad;
	}

	public WebElement getTradeNextButton() {
		return TradeNextButton;
	}

	public WebElement getFromDate() {
		return fromDate;
	}

	public WebElement getToDate() {
		return toDate;
	}

	public WebElement getIncotern() {
		return incotern;
	}

	public WebElement getPortLoading() {
		return portLoading;
	}

	public WebElement getPortDischarge() {
		return portDischarge;
	}

	public WebElement getContractissuer() {
		return Contractissuer;
	}

	public WebElement getShipmentNextButton() {
		return shipmentNextButton;
	}

	public WebElement getCategory() {
		return category;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getBookedQuantity() {
		return bookedQuantity;
	}

	public WebElement getProductRate() {
		return productRate;
	}

	public WebElement getOrigin() {
		return origin;
	}

	public WebElement getCountryName() {
		return countryName;
	}

	public WebElement getContainerType() {
		return containerType;
	}

	public WebElement getNoOfContainers() {
		return NoOfContainers;
	}

	public WebElement getContainerSize() {
		return containerSize;
	}

	public WebElement getAddSpecialisation() {
		return AddSpecialisation;
	}

	public WebElement getSpecilisation() {
		return specilisation;
	}

	public WebElement getUnit() {
		return unit;
	}

	public WebElement getUnivalue() {
		return univalue;
	}

	public WebElement getAddbutton() {
		return Addbutton;
	}

	public WebElement getProductnextButton() {
		return ProductnextButton;
	}

	public WebElement getSeller() {
		return seller;
	}

	public WebElement getSearchMail() {
		return SearchMail;
	}

	public WebElement getSellerCommision() {
		return sellerCommision;
	}

	public WebElement getSellercommisionInput() {
		return sellercommisionInput;
	}

	public WebElement getSellerccMail() {
		return SellerccMail;
	}

	public WebElement getSellerNextButton() {
		return sellerNextButton;
	}

	public WebElement getBuyer() {
		return buyer;
	}

	public WebElement getSearchBuyermail() {
		return searchBuyermail;
	}

	public WebElement getBuyerCCMail() {
		return buyerCCMail;
	}

	public WebElement getBuyernextButton() {
		return buyernextButton;
	}

	public WebElement getAddTrade() {
		return addTrade;
	}

	public WebElement getReviewForBDM() {
		return reviewForBDM;
	}

	public WebElement getSendTrade() {
		return sendTrade;
	}
	

	public WebElement getReadtrade() {
		return readtrade;
	}

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLogout() {
		return logout;
	}
	
    
	@FindBy(xpath="//li[@class=\"nav-item dropdown notification-dropdown\"]//a[@class=\"nav-link\"]")
	WebElement notificationButton;
 
	public WebElement getNotificationButton() {
		return notificationButton;
	}

	public WebElement getSellerID() {
		return sellerID;
	}

	@FindBy(xpath="//*[@id=\"example2\"]/tbody/tr[1]/td[2]/span/u/a")
	WebElement sellerID;
	
	@FindBy(xpath="//button[text()='Approve']")
	WebElement approveAddendumButton;
	
	public WebElement getApproveAddendumButton() {
		return approveAddendumButton;
	}

	public WebElement getAddendumRemarks() {
		return addendumRemarks;
	}

	public WebElement getAddendumApproveAfterRemarksButton() {
		return addendumApproveAfterRemarksButton;
	}

	public WebElement getCreateAddendumTradeButton() {
		return createAddendumTradeButton;
	}

	@FindBy(xpath="//textarea[@id=\"remark\"]")
	WebElement addendumRemarks;
	
	@FindBy(xpath="//button[@class=\"btn btn-primary theme-button\"]")
	WebElement addendumApproveAfterRemarksButton;
	
	@FindBy(xpath="//a[text()='Create Addendum Trade']")
	WebElement createAddendumTradeButton;
	
	@FindBy(xpath="//p[text()='Trades']")
	WebElement trade;


	public WebElement getTrade() {
		return trade;
	}
	
	public WebElement getSellerccMail2() {
		return SellerccMail2;
	}

	@FindBy(xpath="//*[@id=\"seller_cc_email_1\"]")
	WebElement SellerccMail2;
	
	
	public WebElement getTradeClaim() {
		return TradeClaim;
	}

	@FindBy(xpath="//button[contains(text(), 'Claim')]")
	WebElement TradeClaim;
	
	@FindBy(xpath="//select[@id=\"lot_product_id\"]")
	WebElement lotProdcutID;


	public WebElement getLotProdcutID() {
		return lotProdcutID;
	}
	
	
	@FindBy(xpath="//textarea[@id=\"trade_remark\"]")
	WebElement claimRemark;


	public WebElement getClaimRemark() {
		return claimRemark;
	}
	
	@FindBy(xpath="//button[@class=\"btn btn-primary theme-button ml-2 trade-remark-btn\"]")
	WebElement ClaimYesButton;


	public WebElement getClaimYesButton() {
		return ClaimYesButton;
	}
	
	public WebElement getActionDropdownButton() {
		return actionDropdownButton;
	}
	
	@FindBy(xpath="//button[@class=\"mb-menu custom-dropdown-btn\"]")
	WebElement actionDropdownButton;
	
	@FindBy(xpath="(//*[local-name()='svg'])[13]")
	WebElement claimRegisterInAction;


	public WebElement getClaimRegisterInAction() {
		return claimRegisterInAction;
	}
	
	
	@FindBy(xpath="//textarea[@id=\"claim_reason\"]")
	WebElement claimReason;


	public WebElement getClaimReason() {
		return claimReason;
	}
	

	public WebElement getClaimReviewSendButton() {
		return claimReviewSendButton;
	}

	@FindBy(xpath="//button[@class=\"btn btn-primary theme-button\"]")
	WebElement claimReviewSendButton;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement claimDetailsNextButton;


	public WebElement getClaimDetailsNextButton() {
		return claimDetailsNextButton;
	}
	
	
	public WebElement getClaimMangement() {
		return claimMangement;
	}

	@FindBy(xpath="(//a[@id=\"nav_link_trade\"])[3]")
	WebElement claimMangement;
	
	
	@FindBy(xpath="(//a[@class=\"nav-link\"])[11]")
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
	
	@FindBy(xpath="//*[@class='previewTotalCollapseRow collapse show']/div/div/table/tbody/tr/td[6]/div/div/a")
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
	
	@FindBy(xpath="//button[text()='Approve/Reject']")
	WebElement approveInclaimSettlement;


	public WebElement getApproveInclaimSettlement() {
		return approveInclaimSettlement;
	}
	
	@FindBy(xpath="//textarea[@id=\"approve_remark\"]")
	WebElement claimSettlementRemarks;


	public WebElement getClaimSettlementRemarks() {
		return claimSettlementRemarks;
	}
	
	
	public WebElement getConfirmButtonClaimSettlement() {
		return confirmButtonClaimSettlement;
	}

	@FindBy(xpath="//button[text()='Confirm']")
	WebElement confirmButtonClaimSettlement;
	
	
	public WebElement getTradePage() {
		return tradePage;
	}

	@FindBy(xpath="//p[text()='Trades']")
	WebElement tradePage;
	
	public WebElement getTradeId() {
		return tradeId;
	}
	
	
	@FindBy(xpath="//*[@id=\"example2\"]/tbody/tr[1]/td[1]/span/u/a")
	WebElement tradeId;
	
	@FindBy(xpath = "//a[@href='https://stage.agroworlds.com/trades/cancellation']")
	WebElement cancellationListInTrade;


	public WebElement getCancellationListInTrade() {
		return cancellationListInTrade;
	}

	public WebElement getCancelStatusInTradeCancellationList() {
		return cancelStatusInTradeCancellationList;
	}

	@FindBy(xpath="//*[@id=\"example2\"]/tbody/tr[1]/td[1]/small")
	WebElement cancelStatusInTradeCancellationList;
	
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
