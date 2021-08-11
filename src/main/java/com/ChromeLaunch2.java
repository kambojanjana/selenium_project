package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/work/workspace/Sel/exefiles/chromedriver.exe");
		WebDriver cd= new ChromeDriver();
		cd.navigate().to("http://www.fb.com/");  
		

		cd.findElement(By.id("email")).sendKeys("kamboj.anjana2017@gmail.com");
		cd.findElement(By.id("pass")).sendKeys("anju.bala");
		cd.findElement(By.cssSelector("div#u_0_d_zw")).click();  

		
		cd.findElement(By.className("a8c37x1j")).click();
	}

}
