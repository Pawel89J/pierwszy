package selenium.test.automation.tests.task;

import org.testng.annotations.Test;
import selenium.test.automation.pages.task.AddTaskPage;
import selenium.test.automation.pages.HomePage;
import selenium.test.automation.pages.task.TaskListPage;
import selenium.test.automation.tests.DefaultTest;

import java.util.Date;

public class AddTaskTest extends DefaultTest {

    @Test
    public void successAddTaskTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.goToTaskListPage();

        TaskListPage taskListPage = new TaskListPage(driver);
        taskListPage.goToAddTaskPage();

        AddTaskPage addTaskPage = new AddTaskPage(driver);
        addTaskPage.addTaskButton();
        addTaskPage.fillAddTaskForm(new Date().getTime() + "_t");
        Thread.sleep(1000);
        addTaskPage.markDetailsButton();
        addTaskPage.fillDescriptionTaskForm(baseGenerator.generateString(50));
        addTaskPage.closeDescriptionButton();

    }
}
