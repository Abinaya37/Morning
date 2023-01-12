package com.sample.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		// attribute name and value
		WebElement mail = driver.findElement(By.xpath("//input[@type='text']"));
		mail.sendKeys("abi@gmail.com");

		// text
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		String text = create.getText();
		System.out.println(text);

		// partial attribute name and value / Index
		WebElement password = driver.findElement(By.xpath("(//input[contains(@data-testid,'royal')])[2]"));
		password.sendKeys("abi@345");

		// partial text
		WebElement header = driver.findElement(By.xpath("//h2[contains(text(),'you')]"));
		System.out.println(header.getText());

	}

}
