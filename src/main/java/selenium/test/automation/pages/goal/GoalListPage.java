package selenium.test.automation.pages.goal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.test.automation.pages.DefaultPage;

public class GoalListPage extends DefaultPage {

    @FindBy(xpath = "//html/body/div/div/div/div/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[1]/div")
    private WebElement addGoalPageLink;

    @FindBy(xpath = "//html/body/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/div")
    private WebElement infoBox;

    public GoalListPage(WebDriver driver) {
        super(driver);
    }

    public void goToAddGoalPage() {
        clickElement(addGoalPageLink);
    }

    public boolean isInfoBoxDisplayed () {
        return isElementDisplayed(infoBox);
    }
}
