package com.sample.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_WindowHandles {

	public static WebDriver driver;

	public static void right_Click(WebElement element) {

		Actions a = new Actions(driver);

		a.contextClick(element).build().perform();

	}

	public static void down_Enter() throws AWTException {
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void multiple_Window() {
		Set<String> all_Id = driver.getWindowHandles(); // online,mobile,electronics

		String expected_Url = "https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics";

		for (String id : all_Id) { // online,mobile,electronics

			if (driver.switchTo().window(id).getCurrentUrl().equals(expected_Url)) {
				// driver->switch->electronics--> electronics -->equals. electronics
				break;

			}

		}
	}

	public static void main(String[] args) throws AWTException {

		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));

		right_Click(mobiles);
		down_Enter();

		WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));

		right_Click(electronics);
		down_Enter();

		multiple_Window();

	}

}
