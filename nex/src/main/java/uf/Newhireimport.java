package uf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newhireimport {
	
	@FindBy(id = "ctlMenu_Menu1-menuItem005-subMenu-menuItem002")
	WebElement ImportNewHire;
	
	@FindBy(id="ctl19_uplFile")
	WebElement NHupload;
	
	public Newhireimport(WebDriver d) {

		PageFactory.initElements(d, this);
		// TODO Auto-generated constructor stub
	}
	
	
	public WebElement importnewhire()
	{
	return ImportNewHire;
	}
	
	public WebElement NHupload()
	{
	return NHupload;
	}


}
