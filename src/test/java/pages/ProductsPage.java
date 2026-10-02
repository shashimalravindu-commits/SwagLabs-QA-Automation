package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    // Locators
    private By productsTitle = By.className("title");
    private By firstAddToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private By cartButton = By.className("shopping_cart_link");

    // Constructor
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public String getProductsTitle() {
        return driver.findElement(productsTitle).getText();
    }

    public void addBackpackToCart() {
        driver.findElement(firstAddToCartButton).click();
    }

    public void openCart() {
        driver.findElement(cartButton).click();
    }
}
