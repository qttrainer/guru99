package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	//WebElement of Login page
	@FindBy(name  = "uid")
	WebElement userName;
	@FindBy(name  = "password")
	WebElement password;
	@FindBy(name  = "btnLogin")
	WebElement login;	
	@FindBy(name = "btnReset")
	WebElement reset;
	
	
	//Action possible on Login Page
	public void doLogin(String userName, String password)
	{
		this.userName.sendKeys(userName);
		this.password.sendKeys(password);
		login.click();	
	}
	
	public void doReset()
	{
		reset.click();	
	}
	
	

}
