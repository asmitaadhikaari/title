package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

public WebDriver driver;
	
//	ChromeOptions options=new  ChromeOptions();
//	options.addArguments("--disabled-notifications");

	By email=By.id("user_email");
	 By password = By.id("user_password");
	 By login = By.cssSelector("[type='submit']");
	 

	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stu[
	this.driver=driver;
	}
	
	public WebElement emailin()
	{
		return driver.findElement(email);
		
	}
	public  WebElement passwordin()
	{
		return driver.findElement(password);
	}
	public  WebElement login()
	{
		return driver.findElement(login);
	}
	
		
	}
	

