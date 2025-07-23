package workshopTasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicHtml;

public class Task1Test extends TestCase {

    @Test
    public void navigateToDuckduckgoAndCheckPageTitle() {
//        Task 1:
//        Steps:
//       - Open Google Chrome
//       - Navigate to [https://duckduckgo.com/]
//        -Assert that the page title is [DuckDuckGo - Protection. Privacy. Peace of mind.]
//        -Close Google Chrome
        DynamicHtml dynamicHtml = new DynamicHtml(bot);
        dynamicHtml.navigateToDuckDuckGo();
        Assert.assertEquals(dynamicHtml.getTitleDuckDuckGo(), "DuckDuckGo - Protection. Privacy. Peace of mind.");

    }
}