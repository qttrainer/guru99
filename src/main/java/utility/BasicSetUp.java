package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSetUp {
	public Properties properties;
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\BOSS\\Desktop\\workspace\\slenium930Pm\\guru99_repo\\guru99\\src\\main\\resources\\data.properties");
		properties = new Properties();
		properties.load(fis);
		String testbrowser = properties.getProperty("browser");
		if(testbrowser.equalsIgnoreCase("chrome"))
		{
		//	WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\executables\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		else if(testbrowser.equalsIgnoreCase("firefox"))
		{
			
		}
		else if(testbrowser.equalsIgnoreCase("ie"))
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.manage().window().maximize();
		driver.get(properties.getProperty("url"));
		return driver;
	}

	
	public String getScreenShot(String testcaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\reports\\"+testcaseName+ ".png";
		FileUtils.copyFile(source, new File(destination));
		return destination;
	}
}
