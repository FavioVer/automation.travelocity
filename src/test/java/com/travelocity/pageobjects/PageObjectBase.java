package com.travelocity.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import com.travelocity.framework.utils.WebDriverUtils;

public abstract class PageObjectBase {

	protected static final int TIME_FOR_PAGE_LOAD = 10;
	protected static final int TIME_AFTER_CLICK = 5;
	protected static final int TIME_OUT_MINIMUN = 1;
	protected static final int TIME_OUT_MAXIMUM = 30;

	private static WebDriver webDriver;
	private WebDriverUtils webDriverUtils = new WebDriverUtils();

	protected PageObjectBase(WebDriver driver) {
		if (driver == null) {
			throw new IllegalArgumentException("Driver object is null");
		} else {
			webDriver = driver;
			PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, TIME_FOR_PAGE_LOAD), this);
			webDriverUtils.initializeDriverWait(webDriver);
			if (isAlertPresent()) {
				webDriver.switchTo().alert().accept();
				System.out.println("ALERT TRUE DISMISS");
			}
		}
	}

	protected abstract By getPageLocator();

	public boolean isLoaded() {
		return webDriverUtils.waitForElementLocatedToBeVisible(getPageLocator());
	}

	private static WebDriver getDriver() {
		return webDriver;
	}

	protected void typeOnField(WebElement element, String text) {
		System.out.println("Limpiando texto y enviando nuevo texto: " + text);
		element.clear();
		element.sendKeys(text);
		System.out.println("Un texto fue escrito en " + element.toString());
	}

	public void dispose() {
		if (webDriver != null) {
			webDriver.quit();
		}
	}

	protected void scrollDownToElement(WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].scrollIntoView();", webElement);
	}

	public void scrollIntoView(WebElement element) {
		((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void selectOptionFromDropdown(WebElement webElement, String text) {
		Select dropdown = new Select(webElement);
		dropdown.selectByVisibleText(text);
		boolean selectedOptionText = dropdown.getFirstSelectedOption().getAttribute("label").equalsIgnoreCase(text);
		if (!selectedOptionText) {
			throw new InvalidElementStateException(
					String.format("The option with text <{0}> was not correctly selected in the dropdown", text));
		}
	}

	public String getUrl() {
		return getDriver().getCurrentUrl();
	}

	public WebDriverUtils getWebDriverUtils() {
		return this.webDriverUtils;
	}

	protected void click(WebElement element) {
		System.out.println("Tratando de hacer click en " + element.toString());
		if ((webDriverUtils.waitForElementToBeClickable(element))) {
			element.click();
			System.out.println("Se hizo click en " + element.toString());
		}

	}

	public boolean clickWithActionsBuilder(WebDriver webDriver, WebElement element) {
		try {
			Actions builder = new Actions(webDriver);
			builder.moveToElement(element, 5, 5).click(element);
			builder.perform();
			return true;
		} catch (TimeoutException toe) {
			return false;
		}
	}

	public void mouseOver(WebDriver driver, WebElement element) {
		Actions builder = new Actions(driver);
		Action action = builder.moveToElement(element).build();
		action.perform();
	}

	public boolean isAlertPresent() {
		try {
			webDriver.switchTo().alert();
			System.out.println("HAY ALERT");
			return true;
		} catch (NoAlertPresentException Ex) {
			System.out.println("NO HAY ALERT");
			return false;
		}
	}

}
