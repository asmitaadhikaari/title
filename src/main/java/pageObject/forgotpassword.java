package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgotpassword {
	public WebDriver driver;
	
	By forgotpassword = By.cssSelector("a[class='link-below-button']");
	 By sendmeinstruction = By.cssSelector("[type='submit']");
	 public forgotpassword(WebDriver driver) {
			// TODO Auto-generated constructor stu[
		this.driver=driver;
		}
	 
	 public  WebElement getforgotpassword()
		{
			return driver.findElement(forgotpassword);
			
		}
		public  WebElement sendmeinstruction()
		{
			return driver.findElement(sendmeinstruction);
}
}