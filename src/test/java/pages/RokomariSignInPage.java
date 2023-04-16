package pages;

import org.openqa.selenium.By;

public class RokomariSignInPage extends BasePage {
	public String LOGINPAGE_URL = "https://www.rokomari.com/login";
	//Manual SignIn Account
	public By SIGIN_TEXT_FIELD = By.xpath("//div[@class='login-registration__form--heading']/p[1]");
	public By EMAIL_INPUT_LOWERCASE = By.xpath("//input[@id='j_username']");
	public By PASSWORD_FIELD_VALID = By.xpath("//input[@id='j_password']");
	public By REMEMBER_ME = By.xpath("//label[normalize-space()='Remember Me']");
	public By SIGN_IN_BUTTON = By.xpath("//button[normalize-space()='Sign In']");
	public By PLACED_ORDER_BUTTON = By.xpath("//span[normalize-space()='Place Order']");

}