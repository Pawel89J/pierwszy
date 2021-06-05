package selenium.test.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DefaultPage {

    @FindBy(xpath = "//html/body/div[1]/div/div[1]/div[2]/form/div[1]/input")
    private WebElement emailField;

    @FindBy(xpath = "//html/body/div[1]/div/div[1]/div[2]/form/div[1]/div/div/div/div/input")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/form/div[2]")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fillLoginForm(String email, String password) {
        fillElement(emailField, email);
        fillElement(passwordField, password);
    }

    public void submitLoginForm() {
        clickElement(loginButton);
    }
}
