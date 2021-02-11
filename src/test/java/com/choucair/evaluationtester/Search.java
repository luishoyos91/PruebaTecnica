package com.choucair.evaluationtester;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}
	
	@Test
	public void testSearch() {
		WebElement searchbox = driver.findElement(By.name("search_query"));
		
		searchbox.clear();
		
		searchbox.sendKeys("Blouse");
		
		searchbox.submit();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		assertEquals("Search - My Store",driver.getTitle());
		
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}
	
}
