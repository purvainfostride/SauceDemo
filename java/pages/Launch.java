package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {
	WebDriver driver;
	String URL= "https://www.saucedemo.com/";

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}
	public void closeBrowser() {
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	driver.close();
	}
}
