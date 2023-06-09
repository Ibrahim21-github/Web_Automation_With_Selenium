package pages;

import org.openqa.selenium.By;

public class RokomariCatagoriesPage extends BasePage {
	public String WRITTERPAGE_URL = "https://www.rokomari.com/book/author/1/humayun-ahmed?priceRange=0to45100&discountRange=0to30";
	public By SCROLL_FILTERING= By.xpath("//p[normalize-space()='Filter']");
	public By CHECK_BOX_CLICK_RECENT= By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
	public By SCROLL_FILTERING_AGAIN= By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]");
	public By CHECK_BOX_CLICK_HISTORY= By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]");
	public By SCROLL_HOVER_AND_SELECT = By.xpath("//p[normalize-space()='(Showing 1 to 60 of 207 books)']");
	public By HOVER_AND_SELECT = By.xpath("//div[@title='আমাদের শাদা বাড়ি হুমায়ূন আহমেদ']//div[@class='book-list-wrapper ']");
	public By HOVER_AND_CLICK = By.xpath("//h4[contains(text(),'আমাদের শাদা বাড়ি')]");
	public String ENTER_NEW_PAGE = "https://www.rokomari.com/book/1333/amader-shada-bari";
	public By ADD_BOOK_TO_CART = By.xpath("//a[@class='btn details-cart-btn small-cart-button js--add-to-cart js--add-to-cart-desc']");
	public By CLICK_CART_ICON = By.xpath("//a[@id='js-cart-menu']");
	public By FIND_NEXT_PAGE = By.xpath("//div[@class='pagination']//a[contains(text(),'1')]");
	public By SCROLL_DOWN_CLICK_NEXT_PAGE = By.xpath("//a[contains(text(),'Next')]");
	public By SENDS_NUMBER = By.xpath("//input[@id='phone-number']");

}