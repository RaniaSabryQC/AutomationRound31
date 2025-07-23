package workshopTasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicHtml;

public class Task2Test extends TestCase {

    @Test
    public void checkLogoIsDisplay() {
//        Task 2:
//       - Open Google Chrome
//       - Navigate to [https://duckduckgo.com/]
//       - Assert that the DuckDuckGo logo is displayed
//       - Close Google Chrome

        DynamicHtml dynamicHtml = new DynamicHtml(bot);
        dynamicHtml.navigateToDuckDuckGo();
        Assert.assertTrue(dynamicHtml.isLogoDisplayed(), "DuckDuckGo logo is not displayed");
    }


}
