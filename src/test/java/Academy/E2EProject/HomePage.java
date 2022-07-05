package Academy.E2EProject;

import java.io.IOException;
//import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pageObject.Landinpage;
import pageObject.Loginpage;
import pageObject.forgotpassword;
//import pageObject.Loginpage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException, InterruptedException {
		driver=	initializeDriver();
		//driver.get(prop.getProperty("browser"));
		driver.get("http://www.qaclickacademy.com/");
	}

@Test(dataProvider="getData")
public void basePageNavigation(String username,String password,String text) throws IOException, InterruptedException
{
driver=	initializeDriver();
log.info(text);
//driver.get(prop.getProperty("url"));
driver.get("http://www.qaclickacademy.com/");
//driver.get(prop.getProperty("browser"));
	Landinpage l=new Landinpage(driver);//we can get method by inheritance or creating object
	Loginpage lo=new Loginpage(driver);
	forgotpassword fp=new forgotpassword(driver);
	//l.closepopup().click();
	l.getlogin().click();
	lo.login().click();
	
	lo.emailin().sendKeys(username);
	lo.passwordin().sendKeys(password);
	//System.out.println(text);
	log.info(text);
	lo.login().click();
	fp.getforgotpassword().click();
	lo.emailin().sendKeys("asmita");
	fp.sendmeinstruction().click();
}
@DataProvider
	
	public Object[][] getData()
			{
		Object[][] data= new Object[2][3];
		data[0][0]="non restricted";
		data[0][1]="1233333";
		data[0][2]="restricted username";
		data[1][0]="resctriced";
		data[1][1]="1234";
		data[1][2]="non resctriced username";
		
			return data;
			}

@AfterTest
public void Teardown()
{
driver.close();
}
		
				
			}
		

	



	

