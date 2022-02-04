package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	WebDriver driver;
	String URL= "https://www.saucedemo.com/";
	By username = By.id("user-name");
    By userpass = By.id("password");
    By login = By.id("login-button");
    
}
