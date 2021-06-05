package selenium.test.automation.pages.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.test.automation.pages.DefaultPage;

public class TaskListPage extends DefaultPage {

    @FindBy(xpath = "//html/body/div/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]/a[2]/div")
    private WebElement addTaskPageLink;

    public TaskListPage(WebDriver driver) {
        super(driver);
    }

    public void goToAddTaskPage() {
        clickElement(addTaskPageLink);
    }

}