package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.Facebookpage;
import Objects.GoogleSearchpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_Googlesearch {

	WebDriver driver;
	GoogleSearchpage objectrepo;

	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

	@Test(priority = 0)
	public void searchOperation() {
		GoogleSearchpage page = new GoogleSearchpage(driver);
		page.searchgoogle("facebook");
	}

	@Test(priority = 1)
	public void VerifyandAccessFacebook() {
		objectrepo = new GoogleSearchpage(driver);
		objectrepo.clickfacebooklink();
	}

	@Test(priority = 2)
	public void FacebookLogin() {
		Facebookpage pages = new Facebookpage(driver);
		pages.UserNametext();
		pages.Passwordtext();
		pages.Submit_Login();
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
