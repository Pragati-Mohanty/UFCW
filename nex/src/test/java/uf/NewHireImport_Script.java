package uf;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import login.LoginCred;
import resources.Base;
import resources.GenericMethods;

public class NewHireImport_Script extends Base {
	
	@BeforeTest
	public void loginpage() throws IOException {

		
	

		d = initializeDriver();
		d.get(prop.getProperty("url"));
		LoginCred s = new LoginCred(d);
		s.username().sendKeys("MANISH@VELARIUM.COM");
		s.password().sendKeys("N3xtw0rld");
		s.signinbtn().click();
	}
	
	@Test
	public void NewHireImport() throws InterruptedException, IOException 
	{
		
		MainMenu mm = new MainMenu(d);
		mm.ImportMenu().click();
		Newhireimport nhi = new Newhireimport(d);
		nhi.importnewhire().click();
		
//		nhi.NHupload().click();;
		GenericMethods gm= new GenericMethods();
		gm.hover(nhi.NHupload());
		Thread.sleep(3000);;
//		
		Runtime.getRuntime().exec("C:\\Users\\dell\\Documents\\demo\\newhire.exe");

}
	
//	@AfterTest
//	public void close()
//	{
//		d.quit();
//	}

	}
