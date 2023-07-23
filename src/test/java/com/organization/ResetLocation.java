package com.organization;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResetLocation {
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
	String locations = p.getProperty("locations");
	String name1 = p.getProperty("name1");
	String city1 = p.getProperty("city1");
	String city1Input = p.getProperty("city1_input");
	String country = p.getProperty("country0");
	String resetButton = p.getProperty("resetbutton");
	String organization = p.getProperty("organization");
	String countryListbox = p.getProperty("country_listbox");
	String nameInput = p.getProperty("name_input");

	
	d.get(url);
	Thread.sleep(2000);

    // loginpage
	d.findElement(By.name(username)).sendKeys(usernameInput);
	Thread.sleep(2000);
	
	d.findElement(By.name(password)).sendKeys(passwordInput);
	Thread.sleep(2000);
	
	d.findElement(By.xpath(loginButton)).click();
	Thread.sleep(2000);
	
    //click on admin
	d.findElement(By.xpath(admin)).click();
	Thread.sleep(2000);
	
    //click on organization
	d.findElement(By.xpath(organization)).click();
	Thread.sleep(2000);	

	// click on locations
	d.findElement(By.xpath(locations)).click();
	Thread.sleep(2000);

	d.findElement(By.xpath(name1)).sendKeys(nameInput);
	Thread.sleep(2000);
		
	d.findElement(By.xpath(city1)).sendKeys(city1Input);
	Thread.sleep(2000);
		
	// Select India From Country listbox
	
	WebElement country1 = d.findElement(By.xpath(country));
	country1.click();
	   
	Thread.sleep(2000);
		
	d.findElement(By.xpath(countryListbox)).click();	
	Thread.sleep(2000);

	d.findElement(By.xpath(resetButton)).click();
	Thread.sleep(2000);
	
	
	d.quit();
	
	}
  catch (Exception e) {
  System.out.println(e);
  }	
 }
 }
