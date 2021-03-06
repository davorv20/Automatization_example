package hr.cube.qa.automatizacija;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class App {

	//System.setProperty("chromedriver", "C:\\webdrivers\\chromedriver.exe");
	//System.setProperty
	
	public static WebDriver driver;


	@BeforeMethod
	public void beforeMethod() {
		System.out.print("Before method start \n");
        System.setProperty("driver.wedriver.chrome", "chromedriver.exe");
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.print("Before method finish \n");

	}
	


	@AfterMethod
	public void afterMethod() {
		driver.close();
		driver.quit();
	}
}
