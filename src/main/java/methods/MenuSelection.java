package methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuSelection {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);

		driver.get("https://demoqa.com/menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test(priority=0)
	public static void menuOneSelection() {
		WebElement menu1 = driver.findElement(By.cssSelector("#nav>li:nth-child(1)"));
		Actions a = new Actions(driver);
		a.moveToElement(menu1).perform();

	}
	@Test(priority=1)
	public static void menuTwoSelection() {
		WebElement menu1 = driver.findElement(By.cssSelector("#nav>li:nth-child(2)"));
		Actions a = new Actions(driver);
		a.moveToElement(menu1).perform();

	}

	@Test(priority=2)
	public static void SubMenuSelection() {

		List<WebElement> subMenu = driver.findElements(By.cssSelector("#nav>li:nth-child(2) ul li:nth-child(n)"));
		for (WebElement Menu1 : subMenu)
		{
			Menu1.click();
			break;
		}
	}
	@Test(priority=3)
	public static void SubListSelection() {
		WebElement menu1 = driver.findElement(By.cssSelector("#nav>li:nth-child(2) ul li:nth-child(3)"));
		Actions a = new Actions(driver);
		a.moveToElement(menu1).perform();

	}
	
	
	@Test(priority=4)
	public static void SubSubMenuSelection() {
		WebElement menu3 = driver
				.findElement(By.cssSelector("#nav>li:nth-child(2) ul li:nth-child(3) ul li:first-child"));
		Actions a = new Actions(driver);
		a.moveToElement(menu3).perform();

	}

	@Test(priority=5)
	public static void menuThreeSelection() {
		WebElement menu4 = driver.findElement(By.cssSelector("#nav>li:nth-child(3)"));
		Actions a = new Actions(driver);
		a.moveToElement(menu4).perform();

	}
}
