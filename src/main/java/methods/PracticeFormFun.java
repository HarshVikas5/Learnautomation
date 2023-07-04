package methods;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pageobjects.PracticeFormOR;

public class PracticeFormFun {

	final static Logger logger = LogManager.getLogger(PracticeFormFun.class);

	public static void launchBrowser(WebDriver driver) throws InterruptedException {
		try {
			driver.get("https://demoqa.com/automation-practice-form");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} catch (TimeoutException e) {
			logger.info("NOt able to load the URL within 20 sec ", e);
		}
		logger.info("URL is loaded successfully ");
	}

	public static void enterNameEmail(WebDriver driver, String fname, String lname, String email)
			throws InterruptedException {
		try {
			driver.findElement(PracticeFormOR.TXT_FNAME).sendKeys(fname);
			driver.findElement(PracticeFormOR.TXT_LNAME).sendKeys(lname);
			driver.findElement(PracticeFormOR.TXT_EMAIL).sendKeys(email);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} catch (NoSuchElementException e) {
			logger.info("FNAME Element does not exist ", e);
		} catch (TimeoutException e) {
			logger.info("Not able to locate first name on practice form within the given time 20 secound ", e);

		}
		logger.info("First anme last name and email are entered successfully");

	}

	public static void selectGender(WebDriver driver) {
		try {
			WebElement element = driver.findElement(PracticeFormOR.TXT_GENDER);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	public static void phnNumber(WebDriver driver, String pnum) throws InterruptedException {

		try {
			driver.findElement(PracticeFormOR.TXT_NUMBER).sendKeys(pnum);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void subSelection(WebDriver driver, String sub) throws InterruptedException, AWTException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(PracticeFormOR.TXT_SUB));
			ele.sendKeys(sub);
			driver.findElement(PracticeFormOR.TXT_SUBVALUE).click();

		} catch (NoSuchElementException e) {
			logger.info("", e);
		} catch (TimeoutException e) {
			logger.info("", e);

		}
	}

	public static void selectHobbies(WebDriver driver, String hobbies) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)");
			// If you dont use the scroldown code , it is opening the google ad
			WebElement element = driver.findElement(PracticeFormOR.TXT_HOBBIES);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} catch (NoSuchElementException e) {
			logger.info("", e);
		} catch (TimeoutException e) {
			logger.info("", e);
		}
	}

	public static void selectDate(WebDriver driver) {
		try {
			WebElement element = driver.findElement(PracticeFormOR.DATE);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();

			Select month = new Select(driver.findElement(PracticeFormOR.MONTH));
			month.selectByIndex(0);

			Select year = new Select(driver.findElement(PracticeFormOR.YEAR));
			year.selectByIndex(0);

			List<WebElement> day = driver.findElements(PracticeFormOR.DAY);

			for (WebElement myday : day) {
				myday.click();
				break;
			}

		} catch (NoSuchElementException e) {
			logger.info("", e);
		} catch (TimeoutException e) {
			logger.info("", e);

		}
	}

	public static void address(WebDriver driver, String add) throws InterruptedException {
		try {
			driver.findElement(PracticeFormOR.TXT_ADDRESS).sendKeys(add);

		} catch (NoSuchElementException e) {
			logger.info("", e);
		} catch (TimeoutException e) {
			logger.info("", e);

		}
	}

	public static void uploadImage(WebDriver driver) throws InterruptedException {
		try {
			WebElement UploadImg = driver.findElement(PracticeFormOR.TXT_PIC);
			Thread.sleep(3000);
			UploadImg.sendKeys(new java.io.File("TestData/userimage.jpg").getAbsolutePath());
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			logger.info("", e);
		} catch (InterruptedException e) {
			logger.info("", e);

		}
	}

	public static void selectState(WebDriver driver, String state) {
		try {
			WebElement element = driver.findElement(PracticeFormOR.TXT_STATE);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
			WebElement se = driver.findElement(PracticeFormOR.TXT_SUBVALUE);
			se.click();

		} catch (NoSuchElementException e) {
			logger.info("", e);
		} catch (TimeoutException e) {
			logger.info("", e);

		}
		logger.info("Given state value is selected" + state);
	}

	public static void selectcity(WebDriver driver, String city) {
		try {
			driver.findElement(PracticeFormOR.TXT_CITY).click();
			WebElement se = driver.findElement(PracticeFormOR.TXT_CITYVALUE);
			se.click();
		} catch (NoSuchElementException e) {
			logger.info("", e);
		} catch (TimeoutException e) {
			logger.info("", e);

		}
		logger.info("Given city value is selected" + city);
	}

	public static void clickSubmit(WebDriver driver) {
		try {

			WebElement element = driver.findElement(PracticeFormOR.TXT_SUBMIT);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();

		} catch (NoSuchElementException e) {
			logger.info("", e);
		} catch (TimeoutException e) {
			logger.info("", e);

		}
	}

}
