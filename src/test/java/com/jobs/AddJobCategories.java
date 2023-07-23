package com.jobs;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddJobCategories {
public static void main(String[] args) {
try {
	 WebDriverManager.chromedriver().setup();	
		
	 ChromeOptions c = new ChromeOptions();
     c.addArguments("--remote-allow-origins=*");
	 WebDriver d = new ChromeDriver(c);
	 d.manage().window().maximize();
	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 FileInputStream fis = new FileInputStream("C:\\\\Users\\\\91797\\\\eclipse-workspace\\\\Orangehrm\\\\input.properties");
	 Properties p = new Properties();
	 p.load(fis);
		
	 String url = p.getProperty("url");	
	 String username = p.getProperty("username");
	 String password = p.getProperty("password");
	 String usernameInput = p.getProperty("username_input");
	 String passwordInput = p.getProperty("password_input");
	 String loginButton = p.getProperty("login_button");
	 String admin = p.getProperty("admin");
	 String jobs = p.getProperty("jobs");		 
	 String jobCategories = p.getProperty("jobCategories");		
	 String addCategories = p.getProperty("add_skills");		 		 	
	 String jobCategoriesName = p.getProperty("jobTitleName");		 	
	 String categoriesName = p.getProperty("categoriesName");
	 String saveButton = p.getProperty("save_button");


	 d.get(url);
	 Thread.sleep(2000);

	 // Loginpage
	 d.findElement(By.name(username)).sendKeys(usernameInput);
	 Thread.sleep(2000);
		
	 d.findElement(By.name(password)).sendKeys(passwordInput);
	 Thread.sleep(2000);
		
	 d.findElement(By.xpath(loginButton)).click();
	 Thread.sleep(2000);
	
	 // Click on admin
	 d.findElement(By.xpath(admin)).click();
	 Thread.sleep(2000);
	
	 //click on jobs
	 d.findElement(By.xpath(jobs)).click();
	 Thread.sleep(2000);	
		
	 // click on jobCategories
	 d.findElement(By.xpath(jobCategories)).click();
	 Thread.sleep(2000);

	 d.findElement(By.xpath(addCategories)).click();
     Thread.sleep(2000);	
  
	 // save Categories
     d.findElement(By.xpath(jobCategoriesName)).sendKeys(categoriesName);
     Thread.sleep(2000);	
	
     d.findElement(By.xpath(saveButton)).click();
     Thread.sleep(3000);	
  
     d.quit();
		
} catch (Exception e) {
System.out.println(e);}	
}
}
