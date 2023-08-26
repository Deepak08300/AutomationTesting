package com.example.demo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;

import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootTest
class AutomationTestingApplicationTests {
WebDriver webdriver;
	@Test
	void contextLoads() {
		System.out.println("hello testing");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.youtube.com");
		boolean present;
		System.out.println(11);
		driver.findElement(By.id("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button"));
		System.out.println(112);
		if(driver.findElements(By.id("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button")) != null){
				        System.out.println(1);
	    }else{
	    	System.out.println(2);
	    }
	}

}
