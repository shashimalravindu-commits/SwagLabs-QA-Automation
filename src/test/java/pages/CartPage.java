package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    // Locators
    private By cartTitle = By.className("title");
    private By checkoutButton = By.id("checkout");

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public String getCartTitle() {
        return driver.findElement(cartTitle).getText();
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }
}