package com.example.demo;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AutomationTestingApplicationTests {
WebDriver webdriver;
	@Test
	void contextLoads() {
		System.out.println("***************************Testing Automation Started*************************************");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//
//		driver.get("https://www.youtube.com");
//		boolean present;
//		System.out.println(11);
//		driver.findElement(By.id("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button"));
//		System.out.println(112);
//		if(driver.findElements(By.id("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button")) != null){
//				        System.out.println(1);
//	    }else{
//	    	System.out.println(2);
//	    }
		
		ChromeOptions options = new ChromeOptions();
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
			   System.out.println("Testing 01- Button is clickable and is tested for its name");
			//   WebDriverWait wait = new WebDriverWait(driver,6);
			//   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
			   WebElement element = driver.findElement(By.xpath("/html/body/div[2]/button"));
			   if (element.isDisplayed() && element.isEnabled()) {
				   System.out.println("Testing 01- Button is clickable and is tested for its name");
			       System.out.println(button);
				   if(button.equals("Register Here")) {
					  
					   System.out.println("Testing 02- Button's name is correct navigating to next page");
				   element.click();
				   String text1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/label")).getText();
				   if(text1.equals("Username")) {
					   System.out.println("Testing 03- Page is navigated and the new page has user name in it");
				   }else {
					   System.out.println("Error in Username");
				   }
				   String text2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/label")).getText();
				   if(text2.equals("Email")) {
					   System.out.println("Testing 04- Page is navigated and the new page has Email in it");
				   }else {
					   System.out.println("Error in Email");
				   }
				   String text3 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/label")).getText();
				   if(text3.equals("Password")) {
					   System.out.println("Testing 05- Page is navigated and the new page has Password in it");
				   }else {
					   System.out.println(text3+"Error in Password");
				   }
				   String text4 = driver.findElement(By.xpath("/html/body/div[1]/div[4]/label")).getText();
				   if(text4.equals("Confirm Password")) {
					   System.out.println("Testing 06- Page is navigated and the new page has Confirm Password in it");
				   }else {
					   System.out.println("Error in Confirm Password");
				   }
				   String text5 = driver.findElement(By.xpath("/html/body/div[1]/button")).getText();
				   if(text5.equals("Register")) {
					   System.out.println("Testing 07- Page is navigated and the new page has button Register in it");
				   }else {
					   System.out.println("Error in Register button");
				   }
				   }else {
					   System.out.println("Error- Button name is incorrect please check again");
					   
				   }
				   

			   }else {
				   System.out.println("Button is not clickable or enabled please check again");
			   }
			   System.out.println(data);
			   present = true;
			}catch (NoSuchElementException e) {
			   present = false;
			   System.out.println("Failes in exception");

			}

		driver.close();
		System.out.println("Browser is closed");
	}

}
