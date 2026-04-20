package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//declaration	
	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement profile;
	@FindBy(linkText ="Sign Out")
	private WebElement signoutlink;
	@FindBy(linkText="Calendar")
	   private WebElement calenderlink;
	@FindBy(xpath="//a[text()='Leads']/parent::td[@class='tabUnSelected']")
	private WebElement leadslink;
	@FindBy(xpath="//a[text()='Organizations']/parent::td[@class='tabUnSelected']")
	private WebElement Orgelement;
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactelement;
	@FindBy(xpath="//a[text()='Opportunities']/parent::td[@class='tabSelected']")
	private WebElement opportuniteselement;
	@FindBy(xpath="//a[text()='Products']/parent::td[@class='tabUnSelected']")
	private WebElement Productselement;
	@FindBy(xpath="//a[text()='Documents']/parent::td[@class='tabUnSelected']")
	private WebElement Documentselement;
	@FindBy(xpath="//a[text()='Email']/parent::td[@class='tabUnSelected']")
	private WebElement Emailelement;
	@FindBy(xpath="//a[text()='Trouble Tickets']/parent::td[@class='tabUnSelected']")
	private WebElement Trobleticketselement;
	@FindBy(xpath="//a[text()='Dashboard']/parent::td[@class='tabUnSelected']")
	private WebElement Dashboardelement;		
	
	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}

	public WebElement getCalenderlink() {
		return calenderlink;
	}

	public WebElement getLeadslink() {
		return leadslink;
	}

	public WebElement getOrgelement() {
		return Orgelement;
	}

	public WebElement getContactelement() {
		return contactelement;
	}

	public WebElement getOpportuniteselement() {
		return opportuniteselement;
	}

	public WebElement getProductselement() {
		return Productselement;
	}

	public WebElement getDocumentselement() {
		return Documentselement;
	}

	public WebElement getEmailelement() {
		return Emailelement;
	}

	public WebElement getTrobleticketselement() {
		return Trobleticketselement;
	}

	public WebElement getDashboardelement() {
		return Dashboardelement;
	}

	
}
