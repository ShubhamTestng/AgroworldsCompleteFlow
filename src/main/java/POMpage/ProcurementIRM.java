package POMpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcurementIRM {
	
public WebDriver ProcIRMdriver;
	
	
	public ProcurementIRM(WebDriver ProcIRMdriver) {
		
		this.ProcIRMdriver = ProcIRMdriver;
		
        PageFactory.initElements(ProcIRMdriver, this);

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
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div/div/div[2]/a")
	WebElement tradeManagementModule;
	
	public WebElement getTradeManagementModule() {
		return tradeManagementModule;
	}

	public WebElement getTradeManagementDropdown() {
		return tradeManagementDropdown;
	}

	public WebElement getTrade() {
		return trade;
	}

	public WebElement getTradeId() {
		return tradeId;
	}

	public WebElement getProcIRMtradeApproveButton() {
		return procIRMtradeApproveButton;
	}

	public WebElement getOperatorReviewDropdown() {
		return operatorReviewDropdown;
	}

	public WebElement getOperatorName() {
		return operatorName;
	}

	public WebElement getOperatorApproveButton() {
		return operatorApproveButton;
	}

	@FindBy(xpath="//*[@id='nav_link_trade']")
	WebElement tradeManagementDropdown;
	////*[@id="nav_link_trade"]

	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/ul/li[1]/a")
	WebElement trade;
	
	@FindBy(xpath="//*[@id=\"example2\"]/tbody/tr[1]/td[1]/span/u/a")
	WebElement tradeId;
	///html/body/div[3]/div[2]/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/span/u/a
	@FindBy(xpath="//button[@id=\"approve-send-operator-button\"]")
	WebElement procIRMtradeApproveButton;
	
	///html/body/div[3]/div[2]/div[1]/div/div/div/button
	
	@FindBy(xpath="//span[@class=\"select2-selection select2-selection--single\"]")
	WebElement operatorReviewDropdown;
	///html/body/div[3]/div[2]/div[3]/div/div/div/div[2]/span/span[1]/span/span[2]
	
	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	WebElement operatorName;
	////*[@id="select2-operation_irm_id-result-3mj4-246"]
	
	@FindBy(xpath = "//button[@id=\"approve_trade\"]")
	WebElement operatorApproveButton;
	
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
	
	@FindBy(xpath = "//a[@href='https://stage.agroworlds.com/trades/cancellation']") // "(//a[@class=\"nav-link active\"])[2]"
	WebElement cancellationListInTrade;


	public WebElement getCancellationListInTrade() {
		return cancellationListInTrade;
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
