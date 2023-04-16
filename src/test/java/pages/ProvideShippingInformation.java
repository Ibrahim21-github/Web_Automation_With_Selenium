package pages;

import org.openqa.selenium.By;

public class ProvideShippingInformation extends BasePage {
	public By NAME_FLIED = By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
	public By PHONE_NUMBER_INPUT = By.xpath("//fieldset[@class='group']//input[@id='phone']");
	public By ALTERNATIVE_PHONE_NUMBER_INPUT = By.xpath("//fieldset[@class='group']//input[@id='phone2']");
	public By PROVED_SHIPPING_INFORMATION = By.xpath("//select[@id='js--country']");
	public By CITY_SELECT = By.xpath("//select[@id='js--city'][1]/option[@value='2']");
	public By TOWN_SELECT = By.xpath("//select[@id='js--area']");
	public By ADDRESS_INPUT_FLIED = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
}