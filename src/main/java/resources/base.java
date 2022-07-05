package resources;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public static WebDriver driver;//if we use static then every test will share same driverbut if we have created local webdriver then there wont be the problem
	public Properties prop;
public  WebDriver initializeDriver() throws IOException, InterruptedException
{
	prop=new Properties();
	//System.getProperty("user.dir")
	FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
prop.load(fis);
//String browserN=System.getProperty("browser");
//mavn tsest -Dbrowser=chrome
String browserN=prop.getProperty("browser");

if(browserN.contains("chrome"))
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	if(browserN.contains("headless"))
	{
	options.addArguments("headless");}
	driver = new ChromeDriver(options);//options
	
	driver.get("http://www.qaclickacademy.com/");
	
}
else if(browserN.equals("firefox"))
{
	driver=new FirefoxDriver();
}
else if(browserN.equals("IE"))
{
}

//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

return driver;

}
public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot shot=(TakesScreenshot)driver;
	File source=shot.getScreenshotAs(OutputType.FILE);
	String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+"png";
	FileUtils.copyFile(source, new File(destinationFile));
	return destinationFile;
}
}


