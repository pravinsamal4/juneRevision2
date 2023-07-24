package policyBazaar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
		//variable
	
	@FindBy(xpath = "//a[@class=\"sign-in\"]") private WebElement signINButton;
	@FindBy(xpath = "(//input[@type=\"number\"])[2]")private WebElement mobileNum;
	@FindBy(xpath = "(//span[text()='Sign in with Password'])[2]")private WebElement signInPass;
	@FindBy(xpath = "//input[@name=\"password\"]")private WebElement password;
	@FindBy(xpath = "//a[@id=\"login-in-with-password\"]")private WebElement signIn;
	@FindBy(xpath = "//div[text()='My Account']")private WebElement myaccount;
	@FindBy(xpath = "//span[text()=' My profile ']")private WebElement myprofile;
	
	
	
	//Constructor
	
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//methods
	
	public void clickonsignbutton() {
		signINButton.click();
		
	}
	
	public void enterNumber() {
		mobileNum.sendKeys("9623153925");
	}
	
	public void clickonpassword() {
		signInPass.click();
	}
	
	public void enterpassword() {
		password.sendKeys("raju@2811");
	}
	
	public void clickOnSignIn() {
		signIn.click(); 
		
	}
	
	public void clickmyAccount() {
		myaccount.click();
	}
	public void clickmyprofile() {
		myprofile.click();
	}
	
	}
