package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchpage {

	WebDriver driver;

	public GoogleSearchpage(WebDriver driver) {
		this.driver = driver;
	}

	By search_box = By.className("gLFyf");
	By search_btn = By.xpath("(//input[@name='btnK']) [1]");
	By facebook_link = By.xpath("//a/h3[text()='Facebook - log in or sign up']");

	public void searchgoogle(String searchinput) {
		try {
			driver.findElement(search_box).sendKeys(searchinput);
			Thread.sleep(1000);
			driver.findElement(search_btn).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exception thrown" + e.getMessage());
		}
	}

	public void clickfacebooklink() {
		try {
			driver.findElement(facebook_link).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exception thrown" + e.getMessage());
		}

	}
}