package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebookpage {

	WebDriver driver;

	public Facebookpage(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='pass']");
	By login_btn = By.xpath("//button[@type='submit']");

	public void UserNametext() {
		try {
			driver.findElement(username).sendKeys("TestUser");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Exception Caught:" + e.getMessage());
		}
	}

	public void Passwordtext() {
		try {
			driver.findElement(password).sendKeys("123456");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Exception Caught:" + e.getMessage());
		}
	}

	public void Submit_Login() {
		try {
			driver.findElement(login_btn).click();

			String title = driver.getTitle();
			assertEquals(title, "Log in to Facebook");

			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Exception Caught:" + e.getMessage());
		}
	}

}
