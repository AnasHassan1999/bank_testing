package xyz_bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xyz_parameter {

	
	public WebDriver driver;
	public SoftAssert mysoft= new SoftAssert();
	
	@BeforeTest(groups = "1")
	public void define_parameter() {
	
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	
	}
}
