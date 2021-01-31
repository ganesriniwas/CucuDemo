package UseCases;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.Test;
import commonM.Base;
import commonM.HomePageObject;
import commonM.LoginPageObject;

public class Login extends Base {
	WebDriver driver;
	Properties prop;
	String methodName;
	public static final Logger lg = LogManager.getLogger(Login.class.getClass());
	@Test
	public void loginPage() throws IOException {
		driver = initialize();
		lg.trace("Driver initiazalized");
		driver.get(readProp().getProperty("url"));
		lg.trace("URL invoked");
		Assert.assertEquals("QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy",
				driver.getTitle());
		lg.trace("Successfully reached Home Page");
		methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
		getScreenshotCopy(methodName);
		//added by user Y
		System.out.println("user Y");
	}
	@Test
	public void login(String email, String password) throws IOException {
		HomePageObject hpo = new HomePageObject(driver);
		hpo.getLogin().click();
		lg.trace("Login clicked");
		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.getEmail().sendKeys(email);
		lpo.getPassword().sendKeys(password);
		lg.trace("email and password entered");
		lpo.getLoginButton().click();
		lg.trace("Clicked on Login button");
		methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
		getScreenshotCopy(methodName);
	}
}
