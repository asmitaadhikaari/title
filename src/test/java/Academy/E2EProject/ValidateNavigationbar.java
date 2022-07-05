package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.Landinpage;
import resources.base;



public class ValidateNavigationbar extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException, InterruptedException {
		driver=	initializeDriver();
		log.info("Driver is initialized");
		driver.get("http://www.qaclickacademy.com/");
		log.info("login to homepage");}
@Test
	public void basePageNavigation() throws IOException, InterruptedException
	{

		
		Landinpage l=new Landinpage(driver);//we can get method by inheritance or creating object
	Assert.assertTrue(l.getnavigationbar().isDisplayed());
	log.info("validated navigationbar successfully");
}
@AfterTest
public void Teardown()
{
driver.close();
}
}