package uf;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import login.LoginCred;
import resources.Base;
import resources.GenericMethods;

public class AddNewMember_test extends Base{
	
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
	public void Add_NewMember() throws InterruptedException 
	{
		
		MainMenu mm = new MainMenu(d);
		mm.NewMenu().click();
		NewMember nm = new NewMember(d);
		nm.NewMemberSubmenu().click();
		nm.NewMemberssn().sendKeys("372557775");
		Thread.sleep(5000);
		nm.MemberFirstName().sendKeys("oreo");
		GenericMethods gm = new GenericMethods();
        gm.selectByIndex(nm.MemberBillCode(), 4);
        Thread.sleep(3000);
        gm.selectByValue(nm.MemberEmployerCode(), "847");
        Thread.sleep(2000);
        nm.MemberDOB().sendKeys("12051994");
        nm.MemberDOB().sendKeys(Keys.TAB);
        nm.MemberHiredate().sendKeys("12202022");
        nm.MemberHiredate().sendKeys(Keys.TAB);
        Thread.sleep(2000);
        gm.selectByValue(nm.MemberJobclass(), "82");
        gm.scroll(450);
        gm.selectByIndex(nm.MemberPaymentType(), 2);
        gm.selectByValue(nm.InCode(), "371");
        Thread.sleep(2000);
        nm.InEffectiveDate().sendKeys("11152023");
        nm.InEffectiveDate().click();
        nm.MemberSaveButton().click();
        
	}

//	@Test
//	public void Add_NewMemberinvalid() throws InterruptedException 
//	{
//		
//		MainMenu mm = new MainMenu(d);
//		mm.NewMenu().click();
//		NewMember nm = new NewMember(d);
//		nm.NewMemberSubmenu().click();
//		nm.NewMemberssn().sendKeys("618-32-8645");
//		Thread.sleep(5000);
////		String existssn = nm.ssnexist().getText();
////		nm.MemberFirstName();
//		
//		if (nm.MemberFirstName().isSelected()) {
//			
//			System.out.println("correct ssn");
//			
//		}
//		else {
//			System.out.println(nm.ssnexist().getText());
//			
//		}
//		
			
	
//	
//	@AfterTest
//	public void close()
//	{
//		d.close();
//	}


}
