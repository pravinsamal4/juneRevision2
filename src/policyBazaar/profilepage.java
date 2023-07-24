package policyBazaar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profilepage {
	@FindBy(xpath = "//div[@class=\"textCapitalize sc-ckVGcZ kWpXlQ\"]")private WebElement username;
	@FindBy(xpath = "//div[@title=\"Logout\"]")private WebElement logout;
	
	public profilepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void validateusername() {
		String actualUN=username.getText();
		String expUN="Rajashri Kadam";
		if(expUN.equals(actualUN)) {
			System.out.println("actual is matched with expected ");
		}
		else {
			System.out.println("not ma6ched");
		}
		
	}
	public void clickonlogout() {
		logout.click();
	}

}
