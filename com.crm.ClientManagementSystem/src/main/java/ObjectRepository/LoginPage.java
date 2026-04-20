package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(name  ="user_name")
private WebElement Untbx;
	
	
	
	@FindBy(name="user_password")
	private WebElement Pwtbx;
	@FindBy(id="submitButton")
	private WebElement Lgbtn;
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getUntbx() {
		return Untbx;
	}

	public WebElement getPwtbx() {
		return Pwtbx;
	}

	public WebElement getLgbtn() {
		return Lgbtn;
	}

	//business logic
	public void logintocms(WebDriver driver,String username,String pw) {
		LoginPage lp = new LoginPage(driver);
		lp.getUntbx().sendKeys(username);
		lp.getPwtbx().sendKeys(pw);
		lp.getLgbtn().click();
	
	
	}
}
