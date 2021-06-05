package selenium.test.automation.pages.goal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.test.automation.pages.DefaultPage;

public class AddGoalPage extends DefaultPage {

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/span/div/div[1]/div[1]/div[2]/input")
    private WebElement nameField;

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div[2]/div/div/div[3]/div[2]")
    private WebElement saveButton;

    public AddGoalPage(WebDriver driver) {
        super(driver);
    }

    public void fillAddGoalForm (String name) {
        fillElement(nameField, name);
    }

    public void submitAddGoalForm () {
        clickElement(saveButton);
    }

}
