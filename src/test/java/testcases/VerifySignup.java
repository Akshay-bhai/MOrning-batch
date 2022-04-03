package testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.SignUpPagePOM;
import Resources.BaseClass;
import Resources.Constants;

public class VerifySignup extends BaseClass {

	
	
	@Test
	public void signup() throws InterruptedException {
		SignUpPagePOM obj1=new SignUpPagePOM(driver);
		//obj1.clicksignup().click();
	
		Thread.sleep(7000);
		obj1. EnterFirstname().sendKeys(Constants.Firstname);
		obj1.EnterLastname().sendKeys(Constants.lastname);
		obj1.WorkEmail().sendKeys(Constants.Email);
		obj1.JobTitle().click();
		Thread.sleep(3000);
		obj1.Company().sendKeys(Constants.Company);
		
		obj1.Employees().click();
		Select s1 = new Select(obj1.Employees());
		s1.selectByIndex(2);
		
		obj1.Phone().sendKeys(Constants.phone);
		obj1.Country().click();
		obj1.checkbox().click();;
		
		
	}
	@DataProvider
	public void demo() {
		
		
	}
	
	
	
	
	
	
}
