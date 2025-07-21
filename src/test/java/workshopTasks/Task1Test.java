package workshopTasks;

import engine.Bot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1Test {
    Bot bot;

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

    @BeforeMethod
    public void setUp() {
        bot = new Bot();
    }


    @AfterMethod
    public void tearDown() {
        bot.quit();
    }
}
