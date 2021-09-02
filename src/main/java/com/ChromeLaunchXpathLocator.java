package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeLaunchXpathLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/work/workspace/Sel/exefiles/chromedriver.exe");

		ChromeDriver cd= new ChromeDriver();
		cd.navigate().to("http://www.fb.com/"); 	
		
		
		cd.findElement(By.xpath("//*[@id='email']")).sendKeys("kamboj.anjana2017@gmail.com");  
		cd.findElement(By.xpath("//*[@id='pass']")).sendKeys("anju.bala");  
		cd.findElement(By.cssSelector("button[value='1']")).click();  

		
	}

}
