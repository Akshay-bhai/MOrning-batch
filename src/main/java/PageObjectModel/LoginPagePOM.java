package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPagePOM {
	public WebDriver driver;  ///curently this does not have scope
	//Encapsulation
	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By login = By.xpath("//input[@id='Login']");
	private By TryforFree = By.xpath("//a[@id='signup_link']");
  //driver2 took the scope from verifyLoginPage

    public LoginPagePOM(WebDriver driver2) {
    	
		this.driver=driver2;
	}
    
    
public WebElement EnterUSername() {
	
	return driver.findElement(username);
}

public WebElement EnterPassword() {
	
	
	return driver.findElement(password);
}
	
public WebElement clickLogin() {
	 return driver.findElement(login);
}
public WebElement TryforFree() {
	return driver.findElement(TryforFree);
}

	
}
