package uf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	public static WebDriver d;

	@FindBy(id = "ctl19_Home_txtLName_txt")
	WebElement HomeLastname;

	@FindBy(id = "ctl19_Home_txtFName_txt")
	WebElement HomeFirstname;

	@FindBy(id = "ctl19_Home_txtFullssn_txt")
	WebElement Homefullssn;

	@FindBy(id = "ctl19_Home_btnSearch_Button")
	WebElement Homesearchbutton;

	public Home(WebDriver d) {

		PageFactory.initElements(d, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement HomeLastname() {
		return HomeLastname;
	}

	public WebElement HomeFirstname() {
		return HomeFirstname;
	}

	public WebElement signinbtn() {
		return Homefullssn;
	}

	public WebElement Homesearchbutton() {
		return Homesearchbutton;
	}

	
}
