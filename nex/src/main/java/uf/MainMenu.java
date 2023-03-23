package uf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenu {
	
	@FindBy(id="ctlMenu_Menu1-menuItem001")
	WebElement New;
	
	@FindBy (id="ctlMenu_Menu1-menuItem002")
	WebElement Search;
	
	@FindBy(id = "ctlMenu_Menu1-menuItem005")
	WebElement Import;
	
	public MainMenu(WebDriver d) {

		PageFactory.initElements(d, this);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement NewMenu()
	{
		return New;
	}
	
	
	public WebElement SearchMenu()
	{
		return Search;
	}
	
	public WebElement ImportMenu()
	{
		return Import;
	}


}
