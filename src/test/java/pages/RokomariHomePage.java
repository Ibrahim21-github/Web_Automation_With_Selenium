package pages;

import org.openqa.selenium.By;

public class RokomariHomePage extends BasePage  {
	public String HOMEPAGE_URL = "https://www.rokomari.com/book";
	public By LOGIN_BUTTON = By.xpath("//a[normalize-space()='Sign in']");
	public By BROWSER_BY_EXAM = By.xpath("//h2[normalize-space()='Browse by Exam Up to 60% Off']");
	public By popup = By.xpath("//button[contains(@class, 'popup-modal__close')]");



	public By SELECT_BY_AUTORS = By.xpath("//a[@id='js--authors']");
	public By SELECT_BY_WRITTER = By.xpath("//div//a[contains(text(),'হুমায়ূন আহমেদ ')]");
	public By SCROLL_DOWN_NEXT_PAGE= By.xpath("//a[normalize-space()='Next']");
	public By CLICK_CART_ICON = By.xpath("//a[@id='js-cart-menu']//*[name()='svg']");
	public By PLACED_ORDER_BUTTON = By.xpath("//span[normalize-space()='Place Order']");
	
}
