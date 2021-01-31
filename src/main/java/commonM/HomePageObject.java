package commonM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	WebDriver driver;
	By login = By.xpath("//a[@href='https://rahulshettyacademy.com/sign_in/']");

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}
}
