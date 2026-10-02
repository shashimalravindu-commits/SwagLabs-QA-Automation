package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("inventory"),
                "Login failed - Inventory page was not opened"
        );
    }
}