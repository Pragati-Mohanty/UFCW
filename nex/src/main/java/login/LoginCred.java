package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCred {
	
	public static WebDriver d;

	@FindBy(id = "NewIndex_txtuser_id")
	WebElement username;

	@FindBy(id = "NewIndex_txtpassword")
	WebElement password;

	@FindBy(id = "NewIndex_btn_Button")
	WebElement signinbtn;

	public LoginCred(WebDriver d) {

		PageFactory.initElements(d, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement username() {
		return username;
	}

	public WebElement password() {
		return password;
	}

	public WebElement signinbtn() {
		return signinbtn;
	}

}
