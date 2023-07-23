package com.qualification;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteSkill {
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
	 String qualfication = p.getProperty("qualfication");		 
	 String skills = p.getProperty("skills");		
	 String chechbox2 = p.getProperty("chechbox2");		 		 	
	 String deleteSkill = p.getProperty("deleteskill");		 	
	 String yesDeleteButtton = p.getProperty("yes_deletebuttton");

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
	
	 //click on qualfication
	 d.findElement(By.xpath(qualfication)).click();
	 Thread.sleep(2000);	
		
	 // click on skills
	 d.findElement(By.xpath(skills)).click();
	 Thread.sleep(2000);

	 d.findElement(By.xpath(chechbox2)).click();
    Thread.sleep(2000);	
   
	 // delete skill
    d.findElement(By.xpath(deleteSkill)).click();
    Thread.sleep(2000);	
	
    d.findElement(By.xpath(yesDeleteButtton)).click();
    Thread.sleep(2000);	
   
    d.quit();
 } 
  catch (Exception e) {
	System.out.println(e);
    }	
  }
	
 }
