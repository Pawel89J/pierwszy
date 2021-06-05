package selenium.test.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DefaultPage {

    @FindBy(xpath = "//html/body/div[1]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/a/div")
    private WebElement logoutButton;

    @FindBy(xpath = "//html/body/div/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]/a[2]/div")
    private WebElement taskListButton;

    @FindBy(xpath = "//html/body/div/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]/a[6]/div")
    private WebElement goalListButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoutButtonDisplayed() {
        return isElementDisplayed(logoutButton);
    }

    public void goToTaskListPage() {
        clickElement(taskListButton);
    }

    public void goToGoalListPage() {
        clickElement(goalListButton);
    }
}