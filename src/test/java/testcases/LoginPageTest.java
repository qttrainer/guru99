package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.BasicSetUp;

public class LoginPageTest  extends BasicSetUp{
	
	@BeforeTest
	public void initalize()
	{
		try {
			driver = initializeDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void verifyLogin()
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin("username","password");
		
	}

}
