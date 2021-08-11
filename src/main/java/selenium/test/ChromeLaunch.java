package selenium.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/work/workspace/test/exefile/chromedriver.exe");
		ChromeDriver chromeDriver= new ChromeDriver();
		chromeDriver.manage().window().maximize();
		 chromeDriver.navigate().to("https://www.facebook.com/");
			chromeDriver.manage().window().minimize();

	}

}
