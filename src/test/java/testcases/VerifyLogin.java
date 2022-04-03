package testcases;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPagePOM;
import Resources.BaseClass;
import Resources.Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPagePOM;
import Resources.BaseClass;

public class VerifyLogin extends BaseClass{  //Inheritance
	
	@Test(dataProvider="demo")
	public void enterCredentials(String username, String password){
		
		LoginPagePOM obj = new LoginPagePOM (driver);
		obj.EnterUSername().sendKeys(username);
		obj.EnterPassword().sendKeys(password);
		obj.clickLogin().click();
		obj.TryforFree().click();
		
	}
	@DataProvider
	public Object[][] demo(){
		
		Object[][] data = new Object[2][2];
		
		//correct username and password
		data[0][0] = Constants.username1;
		data[0][1] = Constants.password1;
		data[1][0] = Constants.username2;
		data[1][1] = Constants.password2;
		//incorrect username and password
		return data;
	}
}


	
	

		
		
		
	
		
		
	

