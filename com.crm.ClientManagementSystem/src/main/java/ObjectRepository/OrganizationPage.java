package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.ClientManagementSystem.GenericLibrary.SeleniumUtility;

public class OrganizationPage {
	//declaration
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement Plusicon;
	
	@FindBy(name="accountname")
	private WebElement orgname;
	
	@FindBy(id="email1")
	private WebElement email;
	
	@FindBy(name="industry")
	private WebElement industrysropdown;
	
	@FindBy(name="accounttype")
	private WebElement typedrop;
	
	@FindBy(name="assigntype")
	private WebElement radiogroup;
	
	@FindBy(name="bill_street")
	private WebElement billaddress;
	
	@FindBy(name="ship_street")
	private WebElement shipaddress;
	
	@FindBy(id="bill_city")
	private WebElement billcity;
	
	@FindBy(id="ship_city")
	private WebElement shipcity;
	
	@FindBy(name="bill_state")
	private WebElement billstate;
	
	@FindBy(name="ship_state")
	private WebElement shipstate;
	

	@FindBy(id="bill_country")
	private WebElement billcountry;
	
	
	@FindBy(id="ship_country")
	private WebElement shipcountry;
	
	@FindBy(name="button")
	private WebElement savebtn;
	
	@FindBy(name="description")
	private WebElement desp;
	
	
	
	
	
	 
	//initialization
	
	
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//utilisation
	
	public WebElement getPlusicon() {
		return Plusicon;
	}


	public WebElement getOrgname() {
		return orgname;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getIndustrysropdown() {
		return industrysropdown;
	}


	public WebElement getTypedrop() {
		return typedrop;
	}


	public WebElement getRadiogroup() {
		return radiogroup;
	}


	public WebElement getBilladdress() {
		return billaddress;
	}


	public WebElement getShipaddress() {
		return shipaddress;
	}


	public WebElement getBillcity() {
		return billcity;
	}


	public WebElement getShipcity() {
		return shipcity;
	}


	


	public WebElement getBillstate() {
		return billstate;
	}


	public WebElement getShipstate() {
		return shipstate;
	}


	public WebElement getBillcountry() {
		return billcountry;
	}


	public WebElement getShipcountry() {
		return shipcountry;
	}


	public WebElement getDesp() {
		return desp;
	}


	public WebElement getSavebtn() {
		return savebtn;
	}
	
	


	//business logic
	public void createorganization(WebDriver driver,String orgname,String text,String Email,String billaddress,String shipaddress,String billcity,String shipcity,String billstate,String shipstate,String billcountry,String shipcountry,String desp) {
		OrganizationPage op= new OrganizationPage(driver);
		op.getOrgname().sendKeys(orgname);
		op.getEmail().sendKeys(Email);
		WebElement address = op.getIndustrysropdown();
		SeleniumUtility s = new SeleniumUtility();
		s.handledropdownByVisibleText(address, text);
		 op.getBilladdress().sendKeys(billaddress);
		 op.getShipaddress().sendKeys(shipaddress); 
		 op.getBillcity().sendKeys(billcity);
		 op.getShipcity().sendKeys(shipcity);
		 op.getBillstate().sendKeys(billstate);
		 op.getShipstate().sendKeys(shipstate);
		 op.getBillcountry().sendKeys(billcountry);
		 op.getShipcountry().sendKeys(shipcountry);
		 op.getDesp().sendKeys(desp);
		 op.getSavebtn().click();		
	}
		
	}

