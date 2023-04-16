package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import pages.ProvideShippingInformation;
import pages.RokomariCatagoriesPage;
import pages.RokomariHomePage;
import pages.RokomariSignInPage;
import utilities.BaseDriverSetup;

public class Rokomari extends BaseDriverSetup {
	RokomariHomePage rokomariHomePage = new RokomariHomePage();
	RokomariCatagoriesPage rokomariCatagoriesPage = new RokomariCatagoriesPage();
	ProvideShippingInformation provideShippingInformation = new ProvideShippingInformation();
	RokomariSignInPage rokomariSignInPage = new RokomariSignInPage();
	
	
	@Test(priority=1, description="Verify the url browser")
	@Epic("EP001")
	@Feature("Feature1:Homepageloading")
	@Step("Verify home page")
	@Severity(SeverityLevel.MINOR)
	public void rokomarihomeTest() throws InterruptedException {
		getDriver().get(rokomariHomePage.HOMEPAGE_URL);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rokomariHomePage.closedPopup(rokomariHomePage.popup);
		//rokomariHomePage.scrollToElement(rokomariHomePage.BROWSER_BY_EXAM);
	}
	
	@Test(priority=2, description="Hover and select the Author By Humaon Ahmed")
	@Epic("EP002")
	@Feature("Feature2:Author By Humaon Ahmed")
	@Step("Hover and Click By Author")
	@Severity(SeverityLevel.MINOR)
	public void selectByAuthor() throws InterruptedException {
//		getDriver().navigate().refresh();
		rokomariHomePage.closedPopup(rokomariHomePage.popup);
		rokomariHomePage.moveOnElement(rokomariHomePage.SELECT_BY_AUTORS);
		rokomariHomePage.clickOnElement(rokomariHomePage.SELECT_BY_WRITTER);
		Thread.sleep(2000);
	}
	
	
	@Test(priority=3, description="Try scrolling down on the page Catagories")
	@Epic("EP003")
	@Feature("Feature3:Catagories")
	@Step("Go to page and scroll down and down on the page and find catagories")
	@Severity(SeverityLevel.MINOR)
	public void filterCatagory() throws InterruptedException {
		rokomariHomePage.closedPopup(rokomariHomePage.popup);
		//Scroll filtering top to down page
		rokomariCatagoriesPage.scrollToElement(rokomariCatagoriesPage.SCROLL_FILTERING);
		rokomariCatagoriesPage.clickOnElement(rokomariCatagoriesPage.CHECK_BOX_CLICK_RECENT);
		rokomariCatagoriesPage.scrollToElement(rokomariCatagoriesPage.SCROLL_FILTERING_AGAIN);
		rokomariCatagoriesPage.clickOnElement(rokomariCatagoriesPage.CHECK_BOX_CLICK_HISTORY);
		Thread.sleep(2000);
		
		rokomariCatagoriesPage.scrollToElement(rokomariCatagoriesPage.SCROLL_HOVER_AND_SELECT);
		rokomariCatagoriesPage.moveOnElement(rokomariCatagoriesPage.HOVER_AND_SELECT);
		rokomariCatagoriesPage.clickOnElement(rokomariCatagoriesPage.HOVER_AND_CLICK);
		getDriver().get(rokomariCatagoriesPage.ENTER_NEW_PAGE );
		// Opens a new tab and switches to new tab
		//getDriver().switchTo().newWindow(WindowType.TAB);
		//Switch back to the old tab or window
		String originalWindow = getDriver().getWindowHandle();
		getDriver().switchTo().window(originalWindow);
		rokomariCatagoriesPage.clickOnElement(rokomariCatagoriesPage.ADD_BOOK_TO_CART);
//		Scroll Down and go to Next Page
//		rokomariCatagoriesPage.scrollToElement(rokomariCatagoriesPage.FIND_NEXT_PAGE);
//		rokomariCatagoriesPage.moveOnElement(rokomariCatagoriesPage.SCROLL_DOWN_CLICK_NEXT_PAGE);
		//mouse on the button and hover
		
		
	}

	@Test(priority=4, description="Buy book after login the page")
	@Epic("EP004")
	@Feature("Feature4:Sign in")
	@Step("Verify valid username and email Address")
	@Severity(SeverityLevel.MINOR)
	public void validSignInTest() throws InterruptedException {
		rokomariHomePage.clickOnElement(rokomariHomePage.LOGIN_BUTTON);
		rokomariSignInPage.clickOnElement(rokomariSignInPage.SIGIN_TEXT_FIELD);
		rokomariSignInPage.writeText(rokomariSignInPage.EMAIL_INPUT_LOWERCASE, "ibrahimcse.green@gmail.com");
		rokomariSignInPage.writeText(rokomariSignInPage.PASSWORD_FIELD_VALID, "ibrahimcse@12");
		rokomariSignInPage.clickOnElement(rokomariSignInPage.REMEMBER_ME);
		rokomariSignInPage.clickOnElement(rokomariSignInPage.SIGN_IN_BUTTON);
		Thread.sleep(5000);
		//Click Cart Icon
		rokomariCatagoriesPage.clickOnElement(rokomariCatagoriesPage.CLICK_CART_ICON);
		
	}
	
	@Test(priority=5, description="Verify provide information")
	@Epic("EP005")
	@Feature("Feature5:Information")
	@Step("input text filed mobile number, address, city or town select and address details where you pick the product")
	@Severity(SeverityLevel.MINOR)
	public void provideShippingInformation() throws InterruptedException {
		//rokomariHomePage.closedPopup(rokomariHomePage.popup);
		rokomariCatagoriesPage.clickOnElement(rokomariHomePage.PLACED_ORDER_BUTTON);
		rokomariHomePage.writeText(provideShippingInformation.ALTERNATIVE_PHONE_NUMBER_INPUT, "1234");
		rokomariHomePage.selectElementWithText(provideShippingInformation.PROVED_SHIPPING_INFORMATION,"I");
		//rokomariHomePage.selectElementWithText(provideShippingInformation.CITY_SELECT,"ঢাকা");
		//rokomariHomePage.selectElementWithText(provideShippingInformation.TOWN_SELECT,"");
		rokomariHomePage.writeText(provideShippingInformation.ADDRESS_INPUT_FLIED, "Mirpur-10,Dhaka");
//		rokomariCatagoriesPage.writeText(rokomariCatagoriesPage.SENDS_NUMBER,"2222335");
	}
}
