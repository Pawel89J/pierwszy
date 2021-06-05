package selenium.test.automation.tests.goal;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.test.automation.pages.goal.AddGoalPage;
import selenium.test.automation.pages.HomePage;
import selenium.test.automation.pages.goal.GoalListPage;
import selenium.test.automation.tests.DefaultTest;
import selenium.test.automation.utils.data.DataReader;
import selenium.test.automation.utils.generators.GoalDataGenerator;

public class AddGoalTest extends DefaultTest {

    @BeforeClass
    public void setUpClass() {
        HomePage homePage = new HomePage(driver);
        homePage.goToGoalListPage();
    }

    @Test(dataProvider = "readFromCSVGoalDataProvider")
    public void successAddGoalTest(String name) throws InterruptedException {
        GoalListPage goalListPage = new GoalListPage(driver);
        goalListPage.goToAddGoalPage();

        AddGoalPage addGoalPage = new AddGoalPage(driver);
        addGoalPage.fillAddGoalForm(name);
        addGoalPage.submitAddGoalForm();
        Thread.sleep(1000);

        goalListPage = new GoalListPage(driver);
        Assert.assertTrue(goalListPage.isInfoBoxDisplayed());
    }

    @DataProvider(name = "generatedGoalDataProvider")
    public Object[][] generatedGoalDataProvider() {
        return new GoalDataGenerator().generateGoalData(3);
    }

    @DataProvider(name = "readFromCSVGoalDataProvider")
    public Object[][] readFromCSVGoalDataProvider() {
        return new DataReader().readVersionData("versionData.csv");
    }
}
