package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public static WebDriver driver;
	 
@Test
public static void  setup()  {
	WebDriverManager.chromedriver().setup();

	ChromeOptions cr = new ChromeOptions();
	cr.addArguments("*remote-all-origins-*");
	 driver = new ChromeDriver(cr);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
}
}









/*
	public static void launchBrowser(){
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);

		driver.get("https://demoqa.com/elements");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}

    public static void main(String[] args)
    {
    	launchBrowser();
    }
	}*/
