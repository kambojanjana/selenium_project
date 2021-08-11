package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/work/workspace/Sel/exefiles/chromedriver.exe");

		ChromeDriver cd= new ChromeDriver();
		cd.navigate().to("https://www.google.com/"); 	
		
		String title = cd.getTitle();
		//System.out.println(title);
		
		String src = cd.getPageSource();
		System.out.println(src);
		
	//	cd.findElement(By.xpath("[text()='Google offered in']")).click();  

		
	}

}
