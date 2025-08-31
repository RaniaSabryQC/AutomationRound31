package workshopTasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBox;

public class CheckBoxTaskTest extends TestCase{
    // Task6
    //Open Google Chrome
    //Navigate to [http://the-internet.herokuapp.com/checkboxes]
    //Check Checkbox 1
    //Assert that both Checkboxes are checked
    //Close Google Chrome

    @Test
    public void checkboxesAreChecked() {
        CheckBox checkboxesPage = new CheckBox(bot).navigateToCheckboxesWebSite().checkCheckbox1();
        Assert.assertTrue(checkboxesPage.isCheckbox1Checked(), "Checkbox 1 should be checked");
        Assert.assertTrue(checkboxesPage.isCheckbox2Checked(), "Checkbox 2 should be checked");
    }
}
