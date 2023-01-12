package com.sample.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over {

	static WebDriver driver; // chrome

	public static void main(String[] args) throws AWTException {

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		right_Click();

		down();
		down();
		down();
		enter();

	}

	public static void right_Click() {

		WebElement images = driver.findElement(By.xpath("//a[.='Images']"));

		Actions a = new Actions(driver);

		a.contextClick(images).build().perform();

	}

	public static void down() throws AWTException {
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	public static void enter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
