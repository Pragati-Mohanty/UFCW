package uf;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import login.LoginCred;
import resources.Base;
import resources.GenericMethods;

public class Home_Script extends Base {
	
	@BeforeTest
	public void loginpage() throws IOException {

		
	

		d = initializeDriver();
		d.get(prop.getProperty("url"));
		LoginCred s = new LoginCred(d);
		s.username().sendKeys("MANISH@VELARIUM.COM");
		s.password().sendKeys("N3xtw0rld");
		s.signinbtn().click();
		System.out.println("Tittle :" + d.getCurrentUrl());
	}

	@Test
	public void homeSearch() throws InterruptedException 
	{
		
		Home hp = new Home(d);
		hp.HomeFirstname().sendKeys("bo");
		hp.Homesearchbutton().click();
		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) d;
//		js.executeScript("window.scrollBy(0,250)", "");
		GenericMethods g = new GenericMethods();
		g.scroll(650);
	}
	
	
	@AfterTest
	public void close()
	{
		d.close();
	}

}
