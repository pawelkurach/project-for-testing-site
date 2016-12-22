package pl.kurach.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Programy\\projekty\\SeleniumEclipse\\drivers\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "C:\\Programy\\projekty\\SeleniumEclipse\\drivers\\geckodriver64.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://store.demoqa.com/");
		
		System.out.println("Successfully opened the website www.Store.Demoqa.com");
		
		driver.quit();

	}

}
