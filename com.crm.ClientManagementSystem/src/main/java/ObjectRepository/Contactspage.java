package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.ClientManagementSystem.GenericLibrary.SeleniumUtility;

public class Contactspage {
	//declaration
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement plusicon;
	@FindBy(name="salutationtype")
	private WebElement firstnamedrop;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(name="account_name")
	private WebElement organizationname;
	
	
	@FindBy(id="email")
	private WebElement Email;
	
	@FindBy(id ="mailingcity")
	private WebElement mailingcity;
	@FindBy(id="othercity")
	private WebElement othercity;
	
	@FindBy(id ="mailingstate")
	private WebElement mailingstate;
	
	
	@FindBy(id="otherstate")
	private WebElement otherstate;
	
	@FindBy(id ="mailingcountry")
	private WebElement  mailingcountry;
	
	@FindBy(id ="othercountry")
	private WebElement othercountry;
	
	@FindBy(name="description")
	private WebElement description;
	
	@FindBy(name="button")
	private WebElement savebotton;
	
	
	//initialization
	

	public Contactspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	

	
	
	public WebElement getFirstnamedrop() {
		return firstnamedrop;
	}


	public WebElement getPlusicon() {
		return plusicon;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getOrganizationname() {
		return organizationname;
	}


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getMailingcity() {
		return mailingcity;
	}


	public WebElement getOthercity() {
		return othercity;
	}


	public WebElement getMailingstate() {
		return mailingstate;
	}


	public WebElement getOtherstate() {
		return otherstate;
	}


	public WebElement getMailingcountry() {
		return mailingcountry;
	}


	public WebElement getOthercountry() {
		return othercountry;
	}


	public WebElement getDescription() {
		return description;
	}


	public WebElement getSavebotton() {
		return savebotton;
	}
	//business logic
public void createcontacts(WebDriver driver, String text,String lastname,String organizationname,String email,String mailingcity,String othercity,String mailingstate,String otherstate,String mailingcountry,String othercountry,String Desp) {
		
		Contactspage cp= new Contactspage(driver);
		WebElement firstname= cp.getFirstnamedrop();
		SeleniumUtility s = new SeleniumUtility();
		s.handledropdownByVisibleText(firstname, text);
		cp.getLastname().sendKeys(lastname);
		cp.getOrganizationname().sendKeys(organizationname);	
		cp.getEmail().sendKeys(email);
		cp.getMailingcity().sendKeys(mailingcity);
		cp.getOthercity().sendKeys(othercity);
		cp.getMailingstate().sendKeys(mailingstate);
		cp.getOtherstate().sendKeys(otherstate);
		cp.getMailingcountry().sendKeys(mailingcountry);
		cp.getOthercountry().sendKeys(othercountry);
		cp.getDescription().sendKeys(Desp);
		cp.getSavebotton().click();
}


	
}

