package com.usermanagement;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SystemUsersSelectEnabled {

	public static void main(String[] args) {
	try {
		
	   WebDriverManager.chromedriver().setup();	
	   ChromeOptions c = new ChromeOptions();
	   c.addArguments("--remote-allow-origins=*");
	   WebDriver d = new ChromeDriver(c);
	   d.manage().window().maximize();
	   d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	   FileInputStream fis = new FileInputStream("C:\\Users\\91797\\eclipse-workspace\\Orangehrm\\input.properties");
	   Properties p = new Properties();
	   p.load(fis);
					
				
       String url = p.getProperty("url");	
	   String username = p.getProperty("username");
       String password = p.getProperty("password");
       String usernameInput = p.getProperty("username_input");
	   String passwordInput = p.getProperty("password_input");
	   String loginButton = p.getProperty("login_button");
	   String admin = p.getProperty("admin");		
	   String status1 = p.getProperty("status1");
	   String statusEnabled = p.getProperty("status_enabled");
				
		
	   d.get(url);
	   Thread.sleep(3000);
	
	   // loginpage
		
	   d.findElement(By.name(username)).sendKeys(usernameInput);
	   Thread.sleep(2000);
		
	   d.findElement(By.name(password)).sendKeys(passwordInput);
	   Thread.sleep(2000);
		
	   d.findElement(By.xpath(loginButton)).click();
	   Thread.sleep(2000);
       
	   //click on admin
		
	   d.findElement(By.xpath(admin)).click();
	   Thread.sleep(3000);
	
       // Select Enabled from Status listbox
		
	   WebElement status2 = d.findElement(By.xpath(status1));
	   status2.click();
	   Thread.sleep(2000);
		
	   d.findElement(By.xpath(statusEnabled)).click();
	   Thread.sleep(2000);
		
	   d.quit();		
				
	  } 
	  catch (Exception e) {
      System.out.println(e);
   }
  }
  }
