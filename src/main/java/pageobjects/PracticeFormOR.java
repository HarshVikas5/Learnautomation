package pageobjects;

import org.openqa.selenium.By;

public class PracticeFormOR {
	
	public static final By TXT_FNAME = By.id("firstName");
    public static final By TXT_LNAME = By.id("lastName");
	public static final By TXT_EMAIL = By.id("userEmail");
	public static final By TXT_GENDER = By.id("gender-radio-1");
	public static final By TXT_NUMBER = By.id("userNumber");
	public static final By TXT_ADDRESS = By.id("currentAddress");
	public static final By TXT_SUB = By.cssSelector(".subjects-auto-complete__value-container input");
	public static final By TXT_SUBVALUE= By.xpath("//div[@id='react-select-2-option-0']");
	public static final By TXT_HOBBIES= By.id("hobbies-checkbox-1");
	public static final By DATE= By.className("react-datepicker-wrapper");
	public static final By MONTH= By.className("react-datepicker__month-select");
	public static final By YEAR= By.className("react-datepicker__year-select");
	public static final By DAY= By.className("react-datepicker__day");
	public static final By TXT_PIC = By.id("uploadPicture");
	public static final By TXT_STATE = By.id("state");
	public static final By TXT_STATEVALUE = By.id("react-select-3-option-0");
	public static final By TXT_CITY = By.id("city");
	public static final By TXT_CITYVALUE = By.id("react-select-4-option-1");
	public static final By TXT_SUBMIT = By.id("submit");


	

}
