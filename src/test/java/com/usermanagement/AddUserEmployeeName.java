package com.usermanagement;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddUserEmployeeName {
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
		String addButton = p.getProperty("add_button");
		String pIM = p.getProperty("pim");
		String firstname = p.getProperty("firstname");
		String firstnameInput = p.getProperty("firstname_input");
		String lastname = p.getProperty("lastname");
		String lastnameInput = p.getProperty("lastname_input");
		String saveButton = p.getProperty("save_button");
		String employeeName = p.getProperty("employee_name");
		String employeeInput = p.getProperty("employee_input");
		String employeeListbox = p.getProperty("employee_listbox");
		
		d.get(url);
		Thread.sleep(3000);
	
		// loginpage
		d.findElement(By.name(username)).sendKeys(usernameInput);
		Thread.sleep(2000);
		
		d.findElement(By.name(password)).sendKeys(passwordInput);
		Thread.sleep(2000);
		
		d.findElement(By.xpath(loginButton)).click();
		Thread.sleep(2000);
        
		// click on pIM
		
		d.findElement(By.xpath(pIM)).click();
		Thread.sleep(2000);

      	// click on add employee		

		d.findElement(By.xpath(addButton)).click();
		Thread.sleep(3000);
		
		d.findElement(By.xpath(firstname)).sendKeys(firstnameInput);
		Thread.sleep(2000);
		
		d.findElement(By.xpath(lastname)).sendKeys(lastnameInput);
		Thread.sleep(2000);
		
		d.findElement(By.xpath(saveButton)).click();
		Thread.sleep(4000);

		//click on admin
		
		d.findElement(By.xpath(admin)).click();
		Thread.sleep(3000);

		
       //click on add user
		d.findElement(By.xpath(addButton)).click();
		Thread.sleep(2000);
		
	
	   // Select the Employee Name
		d.findElement(By.xpath(employeeName)).sendKeys(employeeInput);
		Thread.sleep(2000);
		
		d.findElement(By.xpath(employeeListbox)).click();
		Thread.sleep(2000);
		
		d.quit();
		
	} 
	catch (Exception e) {
   System.out.println(e);
   }	
	}
   }
