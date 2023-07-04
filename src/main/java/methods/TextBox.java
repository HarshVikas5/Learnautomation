package methods;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.timeout.TimeoutException;
import pageobjects.Elements;

public class TextBox {
	
	public static String name = "Harsh";
	public static WebDriver driver;

	// Global variable
	public static String empName = "Aman";

	// Instance variable static int b=20;
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);

		driver.get("https://demoqa.com/elements");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test(priority = 0)
	public void handleTextBox() throws InterruptedException {
		try {
			// local variable int a=10;

			// Click on Element Icon to expand the menu
			//driver.findElement(By.cssSelector(".element-group:first-child")).click();
			//Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			// Locate text option in the menu
			driver.findElement(By.cssSelector(".left-pannel .element-group:first-child li:first-child")).click();

			// driver.findElement(By.id("userName")).sendKeys(empName);

			// Java Abstraction or Page object pattern
			driver.findElement(Elements.TXT_FULLNAME).sendKeys(name);
			driver.findElement(Elements.TXT_EMAIL).sendKeys("Aman@gmail.com");
			driver.findElement(Elements.TXT_C_ADDRESS).sendKeys("Mohali");
			driver.findElement(Elements.TXT_PERMANENT_ADDRESS).sendKeys("Phase 9");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			driver.findElement(Elements.TXT_SUBMIT).click();

			System.out.println("Done");
			driver.quit();
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			// TODO: handle exception
		}
	}

}
