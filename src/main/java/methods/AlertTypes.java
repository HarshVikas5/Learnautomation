package methods;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.Alerts;


public class AlertTypes {

	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		

		driver.manage().deleteAllCookies();
	}

	@Test
	public static void simpleAlert() {
		driver.findElement(Alerts.ALERTS_BUTTON).click();
		driver.switchTo().alert().accept();

	}

	@Test
	public static void timerAlertButton() throws InterruptedException {
		driver.findElement(Alerts.TIMER_ALERT_BUTTON).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
	}

	@Test
	public static void confirmAlertButton() throws InterruptedException {
		driver.findElement(Alerts.CONFIRM_BUTTON).click();
		driver.switchTo().alert().accept();

	}

	@Test
	public static void promptAlertButton() throws InterruptedException {
		String text = "Nitin";
		driver.findElement(Alerts.PROMPT_BUTTON).click();
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();

		String matchText = driver.findElement(By.id("promptResult")).getText();
		if (matchText.contains(text)) {
			System.out.println("Test pass");

		} else {
			System.out.println("Test fail");
		}

	}
	
}
