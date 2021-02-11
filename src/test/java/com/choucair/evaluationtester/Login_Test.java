package com.choucair.evaluationtester;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("Sign in");
	By emailLocator = By.id("email");
	By passwordLocator = By.id("passwd");
	By submitLocator = By.name("SubmitLogin");
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void registerUser() throws InterruptedException {
		driver.findElement(registerLinkLocator).click();
		driver.findElement(emailLocator).sendKeys("luishoyos91@ingenieros.com");
		driver.findElement(passwordLocator).sendKeys("Luis1991$");
		driver.findElement(submitLocator).click();
		
		//fail("Not yet implemented");
	}

}
