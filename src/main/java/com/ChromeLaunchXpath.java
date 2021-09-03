package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeLaunchXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/work/workspace/Sel/exefiles/chromedriver.exe");

		ChromeDriver cd= new ChromeDriver();
		cd.navigate().to("http://www.fb.com/"); 	
		
		
		cd.findElement(By.xpath("//form/div/div/input")).sendKeys("kamboj.anjana2017@gmail.com");  
		cd.findElement(By.xpath("//form/div/div/div/input")).sendKeys("anju.balaq");  
		cd.findElement(By.xpath("//form/div[2]/button")).click();  

		
	}

}
