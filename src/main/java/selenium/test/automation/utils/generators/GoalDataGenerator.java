package selenium.test.automation.utils.generators;

import selenium.test.automation.utils.BaseConfiguration;

import java.util.Date;

public class GoalDataGenerator {

    public Object[][] generateGoalData(int dataNumber) {
        Object[][] data = new Object[dataNumber][];

        for (int i = 0; i < dataNumber; i++) {
            Object[] versionData = new Object[1];
            versionData[0] = new Date().getTime() + "_" + new BaseGenerator().generateString(6);
            data[i] = versionData;
        }
        return data;
    }
}