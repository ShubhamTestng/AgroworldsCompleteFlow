package POMpage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BDM {
	
	public WebDriver BDMdriver;
	
	public BDM(WebDriver BDMdriver) {
		
		this.BDMdriver=BDMdriver;
		PageFactory.initElements(BDMdriver, this);
	}

	@FindBy(xpath="//input[@type=\"email\"]")
	WebElement Email;
	
	
	@FindBy(xpath="//select[@name=\"countrycode\"]")
	WebElement Country;
	
	@FindBy(xpath="//input[@name=\"phone\"]")
	WebElement phone;
	
	@FindBy(xpath="//button[text()='Verify']")
	WebElement verifyLogin;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement OTP;
	
	@FindBy(xpath="//button[@id=\"verify\"]")
	WebElement OTPverify;
	
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

	@FindBy(xpath ="//*[@id=\"mail\"]/div/div/div/table/tbody/tr[2]/td/div/div/p[2]/b")
	WebElement SellerOTP;
	
	@FindBy(xpath="//*[@id=\"mail\"]/div/div/div/table/tbody/tr[2]/td/div/p/b")
	WebElement cancellationSellerOTP;
	
	@FindBy(xpath= "//*[@id=\"password\"]")
	WebElement SellerOTPpassword;
	
	public WebElement getCancellationSellerOTP() {
		return cancellationSellerOTP;
	}

	public WebElement getCancellationReviewTrade() {
		return cancellationReviewTrade;
	}

	@FindBy(xpath="//*[@id=\"guest-login\"]/button")
	WebElement SellerAccessButton;
	
	@FindBy(xpath="//*[@id=\"submit_for_approval\"]")
	WebElement SellerApproval;
	
	@FindBy(xpath="//*[@id=\"clearbut\"]/a/i")
	WebElement CloseButton;
	
	@FindBy(xpath= "//*[@id=\"webmail\"]/div[1]/div/header/div/nav/div[2]/a[1]")
	WebElement Homebutton;
	
	public WebElement getHomebutton() {
		return Homebutton;
	}

	public WebElement getCloseButton() {
		return CloseButton;
	}

	public WebElement getSellerApproval() {
		return SellerApproval;
	}

	public WebElement getSellerAccessButton() {
		return SellerAccessButton;
	}

	public WebElement getSellerOTPpassword() {
		return SellerOTPpassword;
	}

	public WebElement getSellerOTP() {
		return SellerOTP;
	}

	@FindBy(xpath="//a[@id=\"nav_link_trade\"]/p[text()='Trade Management ']")
	WebElement tradeManagementDropdown;
	

	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/ul/li[1]/a")
	WebElement trade;
	
	@FindBy(xpath="//*[@id='example2']/tbody/tr[1]/td[1]/span/u/a")
	WebElement tradeId;
	
	@FindBy(xpath="//*[@id=\"submit_for_approval\"]")
	WebElement BDMtradeApproveButton;
	
	@FindBy(xpath="//*[@id=\"example2\"]/tbody/tr[2]/td[1]/span/u/a[text()='OS/B/01/2024/0709']/following::*[2]")
	WebElement underBuyerReview;

	public WebElement getTradeManagementDropdown() {
		return tradeManagementDropdown;
	}

	public WebElement getTrade() {
		return trade;
	}

	public WebElement getTradeId() {
		return tradeId;
	}

	
	public WebElement getUnderBuyerReview() {
		return underBuyerReview;
	}
	
	public WebElement getBDMtradeApproveButton() {
		return BDMtradeApproveButton;
	}

	
	@FindBy(xpath = "//*[@id=\"login\"]")
	WebElement yopmailLogin;


	public WebElement getYopmailLogin() {
	    //baseClass.synchronised(By.xpath("//*[@id=\"login\"]"), yopmailLogin);
		return yopmailLogin;
	}
	
	
	public WebElement getReviewtradeseller() {
	    //baseClass.synchronised(By.xpath("//*[@id='mail']/div/div/div/table/tbody/tr[2]/td/div/div/a"), reviewtradeseller);
		return reviewtradeseller;
	}

	@FindBy(xpath="//*[@id='mail']/div/div/div/table/tbody/tr[2]/td/div/div/a")
	WebElement reviewtradeseller;
	
	@FindBy(xpath="//*[@id='mail']/div/div/div/table/tbody/tr[2]/td/div/b/a")
	WebElement cancellationReviewTrade;
	
	public WebElement getAddendumRaiseReason() {
		return addendumRaiseReason;
	}

	public WebElement getActionButtonINTradeList() {
		return actionButtonINTradeList;
	}

	public WebElement getSearchInTradeList() {
		return searchInTradeList;
	}

	public WebElement getYesButtonAddendum() {
		return yesButtonAddendum;
	}

	@FindBy(xpath="//textarea[@id=\"raise_reason\"]")
	WebElement addendumRaiseReason;
	
	@FindBy(xpath="//button[@id=\"dropdownContractButton\"]")
	WebElement actionButtonINTradeList;
	
	@FindBy(xpath="//input[@id=\"search-id\"]")
	WebElement searchInTradeList;
	
	@FindBy(xpath="//button[text()='Yes']")
	WebElement yesButtonAddendum;
	
	public WebElement getSellerID() {
		return sellerID;
	}

	@FindBy(xpath="//*[@id=\"example2\"]/tbody/tr[1]/td[2]/span/u/a")
	WebElement sellerID;
	
	@FindBy(xpath="//li[@class=\"nav-item dropdown notification-dropdown\"]//a[@class=\"nav-link\"]")
	WebElement notificationButton;
 
	public WebElement getNotificationButton() {
		return notificationButton;
	}

	
	@FindBy(xpath = "//a[@href='https://stage.agroworlds.com/trades/cancellation']") // "(//a[@class=\"nav-link active\"])[2]"
	WebElement cancellationListInTrade;


	public WebElement getCancellationListInTrade() {
		return cancellationListInTrade;
	}

	public WebElement getTradeDropdown() {
		return tradeDropdown;
	}
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a/p/i")
	WebElement tradeDropdown;
	
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
	
	@FindBy(xpath="//button[contains(text(),'Approve Cancellation')]")
	WebElement cancellationSellerApprove;

	public WebElement getCancellationSellerApprove() {
		return cancellationSellerApprove;
	}
	
	@FindBy(xpath = "(//textarea[@id='cancel_remark'])[1]")
	WebElement cancelApproveSellerandBuyer;

	public WebElement getCancelApproveSellerandBuyer() {
		return cancelApproveSellerandBuyer;
	}
	
	public WebElement getYesButtonCancelSellerAndBuyer() {
		return yesButtonCancelSellerAndBuyer;
	}

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement yesButtonCancelSellerAndBuyer;
}



   
	
	

