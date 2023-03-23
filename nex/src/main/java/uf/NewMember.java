package uf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.GenericMethods;

public class NewMember {
	
	@FindBy(id="ctlMenu_Menu1-menuItem001-subMenu-menuItem000")
	WebElement NewMember;
	
	@FindBy(name = "ctl19$txtnewhiressn$txt")
	WebElement Memberssn;
	
	
	@FindBy(xpath = "//*[contains(text(),'SSN Already Exists With Other Member')]")
	
	WebElement ssnexist;
	
	@FindBy(id = "ctl19_txtFName_txt")
	WebElement MemberFirstName;
	
	@FindBy(id= "ctl19_txtLName_txt")
	WebElement MemberLastName;
	
	
	@FindBy(id = "ctl19_dtDOB_datepicker2")
	WebElement MemberBirthday;
	
	@FindBy(id= "ctl19_ddlBillingCode_ddlist")
	WebElement Billcode;
	
	
	@FindBy(id= "ctl19_ddlEmployerJob_ddlist")
	WebElement Employer;
	
	@FindBy (id= "ctl19_ddlEmployerClass_ddlist")
	WebElement MemberJobclass;
	
	@FindBy(id="ctl19_dtHireDate_datepicker2")
	WebElement MemHireddate;
	
	@FindBy(id= "ctl19_ddlPaymentType_ddlist") 
	WebElement MemberPaymentType;
	
	@FindBy(id= "ctl19_ddlInCode_ddlist")
	WebElement InCode;
	
	@FindBy(id="ctl19_dtEffectiveDate_datepicker2")
	WebElement InEffectiveDate;
	
	@FindBy(id="ctl19_btnSaveMember_Button")
	WebElement MemberSave;
	
	public NewMember(WebDriver d) {

		PageFactory.initElements(d, this);
		// TODO Auto-generated constructor stub
	}
	
	
	public WebElement NewMemberSubmenu()
	{
		
		return NewMember;
	}
	
	public WebElement NewMemberssn()
	{
		
		return Memberssn;
	}
	
	public WebElement ssnexist()
	{
		
		return ssnexist;
	}

	public WebElement MemberFirstName()
	{
		
		return MemberFirstName;
	}
	
	
	public WebElement MemberLastName()
	{
		return MemberLastName;
	}
	
	
	public WebElement MemberBillCode()
	{
	return Billcode;
	}
	
	public WebElement MemberEmployerCode()
	{
	return Employer;
	}
	
	
	
	public WebElement MemberDOB()
	{
	return MemberBirthday;
	}
	
	public WebElement MemberHiredate()
	{
	return MemHireddate;
	}
	
	
	public WebElement MemberJobclass()
	{
		return MemberJobclass;
	}
	
	public WebElement MemberPaymentType()
	
	{
		return MemberPaymentType;
	}
	
	public WebElement InCode()
	{
		return InCode;
	}
	
	public WebElement InEffectiveDate()
	{
		return InEffectiveDate;
	}
	
	public WebElement MemberSaveButton()
	{
		return MemberSave;
		
	}
}
