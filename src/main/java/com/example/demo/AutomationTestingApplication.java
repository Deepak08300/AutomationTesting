package com.example.demo;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class AutomationTestingApplication {
	

WebDriver webdriver;
	
	public static void main(String[] args) {
		SpringApplication.run(AutomationTestingApplication.class, args);
		System.out.println("enter the first stage");
		
		AutomationTestingApplication obj = new AutomationTestingApplication();
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\91976\\Downloads\\ChromeDriver\\chromedriver.exe");
//
//	ChromeDriver driver = new ChromeDriver();
//	driver.get("https://stackoverflow.com/questions/75680149/unable-to-establish-websocket-connection");
		obj.launchBrowser();
	}


	public void launchBrowser() {

System.out.println("enter the second stage");
//System.setProperty("webdriver.chrome.driver","C:\\Users\\91976\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
////		webdriver.chromedriver().setup();
////System.setProperty("webdriver.http.factory", "jdk-http-client");
//		webdriver = new ChromeDriver();
//
////		ChromeDriver driver = new ChromeDriver();
////		driver.get("https://stackoverflow.com/questions/75680149/unable-to-establish-websocket-connection");
//		System.out.println("enter the second stage34");
//		webdriver.navigate();
//		System.out.println("enter the second stage45");
////webdriver.get("https://github.com/");
//	
//System.out.println("enter the second stage56");
ChromeOptions options = new ChromeOptions();
//options.addArguments("--remote-allow-origins=*");
//options.addArguments("C:\\Users\\91976\\Downloads\\chromedriver-win64");
//WebDriverManager.chromedriver().setup();
//WebDriver driver = new ChromeDriver(options);
//driver.manage().window().maximize();
options.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91976\\Downloads\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();

driver.get("http://localhost:8080/");
boolean present;
try {
	
   Boolean data = driver.findElements(By.xpath("/html/body/header/nav/ul/li[3]/div/a[2]")).isEmpty();
   String button = driver.findElement(By.xpath("/html/body/div[2]/button")).getText();
   System.out.println(button);
//   WebDriverWait wait = new WebDriverWait(driver,6);
//   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
   WebElement element = driver.findElement(By.xpath("/html/body/div[2]/button"));
   if (element.isDisplayed() && element.isEnabled()) {
       element.click();
   }
   System.out.println(data);
   present = true;
}catch (NoSuchElementException e) {
   present = false;
}

}
}
