package com.yosethegame.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class YoseTheGameControllerTest {


	private WebDriver driver;

	@Before
	public void setUp() {
		// Create a new instance of the html unit driver
		driver = new HtmlUnitDriver();

		//Navigate to desired web page
		driver.get("http://localhost:8080/SpringMVC/YoseTheGame/name");
	}
	
	@Test
	public void testGetContactMeLink() {
		// find the link by its id
		WebElement element = driver.findElement(By.id("contact-me-link"));
		assertNotNull(element);
		
	}

}
