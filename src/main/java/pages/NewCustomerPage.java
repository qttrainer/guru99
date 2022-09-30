package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
	WebDriver driver;
	public NewCustomerPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(name = "name")
	WebElement name;
	
	public void enterName(String name)
	{
		this.name.sendKeys(name);
	}

}
