package workshopTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1Test extends TestCase {

    @Test
    public void navigateToDuckduckgoAndCheckPageTitle() {
//        Task 1: Open Google Chrome, navigate to [https://duckduckgo.com/], assert that the page title is [Google], and close Google Chrome.
//        Steps:
//       - Open Google Chrome
//       - Navigate to [https://duckduckgo.com/]
//        -Assert that the page title is [Google]
//        -Close Google Chrome

        String url = "https://duckduckgo.com/";
        bot.navigate(url);
        Assert.assertEquals(bot.getTitle(), "DuckDuckGo - Protection. Privacy. Peace of mind.");

    }
}