package org.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleWindow {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		
	  driver.findElement(By.xpath("//button[text()='✕']")).click();
	  
	  
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone 11pro backcase");
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='SYOTT Back Cover for APPLE iPhone 11 Pro Max, iPhone 11 Pro Max']")).click();
		
		
		WebElement txt$ = driver.findElement(By.xpath("(//div[text()='₹474'])[1]"));
		String text = txt$.getText();
		System.out.println(text);
		
		WebElement txtPin = driver.findElement(By.id("pincodeInputId"));
		txtPin.sendKeys("614803");
		
		
		
		
		

		
		
		
	}

}