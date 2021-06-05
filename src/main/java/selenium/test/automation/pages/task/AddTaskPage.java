package selenium.test.automation.pages.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.test.automation.pages.DefaultPage;

public class AddTaskPage extends DefaultPage {

    @FindBy(xpath = "//html/body/div/div/div/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/div/div[1]")
    public WebElement addButton;

    @FindBy(xpath = "//html/body/div/div/div/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[1]/div/div/div/div[1]/div/label/textarea")
    public WebElement nameFiled;

    @FindBy(xpath = "//html/body/div/div/div/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[1]")
    public WebElement detailsButton;

    @FindBy(xpath ="//html/body/div/div/div/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div[3]/div/div[5]/div[2]/div/div/div[2]/div[2]/p")
    public WebElement descriptionButton;

    @FindBy(xpath = "//html/body/div/div/div/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div[6]")
    public WebElement closeDescriptionButton;

    public AddTaskPage(WebDriver driver) {
        super(driver);
    }

    public void addTaskButton() { clickElement(addButton); }

    public void fillAddTaskForm(String name) {
        fillElement(nameFiled, name);
        clickElement(nameFiled);
    }

    public void markDetailsButton() { clickElement(detailsButton);}

    public void fillDescriptionTaskForm(String description) {
        fillElement(descriptionButton, description);
    }

    public void closeDescriptionButton() {clickElement(closeDescriptionButton);
    }

}