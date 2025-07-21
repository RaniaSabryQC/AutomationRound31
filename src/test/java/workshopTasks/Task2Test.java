package workshopTasks;

import engine.Bot;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task2Test {
    Bot bot;

    @Test
    public void testTask2() {
//        Task 2:
//       - Open Google Chrome
//       - Navigate to [https://duckduckgo.com/]
//       - Assert that the DuckDuckGo logo is displayed
//       - Close Google Chrome

        String url="https://duckduckgo.com/";
        bot.navigate(url);
        By logoLocator = By.xpath("//div[contains(@class,'Desktop')]//img");
        Assert.assertTrue(bot.isDisplayed(logoLocator), "DuckDuckGo logo is not displayed");
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
