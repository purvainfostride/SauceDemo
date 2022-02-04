package pages;

import org.openqa.selenium.By;

public class LoginPage extends Launch {
	
	By username = By.id("user-name");
    By userpass = By.id("password");
    By login = By.id("login-button");
    
	public void enterUserName() {
		driver.findElement(username).sendKeys("standard_user");;
		}
    public void enterUserPass() {
		driver.findElement(userpass).sendKeys("secret_sauce");
		}
	public void login() {
		driver.findElement(login).click();
	}

}
