package pages;

import static utilities.BaseDriverSetup.getDriver;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.qameta.allure.Allure;

public class BasePage {
	public WebElement getElement(By locator){
		return getDriver().findElement(locator);
	}
	
	public void writeText(By locator, String text) {
		getElement(locator).sendKeys(text);	
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	
	public void scrollToElement(By locator) {
		WebElement element = getElement(locator);
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public void moveOnElement(By locator)
	{
		Actions action = new Actions(getDriver());
		action.moveToElement(getElement(locator)).perform();
	}
	
	public void selectElementWithText(By locator, String text ) {
		writeText(locator,text);
		getElement(locator).sendKeys(Keys.ARROW_DOWN);
		getElement(locator).sendKeys(Keys.ENTER);
		
	}
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
	}
	
	public void closedPopup(By locator) {
		List<WebElement> popups = getDriver().findElements(locator);
		for(WebElement popup : popups) {
			try {
				popup.click();
				Thread.sleep(0);
			} catch (Exception e) {
				System.out.println("Popup Not found to perform close action");
			}
		}
	}   
}
