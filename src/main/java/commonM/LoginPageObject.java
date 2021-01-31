package commonM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	WebDriver driver;
	By email = By.id("user_email");
	By password = By.id("user_password");
	By loginButton = By.name("commit");
	By invalidLoginAlert = By.xpath("//div[text()='alert alert-danger']");

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}
}
