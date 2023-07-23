package com.organization;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeneralInformationSelectCountry {
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
	 String organization = p.getProperty("organization");		 
	 String generalInformation = p.getProperty("generalInformation");		 	
	 String country1 = p.getProperty("country1");		 	
	 String countryListbox = p.getProperty("country_listbox1");		 	
	 String editGeneralInformation = p.getProperty("editGeneralInformation");		 	
	
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
	
	 //click on organization
	 d.findElement(By.xpath(organization)).click();
	 Thread.sleep(2000);	
		
	 // click on general information
	 d.findElement(By.xpath(generalInformation)).click();
	 Thread.sleep(2000);
			
     d.findElement(By.xpath(editGeneralInformation)).click();
     Thread.sleep(2000);

     // scrolldown the page
    JavascriptExecutor jse=(JavascriptExecutor)d;
    jse.executeScript("window.scrollBy(0,250)");
    Thread.sleep(2000); 
	
    // select country
     
	WebElement country2 = d.findElement(By.xpath(country1));
	country2.click();
		   
	Thread.sleep(2000);
			
	d.findElement(By.xpath(countryListbox)).click();	
	Thread.sleep(2000);	
	
	d.quit();
	
  } 
   catch (Exception e) {
   System.out.println(e);
   }	
  }
 }
