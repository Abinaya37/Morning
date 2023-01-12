package com.sample.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement gmail = driver.findElement(By.name("email"));
		gmail.sendKeys("Abinaya@gmail.com");

		String tagName2 = gmail.getTagName();
		System.out.println(tagName2);

		String attribute2 = gmail.getAttribute("value");
		System.out.println(attribute2);

		WebElement login = driver.findElement(By.name("login"));

		String text = login.getText();
		System.out.println(text);

		String attribute = login.getAttribute("class");
		System.out.println(attribute);

		String tagName = login.getTagName();
		System.out.println(tagName);

		String cssValue = login.getCssValue("line-height");
		System.out.println(cssValue);

		login.click();

	}

}
