package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

public class PurchaseFlowTest extends BaseTest {

    @Test
    public void completePurchaseFlowTest() {

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Products
        ProductsPage productsPage = new ProductsPage(driver);

        Assert.assertEquals(
                productsPage.getProductsTitle(),
                "Products"
        );

        productsPage.addBackpackToCart();
        productsPage.openCart();

        // Cart
        CartPage cartPage = new CartPage(driver);

        Assert.assertEquals(
                cartPage.getCartTitle(),
                "Your Cart"
        );

        cartPage.clickCheckout();

        // Checkout
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        checkoutPage.enterCustomerDetails(
                "Ravindu",
                "Shashimal",
                "10100"
        );

        checkoutPage.clickContinue();
        checkoutPage.clickFinish();

        // Verify order confirmation
        Assert.assertEquals(
                checkoutPage.getConfirmationMessage(),
                "Thank you for your order!"
        );
    }
}