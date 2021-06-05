package selenium.test.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.automation.pages.HomePage;
import selenium.test.automation.pages.LoginPage;

public class LoginTest extends DefaultTest {

    @Test
    public void successLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginForm("miecio178@go2.pl", "Random123");
        loginPage.submitLoginForm();

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isLogoutButtonDisplayed());
    }
}
