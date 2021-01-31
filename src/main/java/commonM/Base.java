package commonM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;
	Properties prop;

	public WebDriver initialize() throws IOException {
		System.setProperty("webdriver.chrome.driver", readProp().getProperty("chromedriverpath"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}

	public Properties readProp() throws IOException {
		File f = new File("C:\\Users\\ganes\\eclipse-workspace\\CucDemo\\src\\main\\java\\testing.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
	}
	public void getScreenshotCopy(String name) throws WebDriverException, IOException {
		File f = new File ("C:\\Users\\ganes\\eclipse-workspace\\CucDemo\\report\\screenprints\\"+name+".jpg");
		//((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), f);
	}
}
