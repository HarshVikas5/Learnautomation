package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver = new ChromeDriver();

		System.out.println("Session is created ");
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println("browser is launched");

		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Vandana");

		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();

		System.out.println("Program finished");
	}

}
