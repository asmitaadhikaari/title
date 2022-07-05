package pageObject;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landinpage {
	public WebDriver driver;
	
//	ChromeOptions options=new  ChromeOptions();
//	options.addArguments("--disabled-notifications");
	
	// By popup= By.xpath("//button[text()='NO THANKS']/following::div[1]");
//By popup=By.xpath("//div[contains(@style,'box-shadow']");
	
	private By signin=By.cssSelector("a[href*='sign_in']");
	//By popup= By.xpath("//button[text()='NO THANKS']");
	private By text=By.xpath("//div[@class='text-center']/h2");
	private By longtext=By.cssSelector("div[class*='video-banner'] h3");
	 
	private  By navigationbar = By.cssSelector("nav[class='navbar-collapse collapse']");
	

	
	public Landinpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
}
	
	
	
	public  WebElement getlogin()
	{//System.out.println("trying to login");
		return driver.findElement(signin);
		
	}
	/*public  WebElement closepopup() 
	{
	
		return driver.findElement(popup);
	}
	
	
	//public getlogin(*/
	public  WebElement gettext()
	{//System.out.println("trying to login");
		return driver.findElement(text);
		
	}
	public  WebElement getlongtext()
	{//System.out.println("trying to login");
		return driver.findElement(longtext);
		
	}
	public  WebElement getnavigationbar()
	{
		return driver.findElement(navigationbar);
	}
}
