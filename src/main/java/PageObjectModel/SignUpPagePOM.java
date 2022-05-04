package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPagePOM {
	public WebDriver driver;
	
	private By Firstname = By.xpath("//input[@name='UserFirstName']");// By is used to store locator.
	private By Lastname = By.xpath("//input[@name='UserLastName']");
	private By WorkEmail = By.xpath("//input[@name='UserEmail']");
	private By JobTitle = By.xpath("//input[@name='UserTitle']");
	private By Company = By.xpath("//input[@name='CompanyName']");
	private By Employees = By.xpath("//select[@name='CompanyEmployees']");
	private By Phone = By.xpath("//input[@name='UserPhone']");
	private By Country = By.xpath("//select[@name='CompanyCountry']");
    private By checkbox = By.xpath("//div[@class='checkbox-ui']");
	private By TryforFree = By.xpath("//a[@id='signup_link']");
	
	
	public SignUpPagePOM(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement EnterFirstname() {
		// TODO Auto-generated method stub
		return driver.findElement(Firstname);
	}

	public WebElement EnterLastname() {
		return driver.findElement(Lastname);
	}

	public WebElement WorkEmail() {
		return driver.findElement(WorkEmail);
	}

	public WebElement JobTitle() {
		return driver.findElement(JobTitle);
	}

	public WebElement Company() {
		return driver.findElement(Company);
	}

	public WebElement Employees() {
		return driver.findElement(Employees);
	}

	public WebElement Phone() {
		return driver.findElement(Phone);
	}

	public WebElement Country() {
		return driver.findElement(Country);
	}
	public WebElement checkbox() {
		return driver.findElement(checkbox);
	}
	public WebElement clicksignup() {
		return driver.findElement(TryforFree);
	}
	
	

}

	