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


public class ValidateTile extends base{
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());

	Landinpage l;
	@BeforeTest
	public void initialize() throws IOException, InterruptedException {
		driver=	initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
	}
	@Test
	public void basePageNavigation() throws IOException, InterruptedException
	{
	

	//driver.get(prop.getProperty("url"));
		
       l=new Landinpage(driver);//we can get method by inheritance or creating object
		Assert.assertEquals(l.gettext().getText(),"FEATURED COURSES");
//Assert.assertEquals(l.getlongtext().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		log.info("validated text successfully");
		}
	public void validateheader()
	
	{
		//we can get method by inheritance or creating object
	
Assert.assertEquals(l.getlongtext().getText(),"AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		log.info("validated text successfully");}
	
	@AfterTest
	public void Teardown()
	{
	driver.close();
	}
		}

